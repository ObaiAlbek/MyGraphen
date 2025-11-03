# 🕸️ MyGraphen

Dieses Repository enthält eine **generische Graph-Implementierung in Java**, einschließlich Klassen für **Knoten (Nodes)** und **Kanten (Edges)**.  
Das Ziel dieses Projekts ist es, die grundlegenden Konzepte von **Graphdatenstrukturen** zu verstehen und durch eine flexible, generische Implementierung zu demonstrieren.

---

## 📁 Projektstruktur

```

MyGraphen/
├── Graph.java       # Hauptklasse: generische Graph-Implementierung
├── Graphen.pdf      # Theoretische Zusammenfassung oder Aufgabenbeschreibung
├── Kanten.java      # Klasse für Kanten (mit Start- und Zielknoten, Gewicht etc.)
├── Knoten.java      # Klasse für Knoten (mit generischen Datentypen)
├── Test.java        # Testklasse zum Überprüfen der Graph-Funktionalität
└── README.md        # Diese Datei

````

---

## 🧠 Lernziele

- Verständnis der **Graph-Datenstruktur**  
- Umsetzung von **gerichteten und ungerichteten Graphen**  
- Verwendung von **Generics (Generische Typen)** zur Flexibilisierung  
- Modellierung von **Knoten** und **Kanten** als separate Klassen  
- Anwendung grundlegender **Graph-Operationen**:
  - Hinzufügen/Entfernen von Knoten  
  - Hinzufügen/Entfernen von Kanten  
  - Traversierung (z. B. Depth-First- oder Breadth-First-Search)  
  - Anzeige von Adjazenzlisten  

---

## ⚙️ Klassenübersicht

### 🔹 `Graph<T>`
Die zentrale Klasse, die den gesamten Graphen verwaltet.  
Verwendet **Generics**, um beliebige Datentypen als Knoteninhalt zuzulassen.

**Hauptmethoden:**
- `addNode(T value)` – Fügt einen neuen Knoten hinzu  
- `addEdge(T from, T to, int weight)` – Erstellt eine Kante zwischen zwei Knoten  
- `removeNode(T value)` – Entfernt einen Knoten  
- `printGraph()` – Gibt die Adjazenzliste auf der Konsole aus  

---

### 🔹 `Knoten<T>`
Repräsentiert einen **einzelnen Knoten** im Graphen.  
Speichert einen Wert vom Typ `T` und ggf. Referenzen auf benachbarte Knoten.

---

### 🔹 `Kanten<T>`
Repräsentiert eine **Verbindung (Edge)** zwischen zwei Knoten.  
Kann zusätzlich ein **Gewicht (weight)** speichern, falls der Graph gewichtet ist.

---

### 🔹 `Test.java`
Beinhaltet Beispielaufrufe zur Demonstration der Graph-Funktionen.  
Hier werden verschiedene Knoten und Kanten hinzugefügt und der Graph ausgegeben.

---

## ▶️ Ausführung

Kompiliere und starte das Programm mit:

```bash
javac *.java
java Test
````

Oder führe es direkt in einer IDE wie **IntelliJ IDEA** oder **VS Code** aus.

---

## 💡 Beispielausgabe

```text
Knoten hinzugefügt: A
Knoten hinzugefügt: B
Kante hinzugefügt: A -> B (Gewicht: 5)

Graph:
A -> B (5)
B -> 
```
## 🧑‍💻 Autor

**Obai Albek**
Student der Informatik – TH Mannheim
GitHub: [ObaiAlbek](https://github.com/ObaiAlbek)

