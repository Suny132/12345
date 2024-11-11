package utils;

public class StringUtils {

    // 判断字符串是否为空
    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    // 判断字符串是否非空
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    // 将字符串首字母大写
    public static String capitalize(String str) {
        if (isEmpty(str)) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    // 字符串反转
    public static String reverse(String str) {
        if (isEmpty(str)) {
            return str;
        }
        return new StringBuilder(str).reverse().toString();
    }
}

