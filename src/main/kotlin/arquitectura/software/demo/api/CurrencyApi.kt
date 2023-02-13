package arquitectura.software.demo.api

import arquitectura.software.demo.bl.CurrencyBl
import arquitectura.software.demo.dto.RequestDto
import arquitectura.software.demo.dto.ResponseDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal
import java.util.logging.Level
import java.util.logging.Logger

@RestController
@RequestMapping("/api/currency")

class CurrencyApi (private val currencyBl: CurrencyBl) {

    /**
     * Endpoint GET para obtener la conversión de una moneda a otra
     */
    @GetMapping("/convert")
    fun convert(
        @RequestParam from: String,
        @RequestParam to: String,
        @RequestParam amount: BigDecimal
    ): ResponseDto {
        val requestDto = RequestDto(from, to, amount)
        //Log procesando solicitud
        LOGGER.log(
            Level.INFO,
            "Procesando solicitud de conversion de moneda: ${requestDto.amount} ${requestDto.from}  a ${requestDto.to}"
        )
        return currencyBl.convert(requestDto)
    }

    companion object {
        private val LOGGER = Logger.getLogger(CurrencyApi::class.java.name)
    }
}