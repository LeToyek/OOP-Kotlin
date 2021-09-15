package data

class House {
    var address = ""
    var state = ""
    var country = "USA"
    constructor(paramAddress : String, paramState : String){
        address = paramAddress
        state = paramState
    }
    constructor(paramAddress: String, paramState: String,paramCountry : String)
            : this(paramAddress,paramState){
                country = paramCountry
    }
}