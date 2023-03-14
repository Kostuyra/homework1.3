public class Main {
	public static void main(String[] args) {
		taskOne();
		taskTwo();
		taskThree();
		taskFour();
		taskFive();
		taskSix();
		taskSeven();
		taskEight();

	}

	static void taskOne() {
		int money = 10000000;
		byte apple = 50;
		short old = 200;
		long spaceRoad = 5555555555L;
		float square = 54.2f;
		double debt = -100000.856;

		System.out.println("Значение переменной money с типом int равно " + money);
		System.out.println("Значение переменной apple с типом byte равно " + apple);
		System.out.println("Значение переменной old с типом short равно " + old);
		System.out.println("Значение переменной spaceRoad с типом long равно " + spaceRoad);
		System.out.println("Значение переменной square с типом float равно " + square);
		System.out.println("Значение переменной debt с типом double равно " + debt);
	}

	static void taskTwo() {
		double firstVariable = 27.12;
		long secondVariable = 987678965549L;
		float thirdVariable = 2.786f;
		int fourthVariable = 569;
		short fifthVariable = -159;
		int sixthVariable = 27897;
		byte seventhVariable = 67;
	}

	static void taskThree() {
		byte amountStudentsLP = 23;
		byte amountStudentsAS = 27;
		byte amountStudentsEA = 30;
		short amountSheetsPaper = 480;
		int sheetsForStudent = amountSheetsPaper / (amountStudentsLP + amountStudentsAS + amountStudentsEA);
		System.out.println("На каждого ученика рассчитано " + sheetsForStudent + " листов бумаги");
	}

	static void taskFour() {
		int amountEfficiencyForTwoMinutes = 16;
		int timeEfficiency = 2;

		int amountEfficiency = (amountEfficiencyForTwoMinutes / timeEfficiency) * 20;
		System.out.println("За 20 минут машина произвела " + amountEfficiency + " штук бутылок");
		amountEfficiency = (amountEfficiencyForTwoMinutes / timeEfficiency) * 24 * 60;
		System.out.println("За сутки машина произвела " + amountEfficiency + " штук бутылок");
		amountEfficiency = (amountEfficiencyForTwoMinutes / timeEfficiency) * 24 * 60 * 3;
		System.out.println("За 3 дня машина произвела " + amountEfficiency + " штук бутылок");
		amountEfficiency = (amountEfficiencyForTwoMinutes / timeEfficiency) * 24 * 60 * 30;
		System.out.println("За месяц машина произвела " + amountEfficiency + " штук бутылок");
	}

	static void taskFive() {
		byte allPaintCan = 120;
		short whitePaintCanForOneClass = 2;
		short brownPaintCanForOneClass = 4;
		int countClass = allPaintCan / (whitePaintCanForOneClass + brownPaintCanForOneClass);
		int allWhitePaintCan = whitePaintCanForOneClass * countClass;
		int allBrownPaintCan = brownPaintCanForOneClass * countClass;
		System.out.println("В школе, где " + countClass + " классов, нужно " +
				allWhitePaintCan + " банок белой краски и " + allBrownPaintCan + " банок коричневой краски");
	}

	static void taskSix() {
		byte amountBananas = 5;
		byte weightBanana = 80;
		short volumeMilk = 200;
		byte weightMilkFor100Ml = 105;
		byte amountIceCream = 2;
		byte weightIceCream = 100;
		byte amountEggs = 4;
		byte weightEgg = 70;

		int weightBreakfastForGr = amountBananas * weightBanana + (volumeMilk / 100) * weightMilkFor100Ml +
				amountIceCream * weightIceCream + amountEggs * weightEgg;
		float weightBreakfastForKg = weightBreakfastForGr / 1000.0f;

		System.out.println("Вес завтрака составит " + weightBreakfastForGr + " г или " + weightBreakfastForKg + " кг");
	}

	static void taskSeven() {
		byte requiredLoseWeightKg = 7;
		short minLoseWeightForDayGr = 250;
		short maxLoseWeightForDayGr = 500;
		int minRequiredDayForLoseWeight = requiredLoseWeightKg * 1000 / minLoseWeightForDayGr;
		System.out.println(minRequiredDayForLoseWeight + " дней портебуется для того, чтобы сбросить "
				+ requiredLoseWeightKg + " кг, если сбрасывать " + minLoseWeightForDayGr + " г в сутки");
		int maxRequiredDayForLoseWeight = requiredLoseWeightKg * 1000 / maxLoseWeightForDayGr;
		System.out.println(maxRequiredDayForLoseWeight + " дней портебуется для того, чтобы сбросить "
				+ requiredLoseWeightKg + " кг, если сбрасывать " + maxLoseWeightForDayGr + " г в сутки");
		int avrRequiredDayForLoseWeight = (minRequiredDayForLoseWeight + maxRequiredDayForLoseWeight) / 2;
		System.out.println(avrRequiredDayForLoseWeight + " дней портебуется для того, чтобы сбросить "
				+ requiredLoseWeightKg + " кг в среднем");
	}

	static void taskEight() {
		byte percentageIncrease = 10;
		int presentSalaryMasha = 67760;
		int presentSalaryDenis = 83690;
		int presentSalaryKristina = 76230;

		int futureSalaryMasha = presentSalaryMasha + presentSalaryMasha / percentageIncrease;
		int futureSalaryDenis = presentSalaryDenis + presentSalaryDenis / percentageIncrease;
		int futureSalaryKristina = presentSalaryKristina + presentSalaryKristina / percentageIncrease;

		int yearChangeSalaryMasha = (futureSalaryMasha - presentSalaryMasha) * 12;
		int yearChangeSalaryDenis = (futureSalaryDenis - presentSalaryDenis) * 12;
		int yearChangeSalaryKristina = (futureSalaryKristina - presentSalaryKristina) * 12;

		System.out.println("Маша теперь получает " + futureSalaryMasha +
				" рублей. Годовой доход вырос на " + yearChangeSalaryMasha + " рублей");
		System.out.println("Денис теперь получает " + futureSalaryDenis +
				" рублей. Годовой доход вырос на " + yearChangeSalaryDenis + " рублей");
		System.out.println("Кристина теперь получает " + futureSalaryKristina +
				" рублей. Годовой доход вырос на " + yearChangeSalaryKristina + " рублей");

	}
}