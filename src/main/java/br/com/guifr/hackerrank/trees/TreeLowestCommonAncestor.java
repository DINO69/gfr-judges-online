package br.com.guifr.hackerrank.trees;

import br.com.guifr.hackerrank.trees.Trees.Node;

import java.util.Arrays;
import java.util.List;

public class TreeLowestCommonAncestor {


    public static int of(Node root, int v1, int v2) {

        int result = -1;

        while (root != null) {

            if (v1 > root.data && v2 > root.data) {
                root = root.right;
            } else if (v1 < root.data && v2 < root.data) {
                root = root.left;
            } else {
                return root.data;
            }
        }

        return result;
    }

    public static int ofRecursion(Node root, int v1, int v2) {

        List<Integer> searches = Arrays.asList(v1, v2);

        if (root.right != null) {
            if (v1 > root.data && v2 > root.data) {
                return ofRecursion(root.right, v1, v2);
            }
        }
        if (root.left != null) {
            if (v1 < root.data && v2 < root.data) {
                return ofRecursion(root.left, v1, v2);
            }
        }

        return root.data;
    }
}
