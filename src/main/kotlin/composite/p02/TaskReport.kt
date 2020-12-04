package composite.p02

class TaskReport(
    val task: CompositeTask,
) {
    private val list = mutableListOf<TaskReport>()

    fun getList() = list.toList()

    fun addReport(report: TaskReport) {
        list.add(report)
    }
}
