package it.my.TestOnline;

import java.util.Date;

/**
 * Created by eottgen on 11/13/17.
 */
public class SubscriptionInfo {

    private String id;
    private String scannerName;
    private Date activationTime;

    /**
     * Default Constructor
     */
    public SubscriptionInfo() {
    }

    /**
     * Constructor
     * @param id id
     * @param scannerName scannerName
     * @param activationTime activationTime
     */
    public SubscriptionInfo(String id, String scannerName, Date activationTime) {
        this.id = id;
        this.scannerName = scannerName;
        this.activationTime = activationTime;
    }

    /**
     * getId
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * getScannerName
     * @return scannerName
     */
    public String getScannerName() {
        return scannerName;
    }

    /**
     * getActivationTime
     * @return activationTime
     */
    public Date getActivationTime() {
        return activationTime;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SubscriptionInfo)) {
            return false;
        }
        SubscriptionInfo subInfo = (SubscriptionInfo) o;
        return id.equals(subInfo.id);
    }
}

