package com.myheincompany.javarefaktoringexamples.ExtractMethodObjekt;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;

    public class _005PrintOwing
    {
        private ExtractMethodWithTwoVariables _extractMethodWithTwoVariables;
        private Double _outstanding;
        private Double _instanding;

        public _005PrintOwing(ExtractMethodWithTwoVariables extractMethodWithTwoVariables)
        {
            _extractMethodWithTwoVariables = extractMethodWithTwoVariables;
        }

        public void printOwing(Iterator<Double> orders) throws IOException
        {
            Iterator<Double> e = orders;
            _outstanding = 0.0;
            _instanding = 0.0;
            _extractMethodWithTwoVariables.printBanner();
            // calculate outstanding
            while (e.hasNext())
            {
                Double each = CalculateEach(e);
                CalculateInstanding();
                CalculateOutstanding(each);
            }
            _extractMethodWithTwoVariables.printDetails(_outstanding);
            _extractMethodWithTwoVariables.printDetails(_instanding);
        }

        private void CalculateOutstanding(double each)
        {
            _outstanding += each;
        }

        private static double CalculateEach(Iterator<Double> e)
        {
            double each = e.next();
            each += new Random().nextDouble();
            return each;
        }

        private void CalculateInstanding()
        {
            _instanding = _outstanding + new Random().nextDouble();
        }
    }

    /// <summary>
    /// It's the assignment to local variables that becomes complicated. In this case we're only talking 
    /// about temps.If you see an assignment to a parameter, you should immediately use  Remove
    /// Assignments to Parameters.
    /// 
    /// For temps that are assigned to, there are two cases. The simpler case is that in which the 
    /// variable is a temporary variable used only within the extracted code.When that happens, you can
    /// move the temp into the extracted code.The other case is use of the variable outside the code.If
    /// the variable is not used after the code is extracted, you can make the change in just the extracted
    /// code.If it is used afterward, you need to make the extracted code return the changed value of the
    /// variable. I can illustrate this with the following method
    /// </summary>
    class ExtractMethodWithTwoVariables
    {
        private Iterable<Double> _orders;
        private final _005PrintOwing _printOwing;
        private BufferedWriter Console;

        public ExtractMethodWithTwoVariables()
        {
            _printOwing = new _005PrintOwing(this);
        }

        public void printOwing() throws IOException
        {
            _printOwing.printOwing(_orders.iterator());
        }

        public void printDetails(double outstanding) throws IOException
        {
            Console.write("Gesamtkosten {outstanding}");
        }

        public void printBanner() throws IOException
        {
            // print banner
            Console.write("**************************");
            Console.write("***** Customer Owes ******");
            Console.write("**************************");
        }
    }

