package com.clear.dto.input;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName User
 *
 * @author qml
 * Date 2020/11/6 9:21
 * Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private Long id;
    private String userName;
    private String address;
}