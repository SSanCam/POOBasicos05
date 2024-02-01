/**
 * Solicita al usuario ingresar la hora y valida que esté en el rango de 1 a 23.
 * @return La hora ingresada por el usuario.
 */
fun pedirHora(): Int {
    try {
        println("Introduce la hora: ")
        var horaIntro = readln()

        // Validar que la entrada sea un número y esté en el rango de 1 a 23.
        while (horaIntro.toInt() !in 1..23) {
            println("ERROR. Inténtalo de nuevo: ")
            horaIntro = readln()
        }
        return horaIntro.toInt()
    } catch (e: NumberFormatException) {
        // Si ocurre una excepción al convertir a entero, retornar 0.
        return 0
    }
}