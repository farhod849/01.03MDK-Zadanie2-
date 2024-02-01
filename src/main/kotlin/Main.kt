import java.util.Scanner

fun main(args: Array<String>) {
    println("Михаил " + "Был(а) " + agotext(12000).toString())
    println("Вася " + "Был(а) " + agotext(60).toString())
    println("Лена " + "Был(а) " + agotext(20000).toString())
    println("Настя " + "Был(а) " + agotext(10000).toString())
    println("Петя " + "Был(а) " + agotext(90000).toString())
    println("Иванус " + "Был(а) " + agotext(200000).toString())
    println("Роман " + "Был(а) " + agotext(500000).toString())


}
fun agotext(sec:Int):String
{
    when(sec)
    {
        in 0..60 -> return "Только что"
        in 61..3600 -> return  ((sec/60).toString() + " Минут назад")
        in 3601..24*3600 -> return (((sec/60)/60).toString() + " Часов назад")
        in 86400..172800 -> return "Вчера"
        in 172800..259200 -> return "Позавчера"
        else -> return (" Давно")
    }

}