package hellojava;
import java.util.*;
public class Driver {
	static Scanner scanner = new Scanner(System.in);
	public static void main (String args[]){
		String optionChoice;
		
		Theater heytheater = new Theater(5, 9, scanner);
		heytheater.TheaterInit();
		
		while(true){
			
		heytheater.showMap();
		System.out.println();
		System.out.println("□:예약 가능, ■:예약 불가");
		System.out.println("(R)eserve, (V)iew, (C)ancel, (Q)uit:");
		optionChoice = scanner.next().toLowerCase();
		
		
		switch(optionChoice){
		
		case "r":
			System.out.println(heytheater.reserve());
			break;
		case "v":
			heytheater.view();
			break;
		case "c":
			heytheater.cancel();
			break;
		case "q":
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		
		}
		}
}
}
