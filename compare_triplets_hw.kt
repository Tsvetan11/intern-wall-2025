import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'compareTriplets' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    val result = arrayOf(0, 0)
    for(i in a.indices){
        if (a[i] > b[i]) {
            result[0]++
        } else if (a[i] < b[i]) {
            result[1]++
        }
    }
    return result
}

fun checkArray(): Array<Int>{
    while(true){
        val input = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

        if (input.size > 3 || input.size < 3){
            println("There must be 3 scores")

        } else if (input.any { it < 0 || it > 100 }){
            println("Scores must be between 0 and 100")
        } else {
            return input
        }

    }
}

fun main() {

    val a = checkArray()
    val b = checkArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))

}