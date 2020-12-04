package composite.p02

enum class CompositeSortType {
    TITLE_ASC {
        override fun compareTo(t1: CompositeTask, t2: CompositeTask): Int {
            return t1.title.compareTo(t2.title)
        }
    },
    TITLE_DESC {
        override fun compareTo(t1: CompositeTask, t2: CompositeTask): Int {
            return t2.title.compareTo(t1.title)
        }
    },
    ;

    abstract fun compareTo(t1: CompositeTask, t2: CompositeTask): Int
}
