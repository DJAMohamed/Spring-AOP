package m2i.formation.spring;

public class Guitariste implements IMusicien {
	private IInstrument instrument;

	public Guitariste() {
		super();
		
	}

	public Guitariste(IInstrument instrument) {
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
	@M2iLog
	public void jouer() {
		System.out.println("Le guitariste joue : " + this.instrument.toString());
	}
	
	public void afterInjection() {
		System.out.println(this.instrument.getClass().getSimpleName());
	}
	

}
