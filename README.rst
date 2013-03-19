=========
Aufgabe 1
=========

Erstellen Sie ein Programm, das beim Starten sieben Fenster öffnet. Verwenden Sie dafür ein Array für mehrere Objekte der Klasse JFrame. Das erste Fenster soll (initial) die Größe 200x200, das zweite die Größe 300x300, das dritte die Größe 400x400 usw. haben. Die Titel der Fenster sollen „Fenster1“, „Fenster2“ etc. lauten. In jedem Fenster soll außerdem der Schriftzug "Moin" angezeigt werden. Sorgen Sie dafür, dass initial kein Fenster vollständig von einem anderen verdeckt wird.

---------
Hinweise:
---------
- Klasse JFrame
	+ Der Titel des Fensters kann bei JFrame entweder beim Erzeugen (d.h. per Konstruktor) oder mit der Methode JFrame.setTitle(...) angegeben werden.
	+ Damit das Fenster sichtbar wird, muss die Methode JFrame.setVisible(...) aufgerufen werden o Mit der Methode JFrame.setSize(...) können Sie die (initiale) Größe eines Fensters bestimmen.
	+ Mit der Methode setLocation(...) können sie ein Fenster an einer bestimmten Stelle auf dem Bildschirm anzeigen.
	+ Rufen Sie für Ihre Objekte der Klasse JFrame die Methode setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) auf, um dafür zu sorgen, dass beim Schließen eines Fensters immer das gesamte Programm beendet wird.
	+ Mit der Anweisung ClassX[] objectsX = new ClassX[100] werden lediglich 100 Referenzen auf Objekte der Klasse ClassX erzeugt, noch keine Objekte selbst! Objekte werden mit objectsX [0] = new ClassX() (usw.) erzeugt.

- Zum Anzeigen des Schriftzugs können Sie die Klasse JLabel verwenden. Ein Objekt dieser Klasse können Sie dem Fenster mit der Methode JFrame.add(...) hinzufügen.
	+ Die Klasse JLabel besitzt die Funktion JLabel.setText(...), um den Schriftzug zu definieren. Alternativ kann der Schriftzug per Konstruktor angegeben werden.
