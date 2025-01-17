package br.com.guifr.top75leetcodequestions.height;

public class HeightDFS implements Height {
    @Override
    public int calc(Node n) {

        if(n == null) return 0;

        return 1 + Math.max(calc(n.left),calc(n.right));
    }
}
