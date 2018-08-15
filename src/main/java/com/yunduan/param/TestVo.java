package com.yunduan.param;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class TestVo {

    @NotNull
    private String name;

    @NotNull
    private int age;
}
