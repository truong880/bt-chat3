class MyComplex {
    private double real;
    private double imag;

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public boolean equals(MyComplex other) {
        return this.real == other.real && this.imag == other.imag;
    }

    public MyComplex add(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }

    public MyComplex subtract(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag); // Fixed missing * symbols
    }
}

