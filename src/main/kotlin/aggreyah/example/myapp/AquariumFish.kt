package aggreyah.example.myapp

abstract class AquariumFish {
    abstract val color: String
}

class Shark: AquariumFish (){
    override val color: String
        get() = "grey"
}

class Plecostomus: AquariumFish() {
    override val color: String
        get() = "gold"
}