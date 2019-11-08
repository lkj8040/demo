package com.algorithm;

/**
1、编写代码完成如下功能
public static String replace(String text, String target, String replace){
....
}
示例：replace(“aabbccbb”, “bb”, “dd”);  结果：aadccdd
注意：不能使用String及StringBuffer等类的replace等现成的替换API方法。
*/
public class StringReplace {
	public static String replace(String text, String target, String replace){
		String result = "";
		for(int i = 0; i <= text.length() - target.length(); i++) {
			if(text.substring(i, i + target.length()).equals(target)) {
				result += replace;
				i += target.length() - 1;
			}else {
				result += text.charAt(i);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(replace("aabbccbb","bb","dd"));
	}
}
