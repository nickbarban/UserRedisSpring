package net.javabeat.springdata.beans;

import net.javabeat.springdata.jpa.data.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RegistrationBean {
	
	@Autowired
	private RedisTemplate<String,User> redisTemplate;

	public RedisTemplate<String, User> getRedisTemplate() {
		return redisTemplate;
	}

	public void setRedisTemplate(RedisTemplate<String, User> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}
}