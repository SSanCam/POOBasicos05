/**
 * Solicita al usuario ingresar los minutos y valida que estén en el rango de 1 a 59.
 * @return Los minutos ingresados por el usuario.
 */
fun pedirMinutos(): Int {
    try {
        println("Introduce los minutos: ")
        var minutosIntro = readln()

        // Validar que la entrada sea un número y esté en el rango de 1 a 59.
        while (minutosIntro.toInt() !in 1..59) {
            println("ERROR. Inténtalo de nuevo: ")
            minutosIntro = readln()
        }
        return minutosIntro.toInt()
    } catch (e: NumberFormatException) {
        // Si ocurre una excepción al convertir a entero, retornar 0.
        return 0
    }
}