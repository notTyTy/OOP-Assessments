import car.Car
import java.io.*

fun main(args: Array<String>) {
    var carDetails: MutableList<Car> = ArrayList()

    fun writeFile() {
        try {
            println("Please input the cars make: ")
            val make = readln()
            println("Please input the cars model: ")
            val model = readln()
            println("Please input the cars manufactured year: ")
            val year = readln()
            println("Please input the cars total km travelled: ")
            val odometer = readln()

            carDetails.add(Car(make, model, year, odometer))
            val fileOut = FileOutputStream("cars.dat")
            val objectOut = ObjectOutputStream(fileOut)
            objectOut.writeObject(carDetails)

            fileOut.close()
        } catch (s: StringIndexOutOfBoundsException) {
            println(s)
        } catch (e: IOException) {
            println(e)
        }
    }

    fun readFile() {
        try {
            val fileIn = FileInputStream("cars.dat")
            val objectIn = ObjectInputStream(fileIn)
            carDetails = objectIn.readObject() as ArrayList<Car>
            fileIn.close()
        } catch (e: IOException) {
            println(e)
        }
    }

    fun sort() {
        try {
            readFile()
            carDetails.sortWith(compareBy<Car> { it.make }.thenBy { it.model }.thenBy { it.year }
                .thenBy { it.odometer })
        } catch (e: IOException) {
            println(e)
        }

    }

    fun search() {
        readFile()
        println("Input the car make you're looking for")
        val searchValue = readln()
        val index = carDetails.indexOfFirst { it ->
            it.make.toString().contains(searchValue.replaceFirstChar { it.uppercaseChar() })
        }
        try {
            if (index > -1) {
                val output = carDetails[index]
                println("Car Make: ${output.make} | Model: ${output.model} | Year manufactured: ${output.year} | Distance travelled: ${output.odometer} km")
            } else {
                println("Value not found")
            }
        } catch (b: IndexOutOfBoundsException) {
            println(b)
        }
    }

    fun options() = """
        Press "a" to display car details
        Press "s" to search for a car make
        press "d" to sort cars alphabetically
        press "f" to add a new car to the collection
        press "q" to exit
    """.trimIndent()

    while (true) {
        println(options())
        val choice = readln()
        when (choice.lowercase()) {
            "a" -> {
                readFile()
                carDetails.forEach { it.display() }
            }

            "s" -> search()
            "d" -> {
                sort()
                carDetails.forEach { it.display() }
            }

            "f" -> {
                readFile()
                writeFile()
            }

            "q" -> break
            else -> println("Please input a valid value")
        }
    }
}