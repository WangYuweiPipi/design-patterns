package per.design.patterns.decorator;

/**
 * 装饰者设计模式
 */
public class DecoratorTest {

    public static void main(String[] args) {

        Cake cake;
        cake = new BatterCakeSubject();
        BatterCakeDecorator batterCakeDecorator = new BatterCakeDecorator(cake);
        batterCakeDecorator = new EggBatterCakeDecorator(batterCakeDecorator);
        batterCakeDecorator = new EggBatterCakeDecorator(batterCakeDecorator);
        batterCakeDecorator = new SausageBatterCakeDecorator(batterCakeDecorator);

        System.out.println(batterCakeDecorator.desc());


    }
}

/**
 * 抽象类 - 煎饼
 */
abstract class Cake {
    abstract String desc();
}

/**
 * 具体实现类 - 煎饼果子
 */
class BatterCakeSubject extends Cake {

    @Override
    String desc() {
        return "实体煎饼果子";
    }
}

/**
 * 装饰类 - 煎饼果子
 */
class BatterCakeDecorator extends Cake {

    private Cake cake;

    public BatterCakeDecorator(Cake cake) {
        this.cake = cake;
    }


    @Override
    String desc() {
        return cake.desc();
    }
}

/**
 * 具体装饰类 - 加鸡蛋
 */
class EggBatterCakeDecorator extends BatterCakeDecorator {

    public EggBatterCakeDecorator(BatterCakeDecorator batterCakeDecorator) {
        super(batterCakeDecorator);
    }

    @Override
    String desc() {
        return super.desc() + "加一个鸡蛋";
    }
}

/**
 * 具体装饰类 - 加香肠
 */
class SausageBatterCakeDecorator extends BatterCakeDecorator {

    public SausageBatterCakeDecorator(BatterCakeDecorator batterCakeDecorator) {
        super(batterCakeDecorator);
    }

    @Override
    String desc() {
        return super.desc() + "加一根香肠";
    }
}


