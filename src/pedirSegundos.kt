fun pedirSegundos(): Int {
    try {
        println("Introduce los segundos: ")
        var segundosIntro = readln()
        while (segundosIntro.toInt() !in 1..59) {
            println("ERROR. Inténtalo de nuevo: ")
            segundosIntro = readln()
        }
        return segundosIntro.toInt()
    } catch (e: NumberFormatException) {
        return 0
    }
}