package vehicleabstract

class ManageVehicle {
     private val listVehicle = mutableListOf<Vehicle>()
    fun addVehical(vehicle: Vehicle){
        listVehicle.add(vehicle)
    }
    fun removeVehical(vehicle: Vehicle){
        listVehicle.remove(vehicle)
    }
    fun showInfo(){
        listVehicle.forEach{
            println(it.getInfo())
        }
    }
    fun checkSpeedForAllVehicles(){
        listVehicle.forEach { vehicle ->
            vehicle.checkSpeed()
        }
    }

    fun checkSpeedMoveForAllVehicles(){
        listVehicle.forEach{ vehicle ->
            vehicle.checkSpeedMove()
        }
    }
}