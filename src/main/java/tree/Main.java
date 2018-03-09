package main.java.tree;

public class Main {

    public static void main(String[] args)
    {
        InputHandler handler = new InputHandler();
        TreeDrawer tree = new TreeDrawer();

        System.out.println(">How high should your tree be?");
        int height = handler.readInt();

        System.out.println(">Which character should your tree consist of?");
        String character = handler.readString();

        System.out.println(">In which direction should your tree be drawn?");
        String direction = handler.readString();

        tree.drawTree(height, direction, character.charAt(0));
    }
}
