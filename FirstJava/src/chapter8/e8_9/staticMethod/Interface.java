package chapter8.e8_9.staticMethod;

/**
 * 方法引用接口
 * @param <P> 引用方法的参数类型
 * @param <R> 引用方法的返回类型
 */
@FunctionalInterface
public interface Interface<P, R> {
    R transform(P p);
}
