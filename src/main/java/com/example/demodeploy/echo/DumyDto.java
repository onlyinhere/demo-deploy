package com.example.demodeploy.echo;

import lombok.Builder;
import lombok.Data;

@Data
public class DumyDto {
    private int id;
    private String msg;
    @Builder
    public DumyDto(int id, String msg) {
        this.id = id;
        this.msg = msg;
    }
}