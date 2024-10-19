package br.com.guifr.hackerrank;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyQueries {

    public static List<Integer> of(List<List<Integer>> queries) {

        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> values = new HashMap<>();
        Map<Integer, Integer> frequencies = new HashMap<>();
        for (List<Integer> operations : queries) {

            int action = operations.get(0);
            int value = operations.get(1);
            Integer oldFrequency = values.getOrDefault(value, 0);

            if (action == 3) {
                boolean check;
                check = frequencies.get(value) != null;
                result.add(check ? 1 : 0);
            } else {
                builderAction(action).execute(values, value);
                minusFrequency(frequencies, oldFrequency);
                Integer frequency = values.getOrDefault(value, 0);
                if (frequency > 0) plusFrequency(frequencies, frequency);
            }

        }

        return result;
    }

    protected static Actions builderAction(int action) {
        if (action == 1)
            return new ActionOne();
        if (action == 2)
            return new ActionTwo();
        return null;
    }

    protected static void minusFrequency(Map<Integer, Integer> frequencies, int frequency) {
        int valuesInFrenquency = frequencies.getOrDefault(frequency, 0).intValue() - 1;
        if (valuesInFrenquency > 0) {
            frequencies.put(frequency, valuesInFrenquency);
        } else {
            frequencies.remove(frequency);
        }
    }

    protected static void plusFrequency(Map<Integer, Integer> frequencies, int frequency) {
        int amountFrenquency = frequencies.getOrDefault(frequency, 0) + 1;
        frequencies.put(frequency, amountFrenquency);
    }

    interface Actions {
        void execute(HashMap<Integer, Integer> values, Integer data);
    }

    static class ActionOne implements Actions {
        @Override
        public void execute(HashMap<Integer, Integer> values, Integer value) {
            Integer quantity = values.get(value);
            if (quantity == null) {
                quantity = 0;
            }

            values.put(value, ++quantity);

        }
    }

    static class ActionTwo implements Actions {
        @Override
        public void execute(HashMap<Integer, Integer> values, Integer value) {
            Integer quantity = values.get(value);
            if (quantity != null && quantity > 0) {
                --quantity;
                if (quantity > 0)
                    values.put(value, quantity);
                else
                    values.remove(value);
            }
        }
    }

}
