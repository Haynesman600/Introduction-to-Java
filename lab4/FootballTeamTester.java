class FootballTeamTester{
	public static void main(String[] args){
	
	//Teams
	FootballTeam Team1= new FootballTeam("Stone FC",7,2,0);
	FootballTeam Team2= new FootballTeam();
	FootballTeam Team3= new FootballTeam();
	
	//Set Team Names
	Team2.setName("Sky FC");
	Team3.setName("Not Very Good FC");
	
	//System.out.println(Team1.getmatches());
	// number of points, random function
	int i;
	for(i=1;i<=2;i++){
		//matches Won
		Team2.Twon(5*Math.random());
		Team3.Twon(5*Math.random());
		//Matches Lost
		Team2.Tlost(3*Math.random());
		Team3.Tlost(3*Math.random());
		//Matches Drew
		Team2.Tdraw(2*Math.random());
		Team3.Tdraw(2*Math.random());
	}
	
	
	//Total Number of points
	//Team1.totalPoints();
	//Team2.totalPoints();
	//Team3.totalPoints();
	
	//Comparing season outcome
	if(Team1.getmatches()>Team2.getmatches()&&Team2.getmatches()>Team3.getmatches()){
		System.out.println(Team1.totalPoints()+" has had a better season than "+Team2.totalPoints()+" and "+Team3.totalPoints());
	} else {
	if(Team2.getmatches()>Team1.getmatches()&&Team1.getmatches()>Team3.getmatches()){
		System.out.println(Team1.totalPoints()+" has had a better season than "+Team3.totalPoints()+" and "+Team2.totalPoints());
	} else {
	if(Team3.getmatches()>Team2.getmatches()&&Team2.getmatches()>Team1.getmatches()){
		System.out.println(Team2.totalPoints()+" has had a better season than "+Team2.totalPoints()+" and "+Team3.totalPoints());
	}
	}
	}
	
	
	}
}
