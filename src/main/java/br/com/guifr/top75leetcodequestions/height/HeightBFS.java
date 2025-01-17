package br.com.guifr.top75leetcodequestions.height;

import java.util.ArrayDeque;
import java.util.Deque;

public class HeightBFS implements Height {

    @Override
    public int calc(Node n) {
        int result = 0;
        if(n == null) return result;

        Node nextH = n;
        Deque<Node> queue = new ArrayDeque<>();

        queue.add(n);
        while(!queue.isEmpty()){
            Node peek = queue.poll();

            if(peek == nextH || nextH == null){
                nextH = null;
                if(peek.right != null)
                    nextH = peek.right;
                if(peek.left != null)
                    nextH = peek.left;
                result++;

                if(nextH == null && queue.peek() != null){
                    nextH = queue.peek();
                    result--;
                }

            }

            if(peek.left != null) queue.add(peek.left);
            if(peek.right != null) queue.add(peek.right);

        }

        return result;
    }

}
