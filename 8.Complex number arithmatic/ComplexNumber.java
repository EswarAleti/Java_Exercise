public class ComplexNumber {
    // write your code here
    private double real,imaginary;
    public ComplexNumber(double real, double imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }
    public double getReal()
    {
        return real;
    }
    public double getImaginary()
    {
        return imaginary;
    }
    public void add(double real,double imaginary)
    {
        this.real += real;
        this.imaginary += imaginary;
    }
    public void add(ComplexNumber c)
    {
        this.real += c.getReal();
        this.imaginary += c.getImaginary();
    }
    public void subtract(double real,double imaginary)
    {
        this.real -= real;
        this.imaginary -= imaginary;
    }
    public void subtract(ComplexNumber c)
    {
        this.real -= c.getReal();
        this.imaginary -= c.getImaginary();
    }
}