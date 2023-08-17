class Terminal {
    fun addCredits(card: Card, creditBalanceAdd: Int) {
        card.creditBalance += creditBalanceAdd * 2
        println("Card ID = ${card.cardId} | Credit Balance = ${card.creditBalance} | Ticket Balance ${card.ticketBalance}")

    }

    fun creditTransfer(transfer: Card, receive: Card) {
        receive.creditBalance += transfer.creditBalance
        transfer.creditBalance = 0
        println("Card ID = ${transfer.cardId} | Credit Balance = 0 | Ticket Balance = ${transfer.ticketBalance}")
        println("Card ID = ${receive.cardId} | Credit Balance = ${receive.creditBalance} | Ticket Balance = ${receive.ticketBalance}")
    }

    fun ticketTransfer(transfer: Card, receive: Card) {
        receive.ticketBalance += transfer.ticketBalance
        transfer.ticketBalance = 0
        println("Card ID = ${transfer.cardId} | Credit Balance = ${transfer.creditBalance} | Ticket Balance = 0")
        println("Card ID = ${receive.cardId} | Credit Balance = ${receive.creditBalance} | Ticket Balance = ${receive.ticketBalance}")
    }


    private var prizeList = listOf(
        Prizes("tomato", 3, 15),
        Prizes("broccoli", 1, 10),
        Prizes("carrot", 5, 10)
    )

    fun prizeRedeem(prize: String, card: Card) {
        for (x in prizeList) {
            if (x.prizeName == prize) {
                if (card.ticketBalance >= x.prizeCost && x.prizeStock > 0) {
                    x.prizeStock--
                    card.ticketBalance -= x.prizeCost
                    println("You claimed: ${x.prizeName} for ${x.prizeCost} tickets!. You have ${card.ticketBalance} tickets remaining!")
                    println("There are ${x.prizeStock} ${x.prizeName} remaining.")
                    return
                }
                if (x.prizeCost > card.ticketBalance) {
                    println("You have an insufficient credit balance")
                    return
                } else {
                    println("There is insufficient stock remaining of ${x.prizeName}, please select another prize instead.")
                    return
                }
            }
        }
        println("Please input a valid prize name. Options are: carrot, broccoli and tomato")

    }
}