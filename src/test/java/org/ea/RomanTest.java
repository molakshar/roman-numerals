package org.ea;

import org.junit.Assert;
import org.junit.Test;

public class RomanTest {

    @Test
    public void testZero() {
        Assert.assertEquals("", Roman.numToRoman(0));
    }

    @Test
    public void testOne() {
        Assert.assertEquals("I", Roman.numToRoman(1));
    }

    @Test
    public void testTwo() {
        Assert.assertEquals("II", Roman.numToRoman(2));
    }

    @Test
    public void testThree() {
        Assert.assertEquals("III", Roman.numToRoman(3));
    }

    @Test
    public void testFour() {
        Assert.assertEquals("IV", Roman.numToRoman(4));
    }

    @Test
    public void testFive() {
        Assert.assertEquals("V", Roman.numToRoman(5));
    }

    @Test
    public void testSix() {
        Assert.assertEquals("VI", Roman.numToRoman(6));
    }

    @Test
    public void testNine() {
        Assert.assertEquals("IX", Roman.numToRoman(9));
    }

    @Test
    public void testTen() {
        Assert.assertEquals("X", Roman.numToRoman(10));
    }

    @Test
    public void testThirtyNine() {
        Assert.assertEquals("XXXIX", Roman.numToRoman(39));
    }

    @Test
    public void testForty() {
        Assert.assertEquals("XL", Roman.numToRoman(40));
    }

    @Test
    public void testFifty() {
        Assert.assertEquals("L", Roman.numToRoman(50));
    }

    @Test
    public void testFiftyOne() {
        Assert.assertEquals("LI", Roman.numToRoman(51));
    }

    @Test
    public void testNinety() {
        Assert.assertEquals("XC", Roman.numToRoman(90));
    }

    @Test
    public void testOneHundred() {
        Assert.assertEquals("C", Roman.numToRoman(100));
    }

    @Test
    public void testOneHundredSixty() {
        Assert.assertEquals("CLX", Roman.numToRoman(160));
    }

    @Test
    public void testTwoHundredSeven() {
        Assert.assertEquals("CCVII", Roman.numToRoman(207));
    }

    @Test
    public void testTwoHundredFortySix() {
        Assert.assertEquals("CCXLVI", Roman.numToRoman(246));
    }

    @Test
    public void testFourHundred() {
        Assert.assertEquals("CD", Roman.numToRoman(400));
    }

    @Test
    public void testFiveHundred() {
        Assert.assertEquals("D", Roman.numToRoman(500));
    }

    @Test
    public void testSevenHundredEightyNine() {
        Assert.assertEquals("DCCLXXXIX", Roman.numToRoman(789));
    }

    @Test
    public void testNineHundred() {
        Assert.assertEquals("CM", Roman.numToRoman(900));
    }

    @Test
    public void testOneThousand() {
        Assert.assertEquals("M", Roman.numToRoman(1000));
    }

    @Test
    public void testOneThousandNine() {
        Assert.assertEquals("MIX", Roman.numToRoman(1009));
    }

    @Test
    public void testOneThousandSixtySix() {
        Assert.assertEquals("MLXVI", Roman.numToRoman(1066));
    }

    @Test
    public void testOneThousandSevenHundredSeventySix() {
        Assert.assertEquals("MDCCLXXVI", Roman.numToRoman(1776));
    }

    @Test
    public void testOneThousandNineHundredEighteen() {
        Assert.assertEquals("MCMXVIII", Roman.numToRoman(1918));
    }

    @Test
    public void testOneThousandFiftyFour() {
        Assert.assertEquals("MCMLIV", Roman.numToRoman(1954));
    }

    @Test
    public void testTwoThousandFourteen() {
        Assert.assertEquals("MMXIV", Roman.numToRoman(2014));
    }

    @Test
    public void testTwoThousandFourHundredTwentyOne() {
        Assert.assertEquals("MMCDXXI", Roman.numToRoman(2421));
    }

    @Test
    public void testRomanMax() {
        Assert.assertEquals("MMMCMXCIX", Roman.numToRoman(3999));
    }

    @Test
    public void testNegative() {
        Assert.assertEquals(null, Roman.numToRoman(-1));
    }

    @Test
    public void testTooLarge() {
        Assert.assertEquals(null, Roman.numToRoman(4000));
    }
}
