package composite.p02

class Renderer(
    private val factory: () -> Visitor,
) {

    fun render(report: TaskReport) {
        render(factory(), report, 0)
    }

    fun render(visitor: Visitor, report: TaskReport, depth: Int) {
        visitor.drawReport(report.task, depth)
        for (r in report.getList()) {
            render(visitor, r, depth + 1)
        }
        visitor.end(depth)
    }
}
