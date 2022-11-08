package com.joongbu.WebSNS.config.oauth;

// jwt 할때만 사용 해당 프로젝트는 session 저장 방식 사용
public interface JwtProperties {
	String SECRET = "권용호"; // 우리 서버만 알고 있는 비밀값
	int EXPIRATION_TIME = 864000000; // 10일 (1/1000초)
	String TOKEN_PREFIX = "Bearer ";
	String HEADER_STRING = "Authorization";
}