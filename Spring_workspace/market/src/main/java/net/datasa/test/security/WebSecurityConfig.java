package net.datasa.test.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

/**
 * 시큐리티 환경설정
 */
@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class WebSecurityConfig {
	
	// 로그인 실패 핸들러 의존성 주입
	private final CustomAuthFailureHandler custonFailureHandler;
	
    //로그인 없이 접근 가능 경로
    private static final String[] PUBLIC_URLS = {
            "/"                     //root
            , "/images/**"          //이미지 경로
            , "/css/**"             //CSS파일들
            , "/js/**"              //JavaSCript 파일들
            , "/member/join"        //회원가입
            , "/member/login/**"
            , "/board/list"
            
    };

    @Bean
    protected SecurityFilterChain config(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(author -> author
                .requestMatchers(PUBLIC_URLS).permitAll()
                .anyRequest().authenticated()
            )
            .httpBasic(Customizer.withDefaults())
            .formLogin(formLogin -> formLogin
                    .loginPage("/member/loginForm")
                    .usernameParameter("memberId")
                    .passwordParameter("memberPw")
                    .loginProcessingUrl("/member/login")
                    .failureHandler(custonFailureHandler) // 로그인 실패했을 때
//                    .failureHandler(customAuthFailHandler()) // 로그인 실패했을 때
                    .defaultSuccessUrl("/", true)
                    .permitAll()
            )
            .logout(logout -> logout
                    .logoutUrl("/member/logout")
                    .logoutSuccessUrl("/")
            );

        http
            .cors(AbstractHttpConfigurer::disable)
            .csrf(AbstractHttpConfigurer::disable);

        return http.build();
    }

//    @Bean
//    public CustomAuthFailureHandler customAuthFailHandler() {
//    	return new CustomAuthFailureHandler();
//    }

    @Bean
    public BCryptPasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}





