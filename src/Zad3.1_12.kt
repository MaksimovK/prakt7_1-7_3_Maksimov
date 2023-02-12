import kotlin.math.pow

fun main()
{
    try {
        print("Введите x: ")
        val x = readLine()!!.toDouble()
        print("Введите y: ")
        val y = readLine()!!.toDouble()

        if(Math.abs(x) + Math.abs(y) <= 1) println("Точка принадлежит ромбу")
        else if(x.pow(2) + y.pow(2) <= 1) println("Точка принадлежит кругу")
        else if(Math.abs(x) <= 1 && Math.abs(y) <= 1) println("Точка принадлежит квадрату")
        else println("Точка не принадлежит ни одной области")
    }
    catch (ex: Exception)
    {
        println(ex.message)
    }
}