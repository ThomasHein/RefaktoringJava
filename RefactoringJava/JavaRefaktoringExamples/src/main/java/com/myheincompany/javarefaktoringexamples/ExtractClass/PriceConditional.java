package com.myheincompany.javarefaktoringexamples.ExtractClass;

import com.myheincompany.javarefaktoringexamples.ExtractClass.ExtractedClasses._002ExtractClass;
import com.myheincompany.javarefaktoringexamples.ReplaceNestedConditionalwithGuardClauses.MyDateTime;


    public class PriceConditional
    {
        private _002ExtractClass _extractClass;

        public PriceConditional(_002ExtractClass extractClass)
        {
            _extractClass = extractClass;
        }

        public boolean OnSeasonPrice(MyDateTime date)
        {
            return date.before(_extractClass.SUMMER_START);
        }

        public boolean OffSeason(MyDateTime date)
        {
            return date.after(_extractClass.SUMMER_END);
        }

        public boolean NotInSeason(MyDateTime date)
        {
            return date.before(_extractClass.SUMMER_START) || date.after(_extractClass.SUMMER_END);
        }
    }
