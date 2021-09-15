package data

class Hero (firstName: String,
            lastName: String,
            health: Int,
            role : String){
    init {
        println("Health = $health")
    }
    var firstName: String = firstName
    var lastName: String = lastName
    var health: Int   = health
    var role : String = role
}