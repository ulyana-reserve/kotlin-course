package org.example.lessons.lessons14.homeworks

/*
5 Мероприятие: концерт. Создайте класс, который будет представлять концерт.
У него должны быть свойства “группа”, “место проведения”, “стоимость”, “вместимость зала”.
 Также приватное поле “проданные билеты”. Добавьте метод, который выводит информацию о концерте и метод
 “купить билет”, который увеличивает количество проданных билетов на один.
 */
class Concert(val band: String, val place: String, val price: Double, val hallCapacity: Int) {
    private var ticketsSold: Int = 0
    fun displayConcertInfo() {
        println(
            "In the $place band $band will be playing, the price is $price " +
                    "and there are only ${hallCapacity - ticketsSold} available seats"
        )
    }

    fun buyTicket(){
        ticketsSold++
    }

}

fun main() {
    val concert = Concert("Billy Tallent", "Woody Bar", 200.56, 200 )
    println(concert.displayConcertInfo())
    concert.buyTicket()
    println(concert.displayConcertInfo())
}