package com.dots.rcwrapperadapter.utils;

import java.util.List;

/**
 * 小工具集
 * Created by fengwenhua on 2017/5/2.
 */

public class SmallUtils {

    public static <E> boolean isEmpty(List<E> list){
        return (null==list||list.size()==0);
    }
}
