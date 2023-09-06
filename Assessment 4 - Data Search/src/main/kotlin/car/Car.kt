package car

import java.io.Serializable

class Car(
    var make: String?, var model: String?, var year: String?, var odometer: String?
) : Serializable {
    fun display() {
        println("Car Make: $make | Model: $model | Year manufactured: $year | Distance travelled: $odometer km")
    }
}

