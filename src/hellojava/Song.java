package hellojava;

public class Song {
	
	private String title;
	Artist artist;
	Album album;
	
	public Song(String title, Artist artist, Album album){
		
		this.title = title;
		this.artist = artist;
		this.album = album;
	}
	
	String getTitle(){
		return this.title;
	}
	
	public String toString(){
		String returnForm = this.title + " - " + this.artist.getName() + "\n" + this.album.getTitle() + "(" + this.album.getYear() + ")";
		return returnForm;
	}
	
	

}
