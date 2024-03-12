fun main(){
    //object of the class
    var obj1=Person(name="saumya",age=22)
    obj1.canVote() // Corrected
}

class Person(var name:String,var age:Int){

    fun canVote(){
        if(age <18){
            println("Can not vote")
        } else {
            println("Can vote")
        }
    }

}
