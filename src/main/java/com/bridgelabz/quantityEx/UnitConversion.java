package com.bridgelabz.quantityEx;

public enum UnitConversion {
    FEET{
        public  double convertUnits(double value){
                    return  value*12;
        }
    },
    INCHES{
        public  double convertUnits(double value){
            return  value;
        }
    },
    YARD{
        public  double convertUnits(double value){
            return  value*12*3;
        }
    },
    CM{
        public  double convertUnits(double value){
            return value/2.5;
        }
    },
    GALLON {
        public  double convertUnits(double value){
            return value*3.78;
    }},
    LITTERS {
        public  double convertUnits(double value){
            return value;
        }},
    ML {
        public  double convertUnits(double value){
            return value/1000;
        }},
    KG {
        public  double convertUnits(double value){
            return value;
        }},
    GRAM {
        public  double convertUnits(double value){
            return value/1000;
        }},
    TONE {
        public  double convertUnits(double value){
            return value*1000;
        }},
    F {
        public  double convertUnits(double value){
          double F=(value - 32) / 1.8;
            return F;
        }},
    C {
        public  double convertUnits(double value){
            return value;
        }};

    public  double convertUnits(double value){return  0.0;}
}
