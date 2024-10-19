package br.com.guifr.hackerrank;

public class KnowExpection {


    public static void execute(Class<?> classException) throws RuntimeException {

        if(classException == ArrayIndexOutOfBoundsException.class){
            throwArrayIndex();
        }

    }

    private static void throwArrayIndex() {
        int[] a = {1,2,3};

        try{
            a[3] = 3;
        }catch (ArrayIndexOutOfBoundsException ex){
            throw new ArrayIndexOutOfBoundsException("Access index impossible");
        }

    }

}
