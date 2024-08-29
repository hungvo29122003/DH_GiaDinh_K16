package vehicleabstract

class Bicycle : Vehicle(), EnginePoweredVehical {
    private var vehicalType : String? = null

    fun setInfo(newName: String, newColor: String, newNumberOfWheels: Int, newSpeed: Int, newVehicalType: String){
        super.setInfo(newName = newName, newColor = newColor, newNumberOfWheels = newNumberOfWheels, newSpeed = newSpeed)
        this.vehicalType = newVehicalType
    }

    override fun getInfo() : String{
        return "${super.getInfo()}, loại xe $vehicalType"
    }

    override fun move() {
        println("xe đạp ${super.getName()} đang đạp")
    }

    override fun stop() {
        println("xe đạp ${super.getName()} đang dừng")
    }

    override fun accelerate() {
        println("xe đạp ${super.getName()} đang tăng tốc")
    }

    override fun decelerate() {
        println("xe đạp ${super.getName()} đang giảm tốc")
    }
}