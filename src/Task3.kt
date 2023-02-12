import kotlin.math.*

fun Min(list: List<Double>): Double? {
    return list.min()
}

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
        val numbers = listOf(x, y, z)
        var min = Min(numbers)
        val result : Double = 2 * max(x, z) - 3 * min!!.toDouble()
        println("L = $result")
    }
    catch (ex: Exception)
    {
        println(ex.message)
    }
}