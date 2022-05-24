class bt{
  int node;
  bt left;
  bt right;
  bt( int x ){
    node = x;
    left = null;
    right = null;
  }
}

public class binarytree {
    public static void main(String []args) {
      bt tree = new bt();
      tree.root = new bt(20);
      tree.root.right = new bt(30);
      System.out.println((int)root );
      System.out.println(root.left);
    }
}