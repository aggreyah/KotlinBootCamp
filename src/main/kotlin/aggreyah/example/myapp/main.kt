package aggreyah.example.myapp

fun buildAquarium() {
    val aquarium1 = Aquarium()
    aquarium1.printSize()
    // default height and length
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    // default width
    val aquarium3 = Aquarium(length = 110, height = 35)
    aquarium3.printSize()
    // everything custom
    val aquarium4 = Aquarium(height = 35, length = 110, width = 25)
    aquarium4.printSize()
    val aquarium5 = Aquarium(numberOfFish = 29)
    aquarium5.printSize()
    aquarium5.volume = 70
    aquarium5.printSize()
    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
    aquarium6.printSize()
}

fun buildAquariumWithInheritance(){
    val aquarium1 = AquariumInheritance(length = 25, width = 25, height = 40)
    aquarium1.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun makeFish(){
    val myShark = Shark()
    val myPlecostomus = Plecostomus()
    println("Shark: ${myShark.color}")
    println("Plecostomus: ${myPlecostomus.color}")
}

fun main() {
//    buildAquarium()
//    buildAquariumWithInheritance()
    makeFish()
}