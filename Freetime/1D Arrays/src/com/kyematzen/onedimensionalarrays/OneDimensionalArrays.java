package com.kyematzen.onedimensionalarrays;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.SplittableRandom;

/**
 * Copyright 2020, Kye Matzen, http://kyematzen.com
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the
 * Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
 * and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR
 * ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH
 * THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

public class OneDimensionalArrays {

    // Starting position for compiler program execution
    public static void main(String[] args) {

        // Initializes instance of SplittableRandom.
        SplittableRandom splittableRandom = new SplittableRandom();

        // Initializes intArray to a random size from 1-500.
        int[] intArray = new int[splittableRandom.nextInt(1, 200)];

        // Initializes local variable intArraySize to the length of intArray to save time when randomly picking value up to it.
        int intArraySize = intArray.length;

        // Loops through each index of intArray and assigns values randomly up to the length of intArray.
        for (int i = 0; i < intArraySize; i++) {
            intArray[i] = splittableRandom.nextInt(intArraySize);
        }

        // Uses Arrays.stream(array) to return a IntStream and uses method sum() to calculate total of all integers inside.
        int sum = Arrays.stream(intArray).sum();

        // Creates localized variable used to output sum of all values combined.
        String sumStr = "Sum of " + intArraySize + " integers: ";

        // Checks whether or not our sum is greater than 1000.
        if (sum > 1000) {
            // Sum is greater than 1,000 we'll use DecimalFormat to format our sum value with commas.
            // Formats string based on pattern #,###. Example 1,793.
            sumStr = sumStr + new DecimalFormat("#,###").format(sum);
        } else {
            // Sum less than 1000, convert from int to String.
            sumStr = sumStr + sum;
        }

        // Prints sum of all values combined.
        System.out.println(sumStr);

        // End of compiler program execution
    }
}