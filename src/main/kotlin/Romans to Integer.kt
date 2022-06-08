class Solution {
    fun romanToInt(s: String): Int {
        val symbolAndValue: HashMap<Char, Int> = hashMapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)

        var number = 0

        var current = 0

        val size = s.length

        for(char in s) {
            val next = current + 1

            if(next < size) {
                if(symbolAndValue[s[current]]!! < symbolAndValue[s[next]]!!) {
                    number = number - symbolAndValue[s[current]]!!
                    current++
                } else {
                    number = number + symbolAndValue[s[current]]!!
                    current++
                }
            } else {
                number = number + symbolAndValue[char]!!
            }
        }

        return number
    }
}