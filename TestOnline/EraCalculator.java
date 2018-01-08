package it.my.TestOnline;

public class EraCalculator {

	public static void main(String[] args) {
		int earnedRuns=3;
		int inningsPitched=6;
		int inninggsInAGame=9;
		float leagueAverageEra = 4.25f;
		float era = ((float)earnedRuns/(float)inningsPitched*inninggsInAGame);
		boolean betterThanAverage;
		if (era<leagueAverageEra){
			betterThanAverage=true;
		}else {
			betterThanAverage=false;
		}
		char yesNo = betterThanAverage?'Y':'N';
		System.out.println("earnedRuns"+earnedRuns);
		System.out.println("inningsPitched"+inningsPitched);
		System.out.println("ERA\t\t\t"+era);
		System.out.println("League Average ERA\t"+leagueAverageEra);
		System.out.println("Is player better than league average "+yesNo);

	}

}
