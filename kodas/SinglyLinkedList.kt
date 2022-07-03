package kodas

open class SinglyLinkedList : LinkedList{

    protected var head : Node ?= null

    override fun insert(index : Int, data : Any) {
        var prevNode : Node? = head
        var nextNode : Node? = head

        var count : Int = 0

        if(head == null){
            head = Node(data)
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

    override fun delete(index : Int) {
        var prevNode : Node? = head
        var nextNode : Node? = head

        var count : Int = 0

        if(head == null){
            println("invalid")
            return
        }

        if(index == 0){
            head = try {
                head?.next!!
            }catch (e : NullPointerException){
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

    override fun show() {

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
}