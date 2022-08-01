package com.leetcode.arrays;

public class Fibonacci {

        public int fib(int n) {
            return fibonacci(n) ;
        }

        private int fibonacci(int n)
        {
            int[] store = new int [n];

            store[0]=0;
            store[1] =1;

            // int i=0;

            for(int i=2; i<=n; i++)
            {
                store[i] = store[i-1]+ store[i-2];
            }

            return store[n];
        }
    }
