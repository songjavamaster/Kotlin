fun main(args:Array<String>){
    manedParam(x = 200, z= 100)
    manedParam(z = 150)
}
fun manedParam(x:Int = 100, y: Int = 200, z: Int){
    println(x + y + z)
}