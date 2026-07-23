package cohension;

public class PrinterManager {

	public void processPrinterCommand(String command) {
		if(command.equals("PRINT")) {
			printDocumnet();
		} else if(command.equals("SCAN")) {
			scanDocument();
		} else if(command.equals("CANCLE")){
			cancleTASK();
		}
	}

	private void cancleTASK() {
		// TODO Auto-generated method stub
		
	}

	private void scanDocument() {
		// TODO Auto-generated method stub
		
	}

	private void printDocumnet() {
		// TODO Auto-generated method stub
		
	}
}
