import java.util.*

data class Transaction(
    val id: Long?,
    var goal: Goal,
    var amount: Double = 0.0,
    var date: Date,
    var balance: Double = 0.0
)