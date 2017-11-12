package com.myheincompany.javarefaktoringexamples.Inline;

import java.util.Random;


    public class MyInlineRental
    {
        public int GetValueHeavyCalculation(int a, int b)
        {

            int rand = new Random().nextInt();
            int result = Math.max(rand * (a + b), Math.max(rand * a * 10,Math.max(rand * b * 10, 12)));
            return result;
        }

        public void CustomerOneCalculation()
        {
            int value = GetValueHeavyCalculation(1, 3);
        }

        public void CustomterTwoCalculation()
        {
            int value = GetValueHeavyCalculation(4, 3);
        }
    }

