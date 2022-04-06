fun main(){
  getOdd()
  var n =arrayOfNames(arrayOf("Constancia","Mercy","Elizabeth","Ian","Lexi"))
    println(n)
    givingDrinks(4)
    givingDrinks(17)
    givingDrinks(21)
    getMultiple()


}
 fun getOdd(){
     for (z in 1..100){
         if (z % 2!=0)
             println(z)
     }
 }
fun arrayOfNames(names:Array<String>):Int{
    var number=0
    names.forEach { n ->
        if (n.length  >5){
            number++
        }
        }
    return number
    }
fun givingDrinks(age:Int){
    if (age<=6){
        println("Milk")
    }
    else if (age>6 && age<15){
        println("Fanta Orange")
    }
    else{
        println("Coca Cola")
    }
}
fun getMultiple() {

    for (y in 1..100) {
        if (y % 3 == 0) {
            println("Fizz")
        }
          else if (y % 5 == 0) {
                println("Buzz")
            }
         if (y % 3 == 0 && y % 5 == 0) {
                println("FizzBuzz")
            }
    }
}


