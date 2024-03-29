package main.game.cards.development;

import main.game.activatables.Effetto;
import main.game.players.PuntiGiocatore;
import main.game.players.RiservaGiocatore;
import main.game.players.RisorseGiocatore;

/**
 * Classe che implementa il concetto di CartaSviluppo di tipo Territorio
 */
public class CartaTerritorio extends CartaSviluppo {

	private CarteTerritorio carta;

	public CarteTerritorio getCarta() {
		return this.carta;
	}

	public CartaTerritorio(CarteTerritorio carta) {

		super(carta.getNomeCarta(), carta.getPeriodoCarta(),
				new RiservaGiocatore(
						new RisorseGiocatore(carta.getLegna(), carta.getMonete(), carta.getPietra(),
								carta.getServitori()),
						new PuntiGiocatore(carta.getPuntiFede(), carta.getPuntiMilitari(), carta.getPuntiVittoria())),
				carta.getSogliaPuntiMilitari(), Effetto.nomeEffettoToArrayEffetti(carta.getNomeEffettoImmediato()),
				Effetto.nomeEffettoToArrayEffetti(carta.getNomeEffettoPermanente()));

		this.carta = carta;

		/*
		 * Guardo negli effetti quelli che hanno l'effetto principale indicato
		 * nella carta e riempio l'arraylist degli effetti indicati nelle
		 * alternative dell'effetto principale (es. con l'effetto
		 * PRIVILEGIO_DEL_CONSIGLIO scorro l'enum e riempio l'arraylist di tutti
		 * gli effetti alternativi di PRIVILEGIO_DEL_CONSIGLIO). Ditemi se può
		 * andare bene o se invece ho sbagliato qualcosa
		 */
		// for (Effetti eTemp1 : Effetti.values()) {
		// if (c.getEffImm() == eTemp1.getEffettoPrincipale() &&
		// !(eTemp1.getEffettoAlternativo() == null)) {
		// for (Effetti eTemp2 : Effetti.values()) {
		// if (eTemp1.getEffettoAlternativo() == eTemp2.getEffettoPrincipale())
		// this.effettiImmediati.add(0, new Effetto(eTemp2));
		// }
		// }
		// if (c.getEffImm() == eTemp1.getEffettoPrincipale() &&
		// eTemp1.getEffettoAlternativo() == null)
		// this.effettiImmediati.add(0, new Effetto(eTemp1));
		// }
		/*
		 * Faccio la stessa cosa con gli effetti permanenti
		 */
		// for (Effetti eTemp1 : Effetti.values()) {
		// if (c.getEffPerm() == eTemp1.getEffettoPrincipale() &&
		// !(eTemp1.getEffettoAlternativo() == null)) {
		// for (Effetti eTemp2 : Effetti.values()) {
		// if (eTemp1.getEffettoAlternativo() == eTemp2.getEffettoPrincipale())
		// this.effettiPermanenti.add(0, new Effetto(eTemp2));
		// }
		// }
		// if (c.getEffPerm() == eTemp1.getEffettoPrincipale() &&
		// eTemp1.getEffettoAlternativo() == null)
		// this.effettiPermanenti.add(0, new Effetto(eTemp1));
		// }
	}

}
