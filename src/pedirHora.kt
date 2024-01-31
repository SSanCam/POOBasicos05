fun pedirHora(): Int {
    try {
        println("Introduce la hora: ")
        var horaIntro = readln()
        while (horaIntro.toInt() !in 1..24 || horaIntro.toInt() == null) {
            println("ERROR. Inténtalo de nuevo: ")
            horaIntro = readln()
        }
        return horaIntro.toInt()
    }catch (e: NumberFormatException){
        return 0
    }
}