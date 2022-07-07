package kodas

import kodas.linkedlist.SinglyLinkedList

/*
* First In First Out
* */

class Queue : SinglyLinkedList(){

    private var index = 0

    fun enqueue(data : Any){
        insert(index, data)
        index++
    }

    fun deque(){
        if(isEmpty()){
            println("Empty")
            return
        }

        index--
        delete(index)
    }

    fun rear(){
        if(isEmpty()){
            println("Empty")
            return
        }

        show(index - 1)
    }

    fun front(){
        if(isEmpty()){
            println("Empty")
            return
        }

        show(0)
    }
}