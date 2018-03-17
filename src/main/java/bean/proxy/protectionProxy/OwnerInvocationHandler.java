package main.java.bean.proxy.protectionProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Yang on 2018/2/8.
 * 步骤一：
 * 创建两个InvocationHandler,当代理的方法被调用时，代理就会把这个调用转发给InvocationHandler,但是这并不是通过调用InvocationHandler的相应方法做到的。
 */
public class OwnerInvocationHandler implements InvocationHandler {
    PersonBean personBean;

    public OwnerInvocationHandler(PersonBean personBean) {  //将PersonBean传入构造器，保持引用
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().startsWith("get")) {     //自己 能调用get、以及set开头的方法
                return method.invoke(personBean, args);
            } else if (method.getName().equals("setHotOrNotRating")) {  //但是不允许自己调用修改评分的方法，抛出IllegalAccessException表示不允许
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("set")) {
                return method.invoke(personBean, args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
