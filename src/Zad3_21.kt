import kotlin.math.pow

fun main()
{
    try {
        print("Введите длинну диагонали: ")
        val d = readLine()!!.toDouble()
        print("Введите длинну большего основания: ")
        val o = readLine()!!.toDouble()

        println("Длинна меньшего основания: ${Math.sqrt(d.pow(2) - o.pow(2))}")
        println("Площадь: ${(Math.sqrt(d.pow(2) - o.pow(2))) * o}")
    }
    catch (ex: Exception)
    {
        println(ex.message)
    }
}