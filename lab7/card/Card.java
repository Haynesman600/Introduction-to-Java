class Card{
	protected String recipient; // the name of the person who receved the card
	
	Card(String name){recipient=name;} //construtor
	
	//class method
	protected void greeting(){
		System.out.println("Dear"+recipient+"!");
		
	}
}
