package javaclasses;

public class JavaClasses {

	public static void main(String[] args) {
		Reader reader = new Reader();
		
		reader.readIt(new Runes());
		
		reader.printIt();

	}

}

interface IReadable{
	String read();
	
}

class Reader{
	String text;
	


public void readIt(IReadable readMaterial) {
	text = readMaterial.read();
}

public void printIt() {
	if (text != null)
		System.out.println(text);
	}
}

class Runes implements IReadable{
	
	@Override
	public String read() {
		return "Runes are readable too!";
	}
	
}