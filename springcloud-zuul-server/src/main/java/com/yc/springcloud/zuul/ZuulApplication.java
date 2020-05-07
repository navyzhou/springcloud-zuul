package com.yc.springcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.yc.springcloud.zuul.filter.TokenFilter;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}

	// 将过滤器交给Spring管理
	@Bean
	public TokenFilter tokenFilter(){
		return new TokenFilter();
	}
}