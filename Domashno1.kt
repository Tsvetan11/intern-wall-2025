package com.example.myapplication

fun comparetriplets(a: List<Int?>, b:List<Int?>): List<Int>{

    var pa=0
    var pb=0

    for(i in 0 until 3){
        val ai = a[i] ?: 0
        val bi = b[i] ?: 0

        if(ai>bi){
           pa++
        }else if(bi>ai){
            pb++
        }

    }

    var result = listOf(pa,pb)

    for (i in 0 until 2){
        println(result[i])
    }

    return result
}
    fun main(){

        var Alice: MutableList<Int?> = MutableList(3){0}
        var Bob: MutableList<Int?> = MutableList(3){0}

        println("Enter grading for alice: ")

        for (i in 0 until Alice.size){
            do {
                var input = readLine()?.toIntOrNull()

                if (input != null) {
                    Alice[i] = input
                } else {
                    println("Invalid input try again")
                }
            }while(input==null)
        }

        println("Enter grading for Bob: ")

        for (i in 0 until Bob.size){
            do {
                var input = readLine()?.toIntOrNull()

                if (input != null) {
                    Bob[i] = input
                } else {
                    println("Invalid input try again")
                }
            }while(input==null)
        }

        comparetriplets(Alice, Bob)

    }


