package com.hmlhao.simtool;



/**
 * @Author hmlhao
 * @Date 2021/11/18 22:33
 * @Version 1.0
 */
public class IDUtils {

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
    public static boolean checkBirth(String id){
        char [] idList = id.toCharArray();
        boolean flag;
        if (('0'<=idList[0]&&'9'>=idList[0])&&('0'<=idList[1]&&'9'>=idList[1])&&('0'<=idList[2]&&'9'>=idList[2])&&('0'<=idList[3]&&'9'>=idList[3])&&('0'<=idList[4]&&'9'>=idList[4])&&('0'<=idList[5]&&'9'>=idList[5])){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }

    public static boolean checkCheckCode(String id){
        char [] idList = id.toCharArray();
        boolean flag;
        if(('0'<=idList[17] && '9'>=idList[17]) || 'X' == idList[17] || 'x' == idList[17]){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }
}
