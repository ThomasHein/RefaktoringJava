package com.myheincompany.javarefaktoringexamples.ExtractClass.ExtractedClasses;

import com.myheincompany.javarefaktoringexamples.ExtractClass.BasicPriceCaculator;
import com.myheincompany.javarefaktoringexamples.ExtractClass.PriceConditional;
import com.myheincompany.javarefaktoringexamples.ReplaceNestedConditionalwithGuardClauses.MyDateTime;

    public class _002ExtractClass
    {
        public Object SUMMER_START;
        public Object SUMMER_END;
        public final PriceConditional _priceConditional;
        private final BasicPriceCaculator _basicPriceCaculator;

        public _002ExtractClass()
        {
            _priceConditional = new PriceConditional(this);
            _basicPriceCaculator = new BasicPriceCaculator(this);
        }

        /*
         * Decide howto split the responsibilities of the class.
        ·  Create a new class to express the split-off responsibilities.
        ?rarr; If the responsibilities of the old class no longer match its name, 
        rename the old class.
        ·  Make a link from the old to the new class.
        ?rarr; You may need a two-way link. But don't make the back link until 
        you find you need it. 
        ·  Use Move Fieldon each field you wish to move.
        ·  Compile and test after each move.
        ·  Use Move Methodto move methods over from old to new. Start with lower-level 
        methods (called rather than calling) and build to the higher level.
        ·  Compile and test after each move.
        ·  Review and reduce the interfaces of each class.
        ?rarr; If you did have a two -way link, examine to see whether it can be 
        made one way.
        ·  Decide whether to expose the new class. If you do expose the class, decide whether to 
        expose it as a reference object or as an immutable value object.
        */
        public void GetCustomerCharge(MyDateTime date, double quantity)
        {
            double charge=0;
            if (_priceConditional.NotInSeason(date))
            {
                charge = _basicPriceCaculator.GetNotInSeasonPrice(date, quantity, charge);
            }
            else
            {
                charge = _basicPriceCaculator.GetSeasonPrice(quantity);
            }
        }
    }

   

