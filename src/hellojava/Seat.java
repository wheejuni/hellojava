package hellojava;

public class Seat {
	private String name = null;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void cancel(){
		this.setName(null);
	}
	
	public boolean isOccupied(){
		if (this.name != null) return true;
		return false;
	}
	public boolean match(String checkName){
		if (this.name.equals(checkName)) return true;
		return false;
	}
}

