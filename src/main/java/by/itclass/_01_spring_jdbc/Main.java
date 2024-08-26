package by.itclass._01_spring_jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {
        //DataSource dataSource = new DriverManagerDataSource();
        var dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
        dataSource.setUrl("jdbc:mysql://localhost:3306/po_2307");
        dataSource.setUsername("root");
        dataSource.setPassword("");

        var jdbcTemplate = new JdbcTemplate(dataSource);
    }
}
