package br.com.guifr.hackerrank.preparationkit.threemonth.weeknine;

import java.util.*;

public class SimpleTextEditor {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int tests = Integer.parseInt(scanner.nextLine());
        scannerAndProcess(tests).forEach(System.out::println);
    }

    public static List<String> scannerAndProcess(int tests) {
        ResultSimpleTextEditor result = new ResultSimpleTextEditor();
        while (tests-- > 0) {
            process(scanner.nextLine(), result);
        }
        return result.getPrints();
    }

    public static List<String> with(List<String> ops) {
        ResultSimpleTextEditor result = new ResultSimpleTextEditor();
        for (String op : ops) {
            process(op, result);
        }

        return result.getPrints();
    }

    private static void process(String op, ResultSimpleTextEditor result) {
        String[] values = op.split(" ");
        String type = values[0];

        ProcessText process = choiceProcess(type);

        process.execute(op, result);

    }

    protected static ProcessText choiceProcess(String type) {
        switch (type) {
            case "1":
                return new ProcessTypeAppend();
            case "2":
                return new ProcessTypeDelete();
            case "3":
                return new ProcessTypePrint();
            case "4":
                return new ProcessTypeUndo();
        }
        return null;
    }

    protected interface ProcessText {
        void execute(String op, ResultSimpleTextEditor result);
    }

    protected static class ResultSimpleTextEditor {

        private StringBuilder s;
        private Deque<String> stack;
        private List<String> print;

        public ResultSimpleTextEditor() {
            this.s = new StringBuilder();
            this.stack = new ArrayDeque<>();
            this.print = new ArrayList<>();
        }

        protected void addInStack(String s) {
            stack.push(s);
        }

        public int lengthStack() {
            return stack.size();
        }

        public String getString() {
            return s.toString();
        }

        public void appendText(String text) {
            addInStack(s.toString());
            s.append(text);
        }

        public void deleteLastChars(int delChars) {
            int endPosition = s.length();
            addInStack(s.toString());
            s.delete(endPosition - delChars, endPosition);
        }

        public List<String> getPrints() {
            return print;
        }

        public void addToPrint(int positionInString) {
            print.add(String.valueOf(s.charAt(positionInString)));
        }

        public void undoString() {
            s = new StringBuilder(stack.poll());
        }
    }

    protected static class ProcessTypeAppend implements ProcessText {
        @Override
        public void execute(String op, ResultSimpleTextEditor result) {
            String[] values = op.split(" ");
            String text = values[1];
            result.appendText(text);
        }
    }

    protected static class ProcessTypeDelete implements ProcessText {
        @Override
        public void execute(String op, ResultSimpleTextEditor result) {
            String[] values = op.split(" ");
            int delChars = Integer.parseInt(values[1]);
            result.deleteLastChars(delChars);
        }
    }

    protected static class ProcessTypePrint implements ProcessText {
        @Override
        public void execute(String op, ResultSimpleTextEditor result) {
            String[] values = op.split(" ");
            int positionInString = Integer.parseInt(values[1]) - 1;
            result.addToPrint(positionInString);
        }
    }

    protected static class ProcessTypeUndo implements ProcessText {

        @Override
        public void execute(String op, ResultSimpleTextEditor result) {
            result.undoString();
        }

    }
}
