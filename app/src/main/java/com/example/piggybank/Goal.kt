import java.util.*

data class Goal(
    val id: Long?,
    var title: String = "",
    var goalAmount: Double = 0.0,
    var currAmount: Double = 0.0,
    var dueDate: Date?
)