fun main(args: Array<String>) {
    val clock = Clock()
    while (true) {
        println(options())
        val choice = readln().lowercase()
        if (choice.isEmpty()) {
            continue
        }
        when (choice) {
            "s" -> println(clock.setTime())
            "a" -> {
                clock.time()
                println(clock.display())
            }

            "r" -> {
                clock.reset()
                println(clock.display())
            }

            "q" -> break
            else -> println("Please input a valid response")
        }
    }
}

fun options() =
    """
        Enter 's' to set the time.
        Enter 'a' to advance one second.
        Enter 'r' to reset the clock.
        Enter 'q' to quit.
        Your Choice: 
    """.trimIndent()
