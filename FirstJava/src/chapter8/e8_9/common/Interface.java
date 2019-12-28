package chapter8.e8_9.common;

/**
 * 方法引用接口
 * @param <R> 引用方法的返回类型
 */
@FunctionalInterface
public interface Interface<R> {
    R upper();
}

