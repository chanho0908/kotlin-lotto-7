package util.ext

import java.util.TreeSet

fun <T> List<T>.toMapByEachCount(): Map<T, Int> {
    return this.groupingBy { it }.eachCount()
}

fun <T> TreeSet<T>.printWithSquareBracket() {
    println(
        this.joinToString(
            separator = ", ",
            prefix = "[",
            postfix = "]"
        )
    )
}