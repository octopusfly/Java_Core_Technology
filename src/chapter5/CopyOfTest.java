package chapter5;

import java.lang.reflect.*;
import java.util.*;

/**
 * This program demonstrates the use of reflection of manipulating arrays.
 * 
 * @version 1.2 2016-12-06
 * @author Zhang Yufei
 */
public class CopyOfTest {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        a = (int[]) goodCopyOf(a, a.length);
        System.out.println(Arrays.toString(a));

        String[] b = { "Tom", "Dick", "Harry" };
        b = (String[]) goodCopyOf(b, b.length);
        System.out.println(Arrays.toString(b));

        System.out.println("The following call will generate a exception");
        b = (String[]) badCopyOf(b, b.length);
    }

    /**
     * This method attempts to grow an array by allocating a new array and
     * copying all elements.
     * 
     * @param a
     *            the array to grow
     * @param newLength
     *            the new length
     * @return a larger array that contains all elements of a. However, the
     *         returned array has type Object[], not the same as a.
     */
    public static Object[] badCopyOf(Object[] a, int newLength) {// not useful
        Object[] newArray = new Object[newLength];
        System.arraycopy(a, 0, newArray, 0, newLength);
        return newArray;
    }
    
    @SuppressWarnings("rawtypes")
    public static Object goodCopyOf(Object a, int newLength) {
        Class cl = a.getClass();
        if (! cl.isArray()) {
            return null;
        }
        
        Class componentType = cl.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, length);
        System.arraycopy(a, 0, newArray, 0, newLength);
        
        return newArray;
    }
}
