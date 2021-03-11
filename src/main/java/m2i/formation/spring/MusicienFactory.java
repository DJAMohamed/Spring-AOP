package m2i.formation.spring;

public class MusicienFactory {
	public static IMusicien getMusicien() {
		return new Guitariste(InstrumentFactory.getInstrument());
	}
}
