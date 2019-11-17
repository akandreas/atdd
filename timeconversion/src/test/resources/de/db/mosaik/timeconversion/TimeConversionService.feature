# language: de

Funktionalität: Time Conversion Service

  Szenario: Deutschland ist eine Stunde voraus
    Angenommen es ist 05:00 Uhr in Deutschland
    Wenn der Zugbegleiter nach der Uhrzeit in England gefragt wird
    Dann ist es 04:00 Uhr in England

  Szenario: England nutzt das 12-Stunden Format
    Angenommen es ist 15:00 Uhr in Deutschland
    Wenn der Zugbegleiter nach der Uhrzeit in England gefragt wird
    Dann ist es 02:00 Uhr in England
