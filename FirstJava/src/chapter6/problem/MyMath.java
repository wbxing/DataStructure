package chapter6.problem;

/**
 * 编写应用程序，
 * 从命令行输入两个小数参数，求它们的商。
 * 要求程序中捕获NumberFormatException异常和ArithmeticException异常。
 */
public class MyMath {
    public int div(String x, String y) throws NumberFormatException, ArithmeticException {
    // 出现异常要交给被调用处出       
        int result = 0;
        int numa = Integer.parseInt(x);
        int numb = Integer.parseInt(y) ;
        result = numa / numb;       // 除法计算
        return result;
    }
}
