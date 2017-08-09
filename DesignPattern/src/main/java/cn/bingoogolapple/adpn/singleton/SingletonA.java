package cn.bingoogolapple.adpn.singleton;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:2017/8/7 上午8:56
 * 描述:饿汉式
 */
public class SingletonA {
    private static SingletonA instance = new SingletonA();

    /**
     * 构造方法必须是私有的
     */
    private SingletonA() {
    }

    /**
     * 提供能够对该实例加以访问的全局访问方法
     * @return
     */
    public static SingletonA getInstance() {
        return instance;
    }
}
