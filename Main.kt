import kodas.Table

fun main(){

//    var queue = Queue()
//
//    queue.enqueue(1)
//    queue.enqueue(2)
//
//    queue.front()
//    queue.rear()
//
    var table = Table(
        arrayOf("men", "women"),
        arrayOf("young", "old")
    )

    table.append("men","young", 10)
    table.append("men","old", 20)
    table.append("women","young", 30)
    table.append("women","old", 40)

    table.print()
}