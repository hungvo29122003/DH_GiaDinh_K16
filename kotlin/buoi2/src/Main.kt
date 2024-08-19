//data class Student(val id : Int, val name : String, val age : Int )
//
//fun main() {
//    val students = mutableListOf(
//        Student(1, "Hùng", 20),
//        Student(2, "Tiên", 20),
//        Student(3, "Thắng", 20),
//        Student(4, "a", 13),
//        Student(5, "b", 21),
//        Student(6, "c", 20),
//        Student(7, "d", 12),
//        Student(8, "as", 23),
//        Student(9, "ac", 22),
//        Student(10, "Long", 22)
//    )
////    students.forEach{
////        println("id : ${it.id}, name : ${it.name}, age : ${it.age} ")
////    }
////    for (Student in students){
////        println(Student)
////    }
//    // thêm Student
//    students.add(Student(11, "Tên", 22))
//    // xoá Student tại index 3
//    students.removeAt(3)
//    // xoa students với dk name = thắng
//    students.removeIf {it.name == "Thắng"}
//    // it
////    lọc students có tuổi dưới 16
//    val studentsUnder16 = students.filter {it.age < 16}
//    // tìm những studen có tên Long
//   val studentLong =  students.find {it.name == "Long"}
//it là duyệt từ đầu đến cuối danh sách
//
//    students.forEach {
//        println("id : ${it.id}, name : ${it.name}, age : ${it.age} ")
//    }
//    println("---------------------------------------------------------")
//    studentsUnder16.forEach {
//        println("id : ${it.id}, name : ${it.name}, age : ${it.age} ")
//    }

//    println("---------------------------------------------------------")
//    if (studentLong != null){
//        println("tìm thấy sinh viên tên long")
//        println("id : ${studentLong.id}, name : ${studentLong.name}, age : ${studentLong.age} ")
//    } else {
//        println("Không tìm thấy sinh viên tên long trong danh sách")
//    }
//}
////
//
/*a) Tạo 1 class Wheel ( bánh xe)
//Các thuộc tính là brand, width, thick : chinh 1 bien
//Các hành vi setInfo, getInfo: chinh 1 ham
//
//b) Tạo 1 class Car
//Các thuộc tính là color, brand, wheel, normalSpeed
//Các hành vi setInfo, getInfo, getMaxSpeed
//
//C) Tạo class TaxiCar kế thừa class Car
//Các thuộc tính là taxiBrand
//Các hành vi countTaxiCharge
//
//D) Tạo class GrabBar kế thừa class Car
//Các thuộc tính là owner
//
//E) Tạo 1 class CarManager
//Quản lí các xe:
//gồm các phương thức Add 1 xe , Xoá 1 xe, lấy ra thông tin của xe..
*/
//class Whell(var brand : String, var width: Int, var thick: Int){
//
//    fun setInfo(newBrand: String, newWidth: Int, newThick: Int){
//        brand = newBrand
//        width = newWidth
//        thick = newThick
//    }
//
//    fun getInfo() :String{
//        return "Brand ${brand}, width ${width}, thick $thick"
//    }
//}
//
//open class Car{
//    private var color : String? = null
//    private var brand: String? = null
//    private var wheel: Whell? = null
//    private var normalSpeed: Int? = null
//
//    fun setInfo(newColor: String, newBrand: String, newWheel : Whell, newSpeed:  Int) {
//        color = newColor
//        brand = newBrand
//        wheel = newWheel
//        normalSpeed = newSpeed
//    }
//
//    open fun getInfo() : String {
//        return "màu xe ${color}, brand ${brand}, wheel ${wheel?.getInfo()}, normalSpeed $normalSpeed"
//    }
//
//    fun getMaxSpeed() : Int?{
//        return normalSpeed?.times(3)
//    }
//
//}
//
//class TaxiCar : Car(){
//    private var taxiBrand : String? = null
//    private var kilomet : Int? = null
//
//    fun setInfo(newColor: String, newBrand: String, newWheel : Whell, newSpeed:  Int, newTaxiBrand: String, newKilomet: Int){
//        super.setInfo(newColor =newColor , newBrand =newBrand, newWheel =newWheel, newSpeed = newSpeed )
//        this.taxiBrand = newTaxiBrand
//        this.kilomet = newKilomet
//    }
//
//    override fun getInfo() :String {
//        return "${super.getInfo()}, taxiBrand $taxiBrand"
//    }
//
//    fun getTaxiChang() : Int {
//        return kilomet?.times(5000) ?: 0
//    }
//}
//
//class GrabCar : Car(){
//    private var owner : String? = null
//    fun setInfo(newColor: String, newBrand: String, newWheel : Whell, newSpeed:  Int, owner : String){
//        super.setInfo(newColor = newColor, newBrand = newBrand, newWheel = newWheel, newSpeed = newSpeed)
//        this.owner = owner
//    }
//    override fun getInfo() : String {
//        return "${super.getInfo()}, newOwner $owner"
//    }
//}
//
//class CarManage{
//     private val listCar = mutableListOf<Car>()
//
//    fun addCar(car: Car){
//        listCar.add(car)
//    }
//    fun removeCar(car: Car){
//        listCar.remove(car)
//    }
//    fun showInfo() {
//        listCar.forEach{
//            println(it.getInfo())
//        }
//    }
//}
//fun main() {
//    val carMenage = CarManage()
//    val car = Car()
//    val taxiCar = TaxiCar()
//    val grabCar = GrabCar()
//    val wheel = Whell(brand = "abc", width = 2, thick = 1 )
//    car.setInfo(newColor = "đỏ", newBrand = "toyota", newWheel = wheel, newSpeed = 50)
//    taxiCar.setInfo(newColor = "xanh", newBrand = "a", newWheel = wheel, newSpeed = 100, newKilomet = 15, newTaxiBrand = "hs")
//    grabCar.setInfo(newColor = "tím", newBrand = "b", newWheel = wheel, newSpeed = 20, owner = "Hùng")
//    carMenage.addCar(taxiCar)
//    carMenage.addCar(grabCar)
//    carMenage.addCar(car)
//    carMenage.showInfo()
//}
/*a) Tao 1 class Device
có các thuộc tình là id, name, brand, price
Các hành vi setInfo, getInfo

b) Tạo 1 class Light kế thừa class Device
có thuộc tính lightPower, color, brightNess

c) Tạo 1 class Camera kế thừa Device
có thuộc tính rotateSpeed

d) Tạo 1 class DeviceManager
thuộc tính home
+ add 1 device
+ remove 1 device by id
+ update 1 device by id
+ getInfo deviceList*/
open class Device(){

