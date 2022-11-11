fun main() {
    val s = "hello somebody, you are awesome"
    var s2 = s
    val s1 = s.filter { it != ' ' }
    s2 = s2.dropLast(8)
    println(s)
    println(s1)
    println(s2)

    val t1: Simple = Simple()
    val t2 = t1.copy()
    println(t1)
    t2.s1 = "1"
    println(t1)
    println(t2)
}

class Simple (var s1:String = "First", var s2:String = "Second"){
    override fun toString(): String {
        return "\nFirst string: $s1 \nSecond string: $s2"
    }

    fun copy (): Simple{
        return Simple(s1,s2)
    }
}

fun testArray (){
    var array = Array(10) { 1 }
    println(array.toString())
    array[3] = 3
    //Change element changes existing array
    println(array.toString())
    //add element creates new array
    array += 11
    println(array.toString())
    array.forEach { println(it) }
}