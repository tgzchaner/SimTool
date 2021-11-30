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

    public static boolean checkAreaCode(String id){
        char [] idList = id.toCharArray();
        boolean flag;
        if (('0'<=idList[0]&&'9'>=idList[0])&&('0'<=idList[1]&&'9'>=idList[1])&&('0'<=idList[2]&&'9'>=idList[2])&&('0'<=idList[3]&&'9'>=idList[3])&&('0'<=idList[4]&&'9'>=idList[4])&&('0'<=idList[5]&&'9'>=idList[5])){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {

    }
}
