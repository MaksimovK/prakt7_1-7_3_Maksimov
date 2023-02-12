fun main()
{
    try
    {
        print("Введите x: ")
        var x = readLine()!!.toDouble()
        print("Введите y: ")
        var y = readLine()!!.toDouble()
        if (x > 0 && y > 0) println("Четверть I")
        else if (x < 0 && y > 0) println("Четверть II")
        else if (x < 0 && y < 0) println("Четверть III")
        else  if (x > 0 && y < 0) println("Четверть IV")
        else println("Точка лежит на оси")
    }
    catch (ex: Exception)
    {
        println(ex.message)
    }
}