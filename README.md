# SWT2-Test
SWT2 - Qualitätssicherung und Testen


Vorgehensweise:
- Überführung in Maven-Projekt (automatische Erstellung durch IntelliJ)
- Anstoßen von Kompilier- und Testvorgänge durch Ausführen von maven test in IntelliJ, alternativ manuelle Ausführung der einzelnen Tests
- Einfügen in pom.xml von: JUnit und AssertJ als dependency
- Einfügen von plugin jacoco version 0.8.8 in pom.xml, copy paste von Konfiguration von baeldung.com/jacoco
- jacoco unterstützt Abdeckung von Instructions, Lines und Branches
- Konfiguration dieser Abdeckungsarten in pom.xml: TODO: Bild einfügen
- Schreiben von Tests
- Verbesserungen ermittelt durch Tests:  
  -  Semikolon in Zeile 34
  -  Iterator next-Funktion ab Zeile 60 gefixt (speichere aktuelles current Element zwischen, setze current auf nächstes Element und gib aktuelles Element zurück)
-  Einfügen Spotbus-Plugin in pom.xml und Aktivieren von allen Java-Compiler Warnungen auch in pom.xml
