class Tiempo(horas: Int, minutos: Int, segundos: Int){

    //GETTER Y SETTERS - PROPIEDADES DE CLASE
    private var horas: Int = 0
        private set

    private var minutos: Int = 0
        private set

    private var segundos: Int = 0
        private set

    init {
    require(horas in 1..23) { "Datos de horas erróneo. "}
    require(minutos in 1 ..59) { "Datos de minutos erróneos." }
    require(segundos in 1..59) { "Datos de segundos erróneos. "}
        this.horas = horas
        this.minutos = minutos
        this.segundos = segundos
    }
    override fun toString(): String {
        return ("${horas.toString().padStart(2, '0')}h ${minutos.toString().padStart(2, '0')}m ${segundos.toString().padStart(2, '0')}s")
    }

}