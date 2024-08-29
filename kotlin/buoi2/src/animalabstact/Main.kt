
import animalabstact.Administer
import animalabstact.Cat
import animalabstact.Dog

fun main() {
    val manage = Administer()
    val dog = Dog()
    val cat = Cat()
    dog.setInfo(newSpecies = "alaska", newName = "ki", newAge = 3, color = "trắng" , newToy = "xương", newTask = "canh nhà")
    cat.setInfo(newSpecies = "British Shorthair", newName = "miu", newAge = 2, color = "vàng", newToy = "cuộn dây", newTask = "băt chuột")
    manage.addAnimal(dog)
    manage.addAnimal(cat)
    manage.showinfo()
    println("tiếng kêu")
    dog.makeSound()
    cat.makeSound()
    println("hành động")
    dog.bathe()
    cat.sleep()
    println("đồ chơi")
    dog.play()
    cat.play()
    println("nhiệm vụ")
    dog.task()
    cat.task()
}
