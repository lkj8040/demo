package com.algorithm;

/**
3、假设日期段用两个6位长度的正整数表示，例如：(201401，201406)用来表示2014年1月到2014年6月，
求两个日期段的重叠月份数。例如：输入：201401和201406，
201403和201409，输出：4
解释：重叠月份：3,4,5,6月共4个月

 */
public class DuplicatedMonth {
	public static int duplicatedMonth(int start1, int end1, int start2, int end2) {
		String start = start1 > start2 ? start1 + "":start2 + "";
		String end = end1 > end2 ? end2 + "":end1 + "";
		String year1 = start.substring(0, 4);
		String year2 = end.substring(0, 4);
		String month1 = start.charAt(4) == '0' ? start.substring(5) : start.substring(4);
		String month2 = end.charAt(4) == '0' ? end.substring(5) : end.substring(4);
		int yearStart = Integer.parseInt(year1);
		int yearEnd = Integer.parseInt(year2);
		int monthStart = Integer.parseInt(month1);
		int monthEnd = Integer.parseInt(month2);
		if (yearStart == yearEnd) {
			if (monthEnd - monthStart + 1 < 0) {
				return 0;
			}
			return monthEnd - monthStart + 1;
		} else if (yearStart < yearEnd) {
			return (yearEnd - yearStart - 1) * 12 + 12 - monthStart + 1 + monthEnd;
		} else {
			return 0;
		}

	}

	public static void main(String[] args) {
		System.out.println(duplicatedMonth(201901, 201906, 201903, 201909));
	}
}
