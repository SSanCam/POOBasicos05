class Tiempo(horas: Int, minutos: Int, segundos: Int) {

    private var horas: Int = 0
    private var minutos: Int
    private var segundos: Int

    //GETTER Y SETTERS - PROPIEDADES DE CLASE
    //redundantes en este caso
    init {
        require(segundos in 1..60) { "Datos de segundos erróneos. " }
        this.horas = horas
        this.minutos = minutos
        this.segundos = segundos
    }

    companion object {
        fun pedirHora(): Int {
            try {
                println("Introduce la hora: ")
                var horaIntro = readln()
                while (horaIntro.toInt() !in 1..23) {
                    println("ERROR. Inténtalo de nuevo: ")
                    horaIntro = readln()
                }
                return horaIntro.toInt()
            } catch (e: NumberFormatException) {
                return 0
            }
        }

        fun pedirMinutos(): Int {
            try {
                println("Introduce los minutos: ")
                var minutosIntro = readln()
                while (minutosIntro.toInt() !in 1..59) {
                    println("ERROR. Inténtalo de nuevo: ")
                    minutosIntro = readln()
                }
                return minutosIntro.toInt()
            } catch (e: NumberFormatException) {
                return 0
            }

        }

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
    }
    fun incrementarTiempo(){

    }

    fun decrementarTiempo(){

    }
    override fun toString(): String {
        return ("${horas.toString().padStart(2, '0')}h ${minutos.toString().padStart(2, '0')}m ${
            segundos.toString().padStart(2, '0')
        }s")
    }

}