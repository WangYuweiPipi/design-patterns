package per.design.patterns.singleton;

/**
 * 饿汉模式
 * 线程安全的
 */
class EagerLoad {

    private static final EagerLoad eagerLoad = new EagerLoad();

    /**
     * private构造函数，保证类的实例化不对外开放
     */
    private EagerLoad() {}

    public static EagerLoad getInstance() {
        return eagerLoad;
    }
}


class EagerLoadDemo{


    public static void main(String[] args) {

        EagerLoad a = EagerLoad.getInstance();
        EagerLoad b = EagerLoad.getInstance();

        System.out.println(a == b);
    }
}