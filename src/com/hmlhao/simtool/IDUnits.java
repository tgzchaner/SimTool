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

    public static boolean checkSequenceCode(String id){
        char [] idList = id.toCharArray();
        boolean flag;
        if (('0'<=idList[14]&&'9'>=idList[14])&&('0'<=idList[15]&&'9'>=idList[15])&&('0'<=idList[16]&&'9'>=idList[16])){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {
        
    }
}
