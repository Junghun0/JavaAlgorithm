class Solution{
    fun solution(a: Int, b: Int): Long {
        var answer = 0L

        if (a == b){
            return a.toLong()
        }

        var min = Integer.min(a,b)
        var max = Integer.max(a,b)

        for (i in min .. max){
            answer += i
        }

        return answer
    }
}