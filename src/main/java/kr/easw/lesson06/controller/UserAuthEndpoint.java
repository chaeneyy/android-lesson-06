package kr.easw.lesson06.controller;

import jakarta.servlet.http.HttpServletResponse;
import kr.easw.lesson06.model.dto.ExceptionalResultDto;
import kr.easw.lesson06.model.dto.UserAuthenticationDto;
import kr.easw.lesson06.model.dto.UserDataEntity;
import kr.easw.lesson06.service.UserDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class UserAuthEndpoint {
    private final UserDataService userDataService;
    private final BCryptPasswordEncoder encoder;


    // JWT 인증을 위해 사용되는 엔드포인트입니다.
    @@ -32,10 +33,17 @@ public ResponseEntity<Object> login(@RequestBody UserDataEntity entity) {


        @PostMapping("/register")
<<<<<<< HEAD
        public void register(@ModelAttribute UserDataEntity entity , HttpServletResponse response) throws IOException {
            entity.setPassword(encoder.encode(entity.getPassword()));
            userDataService.createUser(entity);
            response.sendRedirect("/");
=======
            public void register(@ModelAttribute UserDataEntity entity) {
                // 유저 회원가입을 구현하십시오.
                // 해당 메서드를 작성하기 위해서는, UserDataService와 admin_dashboard.html을 참고하십시오.
                // 해당 메서드는 register.html에서 사용됩니다.
                throw new IllegalStateException("Not implemented yet");
>>>>>>> 3f8bd0aef41b28c8d2009a26e526aa1d04c2f97d
            }
        }
    }