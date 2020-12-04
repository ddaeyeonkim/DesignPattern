package composite.p02

class ConsoleVisitor : Visitor {
    override fun drawReport(task: CompositeTask, depth: Int) {
        val padding = (0 until depth).fold("") { acc, _ -> "$acc-" }
        val complete = if (task.isComplete()) "v" else " "
        println("$padding[$complete] ${task.title}(${task.date})")
    }

    override fun end(depth: Int) {
    }
}
