#!/usr/bin/env kotlin

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var aliceScore = 0
    var bobScore = 0

    for((el1, el2) in a.zip(b)){
        if(el1 > el2){
            aliceScore++
        }else if(el1 < el2){
            bobScore++
        }
    }

    return arrayOf(aliceScore, bobScore)
}

fun main(args: Array<String>) {

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}