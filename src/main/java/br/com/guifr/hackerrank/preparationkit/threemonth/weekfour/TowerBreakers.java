package br.com.guifr.hackerrank.preparationkit.threemonth.weekfour;

public class TowerBreakers {

    public static int towerBreakers(int n, int m) {
        return n % 2 == 1 && m > 1 ? 1 : 2;
    }

}
