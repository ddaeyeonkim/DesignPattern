package composite.p02

import java.time.LocalDateTime

fun main() {
    val root = CompositeTask("root", LocalDateTime.now())
    root.addTask("sub1", LocalDateTime.now())
    root.addTask("sub2", LocalDateTime.now())

    val sub1 = root.getList(CompositeSortType.TITLE_ASC)[0]
    sub1.addTask("sub1_1", LocalDateTime.now())
    sub1.addTask("sub1_2", LocalDateTime.now())
    val sub2 = root.getList(CompositeSortType.TITLE_ASC)[1]
    sub2.addTask("sub2_1", LocalDateTime.now())
    sub2.addTask("sub2_2", LocalDateTime.now())

    val report = root.getReport(CompositeSortType.TITLE_ASC)
    val renderer = Renderer { ConsoleVisitor() }
    renderer.render(report)
}
