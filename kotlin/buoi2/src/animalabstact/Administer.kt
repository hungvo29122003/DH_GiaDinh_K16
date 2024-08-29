package animalabstact

class Administer {
    private val listAnimal = mutableListOf<Animal>()

    fun addAnimal(animal: Animal){
        listAnimal.add(animal)
    }
    fun removeAnimal(animal: Animal){
        listAnimal.remove(animal)
    }

    fun showinfo() {
        listAnimal.forEach {
            println(it.getInfo())
        }
    }
}