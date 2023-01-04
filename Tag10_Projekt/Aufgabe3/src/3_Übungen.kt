fun main() {

        /* Lese in dieser Aufgabe die Antwort für die Fragen nicht aus der Map heraus. Schreibe Code, der die Antworten aus der Map herausfindet.

        Gegeben ist die folgende Map, die Fahrzeuge zu ihrer Geschwindigkeit in Km/h mappt:

        "Auto" -> 120.5
        "Flugzeug" -> 755.2
        "Fahrrad" -> 22.0
        "Tretroller" -> 15.7
        Erstelle eine passende Map, die initial die genannten Paare besitzt. */

    var fahrzeugGeschwindigkeiten = mutableMapOf(
    "Auto" to 120.5,
    "Flugzeug" to 755.2,
    "Fahrrad" to 22.0,
    "Tretroller" to 15.7)

        /* a) Hole dir die Schlüssel der Map, konvertiere den Typ von Set zu List und weise sie einer Variable zu.
        Verwende die contains() Funktion, die du aus der Vorlesung für Listen kennst, um die folgenden Fragen zu beantworten. Gib dabei ein true für ja und ein false für ein nein in der Konsole aus.
        Ist der Schlüssel "Flugzeug" in den Schlüsseln?
        Ist der Schlüssel "Moped" in den Schlüsseln?
        Ist der Schlüssel "Tretroller" in den Schlüsseln? */

    println(fahrzeugGeschwindigkeiten.keys)
    var fahrzeugGeschwindigkeitenToList = fahrzeugGeschwindigkeiten.toList()

    println(fahrzeugGeschwindigkeiten.containsKey("Flugzeug"))
    println(fahrzeugGeschwindigkeiten.containsKey("Moped"))
    println(fahrzeugGeschwindigkeiten.containsKey("Tretroller"))

        /* b) Hole dir die Werte der Map, konvertiere den Typ von Set zu List und weise sie einer Variable zu.
        Verwende die contains() Funktion, die du aus der Vorlesung für Listen kennst, um die folgenden Fragen zu beantworten. Gib dabei ein true für ja und ein false für ein nein in der Konsole aus.
        Ist der Wert 755.2 in den Werten?
        Ist der Wert 2.0 in den Werten?
        Ist der Wert 120.5 in den Werten? */

    println(fahrzeugGeschwindigkeiten.values)

    println(fahrzeugGeschwindigkeiten.containsValue(755.2))
    println(fahrzeugGeschwindigkeiten.containsValue(2.0))
    println(fahrzeugGeschwindigkeiten.containsValue(120.5))

}