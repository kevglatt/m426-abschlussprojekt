Dailies
======
14.05.24
----------
Heute werden Tasks fürs Backlog (Kanban-board) und ein Repository auf GitHub erstellt werden. 
Wenn noch Zeit übrig ist, könnte man sich mit den CI/CD Möglichkeiten von GitHub 
auseinandersetzen.

21.05.24
--------
Der heutige Task besteht darin, das Java Spring-Boot Backend aufzusetzen. 
Zudem soll Lombock eingebunden werden.

28.05.24
--------
Krankheitsbedingter Ausfall

04.06.24
-------
Heute soll die Datenbank erstellt werden. 
Dazu ein docker-compose file für die Lokale Entwicklung erstellt werden.

Der nächste Task wird sein, die Verbindung von der DB zum Backend und
vom Backend zum Frontend herzustellen

11.06.24
--------
Die Konfiguration der zwischen Backend und Datenbank ist umständlicher als gedacht.
Diese ist noch abzuschliessen.
 

18.06.24
--------
Die Konfiguration zwischen Frontend und Backend ist noch abzuschliessen. Danach sollen noch die wichtigsten Endpunkte der Backend-API erstellt werden.
Anschliessend geht es an die implementierung der Tasks im Frontend.

Herr Lanza wurde informiert, dass der Stress zurzeit sehr hoch ist. Zudem wurde ich darauf hingewiesen,
dass das Projekt nicht zwingend fertiggestellt werden muss und dass die Dokumentation der Scrum Prozesse 
für das Modul wichtiger ist. Herr Lanza hat mit mir kurzerhand einen Zeitplan für die verbleibenden Projekttage
aufgestellt. Es sollen idealerweise pro Doppellektion Zeitblöcke für die Dokumentation der Scrum Prozesse reserviert 
werden. Die restliche Zeit kann für die Entwicklung/Deployment des Projekts verwendet werden. 

25.06.24
--------
Krankheitsbedingter Ausfall

02.07.24
--------
Krankheitsbedingter Ausfall

Es wurde trotzdem der Stand des Projekts und der weitere Verlauf des Projekts besprochen. 
Der Abgabetermin wurde bis auf Weiteres in die Sommerferien verschoben. 
Ich habe mir vorgenommen, dass das Projekt bis spätestens am Freitag, dem 26.07. (vor meinen Sommerferien) 
abzuschliessen.

09.07.24
--------

Heute soll mit dem Deployment begonnen werden. 
Nach dem Review mit Herrn Lanza steht fest, dass rückblickend noch 
Sprintplannings und Sprintreviews erstellt werden müssen.
Dabei können auch die Abwesenheiten als Argument für die Plannings/Reviews
vermerkt werden. 

22.07.24
--------

Heute muss die Dokumentation der Scrum Prozesse gemäss den Vorgaben erweitert/verbessert werden. 
Um die Übersicht zu verbessern, sollen die Projektdefinition, die Sprints und die Dailies in separate 
Dateien aufgegliedert werden. Nachdem die Doku ergänzt wurde, kann das Deployment für das Modul 347 
dementsprechend dokumentiert werden. 

23.07.24
-------

Die Dokumentation konnte gestern so weit ergänzt werden, dass ich heute mit dem Deployment beginnen kann. 
Ich habe mir vorgenommen einen Container Service von Azure dafür zu verwenden, da ich die Images bereits auf 
die Azure Container Registry gepusht habe. Leider haben wir im modul nur den Container Service von AWS verwendet, 
weshalb ich mich zuerst einlesen muss, welcher Service von Azure für das Projekt geeignet ist.

24.07.24
--------
Ich konnte gestern das Frontend in einer Azure Container App publizieren. Beim Erstellen des Service
wollte ich rollenbasierte Zugriffsrechte zuweisen, damit die Azure Container App auf die Azure Container Registry
zugreifen kann. Ich musste aber feststellen, dass das sehr komplex ist, weshalb ich einfach Adminrechte zugewiesen habe.
Zum Erstellen der continuous integration habe über Azure einen GitHub Workflow erzeugt, der direkt funktioniert hat. 
Ich habe mich dagegen entschieden, das Backend und die Datenbank zu deployen. Grund dafür ist,
dass ich mit vielen Konfigurationsproblemen rechne, welche viel Zeit in Anspruch nehmen würden. 

Ich schliesse das Abschlussprojekt und das dazugehörende Deployment somit ab.