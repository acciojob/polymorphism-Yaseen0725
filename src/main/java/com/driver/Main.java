package com.driver;

public class Main {
    public static void main(String[] args) {
        product p = new product();
        int res = p.product(10,20);
        int res1 = p.product(5, 10);
        double res2 = p.product(10.0,20.0);

        System.out.println(res + " " + res1 + " " + res2);
    }
    public static class product{
        public int product(int x, int y){
            return x  * y;
        }
        public int product(int x, int y, int z){
            return x  * y * z;
        }
        public double product(double x, double y){
            return x * y;
        }
    }
}
