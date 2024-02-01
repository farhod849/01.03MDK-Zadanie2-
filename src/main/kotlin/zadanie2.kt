import java.util.*

fun main (args: Array<String>)
{
    println("Выберите с какой карты будет перевод: \n 1.MasterCard/Maestro (комиссия: 0,6% + 20 руб.) \n 2.Visa/Мир (комиссия 0.75% минимум от 35 руб.) \n 3.VK Pay (без комиссии)")
    val sc = Scanner(System.`in`)
    var vibor = sc.nextInt();

    if (vibor == 1)
    {
       println("Вы выбрали MasterCard/Visa(комиссия: 0,6% + 20 руб.) \nВведите кол-во рублей для перевода:  ")
        var master: Int = sc.nextInt();
        println("Итого с учетом комиссии: " + (master + (master * (0.60/100)) + 20) + "\n Комиссия составила: " + (master * (0.60/100) +20))
    }
    if (vibor == 2)
    {
      println("Вы выбрали Visa/Мир(комиссия: 0.75% минимум от 35 руб.) \nВведите кол-во рублей для перевода:  ")
        var visa: Int = sc.nextInt();
        if (visa >= 35)
        {
            println("Итого с учетом комиссии: " + (visa + (visa * (0.75/100))) + "\n Комиссия составила: " + (visa * (0.75/100)))
        }
        else
        {
         println("Ошибка! Нельзя перевести меньше чем 35 руб.")
        }

    }
    if (vibor == 3)
    {
        println("Вы выбрали VKPay (комиссия: нет) \nВведите кол-во рублей для перевода:  ")
        var vk: Int = sc.nextInt();
        val com: Int = 0;
        println("Итого с учетом комиссии: " + vk + "\nКомиссия составила: " + com)
    }

}
