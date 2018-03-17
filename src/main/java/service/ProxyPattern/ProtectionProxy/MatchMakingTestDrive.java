package main.java.service.ProxyPattern.ProtectionProxy;

import main.java.bean.proxy.protectionProxy.NonOwnerInvocationHandler;
import main.java.bean.proxy.protectionProxy.OwnerInvocationHandler;
import main.java.bean.proxy.protectionProxy.PersonBean;
import main.java.bean.proxy.protectionProxy.PersonBeanImpl;

import java.lang.reflect.Proxy;

/**
 * Created by Yang on 2018/2/8.
 */
public class MatchMakingTestDrive {

    public static void main(String[] args) {
        MatchMakingTestDrive drive = new MatchMakingTestDrive();
        drive.drive();
    }


    /**
     * 可以看出 保护代理最终返回的还是PersonBean对象，但是该对象已经基于加载的InvocationHandler做好了哪些人能调用、哪些不能调用的设定
     */
    public void drive() {
        PersonBean joe = new PersonBeanImpl();
        joe.setName("joe");
        joe.setGender("man");
        joe.setInterests("soccer");
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is" + ownerProxy.getName());
        try {
            ownerProxy.setName("joe stupid");
        } catch (Exception e) {
            System.out.println("can't change Name");
        }
        System.out.println("Name change" + ownerProxy.getName());
        try {
            ownerProxy.setHotOrNotRating(8);
        } catch (Exception e) {
            System.out.println("can't change rating");
        }
        System.out.println("rating is" + ownerProxy.getHotOrNotRating());

        System.out.println("//////////////////////////");

        PersonBean kaka = new PersonBeanImpl();
        kaka.setName("kaka");
        kaka.setGender("man");
        kaka.setInterests("football");
        PersonBean nonOwnerProxy = getNonOwnerProxy(kaka);
        System.out.println("Name is" + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setName("kaka stupid");
        } catch (Exception e) {
            System.out.println("can't change Name");
        }
        System.out.println("Name change" + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setHotOrNotRating(8);
        } catch (Exception e) {
            System.out.println("can't change rating");
        }
        System.out.println("rating is" + nonOwnerProxy.getHotOrNotRating());
    }


    /**
     * 步骤二： 创建Proxy类并实例化Proxy对象
     */


    /**
     * 此方法需要一个person对象作为参数，然后返回它的代理，因为代理和主题有相同的接口，所以返回一个Personbean
     *
     * @param personBean
     * @return
     */
    PersonBean getOwnerProxy(PersonBean personBean) {
        return (PersonBean)
                Proxy.newProxyInstance(     //利用Proxy类的静态newProxyInstance方法创建代理
                        personBean.getClass().getClassLoader(), //personBean的类载入器当作参数
                        personBean.getClass().getInterfaces(),  //personBean的类接口传入
                        new OwnerInvocationHandler(personBean));    //调用对应的处理器，这里是OwnerInvocationHandler
    }

    PersonBean getNonOwnerProxy(PersonBean personBean) {
        return (PersonBean)
                Proxy.newProxyInstance(     //利用Proxy类的静态newProxyInstance方法创建代理
                        personBean.getClass().getClassLoader(), //personBean的类载入器当作参数
                        personBean.getClass().getInterfaces(),  //personBean的类接口传入
                        new NonOwnerInvocationHandler(personBean));    //调用对应的处理器，这里是OwnerInvocationHandler
    }
}
