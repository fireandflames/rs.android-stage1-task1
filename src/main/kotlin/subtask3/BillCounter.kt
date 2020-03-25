package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val sum = (0..bill.size-1).sumBy { bill[it] }
        val reasonableSum = (sum - bill[k])/2
        if(reasonableSum == b) { return "Bon Appetit"}
        else { return (b -reasonableSum).toString()}



        throw NotImplementedError("Not implemented")
    }
}
