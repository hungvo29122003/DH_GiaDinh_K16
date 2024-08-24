import kotlin.math.sin

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
//abstract  class Shape(){
//    private var name : String? = null
//
//    fun setInfo(newName : String){
//        this.name = newName
//    }
//    abstract fun calculateArea() : Double
//}
//
//class Cricle() : Shape(){
//    private var radius : Double = 0.0
//
//    fun setInfo(newName: String, newRadius : Double){
//        super.setInfo(newName = newName)
//        this.radius = newRadius
//    }
//    override fun calculateArea() : Double{
//        return Math.PI * radius * radius
//    }
//}
//
//class Rectangle() : Shape(){
//    private var width : Double = 0.0
//    private var height : Double = 0.0
//
//    fun setInfo(newName: String, newWidth: Double, newHeight : Double){
//        super.setInfo(newName = newName)
//        this.width = newWidth
//        this.height = newHeight
//    }
//
//    override fun calculateArea() : Double{
//        return width * height
//    }
//
//}
//
//fun main() {
//    val cricle = Cricle()
//    val rectangle = Rectangle()
//
//    cricle.setInfo("hình tròn", 5.0)
//    rectangle.setInfo("hình chữ nhật", 4.0, 3.0)
//    println("Diện tích của hình tròn là ${cricle.calculateArea()}" )
//    println("Diện tích của hình chữ nhật là ${rectangle.calculateArea()}")
//}

//
//open class Person(){
//    private var name: String? = null
//    private var age : Int? = null
//    private var address : String? = null
//
//    fun setInfo(newName: String, newAge : Int, newAddress : String){
//        this.name = newName
//        this.age = newAge
//        this.address = newAddress
//    }
//    open fun getInfo() : String{
//        return "name $name age $age address $address"
//    }
//    fun eat(){
//        println("$name đang ăn")
//    }
//
//    fun sleep(){
//        println("$name đang ngủ")
//    }
//
//    open fun work() : String{
//        return ("$name đang làm việc")
//    }
//}
//class Student() : Person(){
//    var students : String? = null
//
//    fun setInfo(newName: String, newAge: Int, newAddress: String, newStudents: String){
//        super.setInfo(newName = newName, newAge = newAge, newAddress = newAddress)
//        this.students = newStudents
//    }
//    override fun work() : String{
//        return ("${super.getInfo()}, đang học tập ở $students")
//    }
//}
//
//class Teacher() : Person(){
//    private var subject : String? = null
//    fun setInfo(newName: String, newAge: Int, newAddress: String, newSubject: String){
//        super.setInfo(newName = newName, newAge = newAge, newAddress = newAddress)
//        this.subject = newSubject
//    }
//    override fun work() : String{
//        return ("${super.getInfo()} đang dạy môn $subject")
//    }
//}
//
//class Engineer() : Person(){
//    private var company: String? = null
//
//    fun setInfo(newName: String, newAge: Int, newAddress: String, newCompany: String){
//        super.setInfo(newName = newName, newAge = newAge, newAddress = newAddress)
//        this.company = newCompany
//    }
//
//    override  fun work() : String{
//        return ("${super.getInfo()}, đang làm tại công ty $company")
//    }
//}
//
//class PersonManage(){
//    private val listWork = mutableListOf<Person>()
//
//    fun addWord(person: Person){
//        listWork.add(person)
//    }
//
//    fun remoteWord(person: Person){
//        listWork.remove(person)
//    }
//    fun showWord(){
//        listWork.forEach(){
//            println(it.work())
//        }
//    }
//}
//
//fun main() {
//    val personManage = PersonManage()
//    val student = Student()
//    val teacher = Teacher()
//    val engineer = Engineer()
//    student.setInfo(newName = "Hùng", newAge = 20, newAddress = "Gia lai", newStudents = "Gia định")
//    teacher.setInfo(newName = "Hùng", newAge = 21, newAddress = "Gia lai", newSubject = "android dev")
//    engineer.setInfo(newName = "Hùng", newAge = 22, newAddress = "Gia lai", newCompany = "ZERO")
//    personManage.addWord(student)
//    personManage.addWord(teacher)
//    personManage.addWord(engineer)
//    println("-------------------------------------------------")
//    personManage.showWord()
//    println("-------------------------------------------------")
//}
//
//abstract class Vehicle(){
//    private var brand : String? = null
//    private var model: String? = null
//    private var year : Int? = null
//
//    open fun setInfo(newBrand: String, newModel: String, newYear: Int){
//        this.brand = newBrand
//        this.model = newModel
//        this.year = newYear
//
//    }
//    abstract fun starEngine()
//    abstract fun stopEngine()
//}
//
//class Car(): Vehicle(){
//    override fun setInfo(newBrand: String, newModel: String, newYear: Int){
//        super.setInfo(newBrand = newBrand, newModel = newModel, newYear = newYear)
//    }
//
//    override fun starEngine(){
//        println("động cơ xe hơi đang khởi động")
//    }
//
//    override fun stopEngine(){
//        println("động cơ xe hơi đã tắt")
//    }
//}
//
//class Motorcycle(): Vehicle(){
//    override fun setInfo(newBrand: String, newModel: String, newYear: Int){
//        super.setInfo(newBrand = newBrand, newModel = newModel , newYear = newYear)
//    }
//
//    override fun starEngine(){
//        println("Động cơ xe máy đang được khởi động")
//    }
//
//    override fun stopEngine(){
//        println("Động cơ xe máy đã tắt ")
//    }
//}
//
//class Ship() : Vehicle(){
//    override fun setInfo(newBrand: String, newModel: String, newYear: Int){
//        super.setInfo(newBrand = newBrand, newModel = newModel, newYear = newYear)
//    }
//
//    override fun starEngine(){
//        println("Động cơ tàu đang được khởi động")
//    }
//
//    override fun stopEngine(){
//        println("Động cơ tàu đã được tắt")
//    }
//}
//
//fun main() {
//    val myCar = Car()
//    val myMotorcycle = Motorcycle()
//    val myShip = Ship()
//    myCar.setInfo(newBrand = "toyota", newModel = "Camry", newYear = 2013)
//    myMotorcycle.setInfo(newBrand = "Honda", newModel = "Z1000", newYear = 2012)
//    myShip.setInfo(newBrand = "Hyundai", newModel = "Grand Ace", newYear = 2019)
//    println("----------------------------")
//    myCar.starEngine()
//    println("----------------------------")
//    myCar.stopEngine()
//    println("----------------------------")
//    myMotorcycle.starEngine()
//    println("----------------------------")
//    myMotorcycle.stopEngine()
//    println("----------------------------")
//    myShip.starEngine()
//    println("----------------------------")
//    myShip.stopEngine()
//}

 open   class Person(){
    private var name : String? = null
    private var age : String? = null
    private var address : String? = null

    fun setInfo(newName: String, newAge: String, newAddress: String){
        this.name = newName
        this.age = newAge
        this.address = newAddress
    }
    open fun getInfo() : String{
        return "name ${name}, age ${age}, address ${address} "
    }
}

