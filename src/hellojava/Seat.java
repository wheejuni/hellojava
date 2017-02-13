package hellojava;

public class Seat {
	private String name = "null";
	Theater theaterCall;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void cancel(){
		this.setName("null");
	}
	
	public boolean isOccupied(){
		if (this.name != "null") return true;
		return false;
	}
	public boolean match(String checkName){
		if (this.name == checkName)
			return true;
		return false;
	}
	
}

