package br.com.guifr.beecrowd;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;


public class Banknotes {
    private final Money money;
    private int value;

    public Banknotes(int value, Money money) {
        this.value = value;
        this.money = money;
    }

    public static Banknotes value(int value, Money money) {
        return new Banknotes(value, money);
    }

    public String printNotes() {
        return money.decomposed(value);
    }

    public static void main(String[] args) {

        Chain chains = new Banknotes.Print("NOTAS:",
                Money.Builder.buildLocaleUS(100).withNext(
                        Money.Builder.buildLocaleUS(50).withNext(
                                Money.Builder.buildLocaleUS(20).withNext(
                                        Money.Builder.buildLocaleUS(10).withNext(
                                                Money.Builder.buildLocaleUS(5).withNext(
                                                        Money.Builder.buildLocaleUS(2).withNext(
                                                                new Banknotes.Print("MOEDAS:",
                                                                        Money.Builder.buildCoinsWithLocaleUS(1.00).withNext(
                                                                                Money.Builder.buildCoinsWithLocaleUS(0.50).withNext(
                                                                                        Money.Builder.buildCoinsWithLocaleUS(0.25).withNext(
                                                                                                Money.Builder.buildCoinsWithLocaleUS(0.10).withNext(
                                                                                                        Money.Builder.buildCoinsWithLocaleUS(0.05).withNext(
                                                                                                                Money.Builder.buildCoinsWithLocaleUS(0.01).get()
                                                                                                        ).get()
                                                                                                ).get()
                                                                                        ).get()
                                                                                ).get()
                                                                        ).get()
                                                                )
                                                        ).get()
                                                ).get()
                                        ).get()
                                ).get()
                        ).get()
                ).get());

        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        System.out.println(chains.execute(Double.valueOf(value)));
    }


    public static class Money extends Chain {

        private String type;
        private Locale locale;
        private double note;

        private Money() {
        }

        public String decomposed(double value) {
            int quotient;
            if(type.equals("moeda")) {
                double auxValue = value * 100;
                double auxNote = note * 100;
                quotient = (int) (auxValue / auxNote);
            }else {
                quotient = (int) (value / note);
            }
            BigDecimal bigQuotient = new BigDecimal(String.valueOf(quotient));
            BigDecimal bigNote = new BigDecimal(String.valueOf(note));
            BigDecimal bigValue = new BigDecimal(String.valueOf(value));

            BigDecimal rest = bigValue.subtract(bigQuotient.multiply(bigNote));
            StringBuilder sb = new StringBuilder(String.format(locale, "%d %s(s) de R$ %.2f", quotient, type, note));
            sb.append(callNext(rest.doubleValue()));
            return sb.toString();
        }

        public String execute(Object obj) {
            return decomposed((Double) obj);
        }

        public static class Builder {
            private Money money;

            private Builder() {
            }

            public static Builder build(double value) {
                Builder builder = new Builder();
                Money money = new Money();
                money.addNext(null);
                money.type = "nota";
                money.note = value;
                money.locale = new Locale("pt", "BR");
                builder.money = money;
                return builder;
            }

            public static Builder buildLocaleUS(double value) {
                return build(value).withLocale(Locale.US);
            }

            public static Builder buildCoinsWithLocaleUS(double value) {
                return build(value).withLocale(Locale.US).withType("moeda");
            }

            public Money get() {
                return money;
            }

            public Builder withValue(double value) {
                money.note = value;
                return this;
            }

            public Builder withType(String type) {
                money.type = type;
                return this;
            }

            public Builder withLocale(Locale locale) {
                money.locale = locale;
                return this;
            }

            public Builder withNext(Chain next) {
                money.addNext(next);
                return this;
            }

        }

    }

    public static class Print extends Chain {

        private final String value;

        public Print(String value, Chain money) {
            this.value = value;
            addNext(money);
        }

        public String execute(Object obj) {
            StringBuilder sb = new StringBuilder(value);
            sb.append(callNext(obj));
            return sb.toString();
        }
    }

    public static abstract class Chain {

        private Chain next;

        public Chain addNext(Chain next) {
            this.next = next;
            return next;
        }

        public abstract String execute(Object obj);

        public String callNext(Object obj) {
            StringBuilder sb = new StringBuilder();
            if (next != null) {
                sb.append("\n" + next.execute(obj));
            }
            return sb.toString();
        }

    }
}
