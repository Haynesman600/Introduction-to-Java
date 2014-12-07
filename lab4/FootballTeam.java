class FootballTeam{

	//instance variables
	private String teamName;
	private int matchesWon, matchesLost, matchesDraw;
	//int Total;
	
	
	//constructors
	FootballTeam(String Tname,int Won,int Lost,int Draw){
			teamName=Tname;
			matchesWon=Won;
			matchesLost=Lost;
			matchesDraw=Draw;
	}
	
	// Team constructor empty
	
	FootballTeam(){}
	
	

	void Twon(double sum){
	matchesWon+=sum;
	}
	
	void Tlost(double sum){
	matchesLost+=sum;
	}
	
	void Tdraw(double sum){
	matchesDraw+=sum;
	}
	
	//Method
	int totalPoints(){
		int pWon=3*matchesWon;
		int pLost=1*matchesLost;
		int pDraw=0*matchesDraw;
		int Total=pWon+pLost+pDraw;
		System.out.println(getName()+" "+Total);
		return Total;
	}
	
	
	//Access Getter Setter Methods
	//Get Name
	String getName(){return teamName;}
	
	//Set Name
	void setName(String newTeamName){
		teamName=newTeamName;
	}
	
	//get points Won
	int getWon(){return matchesWon;}
	//get points Lost
	int getLost(){return matchesLost;}
	//get Draw
	int getDraw(){return matchesDraw;}
	//get sum matches
	int getmatches(){return matchesWon+matchesLost+matchesDraw;}
}
	