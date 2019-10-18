package Day1_solid.solid.di.good;

public class HPColoredPrinter implements Printer {
	private String inc;

	public String getInc() {
		return inc;
	}

	public void setInc(String inc) {
		this.inc = inc;
	}

	public void print(String text){
		System.out.println(text);
	}
	
}
