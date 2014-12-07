class SymbolPrinter{

	public static void main(String[] args){
	
		int i;
		String t;
		String a;
		
		for(i=1;i<=9;i=i+2){
			t=new String(new char[i]).replace("\0","#");
			System.out.println(t);
		}
		
		System.out.println("\n");
		
		for(i=5;i>=1;i=i-2){
			a=new String(new char[i]).replace("\0","@");
			System.out.println(a);
		}
	
		//for(i=5; i<=9; i=i+2){
		//System.out.prinln(("+"*i)); <---- works in C not in Java
		//}
	
	
	}
}

	