/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myheincompany.refactoringjava;

import com.myheincompany.refactroingJava.dataStore.DataStore;
import com.myheincompany.refactroingJava.dataStore.Programmer;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ocean
 */
public class MySingleSuperClassTest {

    public MySingleSuperClassTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @org.junit.Test
    public void GetInternalProgrammer1() {
        DataStore store = new DataStore();
        Date date = new Date(2003, 11, 1, 1, 1, 30);
        String email = "myEmail.com";
        String name = "Hans";
        String[] answers = new String[]{"a", "b"};
        int resultSize = store.getProgrammers().size();
        String message = "Hallo";
        int luckyNumber = 3;
        String creditCard = "234";
        String result = new MySingleSuperClass().getInternalBestProgrammer(store.getProgrammers(), name, answers, date, email, message, creditCard, luckyNumber);
        assertEquals("", result);
    }

    @org.junit.Test
    public void GetInternalProgrammer2() {
        DataStore store = new DataStore();
        Date date = new Date(2003, 11, 1, 1, 1, 30);
        String email = "my@Email.com";
        String name = "Hans";
        String[] answers = new String[]{"a", "b"};
        int resultSize = store.getProgrammers().size();
        String message = "Hallo";
        int luckyNumber = 3;
        String creditCard = "234";
        String result = new MySingleSuperClass().getInternalBestProgrammer(store.getProgrammers(), name, answers, date, email, message, creditCard, luckyNumber);
        assertEquals("Fuschie", result);
    }

    @org.junit.Test
    public void GetInternalProgrammer3() {
        DataStore store = new DataStore();
        Date date = new Date(2003, 11, 1, 1, 1, 30);
        String email = "my@Email.com";
        String name = "Hans";
        String[] answers = new String[]{"a", "b"};
        int resultSize = store.getProgrammers().size();
        String message = "Hallo";
        int luckyNumber = 3;
        String creditCard = "234-111-111-111";
        String result = new MySingleSuperClass().getInternalBestProgrammer(store.getProgrammers(), name, answers, date, email, message, creditCard, luckyNumber);
        assertEquals("Fuschie", result);
    }

    @org.junit.Test
    public void GetInternalProgrammer4() {
        DataStore store = new DataStore();
        Date date = new Date(2003, 11, 1, 1, 1, 30);
        String email = "my@Email.com";
        String name = "Hans";
        String[] answers = new String[]{"a", "b"};
        int resultSize = store.getProgrammers().size();
        String message = "Hallo";
        int luckyNumber = 3;
        String creditCard = "";
        String result = new MySingleSuperClass().getInternalBestProgrammer(store.getProgrammers(), name, answers, date, email, message, creditCard, luckyNumber);
        assertEquals("nieemand", result);
    }

    @org.junit.Test
    public void GetInternalProgrammer5() {
        DataStore store = new DataStore();
        Date date = new Date(2003, 11, 1, 1, 1, 30);
        String email = "my@Email.com";
        String name = "Hans";
        String[] answers = new String[]{"a", "b"};
        int resultSize = store.getProgrammers().size();
        String message = "Hallo";
        int luckyNumber = 2;
        String creditCard = "1-2-3-4";
        String result = new MySingleSuperClass().getInternalBestProgrammer(store.getProgrammers(), name, answers, date, email, message, creditCard, luckyNumber);
        assertEquals("Friedhelm", result);
    }

    @org.junit.Test
    public void GetInternalProgrammer6() {
        DataStore store = new DataStore();
        Date date = new Date(2003, 11, 1, 1, 1, 30);
        String email = "my@Email.com";
        String name = "Hans";
        String[] answers = new String[]{"a", "b"};
        int resultSize = store.getProgrammers().size();
        String message = "Hallo";
        int luckyNumber = 19;
        String creditCard = "1-2-3-4";
        String result = new MySingleSuperClass().getInternalBestProgrammer(store.getProgrammers(), name, answers, date, email, message, creditCard, luckyNumber);
        assertEquals("Fuschie", result);
    }

    @org.junit.Test
    public void GetInternalProgrammer7() {
        DataStore store = new DataStore();
        Date date = new Date(2003, 11, 1, 1, 1, 30);
        String email = "admin@Email.com";
        String name = "Hans";
        String[] answers = new String[]{"a", "b"};
        int resultSize = store.getProgrammers().size();
        String message = "Nummer 3 soll gewinnen";
        int luckyNumber = 19;
        String creditCard = "1-2-3-4";
        String result = new MySingleSuperClass().getInternalBestProgrammer(null, name, answers, date, email, message, creditCard, luckyNumber);
        assertEquals("", result);
    }

