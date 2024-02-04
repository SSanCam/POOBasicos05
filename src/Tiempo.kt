/**
 * Clase que representa un instante de tiempo en formato de horas, minutos y segundos.
 * @property horas La cantidad de horas en el tiempo.
 * @property minutos La cantidad de minutos en el tiempo.
 * @property segundos La cantidad de segundos en el tiempo.
 */
class Tiempo(horas: Int, minutos: Int, segundos: Int) {

    private var horas: Int
    private var minutos: Int
    private var segundos: Int

    /**
     * Inicializa una instancia de la clase Tiempo con las horas, minutos y segundos proporcionados.
     * @param horas La cantidad de horas.
     * @param minutos La cantidad de minutos (debe estar en el rango de 0 a 59).
     * @param segundos La cantidad de segundos (debe estar en el rango de 0 a 59).
     * @throws IllegalArgumentException Si los valores de minutos o segundos están fuera de rango.
     */
    init {
        require(segundos in 1..60) { "Datos de segundos erróneos. " }
        require(minutos in 0..59) { "Datos de minutos erróneos." }
        require(segundos in 0..59) { "Datos de segundos erróneos." }
        this.horas = horas
        this.minutos = minutos
        this.segundos = segundos
    }

    /**
     * Representación en formato de cadena del tiempo.
     * @return Una cadena que muestra las horas, minutos y segundos en formato XXh XXm XXs.
     */
    override fun toString(): String {
        return ("${horas.toString().padStart(2, '0')}h ${minutos.toString().padStart(2, '0')}m ${
            segundos.toString().padStart(2, '0')
        }s")
    }

    //Métodos de clase:
    /**
     * Incrementa el tiempo actual sumando el tiempo proporcionado como parámetro.
     * Devuelve true si el incremento no supera las 23:59:59; de lo contrario, devuelve false.
     * @param t El tiempo a incrementar.
     * @return true si el incremento es exitoso y no supera las 23:59:59, false de lo contrario.
     */
    fun incrementar(t: Tiempo): Boolean {
        //Establece un valor límite de segundos en el dia
        val segundosLimite = (23 * 3600) + (59 * 60) + 59
        // Calcular los segundos actuales y los segundos del tiempo a incrementar.
        val segundosActuales = (horas * 3600) + (minutos * 60) + segundos
        val segundosIncrementados = (t.horas * 3600) + (t.minutos * 60) + t.segundos
        // Calcular el tiempo total después del incremento.
        val tiempoIncrementado = segundosActuales + segundosIncrementados
        /*Comprobar si el tiempo incrementado está dentro del límite permitido.
            Devolverá false si no está en límite, true si está en el límite.*/
        return tiempoIncrementado <= segundosLimite
    }

}