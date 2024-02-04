fun main() {
    try {
        //Pedimos por teclado los valores necesario:
        var hora = pedirHora()
        var minutos = pedirMinutos()
        var segundos = pedirSegundos()

        //Comprobamos los valores de hh:mm:ss según las especificaciones del problema.
        while (hora > 23 || minutos >= 59 || segundos >= 59) {
            //Si las horas son más de 23 lanzamos la excecpción pedida en el problema.
            if (hora > 23) throw IllegalArgumentException("Formato de hora '24' no válido.")
            //Si los segundos son 59 o más, actualizamos los minutos y segundos
            if (segundos >= 59) {
                segundos %= 60
                minutos += segundos.div(60)
            }
            //Si los minutos son 59 o más, actualizamos los minutos y horas
            if (minutos >= 59) {
                minutos %= 60
                hora += minutos.div(60)
            }
        }
        //Creamos la instancia con los datos dados.
        val horaActual = Tiempo(hora, minutos, segundos)
        println(horaActual)

    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}