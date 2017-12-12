package com.example.ilijaangeleski.homifytask;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Ilija Angeleski on 12/12/2017.
 */

public class Exercise2Test {

    @Test
    public void happyTest() {
        int[][] image = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 5, 0, 0},
                {0, 0, 0, 0, 5, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 5, 0, 0, 0, 5, 0},
                {0, 5, 0, 0, 0, 5, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 5, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 5}
        };

        replace(image, 2, 4, 7);
        Assert.assertTrue(image[2][4] == 7);
        Assert.assertTrue(image[1][4] == 7);

        System.out.println(Arrays.deepToString(image).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
    }

    @Test
    public void testEdgeCase() {
        int[][] image = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 5, 0, 0},
                {0, 0, 0, 0, 5, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 5, 0, 0, 0, 5, 0},
                {0, 5, 0, 0, 0, 5, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 5, 0, 0, 5},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 5}
        };

        replace(image, 5, 9, 7);
        Assert.assertTrue(image[5][9] == 7);
        Assert.assertTrue(image[4][9] == 7);

        System.out.println(Arrays.deepToString(image).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
    }

    private void replace(int[][] image, int x, int y, int color) {
        int y_length = image.length;
        int x_length = image[0].length;

        for (int y_cord = 0; y_cord < y_length; y_cord++) {
            for (int x_cord = 0; x_cord < x_length; x_cord++) {
                if (y_cord == x && x_cord == y) {
                    int replaceColor = image[y_cord][x_cord];
                    image[y_cord][x_cord] = color;
                    int found_x = x_cord - 1;
                    int found_y = y_cord - 1;
                    for (int y_k = found_y; y_k < found_y + 2; y_k++) {
                        for (int x_k = found_x; x_k < x_cord + 2; x_k++) {
                            if (y_k < y_length
                                    && x_k < x_length
                                    && image[y_k][x_k] == replaceColor
                                    ) {
                                image[y_k][x_k] = color;
                            }
                        }
                    }
                }
            }
        }
    }
}
