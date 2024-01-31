class Tiempo(horas: Int, minutos: Int, segundos: Int){

    private var horas: Int
    private var minutos: Int
    private var segundos: Int

    //GETTER Y SETTERS - PROPIEDADES DE CLASE
    //redundantes en este caso
    init {
    require(horas in 1..24) { "Datos de horas erróneo. "}
    require(minutos in 1 ..60) { "Datos de minutos erróneos." }
    require(segundos in 1..60) { "Datos de segundos erróneos. "}
        this.horas = horas
        this.minutos = minutos
        this.segundos = segundos
    }
    override fun toString(): String {
        return ("${horas.toString().padStart(2, '0')}h ${minutos.toString().padStart(2, '0')}m ${segundos.toString().padStart(2, '0')}s")
    }

}