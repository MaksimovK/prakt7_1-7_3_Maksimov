fun main()
{
    try
    {
        var number : Int
        do {
            print("Введите номер дня недели: ")
            number = readLine()!!.toInt()
        }while (number < 1 || number > 7)

        when
        {
            (number >= 1 && number <= 5) -> println("Сегодня рабочий день")
            else -> println("Сегодня выходной")
        }

    }
    catch (ex: Exception)
    {
        println(ex.message)
    }
}