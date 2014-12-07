import java.io.*;
import java.util.Arrays;

class CountLetters{
	
	public static void main(String[] args){
		try{
			FileReader sonnetRead = new FileReader("Sonnet18.txt");
			BufferedReader sonnetBuffer = new BufferedReader(sonnetRead);
			String line;
			
			//readign file untill the end
			System.out.println("\n");
			while ((line=sonnetBuffer.readLine()) !=null){
				int NumberofE=countE(line);
				System.out.println(line+" "+NumberofE+" of 'e' out of "+line.length()+" letters");
			}
			sonnetBuffer.close();
			
				
	
		}catch(IOException e){
			e.printStackTrace();
		 }
		catch(ArrayIndexOutOfBoundsException e){
		    System.out.println("something went wrong");
		}
	}
		
		


    public static int countE(String input){
    	int s=0;
    	char e='e';
      for(int i=0;i<input.length();i++){
    	 
    	  	if(input.charAt(i)==e){
    	  		s=s+1;
    	  	}
      }
      	return s;
    }
}