class Student() : Person() {
    private var studentId : String? =null
    private var major : String? = null
    private var gpa : Double? = null

    fun setInfo(newName: String, newAge: String, newAddress: String, newStudenId: String, newMajor: String, newGpa: Double){
        super.setInfo(newName = newName, newAge = newAge, newAddress = newAddress)
        this.studentId = newStudenId
        this.major = newMajor
        this.gpa = newGpa
    }
    fun getId() : String{
        return "students ${studentId}"
    }

    override fun getInfo() : String {
        return "${super.getInfo()}, studentID ${studentId}, major ${major}, gpa ${gpa}"
    }
}

class Lecturer() : Person(){
    private var department :String? = null
    private var yearsOfExperience : Int? = 0

    fun setInfo(newName: String, newAge: String, newAddress: String, newDepartment: String, newYearsOfExperience : Int) {
        super.setInfo(newName = newName, newAge = newAge, newAddress = newAddress)
        this.department = newDepartment
        this.yearsOfExperience = newYearsOfExperience
    }

    override fun getInfo() : String {
        return "${super.getInfo()}, deparment ${department}, yearOfExperence ${yearsOfExperience}"
    }
}

data class Book(var title : String, var author : String, var publicationYear: Int, var isBorrowed: Boolean = false)

class Library() {
    var listBook = mutableListOf<Book>()

    fun addBook(book: Book) {
        listBook.add(book)
    }
    fun searchBooksByName(title: String) : List<Book> {
        return listBook.filter {it.title == title}
    }

    fun searchBookByAuthor(author: String) : List<Book> {
        return listBook.filter {it.author == author}
    }
}
class Manage(){
    var listPerson = mutableListOf<Person>()

    fun addPerson(person: Person){
        listPerson.add(person)
    }

    fun removePerson(person: Person){
        listPerson.remove(person)
    }
    fun findStudentById(id: String) : List<Student> {
        return listPerson.filterIsInstance<Student>().filter{it.getId() == id}
    }
    fun showInfo(){
        listPerson.forEach{
            println(it.getInfo())
        }
    }
}

fun main() {
    var listPerson = Manage()
    var student = Student()
    var student1 = Student()
    val lecturer = Lecturer()
    student.setInfo(newName = "Hùng", newAge = "20", newAddress = "Gia lai", newStudenId = "221402", newMajor = "LT", newGpa = 9.0 )
    student1.setInfo(newName = "a", newAge = "22", newAddress = "GL", newStudenId = "221402", newMajor = "LT ANDROID", newGpa = 10.0)
    lecturer.setInfo(newName = "Hùng", newAge = "25", newAddress = "Gia lai", newDepartment = "LT", newYearsOfExperience = 2)
    listPerson.addPerson(student)
    listPerson.addPerson(student1)
    listPerson.addPerson(lecturer)
    println("----------------------------------------------------------")
//    listPerson.findStudentById(id = "221402")
    println("---------------------------------------------------------")
    listPerson.showInfo()
}
