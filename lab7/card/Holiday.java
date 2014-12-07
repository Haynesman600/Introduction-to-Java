class Holiday extends Card{
	protected Holiday(String name){ // I guess its the type of holiday
		super(name); 
	}
	
	protected void greeting(){
		super.greeting();
		System.out.println("Season's Greetings!\n");
	}
}