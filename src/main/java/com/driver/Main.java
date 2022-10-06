package com.driver;

import java.sql.SQLOutput;

public class Main {
    public static void main(String [] args) {
        Product p = new Product();
        p.product(1,2);
        p.product(12,13,4);
        p.product(2.0,3.0);

    }
    static class Product {

        public int product(int x, int y) {

            return 1;
        }

        public int product(int x, int y, int z) {
            return 2;
        }

        public double product(double x, double y) {
            return 3;
        }
    }
}