fun main(){
    println("Program start...")
    val number = 16
    println("The factorial of number $number is ${factorialSimple(number)}")
}

fun factorialSimple (n: Int):Int{
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
    println("The simple way factorial calculated by $steps steps")
    return res
}