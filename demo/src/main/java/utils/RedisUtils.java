package utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisUtils {

    @Autowired
    private StringRedisTemplate redisTemplate;

    // 设置键值对并设置过期时间
    public void set(String key, String value, long timeout) {
        redisTemplate.opsForValue().set(key, value, timeout);
    }

    // 获取键的值
    public String get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    // 删除键
    public void delete(String key) {
        redisTemplate.delete(key);
    }

    // 判断键是否存在
    public boolean exists(String key) {
        return redisTemplate.hasKey(key);
    }

    // 递增操作
    public Long increment(String key, long delta) {
        return redisTemplate.opsForValue().increment(key, delta);
    }
}
