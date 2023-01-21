package nl.tiemenschut.aoc.y2015

import nl.tiemenschut.aoc.lib.dsl.aoc
import nl.tiemenschut.aoc.lib.dsl.day
import nl.tiemenschut.aoc.lib.dsl.parser.InputParser

object ElfSplitter : InputParser<List<List<Int>>> {
    override fun parse(input: String): List<List<Int>> =
        input.split("\n\n").map { elf -> elf.split("\n").map { it.toInt() } }
}

fun main() {
    aoc(ElfSplitter) {
        puzzle { 2022 day 1 }

        part1 { input ->
            input.maxOf { elf -> elf.sum() }
        }

        part2 { input ->
            input.map { it.sum() }.sortedDescending().take(3).sum()
        }
    }
}


