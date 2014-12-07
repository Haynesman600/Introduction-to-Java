class Valentine extends Card{
	protected int kisses;
	
	/////
	protected Valentine (String x, int numKisses ){
		super(x);
		kisses=numKisses;
	}
		String v;
		
	
	protected void greeting(){
		super.greeting();
		System.out.println("Love and Kisses");
		v=new String(new char[kisses]).replace("\0","x");
		System.out.println(v);
	}
}