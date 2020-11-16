package sample;

import java.util.Scanner;

public class Main   {


    static  int [][] array={{0,0,0},{0,0,0},{0,0,0}};

    static  int temp_row_1;
    static  int temp_column_1;
    static  int bead1;
    static  int bead2;
    static  Scanner scan  ;
    static  Scanner scan_2  ;
    static  int win=0;


    public static void main(String[] args) {

        scan =new Scanner(System.in);
        scan_2 =new Scanner(System.in);
        String string_bead;

        input input=new input();
        Computing Computing= new Computing();
        print_array print_array= new print_array();

        /*input name  */

        System.out.println("press your name player1");
        String name1=scan.nextLine();
        /*input  type of bead */
        while (true)
        {
            System.out.println("choice your bead1  x  or O");
            string_bead=scan.nextLine();
            if(string_bead.equals("x")||string_bead.equals("o")){break;}
            else{ System.out.println("wrong");}
        }


        if (string_bead.equals("x")){bead1=1;}else{bead1=2;}

        System.out.println("press your name player2");
        String name2=scan.nextLine();
        /*choice type of bead  for player 2*/
        if (bead1==1)
        {bead2=2;
            System.out.println(name1+" choice x and "+name2+" choice O "); }
        else
        {bead2=1;
            System.out.println(name1+" choice o and "+name2+" choice x "); }
        int counter=1;
        String command;
        while(true)
        {
            while(true)
            {
                /*input Bead movement of player 1 and check and  then add in array  */
                array=input.input_data(bead1,bead2, 1, array);
                /*cheack array for find winner*/
                win=Computing.Computing_data(array, win);
                /*print array */
                print_array.printing(array);
                if(win!=0){break;}


                if(counter!=5)
                {
                    /*input Bead movement of player 1 and check and  then add in array  */
                    array=input.input_data(bead1,bead2, 2, array);

                }
                /*cheack array for find winner*/
                win=Computing.Computing_data(array, win);
                /*print array */
                print_array.printing(array);
                if(win!=0){break;}

                if(counter==5){break;}
                counter++;



            }
            /*print winner */
            if(win==1){System.out.println( " player 1 ="+name1+" win");}
            else if(win==2){System.out.println( " player 2 ="+name2+" win");}
            else {System.out.println( " not person win");}


            /*get command  for continue or exit */
            Scanner scan_3=new Scanner(System.in);
            while (true)
            {
                System.out.println( " press your command if you want exit press exit");
                command=scan_3.nextLine();
                if(command.equals("continue")||command.equals("exit")){break;}
                else{ System.out.println("wrong");}
            }

            System.out.println( " ");
            if(command.equals("exit")){break;}
            else
            {
                /*restart all thing for new round */
                array[0][0]=0;array[0][1]=0;array[0][2]=0;
                array[1][0]=0;array[1][1]=0;array[1][2]=0;
                array[2][0]=0;array[2][1]=0;array[2][2]=0;
                counter=0;
                win=0;
            }
        }


    }
}
