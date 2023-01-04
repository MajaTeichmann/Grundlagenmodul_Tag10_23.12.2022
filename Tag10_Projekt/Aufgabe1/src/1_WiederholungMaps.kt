fun main() {
        /* a) Vervollständige in der Datei zu dieser Aufgabe die folgende Map:

        val temperaturZuTag: Map<Double, String>
        Die Map hat dabei initial (zu Beginn) die folgenden Paare:

        12.2 -> "Montag"
        9.8 -> "Dienstag"
        14.4 -> "Mittwoch"
        Überprüfe deine Map (über die Konsole). Wurde sie richtig erstellt? */

    val temperaturZuTag: Map<Double, String> = mapOf(
        12.2 to  " Montag",
        9.8 to " Dienstag",
        14.4 to " Mittwoch")

    println(temperaturZuTag)

        /* b) Lege eine passende Map an, die initial folgende Paare enthält:

        "Ist heute Freitag?" -> true
        "War gestern Mittwoch?" -> false */

    var abfrage :MutableMap<String, Boolean> = mutableMapOf(
        "Ist heute Freitag?" to true,
        "War gestern Mittwoch?" to false)

        /* Füge anschließend der Map folgende Paare hinzu. Wenn nötig, passe deinen vorherigen Code an.
        Veränder allerdings nicht die Paare aus der Teilaufgabe davor. Überprüfe dann deine Map in der Konsole.

        "Ist morgen Sonntag?" -> false
        "War gestern Donnerstag?" -> true */

    abfrage.set("Ist morgen Sonntag?", false)
    abfrage.set("War gestern Donnerstag?", true)

    println(abfrage)

        /* Füge anschließend der Map die folgenden Paare mit der Index-Schreibweise hinzu. Überprüfe dann deine Map in der Konsole.

        "War vorgestern Montag?" -> false
        "Ist Übermorgen Dienstag?" -> false */

    abfrage["War vorgestern Montag?"] = false
    abfrage["Ist Übermorgen Dienstag?"] = false

        /* Entferne mit einer Funktion aus der Vorlesung die folgenden Paare aus der Liste und gib in der Konsole aus, ob das Paar erfolgreich aus der Map entfernt werden konnte.

        "War gestern Mittwoch?" -> false
        "War gestern Donnerstag?" -> true
        "Ist Übermorgen Dienstag?" -> true */


    println(abfrage.remove("War gestern Mittwoch?", false))
    println(abfrage.remove("War gestern Donnerstag?", true))
    println(abfrage.remove("Ist Übermorgen Dienstag?", true))

    // Die erste Ausgabe sollte true sein, die zweite ebenfalls true und die dritte false. Warum?

    /* Weil "War gestern Mittwoch?" und "War gestern Donnerstag?" in der Liste "abfragen" enthalten war und
       "Ist Übermorgen Dienstag?" ist als false deklariert und wir wollen true entfernen. */

}