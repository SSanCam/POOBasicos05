fun pedirMinutos(): Int {
    try {
        println("Introduce los minutos: ")
        var minutosIntro = readln()
        while (minutosIntro.toInt() !in 1..60 || minutosIntro == null) {
            println("ERROR. Inténtalo de nuevo: ")
            minutosIntro = readln()
        }
        return minutosIntro.toInt()
    }catch (e: NumberFormatException){
        return 0
    }

}