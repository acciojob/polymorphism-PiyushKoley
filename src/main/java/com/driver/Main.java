package com.driver;

public class Main {
    public static void main(String [] args) {
        Product p = new Product();
        int first = p.product(1,2);
        int second = p.product(12,13,4);
        double third = p.product(2.0,3.0);

        System.out.println(first +" "+ second +" "+ third);
    }

    public static class Product {

        public int product(int x, int y) {

            return x*y;
        }

        public int product(int x, int y, int z) {

            return x*y*z;
        }

        public double product(double x, double y) {
            return x*y;
        }
    }
}

