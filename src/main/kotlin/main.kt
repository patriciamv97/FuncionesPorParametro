import kotlin.random.Random

fun main(args: Array<String>) {

    //Ejercicio 1

     /*for (tabla7 in Ejercicio1(10).array){
         println("$tabla7")
     }*/

    //Ejercicio 2

    val arrayNumeros= Ejercicio2(10){ Random.nextInt(50,250) }
    arrayNumeros.array.forEach { array ->
        println("$array")
    }


}