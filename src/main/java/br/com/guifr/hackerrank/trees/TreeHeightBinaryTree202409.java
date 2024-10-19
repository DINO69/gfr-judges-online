package br.com.guifr.hackerrank.trees;


import java.util.Stack;

public class TreeHeightBinaryTree202409 {

    static class Node {
        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        int data;
        Node left;
        Node right;
    }


    public static int height(Node root) {

        return calcHeight2(root,0);

    }

    public static int heightLoop(Node root) {
        int level = -1;
        Stack<Node> nodes = new Stack<>();
        Stack<Node> nodesNext = new Stack<>();
        nodes.push(root);

        while(!nodes.isEmpty()){
            Node process = nodes.pop();
            if(process.left != null) nodesNext.push(process.left);
            if(process.right != null) nodesNext.push(process.right);

            if(nodes.isEmpty()){
                level++;
                nodes = nodesNext;
                nodesNext = new Stack<>();
            }
        }

        return level;
    }

    //recursive call
    private static int calcHeight2(Node root, int level) {
        int max = level;

        if(root == null) return 0;

        if(root.left != null || root.right != null){
            max = Math.max(calcHeight2(root.right,level+1), calcHeight2(root.left,level+1));
        }

//        if(root.right != null){
//            max = Math.max(max,calcHeight(root.right,level+1));
//        }

        return max;

    }

    public static int calcHeight1(Node root, int level) {
        int max = level;

        Node process = root.left;
        while(process != null){
            max = Math.max(max, calcHeight2(process,level+1));
            process = process.left;
        }

        process = root.right;
        while(process != null){
            max = Math.max(max, calcHeight2(process,level+1));
            process = process.right;
        }

        return max;

    }

    public static void main(String[] args) {
        Node root = new Node(3,
                new Node(1,null,null),
                new Node(7, new Node(5, new Node(4,null,null),null),null));
        System.out.println(height(root));
        System.out.println(heightLoop(root));
        System.out.println(calcHeight1(root,0));
        System.out.println(heightLoop(root)==height(root));
        System.out.println(calcHeight2(root,0)==calcHeight1(root,0));
    }


}
