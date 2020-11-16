package sample;



public class Computing {
    public Computing (){}
    public int Computing_data(  int[][] array, int win)
    {
        /*  check  All scenarios  to find winner  */
        if(array[0][0]!=0 && array[0][0]==array[1][1] && array[1][1]==array[2][2]      ) {win=array[0][0];}

        else if(array[0][0]!=0 && array[0][0]==array[0][1] && array[0][1]==array[0][2])  {win=array[0][0];}
        else if(array[1][0]!=0 && array[1][0]==array[1][1] && array[1][1]==array[1][2])  {win=array[1][0];}
        else if(array[2][0]!=0 && array[2][0]==array[2][1] && array[2][1]==array[2][2])  {win=array[2][0];}

        else if(array[0][0]!=0 && array[0][0]==array[1][0] && array[1][0]==array[2][0])  {win=array[0][0];}
        else if(array[0][1]!=0 && array[0][1]==array[1][1] && array[1][1]==array[2][1])  {win=array[0][1];}
        else if(array[0][2]!=0 && array[0][2]==array[1][2] && array[1][2]==array[2][2])  {win=array[0][2];}

        else if(array[0][2]!=0 && array[0][2]==array[1][1] && array[1][1]==array[2][0])  {win=array[0][2];}

        return win;
    }
}
