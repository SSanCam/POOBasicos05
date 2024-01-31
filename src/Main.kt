fun main() {
    try {
        //Instanciamos la hora con los datos recibidos

        var hora = Tiempo.pedirHora()
        var minutos = Tiempo.pedirMinutos()
        var segundos = Tiempo.pedirSegundos()

        while (hora > 23 || minutos >= 59 || segundos >= 59) {
            if (hora > 23) throw IllegalArgumentException ("Formato de hora '24' no válido.")
            if (segundos >= 59) {
                segundos -= 59
                minutos += 1

            }
            if (minutos >= 59) {
                minutos -= 59
                hora += 1
            }

        }


        //Creamos una instancia con los datos recibidos del usuario:
        val horaActual = Tiempo(hora, minutos, segundos)
        println(horaActual)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

}