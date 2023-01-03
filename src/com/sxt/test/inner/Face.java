package com.sxt.test.inner;

public class Face {
    private String shape = "国字脸";

    /**
     * 内部类完全依附于外部类
     */

    class Nose {
        private String shape = "高鼻梁";

        public void breath() {
            System.out.println(shape + "鼻子长在了" + Face.this.shape + "形状的脸上");
        }
    }

    public static void main(String[] args) {
        Face.Nose nose = new Face().new Nose();
        nose.breath(); // 高鼻梁鼻子长在了国字脸形状的脸上
    }
}
