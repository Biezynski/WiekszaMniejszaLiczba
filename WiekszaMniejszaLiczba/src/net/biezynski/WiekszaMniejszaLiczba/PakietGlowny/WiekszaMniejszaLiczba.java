package net.biezynski.WiekszaMniejszaLiczba.PakietGlowny;

import java.util.Scanner;

public class WiekszaMniejszaLiczba {

	public static void metodaLosujacaLiczbe(int i, int liczbaWylosowanaPrzezProgram,
			int liczbaObrotowPetliPotrzebnaDoHiscora) {

	//	System.out.println(liczbaWylosowanaPrzezProgram);

		if (i < liczbaWylosowanaPrzezProgram) {
			System.out.println("Podana przez Ciebie liczba jest mniejsza od szukanej");

		} else if (i > liczbaWylosowanaPrzezProgram) {
			System.out.println("Podana przez Ciebie liczba jest wieksza od szukanej");
		} else {
			System.out
					.println("Trafiona zatiopiona!! Wylosowana przez program liczba to " + liczbaWylosowanaPrzezProgram
							+ " potrzebowales do odgadniecia " + liczbaObrotowPetliPotrzebnaDoHiscora + " prob");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int liczbaWylosowanaPrzezProgram = (int) (Math.random() * 100);
		System.out.println("Program wylosowuje liczbe z zakresu od 1 do 100 a Ty masz ja znalezc, podaj liczbe!!");

		int liczbaObrotowPetliPotrzebnaDoHiscora = 0;
		for (;;) {

			int i = sc.nextInt();

			metodaLosujacaLiczbe(i, liczbaWylosowanaPrzezProgram, liczbaObrotowPetliPotrzebnaDoHiscora);

			if (liczbaWylosowanaPrzezProgram == i) {
				break;

			}

			liczbaObrotowPetliPotrzebnaDoHiscora++;

		}
	}

}


/*
 * Dodac w aplikacji Hiscore, musze ogarnac IO
 * 
 * 
 * */



