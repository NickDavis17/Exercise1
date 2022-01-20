package com.company;

public class Main {
    //Nick Davis Exercise 1 1/20/22
    public static void main(String[] args) {
        System.out.println("Hello World!");

        String city = "Columbus";
        int zip = 43215;
        double highTemp[] ={32, 25, 27, 40, 45};

        double avg = (highTemp[0] + highTemp[1] + highTemp[2] + highTemp[3] + highTemp[4])/ highTemp.length;
        System.out.println("City: " + city + "  Zip Code: "+ zip + "  Average High Temperature: " + avg);


    }
}
