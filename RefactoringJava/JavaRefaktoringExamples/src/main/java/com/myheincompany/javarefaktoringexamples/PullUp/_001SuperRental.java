package com.myheincompany.javarefaktoringexamples.PullUp;


    public abstract class _001SuperRental
    {

    }


     class CompanyRental extends _001SuperRental
    {

        private String title;

        public void GetBillingForCustomer()
        {
            int amount = this.title.length() + GetBillingAmount(5);
        }

        public int GetBillingAmount(int NettoAmount)
        {
            return NettoAmount + 5;
        }
    }

     class UserRental extends _001SuperRental
    {
        private String title;

        public int Value;

        public void GetBillingForCustomer()
        {
            int amount = this.title.length() + GetBillingAmount(5);
        }

        public int GetBillingAmount(int NettoAmount)
        {
            return NettoAmount + 5;
        }
    }

