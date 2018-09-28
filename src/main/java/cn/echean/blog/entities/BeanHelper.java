package cn.echean.blog.entities;

import java.util.HashMap;

/**
 * @author 98382
 */
public class BeanHelper {
    private String msg;
    private int status;
    private HashMap<String,Object> hashMap = new HashMap<>();

    public BeanHelper success(String msg) {
        this.msg = msg;
        this.status = 1;
        return this;
    }

    public BeanHelper fail(String msg) {
        this.msg = msg;
        this.status = 0;
        return this;
    }

    public BeanHelper add(String key,Object value) {
        this.hashMap.put(key,value);
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public HashMap<String, Object> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<String, Object> hashMap) {
        this.hashMap = hashMap;
    }
}
