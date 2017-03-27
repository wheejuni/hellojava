package hellojava;

public class Main2 {
	
	public static void main(String[] args) {
        Artist keithJarrett = new Artist("Keith Jarrett");

        Album theMelodyAtNightWithYou = new Album("The Melody At Night With You", 1999, keithJarrett);
        theMelodyAtNightWithYou.addTrack(new Song("I Loves You, Porgy", keithJarrett, theMelodyAtNightWithYou));
        theMelodyAtNightWithYou.addTrack(new Song("I Got It Bad (and That Ain't Good)", keithJarrett, theMelodyAtNightWithYou));
        theMelodyAtNightWithYou.addTrack(new Song("Don't Ever Leave Me", keithJarrett, theMelodyAtNightWithYou));
        theMelodyAtNightWithYou.addTrack(new Song("Someone to Watch over Me", keithJarrett, theMelodyAtNightWithYou));

        Album insideOut = new Album("Inside Out", 2001, keithJarrett);
        insideOut.addTrack(new Song("From the Body", keithJarrett, insideOut));
        insideOut.addTrack(new Song("Inside Out", keithJarrett, insideOut));

        keithJarrett.addAlbum(theMelodyAtNightWithYou);
        keithJarrett.addAlbum(insideOut);

        Artist bts = new Artist("¹æÅº¼Ò³â´Ü");

        Album darkAndWild = new Album("DARK & WILD", 2014, bts);
        darkAndWild.addTrack(new Song("Intro: What am I to You", bts, darkAndWild));
        darkAndWild.addTrack(new Song("Danger", bts, darkAndWild));

        Album wings = new Album("WINGS", 2016, bts);
        wings.addTrack(new Song("Intro: Boy Meets Evil", bts, wings));
        wings.addTrack(new Song("ÇÇ ¶¡ ´«¹°", bts, wings));
        wings.addTrack(new Song("Begin", bts, wings));
        wings.addTrack(new Song("Lie", bts, wings));


        bts.addAlbum(darkAndWild);
        bts.addAlbum(wings);
        
        Artist RedVelvet = new Artist("·¹µåº§ºª");
        
        Album Rookie = new Album("Rookie" , 2017, RedVelvet);
        Rookie.addTrack(new Song("Rookie", RedVelvet, Rookie));
        Rookie.addTrack(new Song ("Little Little", RedVelvet, Rookie));
        
        RedVelvet.addAlbum(Rookie);

        System.out.println(keithJarrett.getAlbums().get(1).getTrack(1).toString());
        System.out.println();
        System.out.println(bts.getAlbums().get(0).getTrack(1).toString());
        System.out.println();
        System.out.println(RedVelvet.getAlbums().get(0).getTrack(0).toString());
    }

}
