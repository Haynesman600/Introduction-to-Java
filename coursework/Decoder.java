import java.io.*;

class Decoder {

    public static void main(String[] args) {
        try {
            // File reader connects to file, named file reader readF:
            FileReader readF = new FileReader("Codes.txt");
            // Provide buffering for the reader readF. this is
            // the code to read a text file line by line:
            BufferedReader buffF = new BufferedReader(readF);
            String line;

            // Reading file till the end:
            while ((line = buffF.readLine()) != null) {

                // Pass "line" to checkInput() and store result in "Check":
                boolean Check= checkInput(line);
				
				if(!checkInput(line)){
					write2file(line," Wrong Input");
				}else{
					
					Hamming parityCheck = new Hamming(line);
					String messageTransmitted=parityCheck.getMessage();
					String msg="Message: ";
					String outPutMessage=msg+messageTransmitted;
					write2file(line,outPutMessage);
				}
            }
			buffF.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // The method to decide to read line or not:
    public static boolean checkInput(String input) {
        if (input.length() == 7 && input.matches("[0-1]+")) {
            return true;
        } else {
            return false;
        }
    }
	
	public static void write2file(String initInput, String outcome){
	    try{
	        
			File outFile = new File("Codes_decoded.txt"); //initiate new output file
		        if(!outFile.exists()){                    //check if output file exists
			        outFile.createNewFile();              //if it doesnt, creat a new file
			    }else{}
				
				
			FileWriter writeF = new FileWriter("Codes_decoded.txt", true);
			writeF.write("\n"+initInput+" "+outcome);
		writeF.close();
		}catch (IOException e){
		    e.printStackTrace();
		}
	}
	
}