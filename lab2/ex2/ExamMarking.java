class ExamMarking{

	public static void main(String[] args){
	
	int mark=89;
	int efmark=mark/10;
	char grade;
		
		switch(efmark){
			case 1:
			case 2:
			case 3:
				System.out.println("Your grade F"+'\t'+"Your Mark "+mark);
				break;
			case 4:
				System.out.println("Your grade E"+'\t'+"Your Mark "+mark);
				break;
			case 5:
				System.out.println("Your grade D"+'\t'+"Your Mark "+mark);
				break;
			case 6:
				System.out.println("Your grade C"+'\t'+"Your Mark "+mark);
				break;
			case 7:
				System.out.println("Your grade B"+'\t'+"Your Mark "+mark);
				break;
			case 8:
			case 9:
			case 10:
				System.out.println("Your grade A"+'\t'+"Your Mark "+mark);
				break;
			default:
				System.out.println("Bla");
		}
	}	
}
			