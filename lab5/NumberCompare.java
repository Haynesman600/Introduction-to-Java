public class NumberCompare{

public static void main(String[] args){
	
	
	
	//from command line the number entered into the string and printing them
	System.out.print("\n"+"Numbers Entered:");
	double [] numbers=new double[args.length];
	for(int i=0;i<args.length;i++){
		numbers[i]=Double.parseDouble(args[i]);
		System.out.print(" "+args[i]);	
	}
	/////////////////////////////////////////////////
	
	// Getting the Largest and Smallest numbers
	//initialise largest and smallest
	double largest=Double.parseDouble(args[0]);
	double smallest=Double.parseDouble(args[0]);
	
	for(int i=0;i<args.length;i++){
		if (Double.parseDouble(args[i])>largest){
			largest=Double.parseDouble(args[i]);
		}else if
			(Double.parseDouble(args[i])<smallest){
			smallest=Double.parseDouble(args[i]);
		}
	}
	//Printing numbers out
	System.out.println("\n"+"The largest number is "+largest);
	System.out.println("The smallest number is "+smallest);

	//finding sum
	int i=0;
	double sum=0;
	while(i<args.length){
		sum += Double.parseDouble(args[i]);
		i++;
	}
	System.out.println("The sum of numbers entered: "+sum);  

}
}