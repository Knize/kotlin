// WITH_RUNTIME

fun foo() {
    val a = 1
    val b = 2
    (a..b).step<caret>(1)
}