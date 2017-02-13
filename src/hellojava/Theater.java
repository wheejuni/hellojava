package hellojava;
import java.util.*;

public class Theater {
	
	Seat newseat;
	static Scanner scanf;
	private int rowCount;
	private int colCount;
	static private Seat seats[][];
	
	
	public Theater (int rowCount, int colCount, Scanner scanner){
		
		this.rowCount = rowCount;
		this.colCount = colCount;
		scanf = scanner;
	}
	
	public void TheaterInit(){
		Seat seatinit = new Seat();
		seatinit.setName("null");
		seats= new Seat [rowCount][colCount];
		for (int i = 0;i < rowCount; i++){
			for (int j = 0;j < colCount; j++){
				seats[i][j] = seatinit;
			}
		}
	}
	
	public String reserve(){
		Seat reserveSeat = new Seat();
		String name;
		String rowString;
		String failMessage1 = "예약하는 좌석이 없습니다.";
		String failMessage2 = "이미 예약된 좌석입니다.";
		String successMessage = "예약에 성공하였습니다.";
		int colInput; 
		int actualCol = 0;
		int actualRow = 0;
		int seatCount; 
		int actualIndexCount = 0; 
		int seatRangeTester = 0;
		int seatRowTester = 0;
		
		System.out.println("이름 :"); name = scanf.next();
		System.out.println("행: "); rowString = scanf.next().toLowerCase();
		System.out.println("열: "); colInput = scanf.nextInt();
		System.out.println("좌석 수: "); seatCount = scanf.nextInt();
		switch(rowString){
		case "a":
			actualRow = 0;
			break;
		case "b":
			actualRow = 1;
			break;
		case "c":
			actualRow = 2;
			break;
		case "d":
			actualRow = 3;
			break;
		case "e":
			actualRow = 4;
			break;
		default:
			actualRow = 5;
			break;
		}
		actualCol = colInput - 1;
		int savedActualCol = actualCol;
		actualIndexCount = seatCount - 1;
		seatRangeTester = actualCol + actualIndexCount;
		seatRowTester = actualRow + 1;
		
		System.out.println("입력받은 좌석: " + rowString.toUpperCase()+ "행" + colInput + "열");
		if (seatRangeTester > (colCount - 1) || seatRowTester > rowCount) {return failMessage1;}
		else 
			for (int i = actualCol; i < actualIndexCount + savedActualCol + 1; i++){
				if(seats[actualRow][i].isOccupied()) return failMessage2;
				else {seats[actualRow][i] = reserveSeat;}}
		reserveSeat.setName(name);
		return successMessage;
			}
	
	
	public void view(){
		String rowString;
		int count = 0;
		boolean repeatSwitch;
		for (int i = 0;i < rowCount; i++){
			for (int j = 0;j < colCount; j++){
				if (seats[i][j].getName() != "null"){
					switch(i){
					case 0:
						rowString = "A";
						break;
					case 1:
						rowString = "B";
						break;
					case 2:
						rowString = "C";
						break;
					case 3:
						rowString = "D";
						break;
					case 4:
						rowString = "E";
						break;
					default:
						rowString = "F";
						break;
					}
					count++;
					System.out.println(count + ". " + rowString + (j + 1) + ": " + seats[i][j].getName());
				}
			}
	}
		
	}
	public void cancel(){
		String cancelResvName = "null";
		String targetName = "null";
		Seat cancelSeat = new Seat();
		cancelSeat.setName("null");
		System.out.println("취소하실 분의 성명 입력: "); 
		cancelResvName = scanf.next();
		System.out.println("입력된 이름은 " + cancelResvName);
		for (int i = 0;i < rowCount; i++){
			for (int j = 0;j < colCount; j++){ 
				if (seats[i][j].getName().equals(cancelResvName)){
					seats[i][j] = cancelSeat;
				}
				
				}
		}
	}
	
	public void showMap(){
		System.out.println("~~~ 코드박스 좌석 배치도 ~~~");
		System.out.print("  "); 
		
		for (int c = 0; c< colCount ; c++){
		 	System.out.print(" "+(c + 1) );
		}
		
		System.out.println();
		for (int j = 0; j < rowCount; j++){
			switch(j){
			case 0:
				System.out.print("A");
				System.out.print(" ");
                for (int seatMarker = 0; seatMarker < colCount; seatMarker++){
                    if (seats[j][seatMarker].isOccupied()) {System.out.print(" ■");}
                    else System.out.print(" □");
                }
                System.out.println();
				break;
			case 1:
				System.out.print("B");
				System.out.print(" ");
                for (int seatMarker = 0; seatMarker < colCount; seatMarker++){
                	if (seats[j][seatMarker].isOccupied()) {System.out.print(" ■");}
                	else System.out.print(" □");
                }
                System.out.println();
				break;
			case 2: 
				System.out.print("C");
				System.out.print(" ");
                for (int seatMarker = 0; seatMarker < colCount; seatMarker++){
                	if (seats[j][seatMarker].isOccupied()) {System.out.print(" ■");}
                	else System.out.print(" □");
                }
                System.out.println();
				break;
			case 3:
				System.out.print("D");
				System.out.print(" ");
                for (int seatMarker = 0; seatMarker < colCount; seatMarker++){
                	if (seats[j][seatMarker].isOccupied()) {System.out.print(" ■");}
                	else System.out.print(" □");
                }
                System.out.println();
				break;
			case 4:
				System.out.print("E");
				System.out.print(" ");
                for (int seatMarker = 0; seatMarker < colCount; seatMarker++){
                	if (seats[j][seatMarker].isOccupied()) {System.out.print(" ■");}
                	else System.out.print(" □");
                }
                System.out.println();
				break;
			}
			}
		
		}
		
		
	}

