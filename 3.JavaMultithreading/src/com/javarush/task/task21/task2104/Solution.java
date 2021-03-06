package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Equals and HashCode
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!(o instanceof Solution)) return false;
        Solution solution = (Solution) o;
        return Objects.equals(first, solution.first) &&
                Objects.equals(last, solution.last);
    }

    @Override
    public int hashCode() {
        int firstH = first != null ? first.hashCode() : 0;
        int lastH = last != null ? last.hashCode() : 0;
        return 31 * firstH + lastH;
    }

    public static void main(String[] args) {
        Solution test = new Solution(null, null);
        System.out.println(test.hashCode());
//        Set<Solution> s = new HashSet<>();
//        s.add(new Solution("Donald", "Duck"));
//        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}
