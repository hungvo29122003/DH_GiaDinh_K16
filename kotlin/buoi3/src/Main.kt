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
//
//open  class Shape(){
//    private var name : String? = null
//
//    fun setInfo(newName : String){
//        this.name = newName
//    }
//    open fun calculater() : Double{
//        return 0.0
//    }
//}
//
//class Cricle() : Shape(){
//    private var radius : Double = 0.0
//
//    fun setInfo(newName: String, newRadius : Double){
//        super.setInfo(newName = newName)
//        this.radius = newRadius
//    }
//    override fun calculater() : Double{
//        return Math.PI * radius * radius
//    }
//}
//
//class Rectangle() : Shape(){
//    private var width : Double = 0.0
//    private var height : Double = 0.0
//
//    fun setInfo(newName: String, newWith: Double, newHeight : Double){
//        super.setInfo(newName = newName)
//        this.width = newWith
//        this.height = newHeight
//    }
//
//    override fun calculater() : Double{
//        return width * height
//    }
//
//}
//
//fun main() {
//    val cricle = Cricle()
//    val rectangle = Rectangle()
//    cricle.setInfo("hình tròn", 5.0)
//    rectangle.setInfo("hình chữ nhật", 4.0, 3.0)
//    println("Diện tích của hình tròn là ${cricle.calculater()}" )
//    println("Diện tích của hình chữ nhật là ${rectangle.calculater()}")
//}
//

open class Person(){
    private var name: String? = null
    private var age : Int? = null
    private var address : String? = null

    fun setInfo(newName: String, newAge : Int, newAddress : String){
        this.name = newName
        this.age = newAge
        this.address = newAddress
    }
    open fun getInfo() : String{
        return "name $name age $age address $address"
    }
    fun eat(){
        println("$name đang ăn")
    }

    fun sleep(){
        println("$name đang ngủ")
    }

    open fun work() : String{
        return ("$name đang làm việc")
    }
}
class Student() : Person(){
    var students : String? = null

    fun setInfo(newName: String, newAge: Int, newAddress: String, newStudents: String){
        super.setInfo(newName = newName, newAge = newAge, newAddress = newAddress)
        this.students = newStudents
    }
    override fun work() : String{
        return ("${super.getInfo()}, đang học tập ở $students")
    }
}

class Teacher() : Person(){
    private var subject : String? = null
    fun setInfo(newName: String, newAge: Int, newAddress: String, newSubject: String){
        super.setInfo(newName = newName, newAge = newAge, newAddress = newAddress)
        this.subject = newSubject
    }
    override fun work() : String{
        return ("${super.getInfo()} đang dạy môn $subject")
    }
}

class Engineer() : Person(){
    private var company: String? = null

    fun setInfo(newName: String, newAge: Int, newAddress: String, newCompany: String){
        super.setInfo(newName = newName, newAge = newAge, newAddress = newAddress)
        this.company = newCompany
    }

    override  fun work() : String{
        return ("${super.getInfo()}, đang làm tại công ty $company")
    }
}

class PersonManage(){
    private val listWork = mutableListOf<Person>()

    fun addWord(person: Person){
        listWork.add(person)
    }

    fun remoteWord(person: Person){
        listWork.remove(person)
    }
    fun showWord(){
        listWork.forEach(){
            println(it.work())
        }
    }
}

fun main() {
    val personManage = PersonManage()
    val student = Student()
    val teacher = Teacher()
    val engineer = Engineer()
    student.setInfo(newName = "Hùng", newAge = 20, newAddress = "Gia lai", newStudents = "Gia định")
    teacher.setInfo(newName = "Hùng", newAge = 21, newAddress = "Gia lai", newSubject = "android dev")
    engineer.setInfo(newName = "Hùng", newAge = 22, newAddress = "Gia lai", newCompany = "ZERO")
    personManage.addWord(student)
    personManage.addWord(teacher)
    personManage.addWord(engineer)
    println("-------------------------------------------------")
    personManage.showWord()
    println("-------------------------------------------------")
}