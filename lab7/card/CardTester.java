class CardTester {
public static void main ( String[] args )  {
	try{
    String name=args[0];   //get name from the command line
    System.out.println("\n"+"Your name:"  + name);
    //get args[1], convert it to integer and store in a variable age
	int age=Integer.parseInt(args[1]);
	
    //get args[2], convert it to integer and store in a variable numKiss
	int numKiss=Integer.parseInt(args[2]);
	
    Card [] myCards = new Card[3];
    myCards[0] = new Holiday( name );
    myCards[1] = new Birthday( name, age);
    myCards[2] = new Valentine( name, numKiss );
    for (int i=0;i< myCards.length;i++){
      myCards[i].greeting();
    }
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Please enter arguments in the form: Name, age and number of k");
	}
	catch(NumberFormatException e){
		System.out.println("Please enter age and number of k");
	}
	finally{
		System.out.println("some information entered, please check details");
	}
}
}


