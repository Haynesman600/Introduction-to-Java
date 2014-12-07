class Birthday extends Card{
	protected int age;
	
	//constructor
	protected Birthday(String r, int years){
		super (r);
		age=years;
	}
	
	protected void greeting(){
		super.greeting();
		System.out.println("Happy"+age+"th Birthday!\n\n");
	}

}