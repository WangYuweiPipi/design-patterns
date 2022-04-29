package per.design.patterns.singleton;


/**
 * 饿汉式线程安全（变种写法）
 */
public class EagerLoadAnother {

    private static final EagerLoadAnother  eagerLoadAnother;

    static {
        eagerLoadAnother = new EagerLoadAnother();
    }

    public static EagerLoadAnother getInstance() {
        return eagerLoadAnother;
    }

    public static void main(String[] args) {

        EagerLoadAnother test1 = EagerLoadAnother.getInstance();
        EagerLoadAnother test2 = EagerLoadAnother.getInstance();
        System.out.println(test1 == test2);

    }
}
