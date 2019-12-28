package chapter6.e6_6;

public class RuntimeException {
    public static void main(String[] args) {
        /*
         * 所有 RuntimeException 的子类都可以选择性的处理
         * parseInt() throws NumberFormatException
         * NumberFormatException extends RuntimeException
         * 使用 parseInt() 方法，不处理异常，编译正常通过
         */
        int temp = Integer.parseInt("100");     // 此处可以直接转换，不需要处理异常
        System.out.println(temp);
    }
}
