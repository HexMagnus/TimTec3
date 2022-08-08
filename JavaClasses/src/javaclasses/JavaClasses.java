package javaclasses;

public class JavaClasses {

	public static void main(String[] args) {
		Reader reader = new Reader();
		reader.readIt(new Runes());
		reader.readIt();
		reader.printIt();
		
	}

}

interface IReadable{
	String read();
	
}

class Reader{
	
	class DefaultReadingMaterial implements IReadable{
		
		@Override
		public String read() {
			return "Bula de remédio";
		}
		
	}
	String text;
	


public void readIt(IReadable readMaterial) {
	text = readMaterial.read();
}

	public void readIt() {
		text = new DefaultReadingMaterial().read();
	}


public void printIt() {
	if (text != null)
		readIt(new DefaultReadingMaterial());
		System.out.println(text);
	}
}

class Runes implements IReadable{
	
	@Override
	public String read() {
		return "Runes are readable too!";
	}
	
}