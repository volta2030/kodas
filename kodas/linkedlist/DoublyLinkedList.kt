package kodas.linkedlist

import kodas.Node

class DoublyLinkedList {

    private var head : Node? = null
    private var tail : Node? = null

    fun insert(index : Int, data : Any) {
        var prevNode : Node? = head
        var nextNode : Node? = head

        var count = 0

        if(head == null){
            head = Node(data)
            tail = head
            return
        }

        if(index == 0){
            head = Node(data)
            head?.next = nextNode
            return
        }

        while(nextNode?.data != null){
            try {
                prevNode = nextNode
                nextNode = nextNode.next!!
                count++
            }catch (e : NullPointerException){

                if(count == index - 1){
                    prevNode?.next = Node(data)
                    tail = prevNode?.next
                    return
                }else{
                    println("Invalid")
                    return
                }
            }
        }

        prevNode?.next = Node(data)
        prevNode?.next!!.next = nextNode

    }

    fun delete(index : Int) {
        var prevNode : Node? = head
        var nextNode : Node? = head

        var count = 0

        if(head == null){
            println("invalid")
            return
        }

        if(index == 0){
            head = try {
                head?.next!!
            }catch (e : NullPointerException){

                tail = null
                null
            }
            return
        }

        while(nextNode?.data != null){
            try {
                prevNode = nextNode
                nextNode = nextNode?.next!!
                count++
            }catch (e : NullPointerException){
                if(count == index - 1){
                    prevNode?.next = null
                    tail = prevNode
                    return
                }else{
                    println("Invalid")
                    return
                }
            }

            if(count == index){
                break
            }


        }

        prevNode = head
        while (prevNode?.next != nextNode){
            prevNode = prevNode?.next!!
        }

        prevNode?.next = nextNode?.next

    }

    fun show() {

        var nextNode : Node? = head

        while(nextNode?.data != null){
            try {
                print("${nextNode?.data} -> ")
                nextNode = nextNode.next!!
            }catch (e : NullPointerException){
                println("")
                return
            }
        }
    }

    @Override
    fun show(index: Int){

        var count = 0
        var nextNode : Node? = head

        while(nextNode?.data != null){

            if(count == index){
                println(nextNode.data)
                return
            }

            try {
                nextNode = nextNode.next!!
            }catch (e : NullPointerException){
                return
            }
            count++
        }
    }
}