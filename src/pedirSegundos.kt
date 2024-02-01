/**
 * Solicita al usuario ingresar los segundos y valida que estén en el rango de 1 a 59.
 * @return Los segundos ingresados por el usuario.
 */
fun pedirSegundos(): Int {
    try {
        println("Introduce los segundos: ")
        var segundosIntro = readln()

        // Validar que la entrada sea un número y esté en el rango de 1 a 59.
        while (segundosIntro.toInt() !in 1..59) {
            println("ERROR. Inténtalo de nuevo: ")
            segundosIntro = readln()
        }
        return segundosIntro.toInt()
    } catch (e: NumberFormatException) {
        // Si ocurre una excepción al convertir a entero, retornar 0.
        return 0
    }
}