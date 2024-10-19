package br.com.guifr;

public class PrintNMessageWithoutLoopStructure {


    public static void main(String[] args) {
        print("Hello Cesinha!!",5);
    }

    private static void print(String msg, int amount) {
        System.out.println(msg);
        if(amount > 1) print(msg,--amount);
    }

}
