package kodas
class Stack : SinglyLinkedList() {

    var index = 0

    fun push(data : Any){

        insert(index, data)
        index++
    }

    fun pop(){

        if(isEmpty()){
            println("Empty")
            return
        }

        index--
        delete(index)
    }

    fun top(){
        var nextNode : Node? = head

        while(nextNode?.data != null){
            try {
                  nextNode = nextNode.next!!
            }catch (e : NullPointerException){
                println(nextNode.data)
                return
            }
        }

    }

    private fun isEmpty() : Boolean{
        if(head == null){
            return true
        }
        return false
    }

}