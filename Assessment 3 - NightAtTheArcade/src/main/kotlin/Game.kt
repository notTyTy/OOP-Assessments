class Game()
{
    var creditCost: Int = 1

    constructor(creditCost: Int = 1) : this() {
        this.creditCost = creditCost
    }

    fun play(card: Card): Int {

        if (card.creditBalance > creditCost) {
            val ticketRandom = (1..30).random()
            card.ticketBalance += ticketRandom
            card.creditBalance -= creditCost

            println("You have won $ticketRandom tickets!. Your balance is now ${card.ticketBalance}. You have ${card.creditBalance} credits remaining.")
            return (ticketRandom)
        } else {
            println("You have an insufficient credit balance. Please load more onto the card.")
        }
        return 0
    }
}