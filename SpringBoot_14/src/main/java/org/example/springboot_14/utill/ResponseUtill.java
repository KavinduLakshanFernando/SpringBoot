package org.example.springboot_14.utill;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
public class ResponseUtill {
    private int code;
    private String message;
    private Object data;
}
