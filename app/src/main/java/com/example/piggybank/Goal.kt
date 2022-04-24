import java.time.LocalDate

data class Goal(
    val id: Int,
    var title: String = "",
    var goalAmount: Double = 0.0,
    var currAmount: Double = 0.0,
    var dueDate: LocalDate?,
    var transactions: ArrayList<Transaction>? = null
)