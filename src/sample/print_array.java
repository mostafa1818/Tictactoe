package sample;





public class print_array {
    public print_array (){}
    public void printing(  int[][] array )
    {

        /*  print array  */
        for(int count_1=0;count_1<=2;count_1++)
        {
            for(int count_2=0;count_2<=2;count_2++)
            {
                /* Print suitable for the user  */
                if(array[count_1][count_2]==1)
                {System.out.print( "x"+" ");}
                else if(array[count_1][count_2]==2){System.out.print( "o"+" ");}
                else{System.out.print(  "_ ");}

            }
            System.out.println(  );
        }

    }
}


