package Main

import data.House

fun main(){
    val simon = House("address2","New Jersey","South Canada")
    val samson = House ("address1", "New York")

    println(simon.country)
    println(simon.state)
    println(samson.country)
}