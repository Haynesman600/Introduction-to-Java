import java.io.*;
class Decoder{

public static void main(String[] args){

	try{

		FileReader readF = new FileReader("Codes.txt"); // file reader connects to file, named file reader readF//
		BufferedReader buffF = new BufferedReader(readF); // provide buffering for the reader readF				//ok so this is the code to read a text file line by line
		String line;																							//
		
				
			while((line=buffF.readLine())!=null){ // reading file till the end
			String Test= test.checkInput();
				
			}
		
				
	}catch(IOException e){
		e.printStackTrace();
	}
}


// the method to decide to read line or not
public static boolean checkInput(String input){					//
																//so this is a method that accepts an argument in this case the line read  from the text files
																//and checks whether the line read from file is 7 chars long and only contains 1 and 0s
	if(input.length()==7 && input.matches("[0-1]+")){			// so i need to somehoe pass Sting "line" to method "checkInput"
	return(true);												//
	}else{														//
	return(false);												//
	}	
				
}
}