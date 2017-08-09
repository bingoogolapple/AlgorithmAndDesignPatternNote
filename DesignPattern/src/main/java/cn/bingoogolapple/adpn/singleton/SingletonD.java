package cn.bingoogolapple.adpn.singleton;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:2017/8/7 上午9:09
 * 描述:静态内部类的方式实现单例模式
 */
public class SingletonD {
    /**
     * 构造方法必须是私有的
     */
    private SingletonD() {
    }

    /**
     * 静态内部类保存 SingletonD 的单例。SingletonHolder 会在外部调用 SingletonD.getInstance() 时才会被加载，从而实现懒加载
     */
    private static class SingletonHolder {
        private static final SingletonD INSTANCE = new SingletonD();
    }

    public static SingletonD getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