    var id : String? = null
    var name : String? = null
    var brand : String? = null
    var price : Double? = null

    fun setInfo(newId : String, newName : String, newBrand : String, newPrice : Double){
        id = newId
        name = newName
        brand = newBrand
        price = newPrice
    }

    open fun getInfo() : String{
        return "id ${id}, name ${name}, brand ${brand}, price ${price}"
    }
}

class Light() : Device(){
    var lightPower : Int? = null
    var color : String? = null
    var brightNess : Int? = null

    fun setInfo(newId : String, newName : String, newBrand : String, newPrice : Double, lightPower : Int, color : String, brightNess : Int){
        super.setInfo(newId = newId, newName = newName, newBrand = newBrand, newPrice = newPrice)
        this.lightPower = lightPower
        this.color = color
        this.brightNess = brightNess
    }

    override fun getInfo() : String{
        return "${super.getInfo()}, lightPower ${lightPower}, color ${color}, brightNess ${brightNess}"
    }
}

class Camera() : Device(){
    var rotateSpeed : Int? = null

    fun setInfo(newId : String, newName: String, newBrand: String, newPrice: Double, rotateSpeed : Int ){
        super.setInfo(newId = newId, newName = newName, newBrand = newBrand, newPrice = newPrice)
        this.rotateSpeed = rotateSpeed
    }

    override fun getInfo() : String{
        return  "${super.getInfo()}, rotateSpeed ${rotateSpeed}"
    }
}
class DeviceManager(){
    var home = mutableListOf<Device>()
    fun addDevice(device: Device){
        home.add(device)
    }

    fun removeDeviceByID(id : String){
        home.removeIf {it.id == id}
    }

    fun updateDeviceById(id : String){

    }

    fun showInfo(){
        home.forEach {
            println(it.getInfo())
        }
    }

}


fun main() {
    val home = DeviceManager()
    val light = Light()
    val camera = Camera()

    home.addDevice(light)
    home.addDevice(camera)
    light.setInfo(newId = "b1", newName = "Light", newBrand = "Light", newPrice = 10.0, lightPower = 10, color = "nâu", brightNess = 100)
    camera.setInfo(newId = "b2", newName = "Camera", newBrand = "camera", newPrice = 20.0, rotateSpeed = 100)

    home.showInfo()
    println("_________________________________________________")
    home.removeDeviceByID("b2")
    // ... các lệnh khác ...
    println("--------------------------------")

    println("--------------------------------")
    home.showInfo()
}
