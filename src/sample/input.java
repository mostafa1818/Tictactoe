package sample;

import java.util.Scanner;



public class input {
    public input (){}
    public int[][] input_data(int bead1,int bead2, int type, int[][] array )
    {
        int temp_row_1;
        int temp_column_1;
        Scanner scan=new Scanner(System.in);
        int bead ;
        if (type==1){bead=bead1;}else{bead=bead2;}
        while(true)
        {
            /* get position  */
            System.out.println( " player "+type+" choice Row    ");
            temp_row_1=scan.nextInt();
            System.out.println( " player "+type+" choice column ");
            temp_column_1=scan.nextInt();
            /* check  position  */
            if((temp_row_1<=2 )&& (temp_column_1<=2))
            {
                if(array[temp_row_1][temp_column_1]==0 )
                {
                    /* add position  in array*/
                    array[temp_row_1][temp_column_1]=bead;
                    break;
                } else{System.out.println( " player "+type+" please  Re-enter ");}
            }else{System.out.println( " player "+type+" please  Re-enter ");}
        }
        return array;
    }
}
