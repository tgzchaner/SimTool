package com.hmlhao.simtool;

import java.io.*;

/**
 * @Author hmlhao
 * @Date 2021/12/10 21:44
 * @UpdateDate 2021/12/10 23:26
 * @Version 1.0
 */
public class FileUtils {

    /*
     * @param path:要读取文件的绝对路径
     * @return result:读取文件后的二进制
     */
    public static byte [] readBytes(String path){

        File file = new File(path);
        byte [] result = new byte[(int)file.length()];
        InputStream inputStream = null;
        try{
            inputStream = new FileInputStream(file);
            inputStream.read(result);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                inputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return result;
    }

    /*
     * @param path:文件绝对路径
     * @return result:读取文件生成的字符数组
     */
    public static char [] readChars(String path){
        File file = new File(path);
        char [] result = new char[(int)file.length()];
        Reader reader = null;
        try{
            reader = new FileReader(file);
            reader.read(result);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            }catch (IOException e){
                e.printStackTrace();
            }

        }
        return result;
    }

    /*
     * param1 path:输出文件路径
     * param2 bytes:输出文件字节数组
     */
    public static void writeBytes(String path,byte [] bytes){
        File file = new File(path);
        OutputStream outputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try{
            outputStream = new FileOutputStream(file);
            bufferedOutputStream = new BufferedOutputStream(outputStream);
            bufferedOutputStream.write(bytes);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                outputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }

        }
    }

    public static void writeChars(String path,char [] chars){
        File file = new File(path);
        Writer writer = null;
        BufferedWriter bufferedWriter = null;
        try{
            writer = new FileWriter(file);
            bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(chars);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
                writer.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
