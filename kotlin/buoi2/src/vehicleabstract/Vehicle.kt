package vehicleabstract
/*
* class vehical
* có các thuộc tính tên , màu , số bánh
* có các phương thức di chuyển , dừng lại
*
* */
abstract class Vehicle {
    private var name : String? = null
    private var color : String? = null
    private var numberOfWheels : Int? = 0
    private var speed : Int? = 0

    fun setInfo(newName : String, newColor: String, newNumberOfWheels: Int, newSpeed: Int){
        this.name = newName
        this.color = newColor
        this.numberOfWheels = newNumberOfWheels
        this.speed = newSpeed
    }
    open fun getName() : String {
        return "$name"
    }

//    fun getSpeed() : String {
//        return "${speed}"
//    }

    fun checkSpeed() {
//        if(speed != null && speed > 60){
//            println("$name đã vi phạm tốc độ" )
//        } else {
//            println("${name} chưa khởi tạo tốc độ")
//        }
//        speed?.let {
//            if (it > 60){
//
//            } else{
//                if (speed!! < 0) {
//                    println(" xe ${name} chưa chạy  ")
//                } else {
//                    println(" xe ${name} chưa vi phạm tốc độ với tốc độ xe đang đi là ${speed}")
//                }
//            }
//        }
        if (speed!! > 60) {
            println(" xe $name đã vi phạm tốc độ với tốc độ xe đang đi là $speed ")
        }
    }

    open fun getInfo() : String{
        return "tên $name, màu xe ${color}, số bánh ${numberOfWheels}, tốc độ $speed "
    }

    abstract fun move()

    abstract fun stop()
}