package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val result = sadArray.toMutableList()
        var change = true
        while (change) {
            change = false
            for (i in result.indices) {
                if (i != 0 && i != result.lastIndex && result[i] > result[i - 1] + result[i + 1]){
                    result.removeAt(i)
                    change = true
                    break
                }
            }
        }
        return result.toIntArray()
    }
}