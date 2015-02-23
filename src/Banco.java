public class Banco

{
    private float saldo;
    private String titular;

    public float getSaldo() 
    {
        return saldo;
    }

    public void setSaldo(float saldo) 
    {
        this.saldo = saldo;
    }

    public String getTitular()
    {
        return titular;
    }

    public void setTitular(String titular)
    {
        this.titular = titular;
    }

    public Banco(float saldo, String titular)
    {
        this.saldo = saldo;
        this.titular = titular;
    }
    
    public float Ingresar(float importe)
    {
        return saldo+= importe;
    }
    
    public float Retirar(float importe)
    {
        return saldo-= importe;
    }
    
    
    
    
    
}
