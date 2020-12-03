package composite.p01

import java.time.LocalDateTime

class Task(
    var title: String,
    var date: LocalDateTime,
) {
    private var isComplete: Boolean = false

    fun toggle() {
        isComplete = !isComplete
    }
}
