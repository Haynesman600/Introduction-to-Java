//import java.io.*;
import java.util.Arrays;
class Hamming{

	private int code[]=new int[8];         // I have no idea why but the arrays have to be defined to 7 values
	private int errorBit;                  // even though it assinges values from 0 to 6 so the first value of array will have index 0
	private String In[] = new String[7];   //------important to remember------//
	
	// Constructor
	Hamming(String input){
		
	
			for(int i=0;i<7;i++){
				In[i]=Character.toString(input.charAt(i)); //Assings array of type String each with character of input at the index
				code[i+1]=Integer.parseInt(In[i]); // convert array of String In to array of Int code 
				//------important make the code count from 1 rather than 0, index i+1 so that parity check weights are correct-----
				//System.out.println("i: "+i+" "+"input: "+input.charAt(i));
				//System.out.println("i: "+i+" "+"In: "+In[i]);
				//System.out.println("i: "+i+" "+"code: "+code[i]);
				}
				
		
				//Even Parity checks input Hamming code 
				//Parity check 1, Venn Diagram weight 1, parity of 1 3 5 7
				int parity1=code[1]+code[3]+code[5]+code[7];
				int parity1Weight;
		
				if(parity1 % 2== 0){ //% 2 performs modulo of 2 calculation, in basic terms if the number is devided by 2 what is the remainder 
					parity1Weight=0;
				}else{
					parity1Weight=1;
				}
		
				//Parity 2 check, weight 2, parity of 2 3 6 7
				int parity2=code[2]+code[3]+code[6]+code[7];
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
				
				System.out.println("Input line: "+input);
				
				if(errorBit==0){
					System.out.println("There are no errors in the input line");
				}else{
					System.out.println("Error detected, bit: "+errorBit);
				}
			
			
	
	}
	
	
			
	// methods
	String getMessage(){
			if(errorBit==0){ // fixing error if detected 
			}else{				// if errorBit= 0 there are no error do nothing
				if(code[errorBit]==0){
					code[errorBit]=1;
				}else{
					code[errorBit]=0;
				}
			}
			
			//getting the Message
			int messageWoutParity[] = new int[4];
			messageWoutParity[0]=code[3];
			messageWoutParity[1]=code[5];
			messageWoutParity[2]=code[6];
			messageWoutParity[3]=code[7];
			
			// converting array to string
			StringBuffer buffMessage=new StringBuffer(); // for this import Java.utilArrays. create a new String Buffer call it buffMessage
			
			for(int j=0;j<messageWoutParity.length;j++){
			buffMessage.append(messageWoutParity[j]); //.append updates the value of buffMessage
			}
			String message=buffMessage.toString(); //convert buffer message to string allowed by utilArrays
		return(message);
	}








}