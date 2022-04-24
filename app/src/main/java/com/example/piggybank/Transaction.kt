import java.time.LocalDate
import java.util.*

data class Transaction(
    val id: Int,
    var date: LocalDate,
    var amount: Double = 0.0,
    var balance: Double = 0.0
)