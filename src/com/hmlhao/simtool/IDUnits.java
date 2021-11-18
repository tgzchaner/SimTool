package com.hmlhao.simtool;

/**
 * @author taozhang
 * @version 1.0
 * @date 2021/11/18 22:33
 */
public class IDUnits {

    public static boolean checkLen(String id){
        boolean flag;
        int size = id.length();
        if(size == 18){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }
}
