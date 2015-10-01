public class SyGNumerosPrimos
{
    public static void main(String arg[])
    {
        int numDigitos=0;
        int ndigitos=0;
        numDigitos=Integer.parseInt(arg[0]);
        if(numDigitos<=0)
	{
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
            for(int i = 1; i <= 99999; i++ )
            {
		    ndigitos=contarDigitos(i);
		    if(ndigitos==numDigitos)
		        if (primo(i) == true) 
		            System.out.println(i);    
	    }
        }
     }
 

 
}

// Miguel Bayon Alonso
