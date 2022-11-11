fun main(){
    println("Program start...")
    val number = 16
    println("The fibonacci of number $number is ${fibonacciSimple(number)}")
    println("The fibonacci of number $number is ${fibonacciRecursive(number)}")
    println("counter $counter")
}

var counter:Int = 0

fun fibonacciSimple (n: Int):Int{
    if (n==0) return 0
    if (n==1) return 1
    //counter for steps
    var steps = 0
    //define data for first step
    var nMns2 = 0
    var nMns1 = 1
    var res = 0
    for (i in 2..n)
    {
        //calculating current
        res=nMns2+nMns1
        //define data for next step
        nMns2 = nMns1
        nMns1 = res
        //increase steps counter
        steps++
    }
    println("The simple way fibonacci calculated by $steps steps")
    return res
}

fun fibonacciRecursive (n: Int):Int{
    counter++
    if (n==0) return 0
    if (n==1) return 1
    val a = fibonacciRecursive(n-2)
    val b = fibonacciRecursive(n-1)
    return a+b
}