package mars.mission.control;

public class MarsControl {

	public static void main(String[] args) {	
	int risultato = valutaLancio(1000, 600, true);
	System.out.println("Esito missione: " + risultato);

	}
	public static int valutaLancio(int peso, double carburante, boolean sistemiOK) {
		boolean prontoAlLancio = true;
		if (!sistemiOK) {
			System.out.println("ERRORE: Sistemi di bordo in avaria!");
			prontoAlLancio = false;
		}
		if (peso >= 10000) {
			System.out.println("ERRORE: Sovrappeso rivelato (" + peso + "kg)!");
			prontoAlLancio = false;
		}
		if (carburante <= 599.99) {
			System.out.println("ERRORE: Carburante insufficiente (" + carburante + "L)!");
			prontoAlLancio = false;
		}
		if (prontoAlLancio) {
			System.out.println("Tutti i parametri nominali. Autorizzazione al lancio concessa");
			return 1; // Successo!
		} else {
			System.out.println("Lancio abortito. Correggere le anomalie sopra indicate");
			return 0; // Missione fallita!
		}
		 	
		
	}
}
