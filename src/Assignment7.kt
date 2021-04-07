fun main ()  {
    Numbers()
   var details=names("Sophia","Laura","Brawlian","Thomas","Everline")
    println(details)
    Robot()
    Brands()
}
fun Numbers()  {
    for (num  in 1..100){
        if(num % 2 == 1){
            println(num)
        }
    }
}
fun names(num1:String,num2:String,num3:String,num4:String,num5:String):Array<String> {
    var schools = arrayOf(num1, num2, num3, num4, num5)
    for (school in schools) {
        if (school.length > 5)
            println(school)
        }
        return schools

    }


fun Robot ()  {
    var age =0
    if (age<6){
        println("milk")
    }
    else if (age <=15){
        println("fanta orange")
    }
    else{
        println("Coca cola")
    }
}

fun Brands () {
    for (num in 1..100) {
        println(num)
        for (num in 1..100) {
            if (num % 3 == 0) {
                println("Fizz")
            }
        }
        for (Fizz in 1..100) {
            if (num % 5 == 0) {
                println("Buzz")
            }
        }
        for (num in 1..100) {
            if (num % 3 == 0 && num % 5 == 0) {
                println("FizzBuzz")
            }
        }
    }
}

