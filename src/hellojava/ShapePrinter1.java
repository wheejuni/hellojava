package hellojava;

public class ShapePrinter1 {
	
public int upperRowLastFig = 0;
	
	int padDecider(int height){
		
		int maxValue = 0;
		int length = 0;
		String maxLength = null;
		maxValue = height * (1 + height) / 2;
		maxLength = Integer.toString(maxValue);
		length = maxLength.length();
		return length;
	}


	int lastFigDecider (int lastFig){
		 
		int lastFigure = lastFig + 1;
		return lastFigure;
	}

	void drawTriangle(int height){
		ShapePrinter1 newInit = new ShapePrinter1();
		int length = newInit.padDecider(height);
		int last = 0;
		
		for (int i = 0; i < height; i++){
			System.out.println();
			for (int z = -1; z < i; z++){
				last = newInit.lastFigDecider(upperRowLastFig);
				
				if (length == 3){
					if (10 <= last && last < 100) System.out.print(" ");
					if (last < 10) System.out.print("  ");
				}
				
				else if (length == 2){
					//if (last >= 10) System.out.print(" ");
					if (last < 10) System.out.print(" ");
					
				}
				System.out.print(last);
				System.out.print(" ");
				upperRowLastFig = last; 
				
			}
		}
		upperRowLastFig = 0;
	}

}
