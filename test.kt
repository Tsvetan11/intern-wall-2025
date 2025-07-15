fun main() {
    println("Testing for loop:")
    testForLoop()

    println("\nTesting while loop:")
    testWhileLoop()

    println("\nTesting do-while loop:")
    testDoWhileLoop()

    println("\nTesting forEach loop:")
    testForEachLoop()
}

fun testForLoop() {
    for (i in 1..5) {
        println("for loop iteration: $i")
    }
}

fun testWhileLoop() {
    var i = 1
    while (i <= 5) {
        println("while loop iteration: $i")
        i++
    }
}

fun testDoWhileLoop() {
    var i = 1
    do {
        println("do-while loop iteration: $i")
        i++
    } while (i <= 5)
}

fun testForEachLoop() {
    val list = listOf("apple", "banana", "cherry")
    list.forEach { fruit ->
        println("forEach loop item: $fruit")
    }
}