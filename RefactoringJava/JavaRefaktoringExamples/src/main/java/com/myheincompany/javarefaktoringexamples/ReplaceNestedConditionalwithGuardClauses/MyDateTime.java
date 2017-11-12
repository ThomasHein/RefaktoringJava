/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myheincompany.javarefaktoringexamples.ReplaceNestedConditionalwithGuardClauses;

/**
 *
 * @author Ocean
 */
public class MyDateTime {
     public boolean before(Object summerStart)
        {
            return false;
        }

        public boolean after(Object summerEnd)
        {
            return false;
        }

        public boolean isFriday()
        {
            return false;
        }
}
