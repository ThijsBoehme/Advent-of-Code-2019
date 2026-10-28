fun main() {
    fun part1(mass: Int): Int {
        return (mass / 3) - 2
    }

    fun part2(mass: Int): Int {
        val fuel = part1(mass)
        if (fuel <= 0) return 0
        return fuel + part2(fuel)
    }

    // Test if implementation meets criteria from the description, like:
    check(part1(12) == 2)
    check(part1(14) == 2)
    check(part1(1969) == 654)
    check(part1(100756) == 33583)

    check(part2(14) == 2)
    check(part2(1969) == 966)
    check(part2(100756) == 50346)

    // Read the input from the `src/Day01.txt` file.
    val input = readInput("Day01").map { it.toInt() }
    println(input.sumOf(::part1))
    println(input.sumOf(::part2))
}
