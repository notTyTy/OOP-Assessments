fun main(args: Array<String>) {

    println("Write a word below to receive its PhoneWord:")
    val input = readln().lowercase()

    if (input.isNotEmpty()) {
        for (x in input.indices) {
            when (input[x].toString()) {
                "a", "b", "c" -> print("2")
                "d", "e", "f" -> print("3")
                "g", "h", "i" -> print("4")
                "j", "k", "l" -> print("5")
                "m", "n", "o" -> print("6")
                "p", "q", "r", "s" -> print("7")
                "t", "u", "v" -> print("8")
                "w", "x", "y", "z" -> print("9")
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" -> print(input[x])
            }
        }
    } else (println("Please input a valid type"))
}
