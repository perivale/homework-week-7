//import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
//import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Scanner;

public class Programme5 {
    public static void main(String[] args) {

        String employee;
        String name;
       // int salary,HRA,TA,DA,PF;

        Scanner input =new Scanner(System.in);
        System.out.println(" enter employee ID");
        int empid = input.nextInt();
        System.out.println("enter employee name");
        String name1= input.nextLine();
        System.out.println("basic salary");
        int salary1 = input.nextInt();

        float HRA=(25000*10/100);   //10% HRA
        float TA=(25000*9/100);     //9% TA
        float DA=(25000*8/100);     //8%DA
        float PF=(25000-20/100);        //-20%pf

        float salary=HRA+TA+DA+PF;


        System.out.println("|----------------------------------|");
        System.out.println("|           salary slip            | ");
        System.out.println("|__________________________________|");
        System.out.println("|  employ ID :   "+empid  +       "|" );
        System.out.println("|  employee name: "+name1+"        |");
        System.out.println("|__________________________________|");
        System.out.println("|  basic salary:    "+ salary1   +"| ");
        System.out.println("|  HRA 10%   :   "+HRA+"           |");
        System.out.println("|   TA 8%    :    "+TA+"           |");
        System.out.println("|   DA 9%   :    "+DA+"            |");
        System.out.println("|   PF-20%   :    "+PF+"           |");
        System.out.println("|__________________________________|");
        System.out.println("| GROSS SALARY:    "+salary+"      |");
        System.out.println("|__________________________________|");


    }
}
