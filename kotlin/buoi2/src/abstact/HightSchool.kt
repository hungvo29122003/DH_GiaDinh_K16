package buoi2.abstact

class HightSchool() : School(),Manage  {
     override var size : Int = 100
        override fun add(){
            super.create()
        }
    override fun create(){
        println("1")
    }


    override fun manageStudent() {
        TODO("Not yet implemented")
    }

    override fun manageTeacher() {
        TODO("Not yet implemented")
    }
}

interface Manage{
    fun manageStudent()
    fun manageTeacher()
}
