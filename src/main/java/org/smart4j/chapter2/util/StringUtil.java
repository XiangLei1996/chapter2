package org.smart4j.chapter2.util;

import org.apache.commons.lang3.StringUtils;

/**
 * 作者：{hasee}
 * 日期：{2019/5/4}
 * 字符串工具类
 */
public final class StringUtil {

    /**
     * 判断字符串是否为空
     */
    public static boolean isEmpty(String str){
        if(str != null){
            str = str.trim();
        }
        //调用JAVA中集成的工具类判断？
        return StringUtils.isEmpty(str);
    }

    /**
     * 判断字符串是否非空
     */
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }
}