    @org.junit.Test
    public void GetInternalProgrammer8() {
        DataStore store = new DataStore();
        Date date = new Date(2003, 11, 1, 1, 1, 30);
        String email = "admin@Email.com";
        String name = "Hans";
        String[] answers = new String[]{"a", "b"};
        int resultSize = store.getProgrammers().size();
        String message = "Nummer 3 soll gewinnen";
        int luckyNumber = 19;
        String creditCard = "1-2-3-4";
        String result = new MySingleSuperClass().getInternalBestProgrammer(store.getProgrammers(), name, answers, date, email, message, creditCard, luckyNumber);
        assertEquals("DER CHEF", result);
    }

    @org.junit.Test
    public void GetInternalProgrammer9() {
        DataStore store = new DataStore();
        Date date = new Date(2003, 11, 1, 1, 1, 30);
        String email = "admin@Email.com";
        String name = "Hans";
        String[] answers = new String[]{};
        int resultSize = store.getProgrammers().size();
        String message = "Nummer 5 soll gewinnen";
        int luckyNumber = 19;
        String creditCard = "1-2-3-4";
        String result = new MySingleSuperClass().getInternalBestProgrammer(store.getProgrammers(), name, answers, date, email, message, creditCard, luckyNumber);
        assertEquals("Fuschie", result);
    }

    @org.junit.Test
    public void GetInternalProgrammer10() {
        DataStore store = new DataStore();
        Date date = new Date(2003, 11, 1, 1, 1, 30);
        String email = "admin@Email.com";
        String name = "Hans";
        String[] answers = new String[]{"a"};
        int resultSize = store.getProgrammers().size();
        String message = "Nummer 5 soll gewinnen";
        int luckyNumber = 19;
        String creditCard = "1-2-3-4";
        String result = new MySingleSuperClass().getInternalBestProgrammer(store.getProgrammers(), name, answers, date, email, message, creditCard, luckyNumber);
        assertEquals("Fuschie", result);
    }

    @org.junit.Test
    public void GetWorstProgrammer1() {
        DataStore store = new DataStore();
        Date date = new Date(2003, 11, 1, 1, 1, 30);
        String email = "my@Email.com";
        String name = "Hans";
        int resultSize = store.getProgrammers().size();
        Programmer result = new MySingleSuperClass().GetWorstProgrammer(store.getProgrammers(), date, email, name);

        assertEquals(store.getProgrammers().size(), resultSize);

    }

    @org.junit.Test
    public void GetWorstProgrammer2() {
        DataStore store = new DataStore();
        Date date = new Date(2000, 11, 1, 1, 1, 30);
        String email = "myEmail.com";
        String name = "Hans";
        int resultSize = store.getProgrammers().size();
        Programmer result = new MySingleSuperClass().GetWorstProgrammer(store.getProgrammers(), date, email, name);

        assertEquals(store.getProgrammers().size(), resultSize + 5);

    }

    @org.junit.Test
    public void GetWorstProgrammer3() {
        DataStore store = new DataStore();
        Date date = new Date(2002, 11, 22, 1, 1, 30);
        String email = "myEmail.com";
        String name = "Hans";
        int resultSize = store.getProgrammers().size();
        Programmer result = new MySingleSuperClass().GetWorstProgrammer(store.getProgrammers(), date, email, name);

        assertEquals(result.getLastname(), "Skilled");

    }

    @org.junit.Test
    public void GetWorstProgrammer4() {
        DataStore store = new DataStore();
        Date date = new Date(2002, 11, 1, 1, 1, 56);
        String email = "myEmail.com";
        String name = "Hans";
        Programmer result = new MySingleSuperClass().GetWorstProgrammer(store.getProgrammers(), date, email, name);

        assertEquals(result.getLastname(), "Klaus");

    }

    @org.junit.Test
    public void GetWorstProgrammer5() {
        DataStore store = new DataStore();
        Date date = new Date(2002, 11, 1, 1, 1, 20);
        String email = "myEmail.com";
        String name = "Hans";
        Programmer result = new MySingleSuperClass().GetWorstProgrammer(store.getProgrammers(), date, email, name);

    }

}
