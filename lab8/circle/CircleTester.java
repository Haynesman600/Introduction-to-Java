class CircleTester{
public static void main(String[] args){
    try{
	    System.out.println("\n");
		
	    double radius=Double.parseDouble(args[0]);
		double height=Double.parseDouble(args[1]);
	
	
	
	    Circle[] roundThings = new Circle[2];
	    roundThings[0]=new Circle(radius);
	    roundThings[1]=new Cylinder(radius, height);
		
		for(int i=0;i<roundThings.length;i++){
		    roundThings[i].parameters();
		}
    }catch(ArrayIndexOutOfBoundsException e){
	    System.out.println("Please enter two numerical values for radius and height");
		}
	catch(NumberFormatException e){
	    System.out.println("Please enter a numerical value for radius and numerical value for height");
    }		
}
}