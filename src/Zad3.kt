fun main()
{
    try
    {
        print("Введите первый член геометрической прогрессии: ")
        var b = readLine()!!.toDouble()
        print("Введите знаменатель геометрической прогрессии: ")
        var q = readLine()!!.toDouble()
        print("Введите начальный номер: ")
        var k = readLine()!!.toDouble()
        print("Введите конечный номер: ")
        var p = readLine()!!.toDouble()
        if (k > p) throw Exception ("K должно быть меньше P")
        var n  = p - k + 1
        var sum = b * (Math.pow(q, n) - 1) / (q - 1)
        println("Сумма членов: $sum")
    }
    catch (ex: Exception)
    {
        println(ex.message)
    }
}