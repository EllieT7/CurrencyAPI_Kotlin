package arquitectura.software.demo.dto

import com.fasterxml.jackson.annotation.JsonProperty

// @JsonIgnoreProperties(ignoreUnknown = true)
class ErrorServiceDto {
    //Getters and Setters
    @JsonProperty("error")
    var error: ErrorApiDto? = null

    //Constructor vacio
    constructor()

    //Constructor con parametros
    constructor(error: ErrorApiDto?) {
        this.error = error
    }

    //toString
    override fun toString(): String {
        return "ErrorServiceDto [error=$error]"
    }
}