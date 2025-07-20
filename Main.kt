fun main(){
    val pointBob =intArrayOf(1, 2, 3,)
    val pointsAlice=intArrayOf(3,2,1)
    var bobScore:Int = 0
    var aliceScore: Int = 0

    val i:Int=0;
    for(i in pointBob.indices){
        if(pointBob[i]>pointsAlice[i]){
            bobScore++
        }
        if (pointBob[i]<pointsAlice[i]){
            aliceScore++
        }
        else  {
            println("This round they were even")
        }
    }

}