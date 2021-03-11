package m2i.formation.spring;

public class InstrumentFactory {
	public static IInstrument getInstrument() {
		return new Ukulele();
	}
}