package primitive_07;

public class Main {
    public static void main(String[] args) {
        //todo ex1
        // примитив
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        int milk = 78;
        int pmilk = milk;
        milk = 100;
        System.out.println(milk); // 78

        // объект
        Container2 container2 = new Container2(3);
        container.addCount(333);
        System.out.println(container2.getCount());

        //todo ex2
        for (char i = 'А'; i < 'я'; i++ ){
            char io = i;
            System.out.print(" " + i);
            if (io == 'е') {
                io = 'ё';
                System.out.print(" " + io);
            }
            if (io == 'Е') {
                io = 'Ё';
                System.out.print(" " + io);
            }
        }
    }
}
