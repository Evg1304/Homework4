public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задание 1
        int f = 0;
        while (f < 10) {
            f++;
            System.out.print(f + " ");
        }

        System.out.println(" ");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        //Задание 2
        {
            for (int Friday = 2; Friday <= 31; Friday += 7)
                System.out.println("Сегодня пятница, " + Friday + " число.Необходимо подготовить отчет.");
        }
        //Задание 3
        for (int years = 0; years < 2122; years += 79) {
            System.out.println(years);
        }
        System.out.println(" ");

        for (int start = 1896; start < 2122; start += 79) {
            System.out.println(start);

        }


    }
}
