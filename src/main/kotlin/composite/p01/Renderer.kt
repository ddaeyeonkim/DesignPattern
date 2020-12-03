package composite.p01

class Renderer(
    private val factory: () -> Visitor,
) {

    fun render(report: TaskReport) {
        render(factory(), report, 0)
    }

    private fun render(visitor: Visitor, report: TaskReport, depth: Int) {
        visitor.drawTask(report.task, depth)
        report.getList().forEach { r ->
            render(visitor, r, depth + 1)
        }
        visitor.end(depth)
    }
}
