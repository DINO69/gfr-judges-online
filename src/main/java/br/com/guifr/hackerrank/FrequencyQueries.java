package br.com.guifr.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FrequencyQueries {

    public static List<Integer> of(List<List<Integer>> queries) {

        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> values = new HashMap<>();
        for (List<Integer> operations : queries) {

            int action = operations.get(0);
            int value = operations.get(1);

            if (action == 1) {
                new ActionOne().execute(values, value);
            } else if (action == 2) {
                new ActionTwo().execute(values, value);
            } else if (action == 3) {

                boolean check /*= values.values()
                        .stream()
                        .collect(Collectors.toSet())
                        .stream()
                        .anyMatch(q -> q == value)*/;

                check = values.containsValue(value);

                result.add(check ? 1 : 0);

            }

        }

        return result;
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
                    values.put(value, quantity);
            }
        }
    }

}
