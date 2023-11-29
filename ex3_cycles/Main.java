
public class Main {
    public static void main(String[] args) {
        //TODO: Программа, которая находит все пары положительных целых чисел, произведение которых равно значению value
        System.out.println("Введите любое целое число:");
        int date = new Scanner(System.in).nextInt();
        for (int i = 1; i <= date; i++) {
            for (int j = 1; j <= date; j++) {
                if (i * j == date) {
                    System.out.println(i + " * " + j + " = " + i * j);
                }
            }
        }

        //TODO: Программа с исп. цикла while, которая рассчитает и выводит время наполнения бассейна с учётом скоростей наполнения и опустошения.
        int volume = 1200; // volume
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute

        int currentVolume = 0;
        int t = 0;

        while (currentVolume < volume) {
            t++;
            currentVolume += fillingSpeed - devastationSpeed;
        }

        //todo another solution.Recommended 
        // while (true) {
        //     t++;
        //     currentVolume += fillingSpeed - devastationSpeed;

        //     if (volume == currentVolume) {
        //         break;
        //     }
        // }

        System.out.println(t + " min or " + t/60 + "h.");
    }
}