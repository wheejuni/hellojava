package hellojava;
import java.util.*;


public class Album {
	
	private String title;
	Artist newArtist;
	private int releaseYear;
	private ArrayList <Song> tracklist = new ArrayList<Song>();
	
	public Album(String title, int releaseYear, Artist artist){
		this.title = title;
		this.releaseYear = releaseYear;
		this.newArtist = artist;
		
	}
	
	void addTrack(Song newSong){
		tracklist.add(newSong);
	}
	Song getTrack(int track){
		return tracklist.get(track);
	}
	
	String getTitle(){
		return this.title;
	}
	
	int getYear(){
		return this.releaseYear;
	}
	
	
}
