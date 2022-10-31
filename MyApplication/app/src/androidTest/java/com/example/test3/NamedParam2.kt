fun print3Numbers(num1: Int, num2: Int, num3: Int){
}
fun print4Numbers(num1: Int, num2: Int, num3: Int, num4: Int){
}
fun main(args:Array<String>){
    normalVarargs(1,2,3,4) //4개의 인자 구성
    normalVarargs(4,5,6)   //3개의 인자 구성
}
fun normalVarargs(vararg counts: Int){
    for (num in counts){
        println("$num")
    }
    print("\n")
}
