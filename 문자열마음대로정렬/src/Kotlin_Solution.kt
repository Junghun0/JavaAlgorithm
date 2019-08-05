class Kotlin_Solution {

    /*
    입력값 〉	["sun", "bed", "car"], 1
    기댓값 〉	["car", "bed", "sun"]

    입력값 〉	["abce", "abcd", "cdx"], 2
    기댓값 〉	["abcd", "abce", "cdx"]
    */
    fun main(args: Array<String>){
        val solution = Kotlin_Solution()
        solution.solution(arrayOf("sun","bed","car"), 1)
    }

    fun solution(strings: Array<String>, n: Int): Array<String> {
        var answer = arrayOf<String>()

        val splitArray = mutableListOf<String>()

        strings.forEach {
            splitArray.add(it[n] + it)
        }

        splitArray.sort()

        splitArray.forEach {
            val result = it.substring(1,it.length-1)
            print(result)
        }


        for (k in 0..splitArray.size){
            answer.set(k,splitArray[k])
        }

        return answer
    }
}