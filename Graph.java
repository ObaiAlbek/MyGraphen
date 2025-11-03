package Graphen;

import java.util.*;

//Generische Graph-Klasse
class Graph<T> {

 // Wir verwenden eine HashMap, um die Kanten im Graphen zu speichern
 private Map<T, List<T>> kanten = new HashMap<>();

 // Diese Funktion fügt einen neuen Knoten (Vertex) zum Graphen hinzu
 public void knotenHinzufügen(T k) {
     kanten.put(k, new LinkedList<T>());
 }

 // Diese Funktion fügt eine Kante zwischen Quelle und Ziel hinzu
 public void kanteHinzufügen(T quelle, T ziel, boolean bidirektional) {

     if (!kanten.containsKey(quelle))
         knotenHinzufügen(quelle);

     if (!kanten.containsKey(ziel))
         knotenHinzufügen(ziel);

     kanten.get(quelle).add(ziel);
     if (bidirektional) {
         kanten.get(ziel).add(quelle);
     }
 }

 // Diese Funktion gibt die Anzahl der Knoten im Graphen zurück
 public void anzahlKnoten() {
     System.out.println("Der Graph hat " + kanten.keySet().size() + " Knoten.");
 }

 // Diese Funktion gibt die Anzahl der Kanten im Graphen zurück
 public void anzahlKanten(boolean bidirektional) {
     int anzahl = 0;
     for (T k : kanten.keySet()) {
         anzahl += kanten.get(k).size();
     }
     if (bidirektional) {
         anzahl = anzahl / 2;
     }
     System.out.println("Der Graph hat " + anzahl + " Kanten.");
 }

 // Diese Funktion prüft, ob ein bestimmter Knoten vorhanden ist
 public void hatKnoten(T k) {
     if (kanten.containsKey(k)) {
         System.out.println("Der Graph enthält " + k + " als Knoten.");
     } else {
         System.out.println("Der Graph enthält " + k + " nicht als Knoten.");
     }
 }

 // Diese Funktion prüft, ob eine Kante zwischen zwei Knoten existiert
 public void hatKante(T quelle, T ziel) {
     if (kanten.get(quelle).contains(ziel)) {
         System.out.println("Der Graph hat eine Kante zwischen " + quelle + " und " + ziel + ".");
     } else {
         System.out.println("Der Graph hat keine Kante zwischen " + quelle + " und " + ziel + ".");
     }
 }

 // Diese Funktion gibt die Nachbarn eines Knotens aus
 public void nachbarn(T k) {
     if (!kanten.containsKey(k)) 
         return;
     System.out.println("Die Nachbarn von " + k + " sind:");
     for (T nachbar : kanten.get(k)) {
         System.out.print(nachbar + ", ");
     }
 }

 // Gibt die Adjazenzliste jedes Knotens aus
 @Override
 public String toString() {
     StringBuilder builder = new StringBuilder();

     for (T k : kanten.keySet()) {
         builder.append(k.toString() + ": ");
         for (T nachbar : kanten.get(k)) {
             builder.append(nachbar.toString() + " ");
         }
         builder.append("\n");
     }

     return (builder.toString());
 }
}

//Hauptklasse
class Main {

 public static void main(String[] args) {

     // Objekt des Graphen wird erstellt
     Graph<Integer> graph = new Graph<>();

     // Kanten werden hinzugefügt.
     // Da der Graph bidirektional ist, wird true übergeben
     graph.kanteHinzufügen(0, 1, true);
     graph.kanteHinzufügen(0, 4, true);
     graph.kanteHinzufügen(1, 2, true);
     graph.kanteHinzufügen(1, 3, true);
     graph.kanteHinzufügen(1, 4, true);
     graph.kanteHinzufügen(2, 3, true);
     graph.kanteHinzufügen(3, 4, true);

     // Graph ausgeben
     System.out.println("Graph:\n" + graph.toString());

     // Anzahl der Knoten im Graphen
     graph.anzahlKnoten();

     // Anzahl der Kanten im Graphen
     graph.anzahlKanten(true);

     // Prüfen, ob eine bestimmte Kante existiert
     graph.hatKante(3, 4);

     // Prüfen, ob ein bestimmter Knoten existiert
     graph.hatKnoten(5);

     // Nachbarn eines Knotens ausgeben
     graph.nachbarn(1);
 }
}