fun main() {
    val card1 = Card()
    val card2 = Card()
    val game1 = Game(5)
    val game2 = Game(7)
    val terminal1 = Terminal()
    val terminal2 = Terminal()
    terminal1.addCredits(card1, 20)
    terminal2.addCredits(card2, 20)
    println("\n\n>>> Card #1 is used to play Game #1 5 times...")
    game1.play(card1)
    println("\n\n>>> Card #2 is used to play Game #2 5 times...")
    repeat(5)
    {
        game2.play(card2)
    }
    println("\n\n>>> Credits & Tickets will be transferred from Card #1 to Card #2...")
    terminal1.creditTransfer(card2, card1)
    terminal1.ticketTransfer(card2, card1)
    println("\n\n>>> Request prize broccoli with Card #2...")
    terminal1.prizeRedeem("broccoli", card1)
    game1.play(card1)
    println("\n\n>>> Request different prizes with Card #1 and Card #2...")
    terminal1.prizeRedeem("carrot", card2)
    terminal1.prizeRedeem("broccoli", card1)
    terminal1.prizeRedeem("carrot", card1)
    terminal1.prizeRedeem("tomato", card1)
    terminal1.prizeRedeem("carrot", card1)
    terminal1.prizeRedeem("carrot", card1)


}
