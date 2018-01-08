package it.my.TestOnline;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Mappa {

	Map<String, Map<String, List<SubscriptionInfo>>> pmSnmpCountersCache = new HashMap<String, Map<String, List<SubscriptionInfo>>>();

	public void addItem(String fdn) {
		final List<String> subCounters = new ArrayList<>();
		subCounters.add("counter1");
		subCounters.add("counter2");
		final List<String> subCounters2 = new ArrayList<>();
		subCounters2.add("counter3");
		Date d = new Date();
		SubscriptionInfo info = new SubscriptionInfo("1","test",d);
		SubscriptionInfo info2 = new SubscriptionInfo("2","test",d);
		SubscriptionInfo info3 = new SubscriptionInfo("3","test",d);
		setEntryinCache(fdn, info, subCounters);
		setEntryinCache(fdn, info2, subCounters);
		setEntryinCache(fdn, info3, subCounters2);
		System.out.println("fine");
	}

	public void removeItem(String fdn, SubscriptionInfo subscriptionInfo) {
		final Map<String, List<SubscriptionInfo>> countersMap = pmSnmpCountersCache.get(fdn);
		if (countersMap != null) {
			final List<String> keySetToDelete = new ArrayList<>();
			final Iterator<Map.Entry<String, List<SubscriptionInfo>>> entries = countersMap.entrySet().iterator();
			while (entries.hasNext()) {
				Entry<String, List<SubscriptionInfo>> entry = entries.next();
				final List<SubscriptionInfo> subscriptionsList = (List<SubscriptionInfo>) entry.getValue();
				if (subscriptionsList.contains(subscriptionInfo)) {
					subscriptionsList.remove(subscriptionInfo);
					if (subscriptionsList.isEmpty()) {
						keySetToDelete.add(entry.getKey());
					}
				}
			}
			for (String key : keySetToDelete) {
				countersMap.remove(key);
			}
			if (countersMap.isEmpty()) {
				pmSnmpCountersCache.remove(fdn);
			} else {
				pmSnmpCountersCache.replace(fdn, countersMap);
			}
		} else {
			System.out.println("Error");
		}
		// printCache(fdn);
	}

	public void setEntryinCache(String fdn, SubscriptionInfo subId, List<String> subCounters) {
		final Map<String, List<SubscriptionInfo>> countersMap = new HashMap<>();
		List<SubscriptionInfo> listSub = new ArrayList<>();
		Map<String, List<SubscriptionInfo>> existCounters;
		if (pmSnmpCountersCache.containsKey(fdn)) { // exist Entry
			existCounters = pmSnmpCountersCache.get(fdn);
			for (final String counter : subCounters) {
				final String counterKey = counter;
				List<SubscriptionInfo> list = new ArrayList<SubscriptionInfo>();
				if (existCounters.containsKey(counterKey)) {
					List<SubscriptionInfo> listcopy = existCounters.get(counterKey);
					for (final SubscriptionInfo s : listcopy) {
						list.add(s);
					}
					list.add(subId);
				} else {
					list.add(subId);
				}
				existCounters.put(counter, list);
			}
			pmSnmpCountersCache.replace(fdn, existCounters);
		} else { // new entry
			listSub.add(subId);
			for (final String counter : subCounters) {
				final String counterKey = counter;
				countersMap.put(counterKey, listSub);
			}
			pmSnmpCountersCache.put(fdn, countersMap);
		}
		// printCache(fdn);
	}
	
	public void testRemove() {
		final Map<String, List<SubscriptionInfo>> countersMap = pmSnmpCountersCache.get("fdn");
		for (final Entry<String, List<SubscriptionInfo>> entry : countersMap.entrySet()) {
			final String counterExtendedName = entry.getKey();
			final List<SubscriptionInfo> subscriptionInfoList = entry.getValue();
			final Iterator<SubscriptionInfo> subscriptionInfoItr = subscriptionInfoList.iterator();
			while (subscriptionInfoItr.hasNext()) {
				final SubscriptionInfo subInfo = subscriptionInfoItr.next();
				final Date ropStartTime = new Date();
				if (!subInfo.getActivationTime().after(ropStartTime)) {
					subscriptionInfoItr.remove();

				} else {

				}
			}
			final List<SubscriptionInfo> subscriptionInfoListUpdated = (List<SubscriptionInfo>) entry.getValue();
			if ((subscriptionInfoListUpdated == null) || subscriptionInfoListUpdated.isEmpty()) {
				pmSnmpCountersCache.remove(counterExtendedName);
			}
		}
	}
}
