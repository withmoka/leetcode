package com.sxt.test.dirctor;

import java.io.File;

/**
 * 递归打印目录树
 * "/Users/momochan/charpter2/huawei"
 */

public class TreeTest {
    public static void main(String[] args) {
        File file = new File("/Users/momochan/charpter2/huawei");
        printFile(file, 0);

    }

    public static void printFile(File file, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        // 只要目录和.class文件
        if (file.isDirectory() || file.getName().endsWith(".class")) {
            System.out.println(file.getName());
        }
        if (file.isDirectory()) {
            File files[] = file.listFiles();
            for (File f : files) {
                printFile(f, level + 1);
            }
        }
    }
}
