package arquitectura.software.demo.dto

import com.fasterxml.jackson.annotation.JsonProperty

class ErrorApiDto {
    //Getters and Setters
    @JsonProperty("code")
    var code: String? = null

    @JsonProperty("message")
    var message: String? = null

    //Constructor
    constructor(code: String?, message: String?) {
        this.code = code
        this.message = message
    }

    //Constructor vacio
    constructor()

    //toString
    override fun toString(): String {
        return "ErrorApiDto [code=$code, message=$message]"
    }
}