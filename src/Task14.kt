fun main()
{
    try
    {
        print("Введите x: ")
        var x = readLine()!!.toInt()
        print("Введите y: ")
        var y = readLine()!!.toInt()
        print("Введите m: ")
        var m = readLine()!!.toInt()
        print("Введите n: ")
        var n = readLine()!!.toInt()

        if((x - y) < (m % n)) x++
        println("$x")
    }
    catch (ex: Exception)
    {
        println(ex.message)
    }

}