import kotlin.math.E
import kotlin.math.PI
import kotlin.math.pow

fun main()
{
    try
    {
        val c = 2.997924 * 10.0.pow(8.0)
        val h = 6.6252 * 10.0.pow(-34.0)
        val b = 5.6687 * 10.0.pow(-8.0)
        print("Введите длину волны: ")
        var lyamda = readLine()!!.toDouble()
        print("Введите температуру: ")
        var temperature = readLine()!!.toDouble()
        var energy = (2 * PI * c * h * lyamda.pow(-8)) / (E.pow((c * h) / (b * lyamda * temperature)) - 1.0)
        if (b * lyamda * temperature == 0.0 || E.pow((c * h) / (b * lyamda * temperature)) - 1.0 == 0.0)
            throw Exception("Знаменатель равен 0")
        println("E = $energy")
    }
    catch (ex: Exception)
    {
        println(ex.message)
    }

}
