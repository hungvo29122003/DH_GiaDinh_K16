package abstact

  abstract class School {
    abstract var size : Int
    var price : Double = 0.0

      open fun create(){
        println("1")
      }
      abstract fun add()
 }



