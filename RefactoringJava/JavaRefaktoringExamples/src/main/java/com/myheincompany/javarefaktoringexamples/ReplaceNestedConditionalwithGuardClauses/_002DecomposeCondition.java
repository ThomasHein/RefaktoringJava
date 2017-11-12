package com.myheincompany.javarefaktoringexamples.ReplaceNestedConditionalwithGuardClauses;


    public class _002DecomposeCondition
    {
        private Object SUMMER_START;
        private Object SUMMER_END;
        private double _winterRate;
        private double _winterServiceCharge;
        private double _summerRate;

        /*
         * Extract the condition into its own method.
·           Extract the then part and the else part into their own methods.
            ?? Was ist der Standardfall - Anscheind der Elsezweig
        */
        public void aMethod(MyDateTime date, double quantity)
        {
            double charge;
            if (DateNotIinSesaon(date))
                charge = WinterCharge(quantity);
            else
                charge = SeasonCharge(quantity);
        }

        private double SeasonCharge(double quantity)
        {
            return quantity * _summerRate;
        }

        private double WinterCharge(double quantity)
        {
            return quantity * _winterRate + _winterServiceCharge;
        }

        private boolean DateNotIinSesaon(MyDateTime date)
        {
            return date.before(SUMMER_START) || date.after(SUMMER_END);
        }
    }

   

