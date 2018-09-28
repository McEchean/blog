package cn.echean.blog.util;

public class StrUtil {
    public static String tripBlank(String str) {
        return str.replaceAll("\\s+|\\t|\\r", "");
    }
}
