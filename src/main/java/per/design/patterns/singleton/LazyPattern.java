package per.design.patterns.singleton;

/**
 * 懒汉模式，线程不安全
 *
 * 线程不安全原因：当并发访问的时候，第一个调用getInstance方法的线程t1，在判断完singleton是null的时候，线程A就进入了if块准备创造实例，但是同时另外一个线程B在线程A还未创造出实例之前，就又进行了singleton是否为null的判断，这时singleton依然为null，所以线程B也会进入if块去创造实例，这时问题就出来了，有两个线程都进入了if块去创造实例，结果就造成单例模式并非单例。
 *
 * 解决方法
 * 1. 在 getInstance() 方法上，加 synchronized 锁（粗粒度）
 *
 */
public class LazyPattern {

    private static LazyPattern lazyPattern;

    private LazyPattern(){}

    public static LazyPattern getInstance() {

        if (lazyPattern == null) {
            return new LazyPattern();
        }
        return lazyPattern;
    }

    public static void main(String[] args) {
        LazyPattern test1 = LazyPattern.getInstance();
        LazyPattern test2 = LazyPattern.getInstance();
        System.out.println(test1 == test2);

        for (int i = 0; i < 50; i++) {
            Thread thread = new Thread(() -> System.out.println(LazyPattern.getInstance().hashCode()));
            thread.start();
        }
    }
}
