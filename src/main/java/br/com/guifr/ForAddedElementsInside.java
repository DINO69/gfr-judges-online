package br.com.guifr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForAddedElementsInside {


    public static void main(String[] args) {
        List<Field> subcategoryFields = new ArrayList<>();
        subcategoryFields.add(new Field("luanzão"));

        int currentIndex = 0;
        while (currentIndex < subcategoryFields.size()) {
            Field field = subcategoryFields.get(currentIndex);
            List<String> children = new ArrayList<>(Arrays.asList(field.getChildrenValue().split("")));

            System.out.println(field.getChildrenValue());

            if(children.size() > 1)
                children.forEach(childrenValue -> {
                    subcategoryFields.add(new Field(childrenValue));
                });

            currentIndex++;
        }

        //subcategoryFields.forEach(field -> System.out.println(field.getChildrenValue()));
    }

    public static void main2(String[] args) {


//        List<Field> subcategoryFields = new ArrayList<>();
//        subcategoryFields.add(new Field("luanzão"));
//        for (Field field : subcategoryFields) { // tenho a lista de fields
//            List<String> children = new ArrayList(Arrays.asList(field.getChildrenValue().split("")));
//
//            children.forEach(childrenValue -> {
//                    subcategoryFields.addAll(List.of(new Field(childrenValue)));
//            });
//        }

        List<Field> subcategoryFields = new ArrayList<>();
        subcategoryFields.add(new Field("luanzão"));
//        List<Field> newFields = new ArrayList<>();

        Iterator<Field> iterator = subcategoryFields.iterator();
        while (iterator.hasNext()) {
            Field field = iterator.next();
            List<String> children = new ArrayList<>(Arrays.asList(field.getChildrenValue().split("")));

            System.out.println(field.getChildrenValue());

            children.forEach(childrenValue -> {
                subcategoryFields.add(new Field(childrenValue));
            });
        }

        //subcategoryFields.addAll(newFields);



//        List<Integer> values = new ArrayList<>(List.of(2,3,4,5));
//
//        for(Integer value : values){
//            //imprimir todos os valoes menores e iguais que 10 e adicionar na lista seus quadrados
//            if(value <= 10){
//                System.out.println(value);
//                double pow = Math.pow(value, 2.0);
//                values.addAll(List.of((int)pow));
//            }
//        }

    }


    private static class Field {
        private String childrenValue;
        public Field(String childrenValue) {
            this.childrenValue = childrenValue;
        }

        public String getChildrenValue() {
            return childrenValue;
        }
    }

    private static class SubcategoryFields {
        private List<Field> fields;

        public List<Field> getFields() {
            return fields;
        }

        public void setFields(List<Field> fields) {
            this.fields = fields;
        }
    }
}
