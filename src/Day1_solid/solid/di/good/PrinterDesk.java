package Day1_solid.solid.di.good;

public class PrinterDesk {
	private Printer printer;

	public PrinterDesk(Printer printer) {
		super();
		this.printer = printer;
	}

	public void printFile(){
		printer.print("File Content");
	}
	
}
