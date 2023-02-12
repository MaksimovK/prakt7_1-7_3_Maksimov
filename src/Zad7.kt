import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.pow
import kotlin.math.sin

fun main()
{
    try
    {
        print("Введите x: ")
        val x = readLine()!!.toDouble()
        print("Введите y: ")
        val y  = readLine()!!.toDouble()
        print("Введите z: ")
        val z = readLine()!!.toDouble()
        val a = 2 * cos(x - PI/6) / (0.5 + sin(y).pow(2))
        val b = 1 + z.pow(2) / (3 + (z.pow(2) / 5))
        println("a = $a \nb = $b")
    }
    catch (ex: Exception)
    {
        println(ex.message)
    }
}