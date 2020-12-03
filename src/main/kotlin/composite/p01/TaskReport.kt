package composite.p01

class TaskReport(
    val task: CompositeTask,
) {
    private val list = mutableListOf<TaskReport>()

    fun addReport(report: TaskReport) {
        list.add(report)
    }

    fun getList() = list.toList()
}
