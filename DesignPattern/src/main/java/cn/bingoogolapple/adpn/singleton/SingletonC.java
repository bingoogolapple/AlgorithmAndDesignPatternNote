package cn.bingoogolapple.adpn.singleton;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:2017/8/7 上午8:59
 * 描述:双重检测
 */
public class SingletonC {
    private static SingletonC instance = null;

    /**
     * 构造方法必须是私有的
     */
    private SingletonC() {
    }

    public static SingletonC getInstance() {
        if (instance == null) {
            // [1]
            synchronized (SingletonC.class) {
                if (instance == null) {
                    //线程一在此之前线程二到达了位置[1],如果此处不二次判断，那么线程二执行到这里的时候还会重新new
                    instance = new SingletonC();
                }
            }
        }
        return instance;
    }
}
