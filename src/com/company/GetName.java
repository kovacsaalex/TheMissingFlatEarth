package com.company;

import java.util.List;

public class GetName {
    public String name (double x, double y, List<Mechanic> data){
        String sName = "y";
        int costMin = Integer.MAX_VALUE;

        for (Mechanic values : data){
            double cord = Math.sqrt((values.getY() - y) * (values.getY() - y)  + (values.getX() - x) * (values.getX() - x));
            int cost = (int) (cord*values.getFeePerKm())+values.getFixfee();

            if (cost<costMin){
                costMin=cost;
                sName=values.getName();
            }
        }
        return sName;
    }
}
