package utlis;

import cn.edu.bjfu.utils.JdbcUtils;
import org.junit.Test;

/**
 * @author Chao Huaiyu
 * @date 2020/11/23
 */
public class JdbcUtilsTest {

    @Test
    public void getConnection() {
        System.out.println(JdbcUtils.getConnection());
    }
}