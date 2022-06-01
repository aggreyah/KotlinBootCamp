package aggreyah.example.myapp

open class Aquarium (open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {

    init {
        println("...aquarium initializing...")
    }

    open var volume: Int
    get() = (width * height * length) / 1000 // 1000 cm ^ 3 per liter
    set(value) {
        height = value * 1000 / (width * length)
    }

    open val shape = "rectangle"

    open var water: Double = 0.0
        get() = 0.9 * volume


    constructor(numberOfFish: Int): this() {
        // 2000 cm^3 per fish plus extra volume so the water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (width * length)).toInt()
    }

    fun printSize() {
        println(shape)
        println("Width: $width cm " +
            "Height: $height cm " +
            "Length: $length cm.")
        println("Volume: $volume liters Water: $water liters (${(water/volume) * 100.0}% full)")
    }
}