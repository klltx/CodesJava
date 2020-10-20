package ru.svetashov.math;

final public class Fraction extends Number{
    private int num;
    private int den;

    public Fraction(int num, int den) {
        this.num = num;
        if (den < 1)
            throw new IllegalArgumentException("Wrong denominator");
        this.den = den;
    }

    public Fraction sum(Fraction f) {
        if (den == f.den) {
            return new Fraction(num + f.num, den);
        } else
            return new Fraction((num * f.den) + (f.num * den), den * f.den);
    }

    public Fraction minus(Fraction f) {
        if (den == f.den) {
            return new Fraction(num - f.num, den);
        } else
            return new Fraction((num * f.den) - (f.num * den), den * f.den);
    }

    public Fraction multiply(Fraction f) {
        return new Fraction(num * f.num, den * f.den);
    }

    public Fraction divide(Fraction f) {
        return new Fraction(num * f.den, den * f.num);
    }

    public int intValue(){ return num/den;}

    public long longValue(){ return (long)num / den; }

    public float floatValue(){ return (float)num / den; }

    public double doubleValue(){ return  (double)num / den; }

    @Override
    public String toString() {
        return num + "/" + den;
    }
}