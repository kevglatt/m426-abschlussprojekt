Projektdefinition - ToDo App 
================
Kevin Glatthard
____
Eine simple ToDo Web-Applikation, wo man Tasks hinzufügen, entfernen und bearbeiten kann.

Mögliche Erweiterungen könnten sein:

- Tasks können priorisiert werden
- Tasks können voneinander abhängig sein
- Tasks können Sub-tasks haben


Techstack
------

- PostgreSQL
- Java 
- Spring Boot
- Tailwind
- React (noch offen)

Dailys
======
14.05.24
----------
Um vom Docker Modul 347 noch einige Punkte aufzugreifen, 
wäre es sinnvoll eine Docker-Registry zu haben. Dorthin sollen die Images
gepusht und im Projekt von dort gepullt werden. 

Heute werden Tasks fürs 
Backlog erfasst, ein GitHub Repository und Docker Registry erstellt werden. 
Wenn noch Zeit übrig ist, könnte man sich mit den CI/CD Möglichkeiten von GitHub 
auseinander setzen.

21.05.24
--------
Die Docker Images sollen vorläufig als Packages auf GitHub hochgeladen werden. 
Falls dann noch genügend Zeit ist, kann noch eine Docker-Registry eingebunden werden.

Der heutige Task besteht darin, das Java Spring-Boot Backend aufzusetzen. 
Zudem soll Lombock eingebunden werden. 

