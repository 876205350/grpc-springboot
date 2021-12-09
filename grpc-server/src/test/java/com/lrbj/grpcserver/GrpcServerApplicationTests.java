package com.lrbj.grpcserver;

import com.lrbj.grpcserver.convert.CarConvert;
import com.lrbj.grpcserver.dto.CarDTO;
import com.lrbj.grpcserver.dto.DriverDTO;
import com.lrbj.grpcserver.dto.PartDTO;
import com.lrbj.grpcserver.vo.CarVO;
import com.lrbj.grpcserver.vo.VehicleVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class GrpcServerApplicationTests {
    @Resource
    private CarConvert carConvert;
    /**
     * 测试@InheritInverseConfiguration,写入CarDTO
     *
     */

    @Test
    public void test5() {
        VehicleVO vehicleVO = new VehicleVO();
        vehicleVO.setId(20211208L);
        vehicleVO.setPrice(2000000.89d);
        vehicleVO.setBrandName("别克君威");
        //转换对象
//        CarDTO carDTO = CarConvert.INSTANCE.vehicleVOToCarDTOTo(vehicleVO);
        CarDTO carDTO = carConvert.vehicleVOToCarDTOTo(vehicleVO);

        System.out.println( carDTO );
    }
    /**
     * 测试@BeanMapping,更新vehicleVO
     *
     */
    @Test
    public void test4() {
        CarDTO carDTO = buildCarDTO();
        //转换对象
        VehicleVO vehicleVO = CarConvert.INSTANCE.carDTOToVehicleVO(carDTO);
        //更新
        CarDTO carDTO1 = new CarDTO();
        carDTO1.setId(20211208L);
        carDTO1.setBrand("迈巴赫");
        CarConvert.INSTANCE.updateVehicleVO(carDTO1,vehicleVO);
        System.out.println( vehicleVO );
    }

    /**
     * 测试@BeanMapping
     *
     */
    @Test
    public void test3() {
        CarDTO carDTO = buildCarDTO();
        //转换对象
        VehicleVO vehicleVO = CarConvert.INSTANCE.carDTOToVehicleVO(carDTO);
        //测试
        System.out.println( vehicleVO );
    }
    @Test
    public void test1() {
        CarDTO carDTO = buildCarDTO();
        //转换对象
        CarVO carVO = CarConvert.INSTANCE.carDTOToCarVO(carDTO);
        //测试
        System.out.println( carVO );
    }

    /**
     * list<carDTO> --> list<carVO>
     */
    @Test
   public void test2() {
        CarDTO carDTO = buildCarDTO();
        List<CarDTO> carDTOList = new ArrayList<>();
        carDTOList.add(carDTO); //source

//        List<CarVO> carVOList = new ArrayList<>();
//        for (CarDTO dto:carDTOList){
//            //转换对象
//            CarVO carVO = CarConvert.INSTANCE.carDTOToCarVO(dto);
//            carVOList.add(carVO);
//        }

        List<CarVO> carVOList = CarConvert.INSTANCE.carDTOSToCarVOS(carDTOList);
        System.out.println(carVOList);
   }
//    @Test
//    public static void main(String[] args) {
//        new GrpcServerApplicationTests().test5();
//    }

    private CarDTO buildCarDTO(){
        CarDTO carDTO = new CarDTO();
        carDTO.setId(20211207L);
        carDTO.setVin("京A12585");
        carDTO.setPrice(120000.25d);
        carDTO.setTotalPrice(130000.25d);
        carDTO.setPublishDate(new Date());
        carDTO.setBrand("红旗");
        carDTO.setColor("黑色");
        //零件
        PartDTO partDTO1 = new PartDTO();
        partDTO1.setPartId(1001L);
        partDTO1.setPartName("发动机");
        PartDTO partDTO2 = new PartDTO();
        partDTO2.setPartId(1002L);
        partDTO2.setPartName("轮胎");
        List<PartDTO> partDTOS = new ArrayList<>();
        partDTOS.add(partDTO1);
        partDTOS.add(partDTO2);
        //司机
        DriverDTO driverDTO = new DriverDTO();
        driverDTO.setId(1L);
        driverDTO.setName("张三");
        carDTO.setDriverDTO(driverDTO);
        return carDTO;
    }
}
