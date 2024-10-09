package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IslandsProblemTest {
    IslandsProblem solution = new IslandsProblem();

    // Testcase mapping:
    //    '#' -> ocean
    //    '.' -> island
    @Test
    void test1() {
        assertEquals(4, solution.solution(new String[] {"..#...", "..#..#", "######", "....#.", "...###"}));
    }

    @Test
    void test2() {
        assertEquals(3, solution.solution(new String[] {".#..", "#..#", ".##.", "...."}));
    }

    @Test
    void test3() {
        assertEquals(5, solution.solution(new String[] {"..###..", ".#.#.#.", "##.#.##", ".#...#.", ".#####.", "...#..."}));
    }

    @Test
    void test4() {
        assertEquals(2, solution.solution(new String[] {"#...#", "..###", "#.#..", "###.#"}));
    }

    @Test
    void test5() {
        assertEquals(2, solution.solution(new String[] {"#...#", "..###", "#.#..", "###.#"}));
    }

    @Test
    void test6() {
        assertEquals(3, solution.solution(new String[] {"#...#..", "..###..", "#.#..#.", "###.###", "##..###"}));
    }
}