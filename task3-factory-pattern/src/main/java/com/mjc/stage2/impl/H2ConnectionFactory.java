package com.mjc.stage2.impl;

import com.mjc.stage2.ConnectionFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class H2ConnectionFactory implements ConnectionFactory {
    // Write your code here!
    @Override
    public Connection createConnection() {
        Connection conn = null;

        try {
            File propsFile = new File("/src/main/resources/h2database.properties");
            FileInputStream fis = new FileInputStream(propsFile.getAbsolutePath());
            Properties props = new Properties();
            props.load(fis);

            //String driver = props.getProperty("jdbc_driver");
            String url = props.getProperty("db_url");
            String user = props.getProperty("user");
            String password = props.getProperty("password");

            conn = DriverManager.getConnection(url, user, password);
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}

