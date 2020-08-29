package com.example.insureme;

public class Calculator {


    public static double calculatorVehicle(String carType, String insureType, boolean registered, boolean leased,
                                           double marketValue, String usageType, String fuelType, String carBrand,
                                           String carModel, String manufacturedYear){
        double total = 0.0;
        double fuelAdding = 0.0;
        double usageAdding = 0.0;

        if(fuelType.equals("petrol")){
            fuelAdding = 0.02;
        }else if(fuelType.equals("diesel")){
            fuelAdding = 0.02;
        }else if(fuelType.equals("hybrid")){
            fuelAdding = 0.04;
        }else if(fuelType.equals("electric")){
            fuelAdding = 0.05;
        }else{
            fuelAdding = 0.00;
        }

        if(usageType.equals("private")){
            usageAdding = 0.22;
        }else if(usageType.equals("hiring")){
            usageAdding = 0.23;
        }else if(usageType.equals("rent")){
            usageAdding = 0.24;
        }else{
            usageAdding = 0.00;
        }

        if(insureType.equals("full")){
            if(carType.equals("car")){
                total = marketValue * fuelAdding * usageAdding;
            }else if(carType.equals("dual purpose")){
                total = marketValue * fuelAdding * usageAdding + 3000;
            }else if(carType.equals("three wheeler")){
                total = marketValue * fuelAdding * usageAdding - 5000;
            }else{
                total = 0.0;
            }
        }
        else{
            if(carType.equals("car")){
                total = marketValue * fuelAdding * usageAdding * 0.1;
            }else if(carType.equals("dual purpose")){
                total = (marketValue * fuelAdding * usageAdding + 3000) * 0.1;
            }else if(carType.equals("three wheeler")){
                total = (marketValue * fuelAdding * usageAdding - 5000) * 0.1;
            }else{
                total = 0.0;
            }
        }


        return total;
    }

    public static double calculatorTwoWheelers(String insureType,boolean registered,boolean leased,
                                               double marketValue,String fuelType,String carBrand,
                                               String carModel, String manufacturedYear){
        double total = 0.0;
        double fuelAdding = 0.0;

        if(fuelType.equals("petrol")){
            fuelAdding = 0.02;
        }else if(fuelType.equals("electric")){
            fuelAdding = 0.01;
        }else{
            fuelAdding = 0.00;
        }

        if(insureType.equals("full")){
            total = marketValue * fuelAdding;
        }
        else if(insureType.equals("third")){
            total = marketValue * fuelAdding * 0.1;
        }
        else{
            total = 0.0;
        }
        return total;
    }
}
