package com.lrbj.grpcserver.vo;

import com.lrbj.grpcserver.dto.DriverDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarVO {
    private Long id;
    private String vin;
    private Double price;
    private String totalPrice;
    private String publishDate;
    private String brandName;
    private String color;
    private Boolean hasPart;
    private DriverVO driverVO;
}
