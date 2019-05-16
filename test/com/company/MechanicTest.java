package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MechanicTest {

    @Test
    void getName() {
        Mechanic mech = new Mechanic("TestC", 5555,1111,1,5);
        assertEquals("TestC", mech.getName());
    }

    @Test
    void getFixfee(){
        Mechanic mech = new Mechanic("TestC", 5555,1111,1,5);
        assertEquals(5555, mech.getFixfee());
    }

    @Test
    void constructorTest (){
        Mechanic mech = new Mechanic("TestC", 5555,1111,1,5);
        assertEquals("TestC", mech.getName());
        assertEquals(5555, mech.getFixfee());
        assertEquals(1111, mech.getFeePerKm());
        assertEquals(1, mech.getX());
        assertEquals(5, mech.getY());
    }

    @Test
    void nameTest(){
        Mechanic mech = new Mechanic("TestC", 5555,1111,1,5);
        Mechanic tests1 = new Mechanic("TestManBest", 5000,1000,25,0);
        Mechanic tests2 = new Mechanic("TestManWorst", 5000,3000,50,0);
        List<Mechanic> data = new ArrayList<>();
        data.add(0,tests1 );
        data.add(0,tests2 );
        double x = 2;
        double y = 3;
        GetName getNameTest = new GetName();

        assertEquals("TestManWorst",getNameTest.name(50,0,data));
        assertEquals("TestManBest",getNameTest.name(25,0,data));
        assertEquals("TestManBest",getNameTest.name(35,0,data));



    }




}