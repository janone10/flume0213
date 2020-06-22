package com.atguigu.flume.interceptor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

import java.time.OffsetDateTime;

/**
 * @author zxjgreat
 * @create 2020-05-13 9:13
 */
public class JSONUtils {


    /**
     * 验证是否是Json格式
     *
     * @param log
     * @return
     */
    public static boolean isJSONValidate(String log) {
        try {
            JSON.parse(log);
            return true;
        } catch (JSONException e) {
            return false;
        }
    }

}
