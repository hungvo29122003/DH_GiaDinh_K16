package animalabstact

abstract class Animal {
    private var species : String? = null
    private var name : String? = null
    private var age : Int? = null
     open fun setInfo(newSpecies : String, newName : String, newAge : Int){
        this.species = newSpecies
        this.name = newName
        this.age = newAge

    }

     open fun getInfo() : String{
        return "loài ${species}, tên ${name}, tuổi $age"
    }
    abstract fun makeSound()

}

