package br.com.guifr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Stream;

public class Lixo {

    public static void main(String[] args) {

        String str = "gui";

        String[] split = str.split("\\S");
        System.out.println(split.length);
        int[] num = {1, 2, 3, 4, 5};
        for (int j = 0, i = j; i < num.length; ++i) {
            System.out.println(num[i]);
        }
        ArrayList<String> list = new ArrayList<>();
        list.add("gui");
        list.add("gui");
        list.add(2, "gui");

        Path a = Path.of("a");
        a.resolve("b");
        System.out.println(a + " " + a.resolve("b"));

        Stream.iterate(1, i -> i + 1).limit(10).forEach(System.out::println);

    }

}
