import java.lang.Math.*;
class Circle{
    protected double radius;
	
	//proivde a constructor which accepts a parameter for radius
	Circle(double inputRadius){
		radius=inputRadius;
	}
	//method
	protected void parameters(){
	    System.out.println("The radius of the circle is: "+getRadius());
		System.out.println("The area of the circle is: "+getArea());
		System.out.println("The circumference of the circle is: "+getCircumference());
	}

	
		double getArea(){
			int sqr=2;
			double Area=Math.pow(radius, sqr)*Math.PI;
			return Area;
		}
		
		double getRadius(){
			return radius;
		}
		
		double getCircumference(){
			double circumference=2*radius*Math.PI;
			return circumference;
		}
		
}