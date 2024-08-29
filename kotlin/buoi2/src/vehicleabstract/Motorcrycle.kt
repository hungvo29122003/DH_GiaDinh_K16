package vehicleabstract

class Motorcrycle : Vehicle(), EnginePoweredVehical {
    private var enginePower : Double? = 0.0

    fun setInfo(newName : String, newColor: String, newNumberOfWheels : Int, newSpeed: Int, newEnginePower: Double){
        super.setInfo(newName = newName, newColor = newColor, newNumberOfWheels = newNumberOfWheels, newSpeed = newSpeed)
        this.enginePower = newEnginePower
    }

    override fun getInfo() : String {
        return "${super.getInfo()}, động cơ $enginePower"
    }

    override fun move() {
        println("xe ${super.getName()}, đang đi chuyển")
    }

    override fun stop() {
        println("xe ${super.getName()}, đang dừng lại")
    }

    override fun accelerate() {
        println("xe ${super.getName()}, đang tăng tốc")
    }

    override fun decelerate() {
        println("xe ${super.getName()}, đang giảm tốc")
    }
}