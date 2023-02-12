import kotlin.math.pow
import kotlin.math.sqrt

fun main()
{
    try {
        print("Введите k: ")
        val k = readLine()!!.toDouble()
        print("Введите a: ")
        val a = readln()!!.toDouble()
        print("Введите b: ")
        val b = readln()!!.toDouble()
        var x: Double = 0.0
        var y: Double = 0.0

        val D = b.pow(2) - 4 * a * k

        if (D == 0.0) {
            x = -b / 2.0 * a
            y = a / x
            println("Точка пересечения ($x;$y)")
        } else if (D > 0) {
            val x1 = -b + sqrt(D) / (2 * a)
            val x2 = -b - sqrt(D) / (2 * a)
            if (x1 == x2) {
                val y = a / x
                println("Точка пересечения ($x1;$y)")
            } else {
                val y1 = a / x1
                val y2 = a / x2
                println("Точки пересечения ($x1;$y1) ($x2;$y2)")
            }

        } else println("Точек пересечения нет")
    }
    catch (ex : Exception)
    {
        println(ex.message)
    }

}