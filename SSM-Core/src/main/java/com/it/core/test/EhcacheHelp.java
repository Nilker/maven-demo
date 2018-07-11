package com.it.core.test;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class EhcacheHelp {
    public static CacheManager manager = CacheManager.create("F:\\java\\git\\maven-demo\\SSM-Core\\src\\main\\resources\\xml\\ehcache.xml");

    public static Object get(String cacheName, Object key) {
        Cache cache = manager.getCache(cacheName);
        if (cache != null) {
            Element element = cache.get(key);
            if (element != null) {
                return element.getObjectValue();
            }
        }
        return null;
    }

    public static void put(String cacheName, Object key, Object value) {
        Cache cache = manager.getCache(cacheName);
        if (cache != null) {
            cache.put(new Element(key, value));
        }
    }

    public static boolean remove(String cacheName, Object key) {
        Cache cache = manager.getCache(cacheName);
        if (cache != null) {
            return cache.remove(key);
        }
        return false;
    }

    public static void main(String[] args) {
        String key = "key";
        EhcacheHelp.put("mytest", key, "hello");
        System.out.println(EhcacheHelp.get("mytest", key));
    }

}
