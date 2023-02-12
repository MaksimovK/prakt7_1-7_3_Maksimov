import kotlin.math.pow

fun main()
{
    try {
        print("Введите k: ")
        val k = readLine()!!.toDouble()
        print("Введите b: ")
        val b = readLine()!!.toDouble()
        print("Введите r: ")
        val r = readLine()!!.toDouble()

        var aa = k.pow(2) + 1
        var bb = 2 * k * b
        var cc = b.pow(2) - r.pow(2)
        var D = bb.pow(2) - 4 * aa * cc

        if(D < 0) println("Точек пересечения нет")
        else if (D > 0)
        {
            var x1 = (-bb+Math.sqrt(D)) / (2 * aa)
            var x2 = (-bb-Math.sqrt(D)) / (2 * aa)
            var y1 = k * x1 + b
            var y2 = k * x2 + b

            println("Точи пересечения ($x1;$y1) ($x2;$y2)")
        }
        else{
            var x = bb / (2 * aa)
            var y = k * x + b
            println("Точи пересечения ($x;$y)")
        }
    }
    catch (ex: Exception)
    {
        println(ex.message)
    }
}