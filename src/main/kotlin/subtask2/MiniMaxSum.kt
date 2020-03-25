package subtask2



class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        var min = Integer.MAX_VALUE
        var max =Integer.MIN_VALUE
        var sum = 0
        for(i in 0..(input.size-1))
        {
            sum += input[i]
            if(min > input[i] ) { min = input[i]}
            if(max < input[i]) { max = input[i]}
        }
        var result = intArrayOf(sum-max,sum-min)
        return result
        throw NotImplementedError("Not implemented")
    }
}
