#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author jsk
 * @Date 2018/11/7 14:24
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("开始测试-----------------");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("测试结束-----------------");
    }
}