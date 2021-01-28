package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ：fzj
 * @date ：2021/1/14
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class User {

    @Value("狂神")
    private String name;
}
