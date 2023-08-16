fun main(args: Array<String>) {

}


class Card() {
    companion object {
        private var increment = 1
    }

    var cardId: Int = increment++
    var creditBalance: Int = 0
    var ticketBalance: Int = 0

    constructor(creditBalance: Int = 0, ticketBalance: Int = 0) : this() {
        this.creditBalance = creditBalance
        this.ticketBalance = ticketBalance
    }
}

class Game() //default credit cost = 1
{
    private var creditCost: Int = 1

    constructor(creditCost: Int = 1) : this() {
        this.creditCost = creditCost
    }

    fun random(card: Card): Int {
        if (card.creditBalance < creditCost) {
            println("You have insufficient credits | Game cost: $creditCost | Credit balance: ${card.creditBalance}")
            return 0
        }
        val ticketRandom = (1..30).random() * creditCost
        card.ticketBalance += ticketRandom
        card.creditBalance -= creditCost
        return (ticketRandom)
    }
}

class Terminal() {
    fun addCredits(card: Card, creditBalanceAdd: Int) {
        card.creditBalance += creditBalanceAdd * 2
    }

    fun creditTransfer(creditTransfer: Card, creditReceive: Card) {
        creditReceive.creditBalance += creditTransfer.creditBalance
        creditTransfer.creditBalance = 0
    }

    fun ticketTransfer(ticketTransfer: Card, ticketReceive: Card) {
        ticketReceive.ticketBalance += ticketTransfer.ticketBalance
        ticketTransfer.ticketBalance = 0
    }
}
