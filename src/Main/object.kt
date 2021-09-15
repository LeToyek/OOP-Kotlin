package Main

import data.Hero
import data.creep

fun main(){
    val shadowFiend = Hero("Shadow","Fiend",600,"agi")
    val windRanger = Hero("wind","ranger",500,"int")
    windRanger.firstName = "Siti"
    println(windRanger.firstName)

    val rangeCreep = creep("range")
    val tankCreep = creep("tankCreep",250)
    val meleCreep = creep ("meleCreep","green",125)






}