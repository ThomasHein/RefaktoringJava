package com.myheincompany.javarefaktoringexamples.ReplaceNestedConditionalwithGuardClauses;

import com.myheincompany.javarefaktoringexamples.ReplaceNestedConditionalwithGuardClauses.MyDateTime;


    public class _004DecomposeCondition
    {
        private Object SUMMER_START;
        private Object SUMMER_END;
        private double _winterRate;
        private double _winterServiceCharge;
        private double _summerRate;

        /*
         * Extract the condition into its own method.
·           Extract the then part and the else part into their own methods.
            ?? Was ist der Standardfall
        */
        public void aMethod(MyDateTime date, double quantity)
        {
            double charge=0;
            if (NotInSeason(date))
            {
                charge = GetNotInSeasonPrice(date, quantity, charge);
            }
            else
            {
                charge = GetSeasonPrice(quantity);
            }
        }

        private double GetNotInSeasonPrice(MyDateTime date, double quantity, double charge)
        {
            charge = GetChargeBasisPriceByNotInSeason(date, quantity, charge);
            charge += GetChargeExtraFee(quantity);
            return charge;
        }

        private double GetSeasonPrice(double quantity)
        {
            return quantity * _summerRate;
        }

        private double GetChargeExtraFee(double quantity)
        {
            return quantity * _winterRate + _winterServiceCharge;
        }

        private double GetChargeBasisPriceByNotInSeason(MyDateTime date, double quantity, double charge)
        {
            if (OffSeason(date))
            {
                charge = OffSeasonPrice();
            }
            else if (OnSeasonPrice(date))
            {
                charge = _winterRate;
            }
            if (IsBonusDay(date, quantity, charge))
            {
                charge = BonusDayCharge(quantity);
            }
            return charge;
        }

        private double BonusDayCharge(double quantity)
        {
            return quantity * _winterRate + _winterServiceCharge;
        }

        private static boolean IsBonusDay(MyDateTime date, double quantity, double charge)
        {
            return date.isFriday() && charge > quantity * 3;
        }

        private boolean OnSeasonPrice(MyDateTime date)
        {
            return date.before(SUMMER_START);
        }

        private double OffSeasonPrice()
        {
            return _winterRate+SpecialRateForWinter();
        }

        private boolean OffSeason(MyDateTime date)
        {
            return date.after(SUMMER_END);
        }

        private double SpecialRateForWinter()
        {
            return _winterRate * 2;
        }

        private boolean NotInSeason(MyDateTime date)
        {
            return date.before(SUMMER_START) || date.after(SUMMER_END);
        }
    }

   

