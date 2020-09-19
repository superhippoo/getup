package com.board.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.board.dto.storeVO;
import com.board.svc.storeSvc;

@RestController
@RequestMapping("/store")
public class storeController {
	
	@Autowired
	private storeSvc storesvc;


    @RequestMapping(value = "/selectstorelist",method = RequestMethod.POST)
    @ResponseBody
    public List<storeVO> selectstorelist(@RequestBody storeVO storevo){
        return storesvc.selectStoreList(storevo);
    }
    
    @RequestMapping(value = "/searchstorelist",method = RequestMethod.POST)
    @ResponseBody
    public List<storeVO> searchstorelist(@RequestBody storeVO storevo){
        return storesvc.searchstorelist(storevo);
    }
    
    @RequestMapping(value = "/selectstore",method = RequestMethod.POST)
    @ResponseBody
    public storeVO selectstore(@RequestBody storeVO storevo){
        return storesvc.selectStore(storevo);
    }
    
    @RequestMapping(value = "/insertstore",method = RequestMethod.POST)
    @ResponseBody
    public int insertstore(@RequestBody storeVO storevo){
        return storesvc.insertStore(storevo);
    }
    
    @RequestMapping(value = "/updatestore",method = RequestMethod.POST)
    @ResponseBody
    public int updatestore(@RequestBody storeVO storevo){
        return storesvc.updateStore(storevo);
    }
    
    @RequestMapping(value = "/deletestore",method = RequestMethod.POST)
    @ResponseBody
    public int deletestore(@RequestBody storeVO storevo){
        return storesvc.deleteStore(storevo);
    }
    
    @RequestMapping(value = "/approvestore",method = RequestMethod.POST)
    @ResponseBody
    public int approvestore(@RequestBody storeVO storevo){
        return storesvc.approveStore(storevo);
    }
    
    @RequestMapping(value = "/permanentdeletestore",method = RequestMethod.POST)
    @ResponseBody
    public int permanentdeletestore(@RequestBody storeVO storevo){
        return storesvc.permanentdeleteStore(storevo);
    }




}
