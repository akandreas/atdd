# Übung 2: Cucumber (plus Test Automation Gears)
 
Neben den bekannten Unit-Tests, sollen nun auch für den 
`TimeConversionService` Akzeptanztests mit Cucumber bzw. Gherkin 
realisiert werden. Der Tester hat sich für die bereits bekannten 
Anforderungen ein einfaches Testszenario überlegt (siehe 
`TimeConversionService.feature`)

## Aufgabe 1
Installiere folgende Android Studio Plugins 
* Cucumber for Java
* Cucumber for Kotlin
* Gherkin

und führe anschließend den `TimeConversionServiceTest` aus.

Analysiere die Datei `TimeConversionService.feature`, sowie den Glue-
Code in der Klasse `TimeConversionServiceStepDefinitions`. 
Beantworte für Dich folgende Fragen: 
* Worin unterscheiden sich die beiden Testszenarien?
* Wie werden Parameter (wie zum Beispiel die Uhrzeit) übergeben?
* Wo finden sich die BDD-Schlüsselwörter wieder?

Ergänze das `TimeConversionService.feature` um ein weiteres Testszenario 
für die 3. Anforderung (Tagesüberlauf) in Übung 1. 

## Aufgabe 2

Der Tester benötigt nun bei einer **neuen Anforderung** Eure Hilfe:
Mit Eintreten des Brexits will England die im Rest Europas übliche 
Umstellung zwischen Winter- und Sommerzeit nicht mehr mitmachen. 
Stattdessen soll zum Stichtag nur noch die Winterzeit gelten. 

Folgende Sonderfälle sind zu beachten:
 
1. Im Sommer gilt für Deutschland und England dieselbe Zeit (mit 
   Ausnahme des Stundenformats).
2. Die Änderung muss am Tag x aktiviert werden können. 

Erstelle entsprechende Testszenarien, die die neue Anforderung abbilden. 
Wähle dabei Beispiele, die das zu erwartende Verhalten verdeutlichen.  
 
Technische Vorgaben: Der Systemarchitekt stellt in Kürze einen Service 
mit den Terminen zur Zeitumstellung zur Verfügung (31.03.19, 27.10.19, 
29.03.20, 25.10.20, 28.03.21, 31.10.21, ...).

## Aufgabe 3

Erweitere die Klasse `TimeConversionServiceStepDefinitions` und füge den
nötigen Glue-Code für die mit Aufgabe 2 entstandenen Testszenarien hinzu.

Erweitere den "Produktionscode", so dass dem Brexit nichts mehr im Wege 
steht.  