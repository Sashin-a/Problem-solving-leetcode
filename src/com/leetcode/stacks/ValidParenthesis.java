package com.leetcode.stacks;

import java.util.HashMap;
import java.util.Stack;
import java.util.stream.Collectors;

public class ValidParenthesis {
    public boolean isValid(String s) {

        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray())
        {
            if(map.containsKey(c))
            {
                stack.push(c);
            }
            else
            {
                if(!stack.isEmpty() && map.get(stack.peek()).equals(c))
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
