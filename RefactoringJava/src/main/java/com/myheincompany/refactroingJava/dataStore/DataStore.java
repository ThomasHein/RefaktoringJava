/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myheincompany.refactroingJava.dataStore;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author root
 */
public class DataStore {
    
    List<Programmer> result = new ArrayList<Programmer>();
    public DataStore()
    {
        
        
        ProgrammerBuilder builder = new ProgrammerBuilder();
        builder.setLastname("Klaus").setMood(4).setName("Meister").setScore(2).setSkilllevel(2);
        result.add(builder.createProgrammer());
        builder.setLastname("Dieter").setMood(3).setName("Meister").setScore(2).setSkilllevel(2);
        result.add(builder.createProgrammer());
        builder.setLastname("Skilled").setMood(4).setName("Meister").setScore(3).setSkilllevel(8);
        result.add(builder.createProgrammer());
        builder.setLastname("Friedhelm").setMood(9).setName("Meister").setScore(19).setSkilllevel(8);
        result.add(builder.createProgrammer());
        builder.setLastname("Manfred").setMood(18).setName("Meister").setScore(-1).setSkilllevel(2);
        result.add(builder.createProgrammer());
        builder.setLastname("Fuschie").setMood(71).setName("Meister").setScore(2).setSkilllevel(100);
        result.add(builder.createProgrammer());
        builder.setLastname("Akkurat").setMood(1).setName("Meister").setScore(3).setSkilllevel(8);
        result.add(builder.createProgrammer());
        builder.setLastname("Abstrakto").setMood(4).setName("Meister").setScore(9).setSkilllevel(8);
        result.add(builder.createProgrammer());
        
    }
    
    public List<Programmer> getProgrammers()
    {
        
        
        
        return result;
    }
    
}
