package main.game.spaces;

import main.game.players.PuntiGiocatore;

/**
 * Interfaccia che definisce il concetto di Spazio all'interno del Gioco
 */
public interface Spazio {

	/**
	 * Ritorna un valore booleano per determina se lo Spazio � occupato
	 * @return true se occupato
	 */
	public boolean spazioOccupato();

	/**
	 * Punti Giocatore richiesti per occupare lo Spazio
	 * 
	 * @return PuntiGiocatore
	 */
	public PuntiGiocatore puntiRichiesti();

}