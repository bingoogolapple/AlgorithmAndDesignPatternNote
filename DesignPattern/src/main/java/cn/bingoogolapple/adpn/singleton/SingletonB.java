package cn.bingoogolapple.adpn.singleton;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:2017/8/7 上午8:58
 * 描述:懒汉式
 */
public class SingletonB {
    private static SingletonB instance = null;

    /**
     * 构造方法必须是私有的
     */
    private SingletonB() {
    }

    /**
     * 这种方式的坏处是，当有线程在占有该资源时，其他线程都必须在该方法外部等待
     */
    public static synchronized SingletonB getInstance() {
        if (instance == null) {
            instance = new SingletonB();
        }
        return instance;
    }
}
