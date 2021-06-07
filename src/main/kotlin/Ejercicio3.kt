class Ejercicio3 {

    fun numerosImpares(arrayNumeros: Array<Int>){
        println(arrayNumeros.filter {
            it % 2 != 0
        })
    }
}