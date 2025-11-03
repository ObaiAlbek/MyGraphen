package Graphen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Knoten<T> {
	private T id;
	private ArrayList<Kanten> kantenList;

	Knoten(T id) {
		this.id = id;
		this.kantenList = new ArrayList<>();
	}

	// add kante zu this (knote)
	public void addKante(Kanten k) {
		kantenList.add(k);
	}

	public T getId() {
		return id;
	}

	// Grad ist die Anzahl der Kanten an einem Knoten
	public int getGrad() {
		return kantenList.size();
	}

	public ArrayList<Kanten> getKantenList() {
		return kantenList;
	}

	public void getPartner() {
		if (kantenList == null)
			return;

		ArrayList<Knoten<T>> verbindeteKnoten = new ArrayList<>();
		for (Kanten m : kantenList)
			verbindeteKnoten.add(m.getPartner(this));
	}

	@Override
	public String toString() {
		return this.id + " ";
	}

}
