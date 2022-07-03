import kodas.SinglyLinkedList

fun main(){
    val singlyLinkedList = SinglyLinkedList(1)
    singlyLinkedList.insert(0, 2)
    singlyLinkedList.insert(2, 3)
    singlyLinkedList.insert(4, 100)
    singlyLinkedList.insert(3, 4)

    singlyLinkedList.show()

    singlyLinkedList.delete(1)

    singlyLinkedList.show()

}