package per.design.patterns.factory;

/**
 * 抽象工厂类
 */
public class AbstractFactory {

    public static void main(String[] args) {

        // 获得小米手机
        PhoneFactory xiaoMiPhoneFactory = new XiaoMiFactory();
        System.out.println("获取小米手机:");
        Cpu cpu = xiaoMiPhoneFactory.getCpu();
        cpu.run();
        Screen screen = xiaoMiPhoneFactory.getScreen();
        screen.size();

        // 获得红米手机
        PhoneFactory hongMiPhoneFactory = new HongMiFactory();
        System.out.println("获取红米手机:");
        hongMiPhoneFactory.getCpu().run();
        hongMiPhoneFactory.getScreen().size();
    }
}


/**
 * 抽象工厂类 - 手机工厂
 */
interface PhoneFactory {

    Cpu getCpu();

    Screen getScreen();
}

/**
 * 具体工厂类 - 小米手机工厂
 */
class XiaoMiFactory implements PhoneFactory {

    @Override
    public Cpu getCpu() {
        return new Cpu.Cpu650();
    }

    @Override
    public Screen getScreen() {
        return new Screen.Screen5();
    }
}

/**
 * 具体工厂类 - 红米手机工厂
 */
class HongMiFactory implements PhoneFactory {

    @Override
    public Cpu getCpu() {
        return new Cpu.Cpu825();
    }

    @Override
    public Screen getScreen() {
        return new Screen.Screen6();
    }
}


/**
 * 抽象产品类 - cpu
 */
interface Cpu {

    void run();

    /**
     * 具体产品类 - Cpu650
     */
    class Cpu650 implements Cpu {


        @Override
        public void run() {
            System.out.println("Cpu650 run");
        }
    }

    /**d
     * 具体产品类 - Cpu825
     */
    class Cpu825 implements Cpu {

        @Override
        public void run() {
            System.out.println("Cpu825 run");
        }
    }
}


/**
 * 抽象产品类 - 屏幕
 */
interface Screen {

    void size();

    /**
     * 具体产品类 - Screen5
     */
    class Screen5 implements Screen {

        @Override
        public void size() {
            System.out.println("5寸屏幕");
        }
    }

    /**
     * 具体产品类 - Screen6
     */
    class Screen6 implements Screen {

        @Override
        public void size() {
            System.out.println("6寸屏幕");
        }
    }

}
