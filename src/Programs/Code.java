package Programs;

class Calculator1 {
  public double int1;
  public double int2;

    public Calculator1(double int1, double int2) {
        this.int1 = int1;
        this.int2 = int2;
    }

    public double getInt1() {
        return int1;
    }

    public void setInt1(double int1) {
        this.int1 = int1;
    }

    public double getInt2() {
        return int2;
    }

    public void setInt2(double int2) {
        this.int2 = int2;
    }

    public double addition() {
        return int1 + int2;
    }

    public double subtraction() {
        return int1 - int2;
    }

    public double multiply() {
        return int1 * int2;
    }

    public double division() {
        if(int2 != 0) {
            return (double) int1 /int2;
        } else {
            throw new ArithmeticException("Cannot divide by 0.");
        }

    }
}

public class Code {
    public static void main(String[] args) {

    }
}
