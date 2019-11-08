package com.heap;

import java.util.Arrays;

public class MinMeetingRooms {
	/**
	 * 	252.给定一个会议时间安排的数组，每个会议时间都会包括开始和结束时间[[s1,e1],[s2,e2],...](si < ei), 
	 * 	为避免会议冲突，同时需要考虑充分利用会议室资源， 请你计算至少需要多少间会议室，才能满足这些会议安排。
	 * 
	 * 	输入：[[0, 30], [5, 10], [15, 20]]
	 * 	输出:   2
	 * 
	 * 	输入：[[7, 10], [2, 4]]
	 * 	输出：1
	 */
	 public int minMeetingRooms(int[][] intervals) {
		 if(intervals == null || intervals.length == 0) {
			 return 0;
		 }
		 int n = intervals.length;
		 int[] start = new int[n];
		 int[] end = new int[n];
		 for(int i = 0; i < n; ++i) {
			 start[i] = intervals[i][0];
			 end[i] = intervals[i][1];
		 }
		 Arrays.sort(start);
		 Arrays.sort(end);
		 int s = 0, e = 0;
		 for(; s < n; s++) {
			 if(end[e] <= start[s]) {//最多使用n个会议室，如果两个会议时间是岔开的，就可以少用一个会议室
				 e++;//计算有多少个会议的时间是岔开的
			 }
		 }
		 return s - e;
	 }
	
}
