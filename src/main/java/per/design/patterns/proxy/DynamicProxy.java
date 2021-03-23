package per.design.patterns.proxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理设计模式
 */
public class DynamicProxy {

    public static void main(String[] args) {

        RealSubject realSubject = new RealSubject();

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSubject);
        // 获取代理对象
        Subject subject = (Subject) myInvocationHandler.getProxy();

        subject.applyVisa();


        /*
            使用反编译软件打开com.sun.proxy.$Proxy.1.class
            即输出jdk动态代理类文件
         */
        byte[] classFile = ProxyGenerator.generateProxyClass("com.sun.proxy.$Proxy.1", subject.getClass().getInterfaces());
        try {
            FileOutputStream out = new FileOutputStream("com.sun.proxy.$Proxy.1.class");
            out.write(classFile);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

/**
 * 抽象类 - 所有要签证的抽象类
 */
interface Subject {

    /**
     * 申请签证
     */
    void applyVisa();
}

/**
 * 具体类 - 委托人
 */
class RealSubject implements Subject {

    @Override
    public void applyVisa() {
        System.out.println("委托签证");
    }
}

/**
 * 代理类
 */
class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("代理 - 准备签证材料");

        Object object = method.invoke(target, args);

        System.out.println("代理 - 签证完毕");

        return object;
    }

    /**
     * Proxy.newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
     * loader - 用哪个类加载器去加载代理对象
     * interface - 动态代理类需要实现的接口
     * h - 动态代理方法在执行时，会调用h里面的invoke方法去执行
     * @return
     */
    public Object getProxy() {

        // 类加载器
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        // getInterfaces() - 获取这个对象所有实现接口
        Class<?> [] interfaces = target.getClass().getInterfaces();

        /*
        Proxy.newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
        loader - 用哪个类加载器去加载代理对象
        interface - 动态代理类需要实现的接口
        h - 动态代理方法在执行时，会调用h里面的invoke方法去执行
        */
        return Proxy.newProxyInstance(classLoader, interfaces, this);
    }
}
