package cn.bingoogolapple.adpn.singleton;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:2017/8/7 上午9:01
 * 描述:通过枚举实现单例模式
 */
public enum SingletonE {
    INSTANCE;

    /**
     * 数据库连接池
     */
    private Object dataSource;

    /**
     * 枚举的构造方法默认就是 private 的
     */
    SingletonE() {
        // TODO 初始化数据库连接池
    }

    public Object getConnection() {
        // TODO 返回数据库链接
        return null;
    }
}
