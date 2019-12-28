package chapter8.e8_9.specific;
/**
 * 方法引用接口
 * @param <P> 引用方法的参数类型
 */
@FunctionalInterface
public interface Interface<P> {
    int compare(P p1, P p2);
}
