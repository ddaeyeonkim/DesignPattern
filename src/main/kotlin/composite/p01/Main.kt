package composite.p01

import java.time.LocalDateTime

fun main() {

    val root = CompositeTask("root", LocalDateTime.now())
    root.addTask("sub1", LocalDateTime.now())
    root.addTask("sub2", LocalDateTime.now())

    val report = root.getReport(CompositeSortType.TITLE_ASC)
    val sub1 = report.getList()[0].task
    val sub2 = report.getList()[1].task

    sub1.addTask("sub1_1", LocalDateTime.now())
    sub1.addTask("sub1_2", LocalDateTime.now())
    sub2.addTask("sub2_1", LocalDateTime.now())
    sub2.addTask("sub2_2", LocalDateTime.now())

    val report2 = root.getReport(CompositeSortType.TITLE_ASC)

    val renderer1 = Renderer { ConsoleVisitor() }
    renderer1.render(report2)

    println()

    val renderer2 = Renderer { JsonVisitor() }
    renderer2.render(report2)
}
