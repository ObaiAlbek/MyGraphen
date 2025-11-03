package Graphen;

public class Kanten<T>  {
	// jede Kante verbindet zwei Knoten
	private Knoten anfangsKnote;
	private Knoten endeKnote;
	private T gewicht;

	
	public Kanten(Knoten anfangsKnote, Knoten endeKnote, T gewicht) {
		this.anfangsKnote = anfangsKnote;
		this.endeKnote = endeKnote;
		this.anfangsKnote.addKante(this);
		this.endeKnote.addKante(this);
		this.gewicht = gewicht;
	}

	

	public Knoten getPartner(Knoten k) {
		if (k == anfangsKnote)
			return endeKnote;
		else
			return anfangsKnote;
	}

	public T getGewicht() {
		return gewicht;
	}

	


}
