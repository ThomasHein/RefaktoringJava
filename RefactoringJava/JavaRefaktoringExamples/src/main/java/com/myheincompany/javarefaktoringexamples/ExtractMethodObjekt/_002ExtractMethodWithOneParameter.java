package com.myheincompany.javarefaktoringexamples.ExtractMethodObjekt;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Iterator;

    /// <summary>
    /// It's the assignment to local variables that becomes complicated. In this case we're only talking 
    /// about temps.If you see an assignment to a parameter, you should immediately use  Remove
    /// Assignments to Parameters.
    /// </summary>
    public class _002ExtractMethodWithOneParameter
    {
        private Iterable<Double> _orders;
        private BufferedWriter Console;
        
        public void printOwing() throws IOException
        {
            Iterator<Double> e = _orders.iterator();
            double outstanding = 0.0;
            printBanner();
            // calculate outstanding
            while (e.hasNext())
            {
                double each = e.next();
                outstanding += each;
            }
            printDetails(outstanding);
        }

        private void printDetails(double outstanding) throws IOException
        {
            Console.write("Gesamtkosten {outstanding}");
        }

        private void printBanner() throws IOException
        {
            // print banner
            Console.write("**************************");
            Console.write("***** Customer Owes ******");
            Console.write("**************************");
        }
    }

