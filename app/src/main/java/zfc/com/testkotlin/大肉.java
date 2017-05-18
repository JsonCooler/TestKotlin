package zfc.com.testkotlin;

/**
 * Created by lenovo on 2017/5/18.
 */

public class 大肉 {

    private static 大肉 m大肉 = null;

    private 大肉() {
        super();
    }

    public static 大肉 getInstance() {
        if (m大肉 == null) {
            synchronized (大肉.class) {
                if (m大肉 == null) {
                    m大肉 = new 大肉();
                }
            }

        }
        return m大肉;
    }


}
