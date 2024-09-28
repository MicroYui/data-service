package cn.edu.hit.dataservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonDto<T> {
    private String id;
    private String type;
    private T content;
}
