package com.company;

public class Mechanic {

        private String name;
        private int fixfee;
        private int feePerKm;
        private int x;
        private int y;

        public Mechanic() {
        }

        public Mechanic(String name, int fixfee, int feePerKm, int x, int y) {
            this.name = name;
            this.fixfee = fixfee;
            this.feePerKm = feePerKm;
            this.x = x;
            this.y = y;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getFixfee() {
            return fixfee;
        }

        public void setFixfee(int fixfee) {
            this.fixfee = fixfee;
        }

        public int getFeePerKm() {
            return feePerKm;
        }

        public void setFeePerKm(int feePerKm) {
            this.feePerKm = feePerKm;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

}
