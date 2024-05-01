class pyramid1 {
    public static void main (String args[])
   {
       int n = 4 ;
       for (int i=n ; i>=1 ;i--) {
           //outer loop
       for (int j = 1 ; j <= i; j++ )
       //inner loop
       {
        System.out.print("*");
       
       }
       System.out.println( );    
   }
   }    
   }