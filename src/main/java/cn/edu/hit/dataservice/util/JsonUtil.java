package cn.edu.hit.dataservice.util;

import cn.edu.hit.dataservice.common.exception.BaseException;
import cn.edu.hit.dataservice.common.exception.BaseExceptionEnum;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static <T> T fromJson(String jsonString, Class<T> clazz) {
        if (jsonString == null || jsonString.isEmpty()) {
            throw new BaseException(BaseExceptionEnum.NOT_NULL_ERROR);
        }
        T result;
        try {
            result = objectMapper.readValue(jsonString, clazz);
        } catch (JsonProcessingException e) {
            throw new BaseException(BaseExceptionEnum.JSON_CONVERSION_FAILED);
        }
        return result;
    }

    public static String toString(Object obj) {
        if (obj == null) {
            throw new BaseException(BaseExceptionEnum.NOT_NULL_ERROR);
        }
        String result;
        try {
            result = objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new BaseException(BaseExceptionEnum.JSON_CONVERSION_FAILED);
        }
        return result;
    }

}
