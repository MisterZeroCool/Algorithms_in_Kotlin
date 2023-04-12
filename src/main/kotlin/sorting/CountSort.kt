package sorting

fun Array<Int>.countSort(start: Int, end: Int) { // sorts numbers in the range from start to end
    val countedNumbers = Array(end + 1) { 0 }

    var index = 0
    while (index < size) {
        countedNumbers[this[index]]++
        index++
    }

    index = 0
    var currentNumber = start
    while (currentNumber < countedNumbers.size) {
        var frequency = countedNumbers[currentNumber]
        while (frequency > 0) {
            this[index++] = currentNumber
            frequency--
        }
        currentNumber++
    }
}