package org.smart4j.chapter2.util;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;

import java.util.Collection;
import java.util.Map;

/**
 * 作者：{hasee}
 * 日期：{2019/5/4}
 * 集合工具类的简单封装
 */
public final class CollectionUtil {

    /**
     * 判断Collection是否为空
     */
    public static boolean isEmpty(Collection<?> collection){
        //通过调用JAVA中原来集成的集合工具类来实现
        return CollectionUtils.isEmpty(collection);
    }

    /**
     * 判断Collection是否非空
     */
    public static boolean isNotEmpty(Collection<?> collection){
        return !isEmpty(collection);
    }

    /**
     * 判断Map是否为空
     */
    public static boolean isEmpty(Map<?, ?> map){
        return MapUtils.isEmpty(map);
    }

    /**
     * 判断Map是否非空
     */
    public static boolean isNotEmpty(Map<?, ?> map){
        return !isEmpty(map);
    }
}
