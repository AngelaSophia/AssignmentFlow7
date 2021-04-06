fun main ()  {
    Numbers()
    names()
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
fun names(){
    var Schools= arrayOf("Kingsway","Kolanya","Omuga","Siany","Ringa")
    for(school in Schools){
        if (school.length>5){
            println(school)
        }
    }
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
fun Brands ()   {
    for (num in 1..100){
        println(num)
        for(num in 1..100){
            if (num % 3 ==0){
                println("Fizz")
        }
        }
        for (Fizz in 1..100){
            if(num % 5 ==0){
                println("Buzz")
            }
        }
        for (num in 1..100){
            if (num % 3==0 && num % 5==0){
                println("FizzBuzz")
            }
        }
    }
}
