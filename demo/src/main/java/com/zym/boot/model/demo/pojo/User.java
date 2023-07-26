package com.zym.boot.model.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @function
 */
@Component
@Data
public class User {

    private String username;
    private String password;

}
