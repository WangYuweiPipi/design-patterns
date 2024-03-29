# 工厂模式
所谓工厂模式，简单的来说，就是自己不再主动创建对象，而是让工厂来帮我们创建对象。
通常工厂提供一个getObject()方法，程序员调用这个方法来获取自己实际想要的对象。
这样的好处是什么呢？简单来说 ，就是方便扩展。

## 简单工厂模式 - SimpleFactory.java
一个工厂方法，依据传入的参数，生成对应的产品对象；
#### 角色
抽象产品、具体产品、具体工厂、产品使用者
#### 用例
将产品类抽象出来。比如，苹果和梨都属于水果，抽象出来一个水果类Fruit，苹果和梨就是具体的产品类，然后创建一个水果工厂，分别用来创建苹果和梨
#### 存在问题
每当想添加一种水果，就必然要修改工厂类，违反了开闭原则。简单工厂只适合于产品对象少且产品固定的需求


## 工厂方法模式 - Factory.java
将工厂提取成一个接口或抽象类，具体生产什么产品由子类决定

#### 角色
抽象产品类、具体产品类、抽象工厂类、具体工厂类

#### 用例
和上例中一样，将工厂提取成一个接口或抽象类，具体生产什么产品由子类决定

#### 存在问题
此设计虽然解耦了，也遵循了开闭原则，但未根本动态创建子类的问题


## 抽象工厂模式 - AbstractFactory.java
为创建一组相关或者是相互依赖的对象提供的一个接口，而不需要指定它们的具体类。
#### 角色
抽象产品类、具体产品类、抽象工厂类、具体工厂类
#### 用例
- 抽象工厂和工厂方法的模式基本一样，区别在于，工厂方法是生产一个具体的产品，而抽象工厂可以用来生产一组相同，有相对关系的产品；重点在于一组，一批，一系列；
- 举个例子，假如生产小米手机，小米手机有很多系列，小米note、红米note等；假如小米note生产需要的配件有825的处理器，6英寸屏幕，而红米只需要650的处理器和5寸的屏幕就可以了
#### 使用范围
抽象工厂可以解决一系列的产品生产的需求，对于大批量，多系列的产品，用抽象工厂可以更好的管理和扩展

##总结
 - 对于简单工厂和工厂方法来说，两者的使用方式实际上是一样的，如果对于产品的分类和名称是确定的，数量是相对固定的，推荐使用简单工厂模式
 - 抽象工厂用来解决相对复杂的问题，适用于一系列、大批量的对象生产 