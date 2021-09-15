package data

class creep( name : String, color :String, health : Int) {
    init {
        println("creep $name is created")
    }
    constructor(name: String, health : Int): this(name,"green",health){
        println("1st Secondary constructor")
        }
    constructor(name: String):this(name,100){
        println("2nd Secondary constructor")
    }

    var name : String = name
    var color : String = color
    var health : Int = health
}