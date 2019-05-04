package org.smart4j.chapter2.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 作者：{hasee}
 * 日期：{2019/5/4}
 * 属性文件工具类
 * loadProps方法只需传递一个属性文件名称，即可返回一个properties对象，再根据其他方法获得相应的属性值
 */
public final class PropsUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);

    /**
     * 加载属性文件
     */
    public static Properties loadProps(String fileName){
        Properties props = null;
        InputStream is = null;
        try {
            is = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
            if(is == null){
                throw new FileNotFoundException(fileName + "file is not found");
            }
            props = new Properties();
            props.load(is);
        } catch (IOException e){
            LOGGER.error("load properties file failure", e);
        } finally {
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    LOGGER.error("close input stream failure", e);
                }
            }
        }
        return props;
    }

    /**
     * 获取字符属性(默认值为空字符串)
     */
    public static String getString(Properties props, String key){
        return getString(props, key, "");
    }

    /**
     * 获取字符串属性(可指定默认值)
     */
    public static String getString(Properties props, String key, String defaultVaule){
        String value = defaultVaule;
        //properties文件中内容是以键值对读入的，=前为键，=后的为值
        if(props.contains(key)){
            value = props.getProperty(key);
        }
        return value;
    }

    /**
     * 获取值属性(默认值为0)
     */
    public static int getInt(Properties props, String key){
        return getInt(props, key, 0);
    }

    /**
     * 获取值属性(可指定默认值)
     */
    public static int getInt(Properties props, String key, int defaultVaule){
        int value = defaultVaule;
        if(props.contains(key)){
            // todo
        }
        return value;
    }

    /**
     * 获取布尔型属性(默认值为false)
     */
    public static boolean getBoolean(Properties props, String key){
        return getBoolean(props, key, false);
    }

    /**
     * 获取布尔型属性(可指定默认值)
     */
    public static boolean getBoolean(Properties props, String key, Boolean defaultValue){
        boolean value = defaultValue;
        if(props.contains(key)){
            //todo
        }
        return value;
    }
}
