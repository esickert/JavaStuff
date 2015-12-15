
public class HelloWorld {

	public static void main(String[] args) {
		
		int[] stuff = new int[10];

		System.out.println("Hello World");
		for( int i: stuff)	{
			i++;
			System.out.print(i);
			System.out.println(" line 14");
		}
		System.out.println();
			
		Countries poland = new Countries("Warsaw");
		Countries slovakia = new Countries("Bratislava");
		Cities paris = new Cities();
		poland.printMe();
		
		poland.multiplePrints("heyMe", 3);
		poland.printMessages('9');
			
		slovakia.printMe();
		slovakia.printMessages('2');
		System.out.println();
		
		poland.putString("\nHello Poland welcome");
		System.out.println(poland.getString());
		paris.forLoop();
		paris.printMsg();
		paris.conditonalStatement("you there");
		System.out.println(paris.recExp(5));
	}

}
