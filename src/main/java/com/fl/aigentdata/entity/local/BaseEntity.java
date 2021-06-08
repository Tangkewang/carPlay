package com.fl.aigentdata.entity.local;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class BaseEntity {
    private String createTime;
    private String updateTime;
    @TableId(type = IdType.AUTO)
    private int id ;
}
