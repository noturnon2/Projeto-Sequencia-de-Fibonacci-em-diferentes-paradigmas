package Fibonacci;

public class CalculoFib {
    private int n;

    public CalculoFib(int n)
    {
        this.setN(n);
    }
    
    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public final void setN(int n) {
        this.n = n>0?n:0;
    }

   private int fib(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    
   private int soma(int n) {
    return fib(n + 2) - 1;
   }
   
    @Override
    public String toString()
    {
        return Integer.toString(fib(this.getN()));
    }

    public int soma()
    {
        return soma(this.getN());
    }
}