# simtool
This is simple tool,it base on java.

## IDUtils 身份证检测

### static mehods

|                       方法名                       |                       说明                        |
| :------------------------------------------------: | :-----------------------------------------------: |
|     public static boolean checkLen(String id)      | 检测身份证的位数是否为18位，是则返回true,否则返回 |
| public static boolean checkSequenceCode(String id) |           检测身份证的顺序码是否为[0-9]           |
| public static boolean checkAreaCode(String id) |           检测身份证的地区码是否为[0-9]           |

