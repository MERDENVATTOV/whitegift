package com.wg.whitegift;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhitegiftApplicationTests {
    DataSource dataSource;
    @Test
    public void contextLoads() throws SQLException {
        Connection connection = dataSource.getConnection();
    }

}
