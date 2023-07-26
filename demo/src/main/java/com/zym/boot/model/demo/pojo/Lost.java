package com.zym.boot.model.demo.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * @MyFunction
 */
@Component
@Data
public class Lost {
    private int lostId;
    private String lostName;
    private String lostPosition;
    private String lostDescription;
    private String claimPosition;
    @DateTimeFormat(pattern = "yyyy-MM-dd")//不写的话，在增加环节会报错
    private LocalDate lostDate;
    private boolean isReturned;
}
