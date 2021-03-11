package m2i.formation.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("m2i.formation.spring")
public class ApplicationConfig {

	@Bean
	public IInstrument guitare() {
		return new Guitare();
	}
	
	@Bean
	public IInstrument ukulele() {
		return new Ukulele();
	}
	
	@Bean(initMethod = "afterInjection")
	public IMusicien guitariste() {
		Guitariste guitariste = new Guitariste();
		guitariste.setInstrument(ukulele());
		return guitariste;
	}
}
