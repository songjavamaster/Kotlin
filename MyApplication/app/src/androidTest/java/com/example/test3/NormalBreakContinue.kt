fun main(){
    for(i in 1..5){
        if (i==3) break
        print(i)
    }
    println() //개행 문자
    println("outside") //break를 continue로 바꾸면 1245 outside로 변경됨
}