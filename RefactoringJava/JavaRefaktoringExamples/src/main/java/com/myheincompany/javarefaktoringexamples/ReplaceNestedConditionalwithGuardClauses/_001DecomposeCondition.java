package com.myheincompany.javarefaktoringexamples.ReplaceNestedConditionalwithGuardClauses;


    public class _001DecomposeCondition
    {
        private Object SUMMER_START;
        private Object SUMMER_END;
        private double _winterRate;
        private double _winterServiceCharge;
        private double _summerRate;

        /*
         * Extract the condition into its own method.
·           Extract the then part and the else part into their own methods.
        */
        public void aMethod(MyDateTime date, double quantity)
        {
            double charge;
            if (date.before(SUMMER_START) || date.after(SUMMER_END))
                charge = quantity * _winterRate + _winterServiceCharge;
            else charge = quantity * _summerRate;
        }

    }


