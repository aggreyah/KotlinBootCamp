package aggreyah.example.myapp

import java.lang.Math.PI

open class AquariumInheritance(open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {
    init {
        println("***aquarium initializing***")
    }

    open var volume:Int
        get() = (length * width * height) / 1000
        set(value) {
            height = (value * 1000) / (length * width)
        }

    open val shape = "rectangle"

    open val water: Double
        get() = volume * 0.9

    fun printSize() {
        println(shape)
        println("Width: $width cm Length: $length cm Height: $height cm.")
        println("Volume: $volume liters (${water/volume*100}% full)")
    }
}

class TowerTank(override var height: Int, var diameter: Int): AquariumInheritance(length = diameter, width = diameter, height = height){
    override var volume: Int
        get() = ((PI*width/2*length/2*height)/1000).toInt()
        set(value) {
            height = ((value*1000/ PI)/(width/2*length/2)).toInt()
        }

    override val water: Double
        get() = volume * 0.8

    override val shape = "cylinder"
}