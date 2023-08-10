class Clock() {
    var hour: Int
    var minute: Int
    var second: Int

    init {
        hour = 0
        minute = 0
        second = 0
    }

    constructor(hour: Int, minute: Int, second: Int) : this() {
        this.hour = hour
        this.minute = minute
        this.second = second
    }

    fun time() {
        second += 1

        if (second >= 60) {
            second = 0
            minute += 1
        }
        if (minute >= 60) {
            minute = 0
            hour += 1
        }
        if (hour >= 24) {
            hour = 0
        }
    }

    fun reset() {
        second = 0
        minute = 0
        hour = 0
    }

    fun display(): String {
        val display = "The time is: $hour : $minute : $second"
        return (display)
    }

    fun setTime() {
        println("Please input the hour: ")
        val inputHour = readln().toInt(); hour = inputHour
        println("Please input the minute: ")
        val inputMinute = readln().toInt(); minute = inputMinute
        println("Please input the second: ")
        val inputSecond = readln().toInt(); second = inputSecond

        if (inputHour < 24 && inputMinute < 60 && inputSecond < 60) {
            println(display())
        } else {
            println("Please input a valid time")
        }
    }

}