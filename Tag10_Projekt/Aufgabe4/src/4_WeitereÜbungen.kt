import java.security.Key

fun main() {

        /* Gegeben ist die folgende Map, die Fahrzeuge zu ihrer Geschwindigkeit in Km/h mappt:

        "Auto" -> 120.5
        "Flugzeug" -> 755.2
        "Fahrrad" -> 22.0
        "Tretroller" -> 15.7
        Erstelle eine passende Map, die initial die genannten Paare besitzt. */

    var fahrzeugGeschwindigkeiten = mapOf(
        "Auto" to  120.5,
        "Flugzeug" to  755.2,
        "Fahrrad" to  22.0,
        "Tretroller" to  15.7)

        /* a) Erstelle ein kleines Programm, dass die Schlüssel der Map aufsteigend sortiert (auch: natürlich sortiert) ausgibt. Führe dabei folgende Teilschritte aus:
        Erhalte die Schlüssel als Liste.
        Sortiere die Schlüssel.
        Gib die Schlüssel aus.
        Wenn du dich sicher fühlst, kannst du die drei Teilschritte
        mit nur einer Codezeile durchführen.

        Überprüfe dann dein Ergebnis. Sind die Schlüssel (alphabetisch) sortiert? */

    var fahrzeugGeschwindigkeitenToKey = fahrzeugGeschwindigkeiten.keys
    var fahrzeugGeschwindigkeitenToList = fahrzeugGeschwindigkeitenToKey.toList()

    println(fahrzeugGeschwindigkeiten)
    var fahrzeugGeschwindigkeitenKey2 = fahrzeugGeschwindigkeitenToList.sorted()
    println(fahrzeugGeschwindigkeitenKey2)


    /* b) Erstelle ein kleines Programm, dass die Werte der Map aufsteigend sortiert (auch bekannt als: natürlich sortiert) ausgibt.
    Überprüfe dann dein Ergebnis. Sind die Werte (aufsteigend) sortiert? */

    var fahrzeugGeschwindigkeitenToValue = fahrzeugGeschwindigkeiten.values

    println(fahrzeugGeschwindigkeiten)
    var fahrzeugGeschwindigkeitenValue2 = fahrzeugGeschwindigkeitenToValue.sorted()
    println(fahrzeugGeschwindigkeitenValue2)
}