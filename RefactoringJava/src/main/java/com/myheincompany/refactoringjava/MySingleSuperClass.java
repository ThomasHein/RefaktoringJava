/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myheincompany.refactoringjava;

import com.myheincompany.refactroingJava.dataStore.DataStore;
import com.myheincompany.refactroingJava.dataStore.Programmer;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ocean
 */
public class MySingleSuperClass {

    String getInternalBestProgrammer(List<Programmer> programmers, String name, String[] answers, Date date, String email, String messageFromAbove, String creditCardNumber, int luckyNumber) {
        String result = "";
        //emailcorrect
        if (!email.contains("@")) {
            return "";
        }
        //generalevalutionat
        int winningPosition = 0;

        if (programmers == null || programmers.size() == 0) {
            return "";
        }

        switch (luckyNumber) {
            case 3:
                winningPosition++;
                winningPosition = programmers.indexOf(GetWorstProgrammer(programmers, date, email, name));
                programmers.remove(2);
                break;
            case 2:
                winningPosition--;
                programmers.remove(1);
                break;
            case 19:
                winningPosition += 10;
                programmers.remove(0);

        }

        for (Programmer prog : programmers) {
            winningPosition++;

        }

        //credit evaluation
        if (!creditCardNumber.isEmpty() && creditCardNumber.contains("-")) {
            creditCardNumber = creditCardNumber.replaceAll("-", "");

            creditCardNumber = creditCardNumber.replaceAll("\\[a-Z]", "");

            if (email.contains("admin") && messageFromAbove.contains("Nummer 3 soll gewinnen")) {
                return "DER CHEF";
            }

            switch (luckyNumber) {
                case 1:
                    winningPosition = 0;
                    break;
                case 2:
                    winningPosition = 2;
                    break;
                case 19:
                    winningPosition++;
                    break;

            }

            if (creditCardNumber.isEmpty()) {
                creditCardNumber = "0";
            }

            int creditCardInteger = 0;
            try {
                creditCardInteger = Integer.valueOf(creditCardNumber);
            } catch (Exception ex) {
                creditCardInteger = 1;
            }

            winningPosition = winningPosition + creditCardInteger / 10000000;

        } else if (creditCardNumber.isEmpty()) {
            return "nieemand";
        }

        if (email.contains("friedaSek")) {
            for (Programmer program : programmers) {
                if (program.getLastname().equals("Hans")) {
                    return program.getLastname();
                }
            }
        }

        switch (answers.length) {
            case 0:
                luckyNumber++;
                winningPosition = Math.max(4, winningPosition);
                break;
            case 1:
                luckyNumber = +2;
                winningPosition = Math.max(4, winningPosition - luckyNumber);
                break;
            default:
                luckyNumber = GetWorstProgrammer(programmers, date, email, name).getScore();
                break;
        }

        if (messageFromAbove.contains("a") && messageFromAbove.contains("b") && messageFromAbove.contains("e")) {
            winningPosition = 0;
        }

        if (programmers.size() > winningPosition) {
            return programmers.get(winningPosition).getLastname();
        } else if (programmers.size() > winningPosition / 2) {
            return programmers.get(winningPosition / 2).getLastname();
        } else if (programmers.size() > winningPosition / 4) {
            return programmers.get(winningPosition / 4).getLastname();
        }

        return "niemand";
    }

    public String getBestProgrammer(List<Programmer> programmers, String name, String[] answers, Date date, String email, String messageFromAbove, String creditCardNumber, int luckyNumber) {

        return getInternalBestProgrammer(programmers, name, answers, date, email, messageFromAbove, creditCardNumber, luckyNumber);
    }

    Programmer GetWorstProgrammer(List<Programmer> programmers, Date date, String email, String name) {
        if (date.getSeconds() > 50) {
            return programmers.get(0);
        } else if (date.getDay() > 20) {
            return programmers.get(1);
        } else if (date.getYear() > 2001) {
            return programmers.get(2);
        }

        programmers.remove(0);
        programmers.add(programmers.get(0));
        programmers.add(programmers.get(0));
        programmers.add(programmers.get(0));
        programmers.add(programmers.get(0));
        programmers.add(programmers.get(0));
        programmers.add(programmers.get(0));

        return programmers.get(programmers.size() - 1);
    }

}
