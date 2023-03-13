package arquitectura.software.demo.dao.repository

import arquitectura.software.demo.dao.Currency
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.domain.Pageable
import java.math.BigDecimal
import org.springframework.data.domain.Page
import java.util.Date

interface PagingRepository: JpaRepository<Currency, Long> {
    // Filtro por amount
    fun findByAmount(amount: BigDecimal, pageable: Pageable): Page<Currency>;
    // Filtro por currencyFrom
    fun findByCurrencyFrom(currencyFrom: String, pageable: Pageable):Page<Currency>;
    // Filtro por currencyTo
    fun  findByCurrencyTo(currencyTo: String, pageable: Pageable): Page<Currency>;
    // // Filtro por date 
    fun  findByDate(date: Date, pageable: Pageable): Page<Currency>;
}