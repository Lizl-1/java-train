package com.zghc.train.common.util;

import cn.hutool.core.util.IdUtil;

/**
 * @Author Lizl
 * @Description
 * @Data 2024/01/05/0005 0:18
 * @Version 1.0.0
 */
public class SnowUtil {

    private static long dataCenterId = 1; // 数据中心
    private static long workerId = 1; // 机器标识

    public static long getDataCenterId() {
        return IdUtil.getSnowflake(workerId, dataCenterId).nextId();
    }

    public static String getSnowflakeNextIdStr() {
        return IdUtil.getSnowflake(workerId, dataCenterId).nextIdStr();
    }

}
