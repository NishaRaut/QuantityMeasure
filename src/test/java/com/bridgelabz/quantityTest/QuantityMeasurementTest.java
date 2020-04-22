package com.bridgelabz.quantityTest;

import com.bridgelabz.quantityEx.Length;
import com.bridgelabz.quantityEx.UnitConversion;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Length feet1 = new Length(UnitConversion.FEET, 0.0);
        Length feet2 = new Length(UnitConversion.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }
    @Test
    public void given0FeetAnd1Feet_GiveNotEqual() {
        Length feet1 = new Length(UnitConversion.FEET, 0.0);
        Length feet2 = new Length(UnitConversion.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }
    @Test
    public void given0InchAnd0Feet_ShouldGiveEqualLenght() {
        Length feet = new Length(UnitConversion.FEET, 0.0);
        Length inch = new Length(UnitConversion.INCHES, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1InchAnd1Feet_ShouldGiveNotEqualLenght() {
        Length feet = new Length(UnitConversion.FEET, 1.0);
        Length inch = new Length(UnitConversion.INCHES, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
public void given1FeetAnd1Feet_ShouldGiveNotEqualLenght() {
        Length feet1 = new Length(UnitConversion.FEET, 1.0);
        Length feet2 = new Length(UnitConversion.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_ShouldGiveNotEqualLenght() {
        Length feet = new Length(UnitConversion.FEET, 1.0);
        Length inch = new Length(UnitConversion.INCHES, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yd_ShouldGiveEqualLenght() {
        Length feet = new Length(UnitConversion.FEET, 3.0);
        Length yaad = new Length(UnitConversion.YARD, 1.0);
        boolean compareCheck = feet.compare(yaad);
        Assert.assertTrue(compareCheck);
    }


    @Test
    public void given1YdAnd1Yd_ShouldGiveEqualLenght() {
        Length yaad1 = new Length(UnitConversion.YARD, 1.0);
        Length yaad2 = new Length(UnitConversion.YARD, 1.0);
        boolean compareCheck = yaad1.compare(yaad2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given5CMAnd5CM_ShouldGiveEqualLenght() {
        Length cm1 = new Length(UnitConversion.CM, 5.0);
        Length cm2 = new Length(UnitConversion.CM, 5.0);
        boolean compareCheck = cm1.compare(cm2);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given2InchAnd5CM_ShouldGiveEqualLenght() {
        Length inch = new Length(UnitConversion.INCHES, 2.0);
        Length cm = new Length(UnitConversion.CM, 5.0);
        boolean compareCheck = inch.compare(cm);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_EqualTo4inch() {
        Length inch1 = new Length(UnitConversion.INCHES, 2.0 );
        Length inch2 = new Length(UnitConversion.INCHES, 2.0 );;
        double result = inch1.addition(inch2);
        Assert.assertEquals(4.0,result,0.0);
    }

    @Test
    public void given1FeetAnd2Inch_EqualTo14inch() {
        Length feet = new Length(UnitConversion.FEET, 1.0 );
        Length inch = new Length(UnitConversion.INCHES, 2.0 );;
        double result = feet.addition(inch);
        Assert.assertEquals(14.0,result,0.0);
    }

    @Test
    public void given1FeetAnd1Feet_EqualTo24inch() {
        Length feet = new Length(UnitConversion.FEET, 1.0 );
        Length feet2 = new Length(UnitConversion.FEET, 1.0 );;
        double result = feet.addition(feet2);
        Assert.assertEquals(24.0,result,0.0);
    }

    @Test
    public void given2InchAnd2n5CM_EqualTo3inch() {
        Length inch = new Length(UnitConversion.INCHES, 2.0 );
        Length cm = new Length(UnitConversion.CM, 2.5 );;
        double result = inch.addition(cm);
        Assert.assertEquals(3.0,result,0.0);
    }

    @Test
    public void given1GallonAnd3n78Litters_shouldReturnEqualVolume() {
        Length gallon = new Length(UnitConversion.GALLON, 1.0 );
        Length litters = new Length(UnitConversion.LITTERS, 3.78 );
        boolean compareCheck = gallon.compare(litters);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2GallonAnd7n56Litters_shouldReturnEqualVolume() {
        Length gallon = new Length(UnitConversion.GALLON, 2.0 );
        Length litters = new Length(UnitConversion.LITTERS, 7.56 );
        boolean compareCheck = gallon.compare(litters);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenLitterAnd1000ml_shouldReturnEqualVolume() {
        Length litter = new Length(UnitConversion.LITTERS, 1.0 );
        Length ml = new Length(UnitConversion.ML, 1000.0 );
        boolean compareCheck = litter.compare(ml);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1gallonAnd3n78Litters_EqualTo7n57litters() {
        Length gallon = new Length(UnitConversion.GALLON, 1.0 );
        Length litters = new Length(UnitConversion.LITTERS, 3.78 );;
        double result = gallon.addition(litters);
        Assert.assertEquals(7.56,result,0.0);
    }
    @Test
    public void given1LitterAnd1000Ml_EqualTo2litters() {
        Length litters = new Length(UnitConversion.LITTERS, 1.0 );
        Length ml = new Length(UnitConversion.ML, 1000.0 );
        double result = litters.addition(ml);
        Assert.assertEquals(2,result,0.0);
    }

    @Test
    public void given1KgAnd1000Gm_shouldReturnEqualVolume() {
        Length kg = new Length(UnitConversion.KG, 1.0 );
        Length gram = new Length(UnitConversion.GRAM, 1000.0 );
        boolean compareCheck = kg.compare(gram);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1ToneAnd1000kg_shouldReturnEqualVolume() {
        Length kg = new Length(UnitConversion.TONE, 1.0 );
        Length gram = new Length(UnitConversion.KG, 1000.0 );
        boolean compareCheck = kg.compare(gram);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1ToneAnd1000Gm_EqualTo1001kg() {
        Length tone = new Length(UnitConversion.TONE, 1.0 );
        Length gm = new Length(UnitConversion.GRAM, 1000.0 );;
        double result = tone.addition(gm);
        Assert.assertEquals(1001,result,0.0);
    }


    @Test
    public void given212FAnd100C_shouldReturnEqualVolume() {

        Length f = new Length(UnitConversion.F, 212.0 );
        Length c = new Length(UnitConversion.C, 100.0 );
        boolean compareCheck = f.compare(c);
        Assert.assertTrue(compareCheck);
    }


}
