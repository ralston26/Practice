public class Fraction {
  private int n; // numerator
  private int d; // denominator

  // Constructors
 
  public Fraction (int n, int d) { // with parameters
    this.n = n; // this is the member variable
    this.d = d;
  }


  // std method for conversion to string (see API: java.lang.Object)
  public String toString () {
    return (n+"/"+d);
  }
}

