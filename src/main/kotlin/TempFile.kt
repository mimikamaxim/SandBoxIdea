fun main()
{
//    for (i in 1..10)
//        val a = Kol.values().filter { it.toString().startsWith("C")
//                it.toString().startsWith("D")
//        }
//        println(a)
        Actions.values().forEach { println(it.printElement())  }
        Actions.MINUS.isActive = false
        println()
        Actions.values().forEach { println(it.printElement())  }
        var a = Actions.PLUS
        var b = Actions.values().filter { it.isActive }
        println(b)
        for (i in 1..10){
                val c = b.random()
                println({a == c}.invoke())
        }
}

enum class Kol { CAT, COW, DOG, BIRD, PIDGIN, HAMSTER }

enum class Actions(var isActive:Boolean)
{
        PLUS(true),
        MINUS(true),
        DIVISION(true);

        fun printElement ():String {
                return "$this ${this.isActive}"
        }
}