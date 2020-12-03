package composite.p01

import java.time.LocalDateTime

class CompositeTask(
    var title: String,
    var date: LocalDateTime,
) {
    private var isComplete: Boolean = false
    private val list = hashSetOf<CompositeTask>()

    fun toggle() {
        isComplete = !isComplete
    }

    fun isComplete() = isComplete

    fun addTask(title: String, date: LocalDateTime) {
        list.add(CompositeTask(title, date))
    }

    fun removeTask(task: CompositeTask) {
        list.remove(task)
    }

    fun getReport(type: CompositeSortType): TaskReport {
        val report = TaskReport(this)
        list.sortedWith(type::compareTo)
            .map { it.getReport(type) }
            .forEach(report::addReport)
        return report
    }
}
