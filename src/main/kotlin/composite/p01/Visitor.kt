package composite.p01

interface Visitor {
    fun drawTask(task: CompositeTask, depth: Int)

    fun end(depth: Int)

}
