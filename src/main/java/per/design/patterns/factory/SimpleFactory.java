package per.design.patterns.factory;


/**
 * 设计模式 - 简单工厂设计模式
 */
public class SimpleFactory {

    public static void main(String[] args) {

        FruitFactory factory = new FruitFactory();

        // 获得苹果
        Apple apple = (Apple) factory.createFruit("apple");
        apple.eated();

        // 获得橘子
        Orange orange = (Orange) factory.createFruit("orange");
        orange.eated();

    }

}

/**
 * 具体工厂类
 * 工厂方法：根据type实现不同对象的生成
 */
class FruitFactory {

    public SimpleFactoryFruit createFruit(String type) {

        if ("apple".equals(type)) {

            return new Apple();

        } else if ("orange".equals(type)) {

            return new Orange();
        }

        return null;
    }
}

/**
 * 抽象产品 - 水果
 */
interface SimpleFactoryFruit {

    void eated();
}

/**
 * 具体产品 - 苹果
 */
class Apple implements SimpleFactoryFruit {

    @Override
    public void eated() {
        System.out.println("吃苹果");
    }
}

/**
 * 具体产品 - 橘子
 */
class Orange implements SimpleFactoryFruit {

    @Override
    public void eated() {
        System.out.println("吃橘子");
    }
}

