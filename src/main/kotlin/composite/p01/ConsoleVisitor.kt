package composite.p01

class ConsoleVisitor : Visitor {
    override fun drawTask(task: CompositeTask, depth: Int) {
        var padding = ""
        (0 until depth).forEach { _ ->
            padding += "-"
        }

        println("$padding[${if (task.isComplete()) "v" else " "}] ${task.title}(${task.date})")
    }

    override fun end(depth: Int) {
    }
}
