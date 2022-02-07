import java.util.*;
public class Main {
    public static char biggest_number(String number){
        int num = Integer.parseInt(number);
        int max =0;
        while(num!=0){
            if(num%10>max){max=num%10;}
            num/=10;
        }
        return (char)('0'+max);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        String string_7 ="",string_6="",string_5="",string_4="",string_3="",string_2="",string_1="";
        for(int i = 0; i < numbers.length(); i++){
            if (numbers.charAt(i) != biggest_number(numbers)) {
            switch (numbers.charAt(i)) {
                    case '0':
                        string_1 += " ***  ";
                        string_2 += "*   * ";
                        string_3 += "*   * ";
                        string_4 += "*   * ";
                        string_5 += "*   * ";
                        string_6 += "*   * ";
                        string_7 += " ***  ";
                        break;
                    case '1':
                        string_1 += "  *   ";
                        string_2 += " **   ";
                        string_3 += "  *   ";
                        string_4 += "  *   ";
                        string_5 += "  *   ";
                        string_6 += "  *   ";
                        string_7 += " ***  ";
                        break;
                    case '2':
                        string_1 += " ***  ";
                        string_2 += "*   * ";
                        string_3 += "   *  ";
                        string_4 += "  *   ";
                        string_5 += " **   ";
                        string_6 += "*     ";
                        string_7 += " **** ";
                        break;
                    case '3':
                        string_1 += " ***  ";
                        string_2 += "    * ";
                        string_3 += "    * ";
                        string_4 += "  **  ";
                        string_5 += "    * ";
                        string_6 += "    * ";
                        string_7 += " ***  ";
                        break;
                    case '4':
                        string_1 += "   ** ";
                        string_2 += "  * * " ;
                        string_3 += " *  * ";
                        string_4 += "***** ";
                        string_5 += "    * ";
                        string_6 += "    * ";
                        string_7 += "    * ";
                        break;
                    case '5':
                        string_1 += "***** ";
                        string_2 += "*     ";
                        string_3 += "*     ";
                        string_4 += "****  ";
                        string_5 += "    * ";
                        string_6 += "*   * ";
                        string_7 += " ***  ";
                        break;
                    case '6':
                        string_1 += " ***  ";
                        string_2 += "*     ";
                        string_3 += "*     " ;
                        string_4 += "***** ";
                        string_5 += "*   * ";
                        string_6 += "*   * ";
                        string_7 += " ***  ";
                        break;
                    case '7':
                        string_1 += "***** " ;
                        string_2 += "    * ";
                        string_3 += "   *  ";
                        string_4 += "  *   ";
                        string_5 += " *    ";
                        string_6 += "*     ";
                        string_7 += "*     ";
                        break;
                    case '8':
                        string_1 += " ***  ";
                        string_2 += "*   * ";
                        string_3 += "*   * ";
                        string_4 += " ***  ";
                        string_5 += "*   * ";
                        string_6 += "*   * ";
                        string_7 += " ***  ";
                        break;
                    case '9':
                        string_1 += " ***  ";
                        string_2 += "*   * ";
                        string_3 += "*   * ";
                        string_4 += " ***  ";
                        string_5 += "    * ";
                        string_6 += "    * ";
                        string_7 += " ***  ";
                        break;

                }
            }else{
                switch (numbers.charAt(i)) {
                    case '0':
                        string_1 += " 000  ";
                        string_2 += "0   0 ";
                        string_3 += "0   0 ";
                        string_4 += "0   0 ";
                        string_5 += "0   0 ";
                        string_6 += "0   0 ";
                        string_7 += " 000  ";
                        break;
                    case '1':
                        string_1 += "  1   ";
                        string_2 += " 11   ";
                        string_3 += "  1   " ;
                        string_4 += "  1   ";
                        string_5 += "  1   ";
                        string_6 += "  1   ";
                        string_7 += " 111  ";
                        break;
                    case '2':
                        string_1 += " 222  ";
                        string_2 += "2   2 ";
                        string_3 += "   2  ";
                        string_4 += "  2   ";
                        string_5 += " 2    ";
                        string_6 += "2     ";
                        string_7 += " 2222 ";
                        break;
                    case '3':
                        string_1 += " 333  ";
                        string_2 += "    3 ";
                        string_3 += "    3 ";
                        string_4 += "  33  ";
                        string_5 += "    3 ";
                        string_6 += "    3 ";
                        string_7 += " 333  ";
                        break;
                    case '4':
                        string_1 += "   44 ";
                        string_2 += "  4 4 ";
                        string_3 += " 4  4 ";
                        string_4 += "44444 ";
                        string_5 += "    4 ";
                        string_6 += "    4 ";
                        string_7 += "    4 ";
                        break;
                    case '5':
                        string_1 += "55555 ";
                        string_2 += "5     ";
                        string_3 += "5     ";
                        string_4 += "5555  ";
                        string_5 += "    5 ";
                        string_6 += "5   5 ";
                        string_7 += " 555  ";
                        break;
                    case '6':
                        string_1 += " 666  ";
                        string_2 += "6     ";
                        string_3 += "6     ";
                        string_4 += "66666 ";
                        string_5 += "6   6 ";
                        string_6 += "6   6 ";
                        string_7 += " 666  ";
                        break;
                    case '7':
                        string_1 += "77777 ";
                        string_2 += "    7 ";
                        string_3 += "   7  ";
                        string_4 += "  7   ";
                        string_5 += " 7    ";
                        string_6 += "7     ";
                        string_7 += "7     ";
                        break;
                    case '8':
                        string_1 += " 888  ";
                        string_2 += "8   8 ";
                        string_3 += "8   8 ";
                        string_4 += " 888  ";
                        string_5 += "8   8 ";
                        string_6 += "8   8 ";
                        string_7 += " 888  ";
                        break;
                    case '9':
                        string_1 += " 999  ";
                        string_2 += "9   9 ";
                        string_3 += "9   9 ";
                        string_4 += " 999  ";
                        string_5 += "    9 ";
                        string_6 += "    9 ";
                        string_7 += " 999  ";
                        break;

            }


        }



    }
        System.out.println(string_1);
        System.out.println(string_2);
        System.out.println(string_3);
        System.out.println(string_4);
        System.out.println(string_5);
        System.out.println(string_6);
        System.out.println(string_7);
}
}
