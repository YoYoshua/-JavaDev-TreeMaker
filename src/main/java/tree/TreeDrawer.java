package main.java.tree;

public class TreeDrawer
{
    public void drawTree(int height, String direction, char character)
    {
        //Tree basis
        int basis;
        if (height == 1) basis = 1;
        else basis = (height * 2) - 1;

        //Main loop drawing every loop of the tree
        for(int i = 0; i < height; i++)
        {
            //Subloop drawing blank space on the left of the tree
            for (int j = 0; j < height - i - 1; j++)
            {
                System.out.print(" ");
            }

            //Subloop drawing characters
            for (int j = 0; j < basis - (2 * (height - i - 1)); j++)
            {
                System.out.print(character);
            }

            //Subloop drawing blank space on the right of the tree
            for (int j = 0; j < height - i - 1; j++)
            {
                System.out.print(" ");
            }

            //Moving to the next line
            System.out.println();
        }
    }
}
