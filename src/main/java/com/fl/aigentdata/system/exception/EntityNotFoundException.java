package com.fl.aigentdata.system.exception;

import org.springframework.util.StringUtils;

/**
 * @Author : 旺旺
 * @create 2021/6/8 15:07
 */
public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(Class clazz, String field, String val) {
        super(EntityNotFoundException.generateMessage(clazz.getSimpleName(), field, val));
    }

    private static String generateMessage(String entity, String field, String val) {
        return StringUtils.capitalize(entity)
                + " with " + field + " " + val + " does not exist";
    }
}
