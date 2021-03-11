package m2i.formation.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import m2i.formation.spring.Guitare;
import m2i.formation.spring.Guitariste;
import m2i.formation.spring.IMusicien;
import m2i.formation.spring.Pianiste;
import m2i.formation.spring.Piano;
import m2i.formation.spring.Ukulele;

public class PrincipalSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		IMusicien myMusicien = (IMusicien) context.getBean("guitariste");
		myMusicien.jouer();

//		IMusicien myMusicienBis = context.getBean(IMusicien.class); // ok si un seul et unique bean implemente IMusicien
//		myMusicienBis.jouer();

		IMusicien myMusicienTer = context.getBean("pianiste", IMusicien.class);
		myMusicienTer.jouer();

		context.close();
	}

	private static void ceQueFaitSpringPourNous() {
		Guitare guitare = new Guitare();

		Ukulele ukulele = new Ukulele();

		Piano piano = new Piano();

		Guitariste guitariste = new Guitariste();

		Pianiste pianiste = new Pianiste(piano);

		guitariste.setInstrument(guitare);
//		pianiste.setInstrument(piano);

		guitariste.afterInjection();
	}
}
