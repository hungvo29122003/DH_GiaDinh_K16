package vehicleabstract

fun main() {
    val manageVehicle = ManageVehicle()
    val car = Car()
    val motorcrycle = Motorcrycle()
    val bicycle = Bicycle()

    car.setInfo(newName = "BMW", newColor = "blue", newNumberOfWheels = 4, newSpeed = 100, newNumberOfSeats = 4, newEnginePower = 2.5 )
    motorcrycle.setInfo(newName = "Honda Wave", newColor = "white", newNumberOfWheels = 2, newSpeed = 80, newEnginePower = 125.0)
    bicycle.setInfo(newName = "Giant", newColor = "yellow", newNumberOfWheels = 2, newSpeed = 0, newVehicalType = "xe đạp địa hình")
    manageVehicle.addVehical(car)
    manageVehicle.addVehical(motorcrycle)
    manageVehicle.addVehical(bicycle)
    println("hiện thông tin xe ")
    manageVehicle.showInfo()
    println("hiện các hoạt động của car")
    car.move()
    car.stop()
    car.accelerate()
    car.decelerate()
    println("hiện các hoạt động của moto")
    motorcrycle.move()
    motorcrycle.stop()
    motorcrycle.accelerate()
    motorcrycle.decelerate()
    println("hiện các hoạt động của bicycle")
    bicycle.move()
    bicycle.stop()
    bicycle.accelerate()
    bicycle.decelerate()
    println("xe vi phạm giao thông")
    manageVehicle.checkSpeedForAllVehicles()
    println("phương tiện nào đang lưu thông và không lưu thông")
    manageVehicle.checkSpeedMoveForAllVehicles()
}