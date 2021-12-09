package com.lrbj.grpcserver.dto;

import lombok.Data;

@Data
public class PartDTO {
    //零件id
    private Long partId;
    //名字
    private String partName;
}
