java Importar  . io. * ;

   clase pública Ejemplo {

público estático    int    factorial ( int    x)
 {
		 if (x ==    1 )
			 retorno    1 ;
		 más
			 devolver x * factorial (x -    1 );
}
	
	
	 público estático    int    fibonacci ( int    x)
 {
		 if (x ==    0 )
			 devolver    0 ;
		 más
			 if (x ==    1 )
				 retorno    1 ;
			 más
				 retorno fibonacci (x -    1 ) + fibonacci (x -    2 );
}
	
	
	 public    static    int    pascal ( int    n, int    k)
 {
		 si (k ==    0    || k == n)
			 retorno    1 ;
		 más
			 retorno pascal (n -    1 , k -    1 ) + pascal (n -    1 , k);
}
	 public    static    int    multiplicacion ( int    n, int    x)
 {
	 if (x ==    1 )
			 return n;
		 más
			 return n + multiplicacion (n, x -    1 );
}
		
	 public    static    void    main ( String [] args)
 {
		 BufferedReader br =    nuevo    BufferedReader (nuevo    InputStreamReader ( Sistema   .   En ));
		 BufferedWriter bw =    nuevo    BufferedWriter (nuevo    OutputStreamWriter ( System   .   Cabo ));
		
		 prueba
 {
			 int n =    Entero   . parseInt (br . readLine ());
			 int x =    Entero   . parseInt (br . readLine ());
			
			 int result = multiplicacion (n, x);
bw . write ( " Multiplicacion: "    + resultado +    "   \ n " );
			
resultado = factorial (n);
bw . write ( " Factorial: "    + resultado +    "   \ n " );
			
resultado = fibonacci (n);
bw . write ( " Fibonacci: "    + resultado +    "   \ n " );

resultado = pascal (n, k);
bw . write ( " Pascal: "   + resultado +   "   \ n " )
 
bw . enjuagar ();
 
coger   ( Excepci ón ex)
 {
ex . printStackTrace ();
}
}
}
