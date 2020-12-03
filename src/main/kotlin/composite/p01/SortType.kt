package composite.p01

enum class SortType {
    TITLE_DESC {
        override fun compareTo(t1: Task, t2: Task): Int {
            return t1.title.compareTo(t2.title)
        }
    },
    TITLE_ASC {
        override fun compareTo(t1: Task, t2: Task): Int {
            return t2.title.compareTo(t1.title)
        }
    },
    DATE_DESC {
        override fun compareTo(t1: Task, t2: Task): Int {
            return t1.date.compareTo(t2.date)
        }
    },
    DATE_ASC {
        override fun compareTo(t1: Task, t2: Task): Int {
            return t2.date.compareTo(t1.date)
        }
    },
    ;

    abstract fun compareTo(t1: Task, t2: Task): Int
}
