package animalabstact

class Dog: Animal(), Action {
    private var toy : String? = null
    private var task : String? = null
    private var colorDog : String? = null
    fun setInfo(newSpecies: String, newName : String, newAge: Int, newToy : String, newTask : String, color : String){
        super.setInfo(newSpecies = newSpecies, newName = newName, newAge = newAge)
        this.toy = newToy
        this.task = newTask
        this.colorDog = color
    }

    override fun getInfo() : String{
        return "${super.getInfo()},màu lông ${colorDog}, đồ chơi ${toy}, nhiệm vụ $task"
    }

    override fun makeSound() {
        println("tiếng chó sủa")
    }

    override fun eat() {
        println("chó đang được cho ăn")
    }

    override fun sleep() {
        println("chó đang ngủ ")
    }

    override fun play() {
        println("chó đang chơi với $toy  ")
    }

    override fun bathe() {
        println("chó đang được tắm")
    }

    override fun task() {
        println("chó đang làm nhiệm vụ $task")
    }
}