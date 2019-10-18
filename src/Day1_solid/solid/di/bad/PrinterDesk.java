package Day1_solid.solid.di.bad;

public class PrinterDesk {

	private HPColoredPrinter printer;

	public PrinterDesk(HPColoredPrinter printer) {
		super();
		this.printer = printer;
	}

	public void printFile(){
		printer.print("File Content");
	}

}
