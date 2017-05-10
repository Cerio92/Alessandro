package program;

public class Risorsa {
	final int maxQuantit� = 40;
	private int quantit�;

	public Risorsa() {
		quantit� = maxQuantit�;
	}

	public synchronized void incrementa() {
		this.quantit�++;
	}

	public synchronized void riempi() {
		while (quantit� != 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		this.quantit� = maxQuantit�;
		System.out.println("Risorsa riempita");
		notifyAll();
	}

	public synchronized boolean decrementa() {

		while (quantit� <= 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		if (quantit� > 0) {
			this.quantit�--;
			System.out.println("Risorsa presa");
			notifyAll();
			return true;
		} else
			return false;
	}

	public int getQuantit�() {
		return this.quantit�;
	}

}
