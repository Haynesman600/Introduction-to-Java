//import java.io.*;
import java.util.Arrays;
class Hamming{

	private int code[]=new int[6];
	private int errorBit;
	
	// Constructor
	Hamming(String[] In, String line){
		
	
			for(int i=0;i<6;i++){
				In[i]=Character.toString(line.charAt(i)); //in the read line from file get the character at position i, convert charter at i to String
				code[i]=Integer.parseInt(In[i]); // convert array of String In to array of Int code
				}
				
		
				//Even Parity checks
				//Parity check 1, Venn Diagram weight 1, parity of 1 3 5 7
				int parity1=code[0]+code[3]+code[5]+code[7];
				int parity1Weight;
		
				if(parity1 % 2== 0){ //% 2 performs modulo of 2 calculation, in basic terms if the number is devided by 2 what is the remainder
					parity1Weight=0;
				}else{
					parity1Weight=1;
				}
		
				//Parity 2 check, weight 2, parity of 2 3 6 7
				int parity2=code[1]+code[3]+code[6]+code[7];
				int parity2Weight;
			
				if(parity2 % 2==0){
					parity2Weight=0;
				}else{
					parity2Weight=2;
				}
		
				//Parity 3 check, weight 3, parity of 4 5 6 7
				int parity3=code[4]+code[5]+code[6]+code[7];
				int parity3Weight;
			
				if(parity3 % 2==0){
					parity3Weight=0;
				}else{
					parity3Weight=3;
				}
			
				errorBit=parity1Weight+parity2Weight+parity3Weight;
				
				System.out.println("Input line: "+line);
				
				if(errorBit==0){
					System.out.println("There are no errors in the input line");
				}else{
					System.out.println("Error detected, bit: "+errorBit);
				}
			
			
	
	}
	
	
			
	// methods
	String getMessage(){
			if(errorBit==0){ // fixing error if detected 
			}else{				// if errorBit= o there are no error do nothing
				if(code[errorBit]==0){
					code[errorBit]=1;
				}else{
					code[errorBit]=0;
				}
			}
			
			// converting array to string
			StringBuffer buffMessage=new StringBuffer(); // for this import Java.utilArrays. create a new String Buffer call it buffMessage
			
			for(int j=0;j<code.length;j++){
			buffMessage.append(code[j]); //.append updates the value of buffMessage
			}
			String message=buffMessage.toString(); //convert buffer message to string allowed by utilArrays
		return(message);
	}








}