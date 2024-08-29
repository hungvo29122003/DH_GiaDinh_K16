package vehicleabstract

class Car : Vehicle(), EnginePoweredVehical {
    private var numberOfSeats: Int? = 0
    private var enginePower: Double? = 0.0
    fun setInfo(newName: String, newColor: String, newNumberOfWheels : Int, newSpeed: Int, newNumberOfSeats: Int, newEnginePower: Double){
        super.setInfo(newName = newName, newColor = newColor, newNumberOfWheels = newNumberOfWheels, newSpeed = newSpeed)
        this.numberOfSeats = newNumberOfSeats
        this.enginePower = newEnginePower
    }
    override fun getInfo() : String{
        return "${super.getInfo()}, số ghế ${numberOfSeats}, công suất động cơ $enginePower"
    }
//    override fun getName() : String{
//        return "${super.getName()}"
//    }

    override fun move() {
        println("xe ${super.getName()}  đang di chuyển ")
    }

    override fun stop() {
        println("xe ${super.getName()} đang dừng lại ")
    }

    override fun accelerate() {
        println("xe ${super.getName()} đang tăng tốc")
    }

    override fun decelerate() {
        println("xe ${super.getName()} đang giảm tốc ")
    }
}