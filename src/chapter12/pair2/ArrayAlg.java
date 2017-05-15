package chapter12.pair2;

import chapter12.pair1.Pair;


/**
 * @version 1.01 2017-05-06
 * @author Zhang Yufei
 */
class ArrayAlg {
	/**
	 * Gets the minimum and maximum of an array of objects of type T.
	 * 
	 * @param a
	 *            an array of objects of object T.
	 * @return a pair with the min and max value, or null if a is null or empty.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <T extends Comparable> Pair<T> minmax(
			T[] a) {
		if (a == null || a.length == 0)
			return null;
		T min = a[0];
		T max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (min.compareTo(a[i]) > 0) {
				min = a[i];
			}
			if (max.compareTo(a[i]) < 0) {
				max = a[i];
			}
		}

		return new Pair<>(min, max);
	}
}
