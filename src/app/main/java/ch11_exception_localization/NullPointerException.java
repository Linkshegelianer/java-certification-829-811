public class NullPointerException {

    // 0, exception at runtime
    class Node{
        int id;
        Node node;
        public static void main(String[] args) {
            Node n =  new Node();
            System.out.println(n.id);
            System.out.println(n.node.id);
        }
    }

    but if you print null, everything will be fine
}