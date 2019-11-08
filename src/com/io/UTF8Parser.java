package com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @function 将批量的gbk的乱码文件转换到utf8
 *           将gbk的代码放到srcDir之下，转码置destDir之下，不支持srcDir之下有目录，srcDir目录与destDir目录不能一样
 * @author Jacksile E-mail:tufujietec@foxmail.com
 * @date 2016年1月16日 下午3:02:07
 */
public class UTF8Parser {

    static File srcDir = new File("F:\\DailyExercise"); // 待转码的GBK格式文件夹
    static File destDir = new File("F:\\exercise"); // 转码成UTF8的目标文件夹

    public static void main(String[] args) {
        // 1.判断是目录
        if (!srcDir.isDirectory()) {
            return;
        }
        // 2.遍历所有目录
        File[] fs = srcDir.listFiles();

        // 创建目标目录
        if (!destDir.exists()) {
            destDir.mkdirs();
        }

        try {
            new UTF8Parser().parse(fs);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 目录就迭代遍历；文件就重编码
     */
    private void parse(File[] fs) throws IOException {
        for (File file : fs) {
            if (!file.isDirectory()) {
                File destFile = new File(destDir, file.getName());
                parse2UTF_8(file, destFile);
            } else {
                parse(file.listFiles());
            }
        }
    }

    /** 
     */
    private void parse2UTF_8(File file, File destFile) throws IOException {
        StringBuffer msg = new StringBuffer();
        // 读写对象
        PrintWriter ps = new PrintWriter(new OutputStreamWriter(new FileOutputStream(destFile,
                false), "utf8"));
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),
                "gbk"));

        // 读写动作
        String line = br.readLine();
        while (line != null) {
            msg.append(line).append("\r\n");
            line = br.readLine();
        }
        ps.write(msg.toString());
        br.close();
        ps.flush();
        ps.close();
    }

}