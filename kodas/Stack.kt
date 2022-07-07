package kodas

import kodas.linkedlist.SinglyLinkedList

/*
* First In Last Out
* */
class Stack : SinglyLinkedList() {

    private var index = 0

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
        show(index - 1)
    }

}