package br.com.guifr.beecrowd;

import java.util.Scanner;

public class Banknotes {
    private final Notes notes;
    private int value;

    public Banknotes(int value, Notes notes) {
        this.value = value;
        this.notes = notes;
    }

    public static Banknotes value(int value, Notes notes) {
        return new Banknotes(value, notes);
    }

    public String printNotes() {
        return notes.decomposed(value);
    }

    public static void main(String[] args) {

        Banknotes.Notes notes = new Banknotes.Notes(100,
                new Banknotes.Notes(50,
                        new Banknotes.Notes(20,
                                new Banknotes.Notes(10,
                                        new Banknotes.Notes(5,
                                                new Banknotes.Notes(2,
                                                        new Banknotes.Notes(1, null)))))));

        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println(value);
        System.out.println(notes.decomposed(value));
    }


    public static class Notes {
        private int note;
        private Notes next;

        public Notes(int note, Notes next) {
            this.note = note;
            this.next = next;
        }

        public String decomposed(int value) {
            int quotient = value / note;
            int mod = value % note;
            StringBuilder sb = new StringBuilder(String.format("%d nota(s) de R$ %d,00", quotient, note));
            sb.append(next != null ? "\n" + next.decomposed(mod) : "");
            return sb.toString();
        }
    }
}
