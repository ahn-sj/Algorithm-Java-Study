package study.jaeworkspace.baekjoon.w07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 트리 순회 (전위, 중위, 후위)
 */
public class NO1991 {
    static Node[] nodes;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        nodes = new Node[n];

        char A = 'A';

        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(A++);
        }

        for (int i = 0; i < n; i++) {
            char[] group = br.readLine().replace(" ", "").toCharArray();

            char key = group[0];
            char left = group[1];
            char right = group[2];

            int index = key - 'A';

            nodes[index].left = isDot(left);
            nodes[index].right = isDot(right);
        }

//        System.out.println(Arrays.toString(nodes));
        
        System.out.println(preOrder(nodes[0]));
        System.out.println(inOrder(nodes[0]));
        System.out.println(postOrder(nodes[0]));

        br.close();
    }

    private static StringBuilder postOrder(Node node) {
        StringBuilder sb = new StringBuilder();

        if(node.left != null) sb.append(postOrder(node.left));
        if(node.right != null) sb.append(postOrder(node.right));
        sb.append(node.key);

        return sb;
    }

    private static StringBuilder inOrder(Node node) {
        StringBuilder sb = new StringBuilder();

        if(node.left != null) sb.append(inOrder(node.left));
        sb.append(node.key);
        if(node.right != null) sb.append(inOrder(node.right));

        return sb;
    }

    private static StringBuilder preOrder(Node node) {
        StringBuilder sb = new StringBuilder();

        sb.append(node.key);
        if(node.left != null) sb.append(preOrder(node.left));
        if(node.right != null) sb.append(preOrder(node.right));

        return sb;
    }

    private static Node isDot(char value) {
        if(value == '.') return null;

//        return new Node(value);
        return nodes[value - 'A'];
    }
}

class Node {
    char key;
    Node left, right;

    public Node(char key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Node {" +
                "value=" + key +
                ", left=" + left +
                ", right=" + right +
                '}' + "";
    }
}