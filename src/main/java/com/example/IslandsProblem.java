package com.example;

public class IslandsProblem {
    public int solution(String[] map) {
        int c = 0;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length(); j++) {
                if (map[i].charAt(j) == ' ' || map[i].charAt(j) == '#') {
                    continue;
                }
                c++;
                markIslandMapped(i, j, map);
            }
        }

        return c;
    }

    private void markIslandMapped(int r, int c, String[] map) {
        if (r < 0 || c < 0 || r >= map.length || c >= map[0].length()) {
            return;
        }
        if (map[r].charAt(c) == ' ' || map[r].charAt(c) == '#') {
            return;
        }
        map[r] = map[r].substring(0, c) + ' ' + map[r].substring(c + 1);

        markIslandMapped(r, c + 1, map);
        markIslandMapped(r, c - 1, map);
        markIslandMapped(r + 1, c, map);
        markIslandMapped(r - 1, c, map);
    }
}
