package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        GetName getName = new GetName();
        Mechanic man = new Mechanic("John", 5000, 100, 2,0);
        Mechanic man2 = new Mechanic("Doe", 400, 3060, 16,0);
        Mechanic man3 = new Mechanic("Smith", 16000, 150, 21,0);
        List<Mechanic> data = new ArrayList<>();
        data.add(0, man);
        data.add(1, man2);
        data.add(1, man3);


        System.out.print(getName.name(10.0,5.1, data));

    }
}
