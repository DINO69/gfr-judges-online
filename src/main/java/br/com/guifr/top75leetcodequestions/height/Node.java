package br.com.guifr.top75leetcodequestions.height;

public class Node {

    int val;
    Node left;
    Node right;

    public Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {

        Node n6 = new Node(6, null, null);
        Node n4 = new Node(4, null, null);
        Node n5 = new Node(5, null, n6);
        Node n2 = new Node(2, n4, n5);
        Node n3 = new Node(3, null, null);
        Node n1 = new Node(1, n2, n3);

        Assert(new HeightBFS(),null,0);
        Assert(new HeightBFS(),n1,4);
        Assert(new HeightBFS(),n3,1);
        Assert(new HeightBFS(),n6,1);
        Assert(new HeightBFS(),n4,1);
        Assert(new HeightBFS(),n2,3);
        Assert(new HeightBFS(),n5,2);
        System.out.println("All tests with HeightBFS passed !!!");

        Assert(new HeightDFS(),null,0);
        Assert(new HeightDFS(),n1,4);
        Assert(new HeightDFS(),n3,1);
        Assert(new HeightDFS(),n6,1);
        Assert(new HeightDFS(),n4,1);
        Assert(new HeightDFS(),n2,3);
        Assert(new HeightDFS(),n5,2);
        System.out.println("All tests with HeightDFS passed !!!");

    }

    private static void Assert(Height strategy, Node n1, int expected) {
        int result = strategy.calc(n1);
        if(result != expected)
            throw new RuntimeException(String.format("%s expected [%d] result [%d]",strategy.getClass().getSimpleName(), expected, result));
    }

}
