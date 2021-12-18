# simtool
这是一个基于Java的工具类

## IDUtils 身份证检测工具

### static mehods

|                       方法名                       |                       说明                        |
| :------------------------------------------------: | :-----------------------------------------------: |
|     public static boolean checkLen(String id)      | 检测身份证的位数是否为18位，是则返回true,否则返回 |
| public static boolean checkSequenceCode(String id) |           检测身份证的顺序码是否为[0-9]           |
| public static boolean checkAreaCode(String id) |           检测身份证的地区码是否为[0-9]           |

## FileUtils 文件处理工具

### static methods
|                            方法名                             |      说明      |
|:----------------------------------------------------------:|:------------:|
|        public static byte [] readBytes(String path)        | 根据文件地址取出字节数组 |
|        public static byte [] readChars(String path)        | 根据文件地址取出字符数组 |
| public static byte[] writeBytes(String path,byte [] bytes) | 将字节数组存入文件地址中 |
| public static byte[] writeChars(String path,char [] chars) | 将字符数组存入文件地址中 |

### StrUtils 字符串处理工具

|                            方法名                        |     说明      |
|:-------------------------------------------------------:|:-----------:|
|        public static boolean isEmpty(String str)        |  判断字符串是否为空  |

