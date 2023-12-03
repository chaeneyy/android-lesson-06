package kr.easw.lesson06.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.*;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RemoveUserDto {
    private final String userId;
    private String userId;
}