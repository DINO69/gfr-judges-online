package br.com.guifr.beecrowd;

public class No {

    public static int connections = 0;

    public final int number;
    public No next;
    public No previous;

    public No(int number) {
        this.number = number;
        connections++;
    }

    public void blacked() {
        connections--;
        if (this.next != null) {
            this.next.previous = this.previous;
        }
        if (this.previous != null) {
            this.previous.next = this.next;
        }
    }

    public String print() {
        return "No{" +
                "number=" + number +
                ", next=" + next +
                ", previous=" + previous +
                '}';
    }

    public static No initialNo(int amountOfCities) {
        No.connections = 0;
        No first = new No(1);

        No previous = first;
        for (int i = 2; i <= amountOfCities; i++) {
            No no = new No(i);
            previous.next = no;
            no.previous = previous;
            previous = no;
        }
        previous.next = first;
        first.previous = previous;
        return first;
    }

}
