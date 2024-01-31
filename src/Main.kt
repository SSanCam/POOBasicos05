fun main() {
    try {
        //Instanciamos la hora con los datos recibidos

        var hora = pedirHora()
        var minutos = pedirMinutos()
        var segundos = pedirSegundos()

        while (hora > 23 || minutos >= 59 || segundos >= 59) {
            if (segundos >= 59) {
                segundos -= 59
                minutos += 1

            }
            if (minutos >= 59) {
                minutos -= 59
                hora += 1
            }

            if (hora > 23) {
                hora -= 23
            }
        }
        //Creamos una instancia con los datos recibidos del usuario:
        val horaActual = Tiempo(hora, minutos, segundos)
        println(horaActual)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

}