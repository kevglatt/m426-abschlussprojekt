# Sprint 14.05. - 04.06.
## Planning (Rekonstruiert)

- Projekt in GitHub aufsetzen
  - Repository einrichten
  - Kanban board erstellen
    - Tickets erstellen
- Frontend, Backend, Datenbank erstellen
    - React Frontend erstellen
    - Java, SpringBoot Backend erstellen
    - Postgresql Datenbank erstellen
- Docker compose file für die Datenbank damit man lokal entwickeln / testen kann
- Projekt konfigurieren
  - Verbindung zwischen Datenbank und Backend konfigurieren
  - Verbindung zwischen Frontend und Backend konfigurieren

## Review
### Erledigt 
- Projekt in GitHub aufsetzen
- Frontend, Backend, Datenbank erstellen
- Docker compose file für die Datenbank damit man lokal entwickeln / testen kann
### In Bearbeitung
- Projekt konfigurieren
### Reflexion
- Die erledigten Tasks verliefen grundsätzlich gut
- Das Backend konnte mit Hilfe von Herrn Lanza ebenfalls speditiv erstellt werden
- Durch den krankheitsbedingten Ausfall konnte die Konfigurierung des Projekts erst begonnen werden.

# Sprint 04.06. - 25.06.
## Planning (Rekonstruiert)

- Projekt konfigurieren
  - Verbindung zwischen Datenbank und Backend konfigurieren
  - Verbindung zwischen Frontend und Backend konfigurieren
- Implementierung der Tasks der To-Do App
  - DB Tabelle
  - Backend Rest API
  - Frontend Komponente

## Review
### Erledigt
- Projekt konfigurieren
- Implementierung der Tasks der To-Do App
  - DB Tabelle
  - Backend Rest API
  - Frontend Komponente
### Unterbrochen
- Implementierung der Tasks der To-Do App
  - Frontend Komponente
### Reflexion
- Die Projektkonfiguration war umständlicher als gedacht. Besonders die Konfiguration 
von Datenbank und Backend war aufwändig / zeitintensiv.
- Aufgrund des Gesprächs mit Herrn Lanza, mussten die Priorität auf die Dokumentation der 
Agile Prozesse und auf das Deployment auf der Cloud gesetzt werden. Deswegen wurde die Implementierung der Komponente unterbrochen.
- Es war wichtig, Herrn Lanza darüber zu informieren, dass der Workload zurzeit sehr hoch ist. 

# Sprint 25.06. - 09.07.
## Planning

- Dokumentation der Agile Prozesse erweitern
- Tickets ausführlicher beschreiben
- Deployment in der Cloud
  - Container Registry
  - Konfiguration App Service

## Review
### Erledigt
- Deployment in der Cloud
  - Container Registry
### Nicht Begonnen
- Dokumentation der Agile Prozesse erweitern
- Tickets ausführlicher beschreiben
- Deployment in der Cloud
  - Konfiguration App Service
### Reflexion
- Die Erstellung der Container Registry verlief reibungslos.
- Es war jedoch unklar, ob es auf Azure einen geeigneten App-Service gibt, 
auf welchem man mehrere Container orchestrieren kann.
- Am naheliegendsten ist, den ECS von AWS zu verwenden.
- Aufgrund von gleich zwei krankheitsbedingten Ausfällen konnte nicht mehr alles rechtzeitig 
fertiggestellt werden. 
- Es wurde deshalb eine spätere Abgabe in den Sommerferien mit Herrn Lanza besprochen. 
- Auch Herr Feuchter wurde wegen der vielen Absenzen informiert. 
- Alle Beteiligten sind mit der späteren Abgabe einverstanden.

# Sprint 09.07. - 26.07.
## Planning

- Dokumentation der Agile Prozesse erweitern
  - Dailies
  - Sprints
- Tickets ausführlicher beschreiben
- Deployment in der Cloud
  - Frontend Deployment
  - Backend Deployment
  - Datenbank Deployment

## Review
### Erledigt
- Dokumentation der Agile Prozesse erweitern
  - Dailies 
  - Sprints
- Deployment in der Cloud
  - Frontend Deployment
#### Nicht eingeplant
- Continuous Deployment GitHub Workflow
### Abgebrochen
- Tickets ausführlicher beschreiben
- Deployment in der Cloud
  - Backend Deployment
  - Datenbank Deployment

### Reflexion
- Angesichts der Menge an anderen Arbeiten, die noch erledigt werden müssen, 
wird das Ergänzen der Ticketbeschreibung weggelassen, ebenso das Deployment des 
Backends und der Datenbank.
- Die Azure Container App mit dem Frontend Container aus der Azure Container Registry funktioniert
und kann über den Link besucht werden https://frontend.jollyforest-64db3974.eastus.azurecontainerapps.io
- Ursprünglich nicht eingeplant war das Erstellen des Continuous Deployment mit dem GitHub Workflow. 
Ging erstaunlicherweise recht schnell und funktionierte auf Anhieb.

#### Abschluss vom Projekt
Ich bin froh, habe ich die Lehrpersonen frühestmöglich über die belastende Situation informiert. Die zusätzliche Zeit 
bis zur Abgabe war sehr wichtig, dass ich mich auf die Vormaturitätsprüfungen in der BMS konzentrieren, und die 
Projekte meinen Ansprüchen gerecht fertigstellen konnte. Ich hätte gerne noch etwas mehr Zeit für das Deployment aufgewendet,
um zu sehen, wie man ein solches Projekt korrekt und vollständig publiziert. 