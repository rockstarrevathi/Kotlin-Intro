fun main(args: Array<String>) {
    println("Hello Revathi, Welcome to Kotlin")
    /*
    Strings and Integers
     */
    val weather = "Sunny"
    println(weather)


    var age = 25
    age += 40
    println(age)
    //I will be an Entrepreneur , busy with the meetings and happy in my life


    /*

    Arrays and Lists
     */
   // var topCandy : Array<String> = arrayOf("snickers","Fun Dip", "Milky way")
    //var topCandy : List<String> = listOf("snickers","Fun Dip", "Milky way")

    var topCandy : MutableList<String> = mutableListOf("snickers","Fun Dip", "Milky way")

    topCandy.add( 2,"Black Thunder")
    println(topCandy[0])
    println(topCandy[1])
    println(topCandy[2])
    println(topCandy[3])


    var luckyInts = arrayOf(1,2,8,10)
    println(luckyInts[0])
    println(luckyInts[1])
    println(luckyInts[2])
    println(luckyInts[3])


    //Loops
    for (numbers in 1..10_000)
        if(numbers >=692) {
            println(numbers)
        }

    //Maps
    var revDictionary = mapOf<String,Int>("Revathi" to 8, "Mummy" to 10, "Rupika" to 1)
    println(revDictionary["Revathi"])

    //Function
    fun hello(){
        println("Hello Revathi")
    }

    for (x in 1..10){
        hello()
    }

    fun dogInfo(name:String, age:Int){
        println("$name is $age old.")
    }

    dogInfo("Puppy", 8)
    dogInfo("Ross",7)


    /*
    Classes
     */

    class Dog(name:String,age:Int,furColor:String){
        var name = name
        var age = age
        var furColor = furColor
    }

    var myDog = Dog("Puppy",8,"Black")
    println(myDog.age)

    var otherDog = Dog("Ross",10,"White")
    println(otherDog.furColor)


    /*
    Class Functions
     */
    class Cat(name:String,age:Int,furColor:String){
        var name = name
        var age = age
        var furColor = furColor

        fun info(){
            println( "$name is $age old , has $furColor fur")
        }
    }

    var myCat =Cat("Puppy",810,"Black")
    myCat.info()

    var otherCat = Cat("Ross",100,"White")
    otherCat.info()

}