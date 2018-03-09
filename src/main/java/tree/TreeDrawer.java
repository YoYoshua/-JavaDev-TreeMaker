package main.java.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeDrawer
{
    public void drawTree(int height, String direction, char character)
    {
        //Prepared array of strings
        List<String> strings = new ArrayList<String>();

        switch(direction)
        {
            case "up":
                strings = prepareTreeVertical(height, character);

                //Loop for drawing tree
                for(int i = 0; i < strings.size(); i++)
                {
                    System.out.println(strings.get(i));
                }
                break;

            case "right":
                strings = prepareTreeHorizontal(height, character);

                //Loop for drawing tree
                for(int i = 0; i < strings.size(); i++)
                {
                    System.out.println(strings.get(i));
                }
                break;

            default:
                System.out.println("An error occured.");
                break;
        }
    }

    private List<String> prepareTreeHorizontal(int height, char character)
    {
        //Resulting array of Strings
        List<String> result = new ArrayList<String>();

        //Temporary string for every line
        String temp;

        //Tree basis
        int basis;
        if (height == 1) basis = 1;
        else basis = (height * 2) - 1;

        //Main loop for first part of drawing
        for(int i = 0; i < height; i++)
        {
            //Clear temporary String
            temp = new String();

            //Subloop drawing character
            for(int j = 0; j < i + 1; j++)
            {
                temp += character;
            }

            //Subloop adding blank spaces
            for(int j = 0; j < height - i + 1; j++)
            {
                temp += " ";
            }

            //Saving line
            result.add(temp);
        }

        //Main loop for second part of drawing
        for(int i = basis - height - 1; i >= 0; i--)
        {
            //Clone string
            result.add(result.get(i));
        }

        return result;
    }

    private List<String> prepareTreeVertical(int height, char character)
    {
        //Resulting array of Strings
        List<String> result = new ArrayList<String>();

        //Temporary string for every line
        String temp;

        //Tree basis
        int basis;
        if (height == 1) basis = 1;
        else basis = (height * 2) - 1;

        //Main loop drawing every loop of the tree
        for(int i = 0; i < height; i++)
        {
            //Clear string
            temp = new String();

            //Subloop drawing blank space on the left of the tree
            for(int j = 0; j < height - i - 1; j++)
            {
                temp += " ";
            }

            //Subloop drawing characters
            for(int j = 0; j < basis - (2 * (height - i - 1)); j++)
            {
                temp += character;
            }

            //Subloop drawing blank space on the right of the tree
            for(int j = 0; j < height - i - 1; j++)
            {
                temp += " ";
            }

            //Saving line
            result.add(temp);
        }

        return result;
    }


}
