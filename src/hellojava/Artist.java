package hellojava;
import java.util.*;

public class Artist {
	
	private String name;
	ArrayList<Album> albumlist = new ArrayList<Album>();
	
	public Artist(String name){
		this.name = name;
	}
	
	String getName(){
		return this.name;
	}
	
	void addAlbum(Album album){
		albumlist.add(album);
		
	}
	ArrayList<Album> getAlbums(){
		return albumlist;
	}	
}
