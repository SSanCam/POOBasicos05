fun main() {

    //Solicitacmos la hora
    fun pedirHora(): Int {
        println("Introduce la hora: ")
        var horaIntro = readln()
        while ((horaIntro.isNullOrBlank()) || (horaIntro.toInt() !in 1..24)) {
            println("ERROR. Inténtalo de nuevo: ")
            horaIntro = readln()
        }
        return horaIntro.toInt()
    }

    //Solicitamos los miniutos
    fun pedirMinutos(): Int {
        println("Introduce los minutos: ")
        var minutosIntro = readln()
        while (minutosIntro.isNullOrBlank() || minutosIntro.toInt() !in 1..60) {
            println("ERROR. Inténtalo de nuevo: ")
            minutosIntro = readln()
        }
        return minutosIntro.toInt()
    }

    //Solicitamos los segundos
    fun pedirSegundos(): Int {
        println("Introduce los segundos: ")
        var segundosIntro = readln()
        while (segundosIntro.isNullOrBlank() || segundosIntro.toInt() !in 1..60) {
            println("ERROR. Inténtalo de nuevo: ")
            segundosIntro = readln()
        }
        return segundosIntro.toInt()
    }
    //Instanciamos la hora con los datos recibidos

    var hora = pedirHora()
    var minutos = pedirMinutos()
    var segundos = pedirSegundos()

    while (hora > 23 || minutos >= 59 || segundos >= 59){
        if (segundos >= 59) {
            segundos -= 59
            minutos += 1

        }
        if (minutos >= 59) {
            minutos -= 59
            hora += 1
        }

        if (hora >= 23) {
            hora = 0
        }
    }
    val horaActual = Tiempo(hora, minutos, segundos)
    println(horaActual)
}