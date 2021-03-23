package per.design.patterns.factory;

/**
 * 工厂方法设计模式
 */
public class Factory {

    public static void main(String[] args) {

        // 获得红车
        CarFactory redFactory = new RedCarFactory();
        RedCar redCar = (RedCar) redFactory.createCar();
        redCar.amI();

        // 获得黄车
        CarFactory yellowFactory = new YellowCarFactory();
        YellowCar yellowCar = (YellowCar) yellowFactory.createCar();
        yellowCar.amI();
    }
}

/**
 * 抽象工厂类 - 汽车工厂
 */
interface CarFactory {
    Car createCar();
}

/**
 * 具体工厂类 - 红汽车工厂
 */
class RedCarFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new RedCar();
    }
}

/**
 * 具体工厂类 - 黄汽车工厂
 */
class YellowCarFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new YellowCar();
    }
}


/**
 * 抽象产品类 - 车
 */
class Car {
    public void amI() {
        System.out.println("车");
    }
}

/**
 * 具体产品 - 红车
 */
class RedCar extends Car {
    @Override
    public void amI() {
        System.out.println("红车");
    }
}

/**
 * 具体产品 - 黄车
 */
class YellowCar extends Car {
    @Override
    public void amI() {
        System.out.println("黄车");
    }
}