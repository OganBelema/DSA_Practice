import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    @org.junit.jupiter.api.Test
    fun romanToInt() {
        val three = "VII"
        val expected = 7
        val solution = Solution()
        assertEquals(expected, solution.romanToInt(three))
    }
}