fun main() {

    high (5){
       it + 10
    }


}
//    val name1 : () -> String = {
//
//        "Humaid"
//    }
//
//    fun name1() {
//        5
//}
// name1 is the anonymous function
// the function below is high order function


//    fun name2(math: (num1:Int) -> Int):Int {
//        return 5
//    }
//
//    val name: (x:Int) -> Unit = {
//        println(it)
//    }

    fun high (num1:Int , math: (x:Int) -> Int) {
        println(math(num1))
    }