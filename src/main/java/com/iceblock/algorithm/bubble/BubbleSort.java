/**
 * 
 */
package com.iceblock.algorithm.bubble;

/**
 * @author YanLiang 冒泡排序
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] x = { 6, 2, 4, 1, 5, 9 };
		bubbleSort(x);
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

	/**
	 * @author yan.liang
	 * @date 2015年9月1日 下午11:08:17
	 * @Description 顺序排列一个数组
	 */
	public static void bubbleSort(int[] unsorted) {
		for (int i = 0; i < unsorted.length; i++) {
			/* 内循环，保证最小的数在第i个 */
			for (int j = i; j < unsorted.length; j++) {
				if (unsorted[i] > unsorted[j]) {
					/* 比较大小，并交换位置，大的放在后面 */
					int temp = unsorted[j];
					unsorted[j] = unsorted[i];
					unsorted[i] = temp;
				}
			}
		}
	}
}
