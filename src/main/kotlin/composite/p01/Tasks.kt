package composite.p01

import java.time.LocalDateTime

class Tasks(
    var title: String,
) {
    private val list = hashSetOf<Task>()

    fun addTask(title: String, date: LocalDateTime) {
        list.add(Task(title, date))
    }

    fun removeTask(task: Task) {
        list.remove(task)
    }

    fun getList(type: SortType) = list.sortedWith(type::compareTo).toList()
}
