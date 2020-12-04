package composite.p02

interface Visitor {
    fun drawReport(task: CompositeTask, depth: Int)
    fun end(depth: Int)
}

