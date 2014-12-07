class Cylinder extends Circle{
    private double height;
	
	//provide a constructor
	Cylinder(double r,double inputHeight){
		super(r);
		height=inputHeight;
	}

	protected void parameters(){
	    System.out.println("The height of the cylinder is: "+getHeight());
		System.out.println("The volume of the cylinder is: "+getVolume());
		System.out.println("The area of the cylinder is: "+getArea());
	
	}
	
		double getArea(){
			double areaOfCylinder=super.getCircumference()*height+super.getArea();
			return areaOfCylinder;
		}
		
		double getHeight(){
			return height;
		}
		
		double getVolume(){
			double volumeOfCylinder=super.getArea()*height;
			return volumeOfCylinder;
		}

}