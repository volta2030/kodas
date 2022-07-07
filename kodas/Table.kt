package kodas

class Table(private val rows:  Array<String>, private val cols:  Array<String>) {
    private val array = Array(rows.size) {
        Array<Any>(cols.size){ }
    }

    fun append(row : String, col : String , data: Any){
        array[rows.indexOf(row)][cols.indexOf(col)] = data
    }

    fun remove(row : String, col : String){
        array[rows.indexOf(row)][cols.indexOf(col)] = ""
    }

    fun print(){

        var printCols = cols
        var printRows = rows

        var maxLengthCol = findMaxLength(printCols)
        var maxLengthRow = findMaxLength(printRows)

        printRows.forEachIndexed { index, it ->
            if(it.length < maxLengthRow){
                var string = printRows[index]
                for(i in it.length+1 ..maxLengthRow){
                    string += " "
                }
                printRows[index] = string
            }
        }

        var blank = ""
        var hyphenRow = "-"
        var hyphen ="-"

        for(i in 1..maxLengthRow){
            blank += " "
            hyphen += "-"
        }

        for(i in 1..maxLengthCol){
            hyphenRow += "-"
        }

        blank += "|"
        print(blank)

        printCols.forEach {
            print("$it ")
        }

        println()
        print(hyphen)
        print(hyphenRow)
        print(hyphenRow)
        println()

        array.forEachIndexed {index, it->
            print("${printRows[index]}|")
            it.forEach { it ->
                print("$it ")
            }
            println()
        }
    }

    private fun findMaxLength(array : Array<String>) : Int {
        var maxLength = 0

        array.forEach {
            if(maxLength < it.length) {
                maxLength = it.length
            }
        }

        return maxLength
    }
}