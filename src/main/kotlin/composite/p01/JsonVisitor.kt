package composite.p01

class JsonVisitor : Visitor {
    override fun drawTask(task: CompositeTask, depth: Int) {
        val padding = getPadding(depth)
        println("$padding{")
        println("$padding  title: \"${task.title}\"")
        println("$padding  date: \"${task.date}\"")
        println("$padding  isComplete: ${task.isComplete()}")
        println("$padding  sub: [")
    }

    override fun end(depth: Int) {
        println("${getPadding(depth)}  ]")
        println("${getPadding(depth)}},")
    }

    private fun getPadding(depth: Int): String {
        var padding = ""
        (0 until depth).forEach { _ ->
            padding += "  "
        }
        return padding
    }
}
