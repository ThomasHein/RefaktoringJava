package com.myheincompany.javarefaktoringexamples.FormTemplate;

import java.io.BufferedWriter;
import java.io.IOException;


    /**
     * 
     * Zielstelung Customer --1----->  Statement
     *                                    |
     *                            ________|_______________     
     *                           |                       |    
     *                     TextStatement           Html Statement
     * 
     * Decompose the methods so that all the extracted methods are either identical or 
        completely different.
        ·  Use Pull Up Methodto pull the identical methods into the superclass.
        ·  For the different methods use  Rename Methodso the signatures for all the methods at 
        each step are the same.
        ?rarr; This makes the original methods the same in that they all issue the 
        same set of method calls, but the subclasses handle the calls differently.  
        ·  Compile and test after each signature change.
        ·  Use Pull Up Methodon one of the original methods. Define the signatures of the 
        different methods as abstract methods on the superclass.
        ·  Compile and test.
·  Remove the other methods, compile, and test after each removal.
*/
    public class _001OriginalCustomer
    {
        private BufferedWriter Console;
        private String Name;

        public void doText() throws IOException
        {
            Console.write(HtmlStatement() + Statement());
        }

        public String HtmlStatement()
        {
            String header = "<title>" + Name + "</title>";
            String body = "Du bist der Auserwählte";
            return header + body;
        }

        public String Statement()
        {
            String text = "das sagt" + Name + "gerne";
            return text;
        }
    }
