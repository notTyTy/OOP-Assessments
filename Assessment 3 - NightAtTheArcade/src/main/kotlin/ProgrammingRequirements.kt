/*
Card class
    All card have custom UUID
    Store information
        Current credit balance
        Current ticket balance
        Card number
Game
    Magnetic card reader (can interact with card)
    Swiping card reduces balance
        Instead giving a random ticket output
        Total ticket balance is calculated here
Prize Category
    Each category has a name, ticket cost, and how many are left in a terminal
    Prizes know nothing about the terminal they belong to
Terminal
    Each terminal has a magnetic card reader
    Terminal accepts money which is converted into credits
    2 credits per $1 - only whole number of money e.g. $10 is allowed
    Terminal shows card balances - alongside their UUID
    Card balances may be transferred at terminals
    Card balance is always printed during interaction at a terminal - tickets, credit and UUID
    Terminals can be used to exchange tickets for prizes, with an error print if insufficient funds or stock
    Print remaining prizes within a category
    Terminal contains 3 categories of prizes

/*


fun main(args: Array<String>) {
    val card1 = Card() // A card created with a unique id (1) -DONE
    val card2 = Card() // Another card created with a unique id (2) -DONE
    val game1 = Game(5) // A playable game which costs 5 credits per play - DONE
    val game2 = Game(7) // Another playable game which costs 7 credits per play -DONE
    val terminal1 = Terminal() // A terminal created - DONE
    val terminal2 = Terminal() // Another terminal created -DONE
    terminal1.addCredits(card1, 20) // add 40 credits with $20 into card1 -DONE
    terminal1.addCredits(card2, 20) // add 40 credits with $20 into card2 -DONE
    println("\n\n>>> Card #1 is used to play Game #1 5 times...")
    repeat(5) {
        game1.play(card1) // play game1 5 times with card1 - DONE
    }
    println("\n\n>>> Card #2 is used to play Game #2 5 times...")
    repeat(5) {
        game2.play(card2) // play game1 5 times with card2
    }
    println("\n\n>>> Credits & Tickets will be transferred from Card #1 to Car #2...")
    terminal1.transferCredits(card1, card2) // transfer credrits from card1 to card2
    terminal1.transferTickets(card1, card2) // transfer tickets from card1 to card2
    println("\n\n>>> Request prize Candy with Card #2...")
    terminal1.requestPrize("Candy", card2) // request Candy with card2. may or may not be claimed.
    println("\n\n>>> Card #1 is used to play Game #1 one more time...")
    game1.play(card1) // try to play game1 again with card1
    println("\n\n>>> Request different prizes with Card #1 and Card #2...")
// request prize (Candy, Hat or Classes) with card1 or card 2.
// prize may be claimed with enough tickets or may not if not enough tickets
    terminal1.requestPrize("Candy", card1)
    terminal1.requestPrize("Hat", card2)
    terminal1.requestPrize("Candy", card2)
    terminal1.requestPrize("Glasses", card2)
    terminal1.requestPrize("Candy", card2)
    terminal1.requestPrize("Candy", card2)
}


*/



































 */