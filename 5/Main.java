
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        logic worker = new logic();
        worker.init();
        worker.logic();
    }
}
class logic {
        int quantity,total_volume;
        private int[] volume_item;
        private int[] value_item;
        private int[] F;
        public void logic() {
            for(int i = 0; i <= total_volume; i++) {
                F[i] = 0;
            }
            for(int i = 1; i <= quantity; i++) {
                for(int j = total_volume; j >= 0; j--) {
                    if(j >= volume_item[i]) {
                        F[j] = Math.max(F[j - volume_item[i]] + value_item[i], F[j]);
                    }else {
                        F[j]= F[j];
                    }
                }
            }
            System.out.println("Максимальная стоимость:"+F[total_volume]);
        }



        public void init() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите через пробел количество предметов и объём сейфа");
            quantity = sc.nextInt();
            total_volume = sc.nextInt();

            volume_item = new int[quantity + 1];
            value_item = new int[quantity + 1];
            F = new int [total_volume + 1];

            for(int i = 1; i <= quantity; i++) {
                System.out.println("Введите через пробел объём и цену "+i+" предмета");
                volume_item[i] = sc.nextInt();
                value_item[i] = sc.nextInt();
            }


        }


    }
