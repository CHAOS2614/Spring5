package cn.edu.bjfu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Chao Huaiyu
 * @date 2020/12/5
 */
@Component
public class Properties {

    java.util.Properties getProperties(){
        java.util.Properties properties = new java.util.Properties();
        InputStream resourceAsStream = Profile.class.getClassLoader().getResourceAsStream("druid.properties");
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

}
