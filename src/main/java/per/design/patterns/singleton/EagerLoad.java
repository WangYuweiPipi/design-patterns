package per.design.patterns.singleton;

/**
 * 饿汉模式
 */
class EagerLoad {

    private static EagerLoad eagerLoad = new EagerLoad();

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