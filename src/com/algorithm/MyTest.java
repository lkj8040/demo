package com.algorithm;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class MyTest {

	@Test
	public void test3() throws UnsupportedEncodingException {
	    String str1 = "abc123中国";
	    byte[] bytes = str1.getBytes();//使用默认的字符集，进行编码。
	    System.out.println(Arrays.toString(bytes));
	
	    byte[] gbks = str1.getBytes("gbk");//使用gbk字符集进行编码。
	    System.out.println(Arrays.toString(gbks));
	
	    System.out.println("******************");
	
	    String str2 = new String(bytes);//使用默认的字符集，进行解码。
	    System.out.println(str2);
	
	    String str3 = new String(gbks);
	    System.out.println(str3);//出现乱码。原因：编码集和解码集不一致！
	
	
	    String str4 = new String(gbks, "gbk");
	    System.out.println(str4);//没出现乱码。原因：编码集和解码集一致！
	}
	
    @Test
    public void testExer() throws ParseException {
        String birth = "2020-09-08";

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(birth);
//        System.out.println(date);

        java.sql.Date birthDate = new java.sql.Date(date.getTime());
        System.out.println(birthDate);
    }
    @Test
    public void test() {
    	//拓展：数组 --->集合:调用Arrays类的静态方法asList(T ... t)
    	List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
    	System.out.println(list);

    	List arr1 = Arrays.asList(new int[]{123, 456});
    	System.out.println(arr1.size());//1

    	List arr2 = Arrays.asList(new Integer[]{123, 456});
    	System.out.println(arr2.size());//2
    }
    @Test
    public void test2() {
    	List<Integer> list = new ArrayList<>();
    	list.add(1);
    	list.add(2);
    	list.add(5);
    	Iterator<Integer> iterator = list.iterator();
    	while(iterator.hasNext()) {
    		System.out.println(iterator.next());
    	}
    }

}
