package m2i.formation.spring;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pianiste implements IMusicien {
	
	private IInstrument instrument;

	public Pianiste() {
		super();
	}
	@Autowired
	public Pianiste( @Qualifier("piano") IInstrument instrument) {
		super();
		this.instrument = instrument;
	}

	public IInstrument getInstrument() {
		return instrument;
	}

	public void setInstrument(IInstrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public void jouer() {
		System.out.println("Le Pianiste joue : " + this.instrument.toString());
		throw new RuntimeException("Fausse note !!!");
	}
	
	@PostConstruct
	public void afterInjection() {
		System.out.println(this.instrument.getClass().getSimpleName());
	}

}
