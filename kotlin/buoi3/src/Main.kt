////fun main() {
////    val number = 100
////
////    when {
////        number > 10 -> println("lớn hơn 10")
////        number < 10 -> println("nhỏ hơn 10")
////        else -> println("bằng 10")
////    }
////    println("_------------------------------------_")
////
////    val input : Int = 5
////    fun doSomThingForCaseOne(){
////        val a = 5
////        val b = 10
////        val c : Int = a + b
////        println("a + b = $c" )
////    }
////    fun doSomeThingForCaseOneOrTwo(){
////        val a : Int = 10
////        val b : Int = 5
////        println("a - b = ${a - b}")
////    }
////    fun doSomeThingForCaseThree(){
////        val a : Int = 10
////        val b : Int = 5
////        println("a * b = ${a * b}")
////    }
////    fun bug(){
////        println("không có chức năng này trong chương trình ! ")
////    }
////    when(input){
////        1, 2 -> doSomThingForCaseOne()
////        3 -> doSomeThingForCaseOneOrTwo()
////        else -> bug()
////    }
////}
////
//
//data class Test(var name : String){
//    fun showName(name: String){
//        this.name = name
//    }
//}
//open class Animal(){
//    private var name: String? = null
//    private var age : Int? = null
//
//    fun setInfo(newName: String, newAge: Int){
//        this.name = newName
//        this.age = newAge
//    }
//
//    open fun getInfo() : String{
//        return "name $name age $age"
//    }
//}
//
//class Dog() : Animal(){
//    private var breed : String? = null
//
//    fun setInfo(newName: String, newAge: Int, newBreed : String){
//        super.setInfo(newName = newName, newAge = newAge )
//        this.breed = newBreed
//    }
//
//    override fun getInfo() : String{
//        return "${super.getInfo()}, breed ${breed}"
//    }
//
//}
//
//class Cat() : Animal(){
//    private var color : String? = null
//
//    fun setInfo(newName: String, newAge: Int, newColor : String){
//        super.setInfo(newName = newName, newAge = newAge)
//        this.color = newColor
//    }
//
//    override fun getInfo() : String{
//        return "${super.getInfo()}, color $color"
//    }
//}
//
//class Manage(){
//    private val listAnimal = mutableListOf<Animal>()
//
//    fun addAnimal(animal: Animal){
//        listAnimal.add(animal)
//    }
//
//    fun removeAnimal(animal: Animal) {
//        listAnimal.remove(animal)
//    }
//
//    fun showInfo(){
//        listAnimal.forEach(){
//            println(it.getInfo())
//        }
//    }
//}
//fun main() {
//    var manage = Manage()
//    var cat = Cat()
//    var dog = Dog()
//    dog.setInfo(newName = "ki", newAge = 3, newBreed = "tai cụp")
//    cat.setInfo(newName = "miu", newAge = 2, newColor = "sọc nâu")
//    manage.addAnimal(cat)
//    manage.addAnimal(dog)
//    manage.showInfo()
//}

open  class Shape(){
    private var name : String? = null

    fun setInfo(newName : String){
        this.name = newName
    }
    open fun calculater() : Double{
        return 0.0
    }
}

class Cricle() : Shape(){
    private var radius : Double = 0.0

    fun setInfo(newName: String, newRadius : Double){
        super.setInfo(newName = newName)
        this.radius = newRadius
    }
    override fun calculater() : Double{
        return Math.PI * radius * radius
    }
}

class Rectangle() : Shape(){
    private var width : Double = 0.0
    private var height : Double = 0.0

    fun setInfo(newName: String, newWith: Double, newHeight : Double){
        super.setInfo(newName = newName)
        this.width = newWith
        this.height = newHeight
    }

    override fun calculater() : Double{
        return width * height
    }

}

fun main() {
    val cricle = Cricle()
    val rectangle = Rectangle()
    cricle.setInfo("hình tròn", 5.0)
    rectangle.setInfo("hình chữ nhật", 4.0, 3.0)
    println("Diện tích của hình tròn là ${cricle.calculater()}" )
    println("Diện tích của hình chữ nhật là ${rectangle.calculater()}")
}


