package com.myheincompany.javarefaktoringexamples.FormTemplate;

import java.io.BufferedWriter;
import java.io.IOException;

     abstract  class Statement{
    
    }

     class TextStatement extends Statement
    {
        private _002Customer _customer;

        public TextStatement(_002Customer customer)
        {
            _customer = customer;
        }

        public String Value()
        {
            String text = GetHeader() + GetBody() + "gerne";
            return text;
        }

        private String GetBody()
        {
            return _customer.Name;
        }

        protected String GetHeader()
        {
            return "das sagt";
        }
    }

     class HtmlStatement extends Statement
    {
        private _002Customer _customer;

        public HtmlStatement(_002Customer customer)
        {
            _customer = customer;
        }

        public String Value()
        {
            String header = GetHeader();
            String body = GetBody();
            return header + body;
        }

        protected String GetBody()
        {
            return "Du bist der Auserwählte";
        }

        protected String GetHeader()
        {
            return _customer.Name;
        }
    }

    public class _002Customer
    {
        public String Name;
        private final TextStatement _textStatement;
        private final HtmlStatement _htmlStatement;
        private BufferedWriter Console;

        public _002Customer()
        {
            _textStatement = new TextStatement(this);
            _htmlStatement = new HtmlStatement(this);
        }

        public void doText() throws IOException
        {
            Console.write(HtmlStatement()+Statement());
        }

        public String HtmlStatement()
        {
            return _htmlStatement.Value();
        }

        public String Statement()
        {
            return _textStatement.Value();
        }
    }
