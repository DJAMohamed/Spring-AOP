package m2i.formation.spring.test;

import m2i.formation.spring.IMusicien;
import m2i.formation.spring.MusicienFactory;

public class Principal {

	public static void main(String[] args) {
		IMusicien myMusicien = MusicienFactory.getMusicien();
		myMusicien.jouer();
	}

}
