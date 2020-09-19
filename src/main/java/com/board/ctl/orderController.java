package com.board.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.board.dto.orderVO;
import com.board.svc.orderSvc;

@RestController
@RequestMapping("/order")
public class orderController {
	
	@Autowired
	private orderSvc ordersvc;


    @RequestMapping(value = "/selectorderlist",method = RequestMethod.POST)
    @ResponseBody
    public List<orderVO> selectorderlist(@RequestBody orderVO ordervo){
        return ordersvc.selectOrderList(ordervo);
    }
    
    @RequestMapping(value = "/selectorder",method = RequestMethod.POST)
    @ResponseBody
    public orderVO selectorder(@RequestBody orderVO ordervo){
        return ordersvc.selectOrder(ordervo);
    }
    
    @RequestMapping(value = "/selectmyorderlist",method = RequestMethod.POST)
    @ResponseBody
    public List<orderVO> selectmyorderlist(@RequestBody orderVO ordervo){
        return ordersvc.selectMyOrderList(ordervo);
    }
    
    @RequestMapping(value = "/selectmyauthororderlist",method = RequestMethod.POST)
    @ResponseBody
    public List<orderVO> selectmyauthororderlist(@RequestBody orderVO ordervo){
        return ordersvc.selectMyAuthorOrderList(ordervo);
    }
    
    @RequestMapping(value = "/insertorder",method = RequestMethod.POST)
    @ResponseBody
    public int insertorder(@RequestBody orderVO ordervo){
        return ordersvc.insertOrder(ordervo);
    }
    
    @RequestMapping(value = "/updateorder",method = RequestMethod.POST)
    @ResponseBody
    public int updateorder(@RequestBody orderVO ordervo){
        return ordersvc.updateOrder(ordervo);
    }
    

    @RequestMapping(value = "/permanentdeleteorder",method = RequestMethod.POST)
    @ResponseBody
    public int permanentdeleteorder(@RequestBody orderVO ordervo){
        return ordersvc.permanentdeleteOrder(ordervo);
    }




}
