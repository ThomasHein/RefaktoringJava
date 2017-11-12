package com.myheincompany.javarefaktoringexamples.PullUp;


    public abstract class _002SuperRental
    {
        public int GetBillingAmount(int NettoAmount)
        {
            return NettoAmount + 5;
        }
    }


     class CompanyRental1 extends _002SuperRental
    {

        private String title;

        public void GetBillingForCustomer()
        {
            int amount = this.title.length() + GetBillingAmount(5);
        }

    }

     class UserRental1 extends _002SuperRental
    {
        private String title;

        public int Value;

        public void GetBillingForCustomer()
        {
            int amount = this.title.length() + GetBillingAmount(5);
        }
    }

