package hellojava;
import hellojava.NumBaseball;


class makerandint{
	int[] chucheom(){
		
		int randomlist[];
		makearray makerandomlist = new makearray();
		randomlist = makerandomlist.throwball();
		return randomlist;
		
		
	}
	
	int[] autoselect(){
		
		int randomuser[];
		makearray makeautoselect = new makearray();
		randomuser = makeautoselect.throwball();
		return randomuser;
	}
	
	
	
}


public class lotto {
	public static void main (String args[]){
		
		int[] a;
		
		makerandint randomdigit = new makerandint();
		a = randomdigit.chucheom();
		
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
		
	}

}
