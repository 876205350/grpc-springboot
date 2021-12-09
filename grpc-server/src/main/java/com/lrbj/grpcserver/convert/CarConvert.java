package com.lrbj.grpcserver.convert;
/**
 * 实体类之间的转换
 */

import com.lrbj.grpcserver.dto.CarDTO;
import com.lrbj.grpcserver.dto.DriverDTO;
import com.lrbj.grpcserver.dto.PartDTO;
import com.lrbj.grpcserver.vo.CarVO;
import com.lrbj.grpcserver.vo.DriverVO;
import com.lrbj.grpcserver.vo.VehicleVO;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class CarConvert {
    public static CarConvert INSTANCE = Mappers.getMapper( CarConvert.class );
    /**
     * CarDTO --> CarVO
     */
    @Mappings(value = {
            @Mapping(source = "totalPrice" ,target = "totalPrice",numberFormat = "#.0"),
            @Mapping(source = "publishDate" ,target = "publishDate",dateFormat = "YYYY-mm-dd"),
            @Mapping(target = "color", ignore = true),
            @Mapping(source = "brand",target = "brandName"),
            @Mapping(source = "driverDTO",target = "driverVO")
    })

    public abstract CarVO carDTOToCarVO(CarDTO carDTO);

    /**
     * DriverTDO--> DriverVO
     */
    @Mapping(source = "id" ,target = "driverId")
    @Mapping(source = "name" ,target = "fullName")
    public abstract DriverVO driverTDOToDriverVO(DriverDTO driverDTO);

    @AfterMapping //mapstruct调用过转换之后，自动调用本方法
    public void dtoToVO(CarDTO carDTO,@MappingTarget CarVO carVO){
        //@MappingTarget注解 carVO是已经赋值过的
        List<PartDTO> partDTOS = carDTO.getPartDTOS();
        boolean hasPart = partDTOS != null && !partDTOS.isEmpty();
        carVO.setHasPart(hasPart);
    }

    /**
     * List<CarDTO> --> List<CarVO>
     */
    public abstract List<CarVO> carDTOSToCarVOS(List<CarDTO> carDTOS);

    /**
     * 配置忽略mapstruct的默认映射行为，只映射配置@mapping的属性
     */
    @BeanMapping(ignoreByDefault = true)
    @Mapping(source = "id",target = "id")
    @Mapping(source = "brand",target = "brandName")
    public abstract VehicleVO carDTOToVehicleVO(CarDTO carDTO);

    @InheritConfiguration
    public abstract void updateVehicleVO(CarDTO carDTO,@MappingTarget VehicleVO vehicleVO);

    /**
     * 测试@InheritInverseConfiguration反向继承carDTOToVehicleVO
     * name 指定使用哪一个方法的配置
     * @param vehicleVO
     * @return
     */
    @InheritInverseConfiguration(name = "carDTOToVehicleVO")
    public abstract CarDTO vehicleVOToCarDTOTo(VehicleVO vehicleVO);
}