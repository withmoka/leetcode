package com.sxt.test.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFile {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/momochan/IdeaProjects/practice/src/com/sxt/test/file/here_is_a_text.txt");
        System.out.println(f);
        File f2 = new File("/Users/momochan/IdeaProjects/50hs");// 也可以放目录
        System.out.println(System.getProperty("user.dir")); // 项目所在路径
        File f3 = new File(System.getProperty("user.dir"));

        File f4 = new File("lalo.txt");
        f4.createNewFile(); // 默认存到了项目路径下

        System.out.println("是否存在：" + f4.exists());
        System.out.println("是文件吗：" + f4.isFile());
        System.out.println("是目录吗：" + f4.isDirectory());
        System.out.println("最后修改时间：" + new Date(f.lastModified()));
        System.out.println("文件大小：" + f4.length());
        System.out.println("文件名：" + f4.getName());
        System.out.println("目录路径：" + f4.getPath());

        File dir = new File("/Users/momochan/IdeaProjects/practice/try_text/test");
        dir.mkdirs();

    }
}
