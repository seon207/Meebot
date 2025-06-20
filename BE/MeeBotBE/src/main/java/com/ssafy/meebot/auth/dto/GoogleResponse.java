package com.ssafy.meebot.auth.dto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GoogleResponse {
    private String access_token; // 애플리케이션이 Google API 요청을 승인하기 위해 보내는 토큰
    private String expires_in;   // Access Token의 남은 수명
    private String refresh_token;    // 새 액세스 토큰을 얻는 데 사용할 수 있는 토큰
    private String scope;
    private String token_type;   // 반환된 토큰 유형(Bearer 고정)
    private String id_token; // 계정 정보가 담겨있는 jwt 토큰!!!
}