
var counter:Int = 0
fun main(){
    println("Program start...")
    val number = 16
    fibByRecursiveWrapper(number)
    fibByStepsWrapper(number)
    fibRecursiveMemoWrap(number)
}
fun fibonacciBySteps (n: Int):Int{
    if (n==0) return 0
    if (n==1) return 1
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
        counter++
    }
    return res
}
fun fibByStepsWrapper (n: Int) {
    counter =0
    println("The fibonacci calculated by steps of number $n is ${fibonacciBySteps(n)}")
    printCounter()
}
fun fibonacciByRecursive (n: Int):Int{
    counter++
    if (n==0) return 0
    if (n==1) return 1
    val a = fibonacciByRecursive(n-2)
    val b = fibonacciByRecursive(n-1)
    return a+b
}

fun fibByRecursiveWrapper (n: Int){
    counter = 0
    println("The fibonacci calculated recursively of number $n is ${fibonacciByRecursive(n)}")
    printCounter()
}

fun printCounter (){
    println("Iteration count is $counter")
    println("--------------------------------<")
}

fun fibonacciByRecursiveWithMemorisation (n: Int, resArray: Array<Int>):Int{
    counter++
    if (n==0) return 0
    if (n==1) return 1
    if (resArray[n]!=0) return resArray[n]
    val a = fibonacciByRecursiveWithMemorisation(n-2,resArray)
    val b = fibonacciByRecursiveWithMemorisation(n-1,resArray)
    resArray[n] = a+b
    return a+b
}

fun fibRecursiveMemoWrap (n: Int){
    counter = 0
    val array = Array<Int>(n+2) { 0 }
    println("The fibonacci calculated recursively with memorisation of number $n is ${fibonacciByRecursiveWithMemorisation(n,array)}")
    printCounter()
}