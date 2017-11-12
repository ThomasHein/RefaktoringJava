package com.myheincompany.javarefaktoringexamples.Inline;


    public class FurtherUsingClass
    {
        public void SomeTestMethod()
        {
            int vale = new MyInlineRental().GetValueHeavyCalculation(4,1);
        }
    }

