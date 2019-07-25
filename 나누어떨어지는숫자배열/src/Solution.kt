import java.util.*

class Solution {
    fun main(args: Array<String>) = with(Scanner(System.`in`)) {

        val solution = Solution()
        solution.solution(intArrayOf(5,9,7,10),5)
    }
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val answer = arrayListOf<Int>()

        for (a in arr){
            if (a % divisor == 0){
                answer.add(a)
            }
        }
        if (answer.size == 0){
            answer.add(-1)
        }
        return answer.sorted().toIntArray()
    }
}