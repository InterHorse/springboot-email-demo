package pers.myz.springbootemaildemo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Yuzhe Ma
 * @date 2018/11/28
 */
@Data
public class ResponseEntity implements Serializable {
    private String code;
    private String msg;
    private Object data;

    public ResponseEntity(){}

    public ResponseEntity(String code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
