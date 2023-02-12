import kotlin.math.PI
import kotlin.math.pow

fun main()
{
    try
    {
        print("Введите r: ")
        val r = readLine()!!.toDouble()

        println("Длина окружности: ${2 * PI * r}")
        println("Площадь круга: ${PI * r.pow(2)}")
    }
    catch (ex: Exception)
    {
        println(ex.message)
    }
}