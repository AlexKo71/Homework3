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

    public static void task1() {
        System.out.println("Задача 1");
        int inFirst = 256;
        byte byFirst = 5;
        short shFirst = -500;
        long lonFirst = 15644L;
        float flFirst = 35.65f;
        double doFirst = 2.568;
        System.out.println("Значение переменной inFirst с типом int равно " + inFirst);
        System.out.println("Значение переменной byFirst с типом byte равно " + byFirst);
        System.out.println("Значение переменной shFirst с типом short равно " + shFirst);
        System.out.println("Значение переменной lonFirst с типом long равно " + lonFirst);
        System.out.println("Значение переменной flFirst с типом float равно " + flFirst);
        System.out.println("Значение переменной doFirst с типом double равно " + doFirst);

    }

    public static void task2() {
        System.out.println("Задача 2");
        float flSecond = 27.12f;
        System.out.println(flSecond);
        long lonSecond = 987678965549L;
        System.out.println(lonSecond);
        double doSecond = 2.786;
        System.out.println(doSecond);
        short shSecond = 569;
        System.out.println(shSecond);
        short shoSecond = -159;
        System.out.println(shoSecond);
        int inSecond = 27897;
        System.out.println(inSecond);
        byte bySecond = 67;
        System.out.println(bySecond);

    }

    public static void task3() {
        System.out.println("Задача 3");
        byte teacherLudmilaPav = 23;
        byte teacherAnnaSer = 27;
        byte teacherEkaterinaAnd = 30;
        short allPaper = 480;
        int paperStudent = allPaper / (teacherLudmilaPav + teacherAnnaSer + teacherEkaterinaAnd);
        System.out.println("На каждого ученика рассчитано " + paperStudent + " листов бумаги");

    }

    public static void task4() {
        System.out.println("Задача 4");
        byte oneTime = 2;
        byte numberBottleTime = 16;
        int numberBottleOneTime = numberBottleTime / oneTime;
        int numberBottle = numberBottleOneTime * 20;
        System.out.println("За 20 минут машина произвела " + numberBottle + " штук бутылок");
        numberBottle = numberBottleOneTime * 60 * 24;
        System.out.println("За сутки машина произвела " + numberBottle + " штук бутылок");
        numberBottle = numberBottle * 3;
        System.out.println("За 3 дня машина произвела " + numberBottle + " штук бутылок");
        numberBottle = numberBottle * 10;
        System.out.println("За месяц машина произвела " + numberBottle + " штук бутылок");


    }

    public static void task5() {
        System.out.println("Задача 5");
        byte allNumberTins = 120;
        byte whiteNumberClass = 2;
        byte brownNumberClass = 4;
        int classNumberTins = whiteNumberClass + brownNumberClass;
        int classesNumber = allNumberTins / classNumberTins;
        int whiteNumberTins = classesNumber * whiteNumberClass;
        int brownNumberTins = classesNumber * brownNumberClass;
        System.out.println("В школе, где " + classesNumber + " классов, нужно " + whiteNumberTins + " банок белой краски и " + brownNumberTins + " банок коричневой краски");

    }

    public static void task6() {
        System.out.println("Задача 6");
        byte bananas = 5;
        short weightBanana = 80;
        short milk = 200;
        short weight100milk = 105;
        byte iceCream = 2;
        short weightIceCream = 100;
        byte eggs = 4;
        short weightEggs = 70;
        int allWeightBananas = (bananas * weightBanana);
        int allWeightMilk = milk * weight100milk / 100;
        int allWeightIceCream = iceCream * weightIceCream;
        int allWeightEggs = eggs * weightEggs;
        int weightBreakfast = allWeightBananas + allWeightMilk + allWeightIceCream + allWeightEggs;
        System.out.println("Вес спортзавтрака составляет " + weightBreakfast + " граммов");
        double weightBreakfastKg = weightBreakfast * 0.001;
        System.out.println("Вес спортзавтрака составляет " + weightBreakfastKg + " килограмм");

        }
    private static void task7() {
        System.out.println("Задача 7");
        byte mustWeightLossKg = 7;
        short minWeightLoss = 250;
        short maxWeightLoss = 500;
        int mustWeightLoss = mustWeightLossKg * 1000;
        int minDaysWeightLoss = mustWeightLoss / maxWeightLoss;
        int maxDaysWeightLoss = mustWeightLoss / minWeightLoss;
        System.out.println("Если спортсмен будет терять каждый день по " + minWeightLoss + " грамм, то на похудение уйдет " + maxDaysWeightLoss + " дней");
        System.out.println("Если спортсмен будет терять каждый день по " + maxWeightLoss + " грамм, то на похудение уйдет " + minDaysWeightLoss + " дней");
        int averageDaysWeightLoss = (minDaysWeightLoss + maxDaysWeightLoss) / 2;
        System.out.println("В среднем, чтобы добиться результата похудения - спортсмену понадобится " + averageDaysWeightLoss + " день");

    }

    private static void task8() {
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int annualIncomeMasha = salaryMasha * 12;
        int annualIncomeDenis = salaryDenis * 12;
        int annualIncomeKristina = salaryKristina * 12;
        int newSalaryMasha = salaryMasha * 10 / 100 + salaryMasha;
        int newSalaryDenis = salaryDenis * 10 / 100 + salaryDenis;
        int newSalaryKristina = salaryKristina * 10 / 100 + salaryKristina;
        int annualNewMasha = newSalaryMasha * 12;
        int annualNewDenis = newSalaryDenis * 12;
        int annualNewKristina = newSalaryKristina * 12;
        int differenceIncomeMasha = annualNewMasha % annualIncomeMasha;
        int differenceIncomeDenis = annualNewDenis % annualIncomeDenis;
        int differenceIncomeKristina = annualNewKristina % annualIncomeKristina;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей в месяц. Годовой доход Маши вырос на " + differenceIncomeMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей в месяц. Годовой доход Дениса вырос на " + differenceIncomeDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей в месяц. Годовой доход Кристины вырос на " + differenceIncomeKristina + " рублей");

    }

}
