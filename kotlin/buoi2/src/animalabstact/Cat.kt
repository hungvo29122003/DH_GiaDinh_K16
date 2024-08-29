package animalabstact

class Cat : Animal(), Action {
    private var toy : String? = null
    private var task : String? = null
    private var colorCat : String? = null
    fun setInfo(newSpecies : String, newName : String, newAge : Int, newToy : String, newTask : String, color : String){
        super.setInfo(newSpecies = newSpecies, newName = newName, newAge = newAge)
        this.toy = newToy
        this.task = newTask
        this.colorCat = color
    }
    override fun getInfo() : String{
        return "${super.getInfo()},màu lông ${colorCat},đồ chơi ${toy}, nhiệm vụ $task"
    }
    override fun makeSound() {
        println("tiếng mèo kêu")
    }

    override fun eat() {
       println("mèo đang được cho ăn")
    }

    override fun sleep() {
        println("mèo đang được ngủ ")
    }

    override fun play() {
        println("mèo đang chơi với $toy")
    }

    override fun bathe() {
        println("mèo đang được tắm")
    }

    override fun task() {
        println("mèo đang làm nhiệm vụ $task")
    }

}