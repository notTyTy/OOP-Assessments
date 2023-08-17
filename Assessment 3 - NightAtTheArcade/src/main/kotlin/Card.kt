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