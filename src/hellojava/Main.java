package hellojava;

public class Main {
	
	public static void main (String args[]){
		   ShapePrinter1 printer = new ShapePrinter1();

	        // Å×½ºÆ®
	        printer.drawTriangle(3);
	        System.out.println();
	        System.out.println("----------");
	        printer.drawTriangle(5);
	        System.out.println();
	        System.out.println("----------");
	        printer.drawTriangle(15);
		
		
	}

}
