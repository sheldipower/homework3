public class Main {
    public static void main(String[] args) {
                task1();
                task2();
                task3();
                task4();
                task5();
                task6();
                task7();
                task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int population = 2000000;
        System.out.println("Значение переменной population с типом int равно" + population);
        byte apple = 15;
        System.out.println("Значение переменной population с типом byte равно" + apple);
        short pricePhone = 20000;
        System.out.println("Значение переменной population с типом short равно" + pricePhone);
        long star = 9L;
        System.out.println("Значение переменной star c типом long равно" + star);
        float a = 3.75f;
        System.out.println("Значение переменной a c типом float равно" + a);
        double b = 3.55555555;
        System.out.println("Значение переменной b c типом double равно" + b);
    }
        public static void task2() {
            System.out.println("Задача 2");
            float a = 27.12f;
            System.out.println(a);
            long b = 987678965549L;
            System.out.println(b);
            float c = 2.786f;
            System.out.println(c);
            short d = 569;
            System.out.println(d);
            int f = -159;
            System.out.println(f);
            short g = 27897;
            System.out.println(g);
            byte e = 67;
            System.out.println(e);}
            public static void task3() {
                System.out.println("Задача 3");
                byte a = 23;
                byte b = 27;
                byte c = 30;
                short d = 480;
                int e = a+b+c;
                int f = d/e;
                System.out.println("На каждого ученика рассчитано"+ f +"листов бумаги");}
    public static void task4() {
        System.out.println("Задача 4");
        byte a = 16;
        int b = (a/2);
        int c = (b*20);
        int d = 24*60;
        int e = b*d;
        int f = d*3;
        int g = f*b;
        int k = d * 31;
        long o = (k*b);
        System.out.println("за" + b + "минут машина произвела " + c + "штук");
        System.out.println("за" + d + "минут машина произвела " + e + "штук");
        System.out.println("за" + f + "минут машина произвела " + g + "штук");
        System.out.println("за" + k + "минут машина произвела " + o + "штук");

    }
    public static void task5() {
        System.out.println("Задача 5");
        byte a = 120;
        byte b = 2;
        byte c = 4;
        int d = b + c;
        int e = a/d;
        int f = b*e;
        int g = c*e;
        System.out.println("В школе, где" + e+ "классов, нужно"+f+ "банок белой краски и" + g + "банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        int a = 5 * 80;
        int b = 105+105;
        int c = 2*100;
        int d = 4*70;
        int e = a+b+c+d;
        int f = e/1000;
        System.out.println("Вес завтрака" + e+ "Грамм");
        System.out.println("Вес завтрака" + f + "Килограмм");
    }
    public static void task7() {
       System.out.println("Задача 7");
       byte a = 7;
       float b = 0.25f;
       float c = 0.5f;
       float d = a/b;
       System.out.println("За"+d+"дней, сопртсмен похудеет на"+a+"кг");
       float e = a/c;
       System.out.println("За"+e+"дней, сопртсмен похудеет на"+a+"кг");
       float f = (d+e)/2;
       System.out.println(f+"дней на похудение понадобится в среднем");

    }

    public static void task8() {
        System.out.println("Задача 8");
        int a = 67760;
        int b = 83690;
        int c = 76230;
        double d = a*1.1;
        double e = b*1.1;
        double f = c*1.1;
        int g = a*12;
        int s = b*12;
        int w = c*12;
        double r = d*12;
        double t = e*12;
        double y = f*12;
        double o = r-g;
        double u = t-s;
        double p = y-w;
        System.out.println("Маша теперь получает"+d+"Годовой доход вырос на"+o);
        System.out.println("Денис теперь получает"+e+"Годовой доход вырос на"+u);
        System.out.println("Кристина теперь получает"+f+"Годовой доход вырос на"+p);}

    }