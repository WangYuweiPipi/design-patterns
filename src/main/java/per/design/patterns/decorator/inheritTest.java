package per.design.patterns.decorator;

/**
 * 只通过继承方式实现扩展（与装饰者模式做对比）
 * 问：如果此时我需要加2个鸡蛋、2根香肠该如何实现
 */
public class inheritTest {

    public static void main(String[] args) {
        // 获得原味煎饼果子
        BatterCake batterCake = new BatterCake();
        batterCake.desc();

        // 获得加鸡蛋煎饼果子
        BatterCake eggBatterCake = new EggBatterCake();
        eggBatterCake.desc();

        // 获得加香肠煎饼果子
        BatterCake sausageBatterCake= new SausageBatterCake();
        sausageBatterCake.desc();



    }
}

/**
 * 父类 - 煎饼果子
 */
class BatterCake {

    void desc() {
        System.out.println("原味煎饼果子");
    }
}

/**
 * 子类 - 煎饼果子加一个鸡蛋
 */
class EggBatterCake extends BatterCake {

    @Override
    void desc() {
        System.out.println("原味煎饼果子+一个鸡蛋");
    }
}

/**
 * 子类 - 煎饼果子加一根香肠
 */
class SausageBatterCake extends BatterCake {

    @Override
    void desc() {
        System.out.println("原味煎饼果子+一根香肠");
    }
}