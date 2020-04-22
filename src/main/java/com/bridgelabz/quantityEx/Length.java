package com.bridgelabz.quantityEx;

public class Length {
//    private static final double FEET_TO_INCH = 12.0;
//    private static final double YD_TO_FEET = 3.0;

    //public enum Unit {FEET, INCH,YD};
    private final double value;
    UnitConversion unit;

    public Length(UnitConversion unit , double value) {
        this.unit = unit;
        this.value= value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }
    public boolean compare(Length that) {
        Double firstValue = this.unit.convertUnits(this.value);
        Double secondValue = that.unit.convertUnits(that.value);
        return firstValue.equals(secondValue);
    }

    public double addition(Length that) {
        Double firstValue = this.unit.convertUnits(this.value);
        Double secondValue = that.unit.convertUnits(that.value);
        return  (firstValue+secondValue);
    }
}



