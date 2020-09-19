package com.board.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.board.dto.categoryVO;
import com.board.svc.categorySvc;

@RestController
@RequestMapping("/category")
public class categoryController {
	
	@Autowired
	private categorySvc categorysvc;


    @RequestMapping(value = "/selectcategorylist",method = RequestMethod.POST)
    @ResponseBody
    public List<categoryVO> selectcategorylist(@RequestBody categoryVO categoryvo){
        return categorysvc.selectCategoryList(categoryvo);
    }

    
    @RequestMapping(value = "/insertcategory",method = RequestMethod.POST)
    @ResponseBody
    public int insertcategory(@RequestBody categoryVO categoryvo){
        return categorysvc.insertCategory(categoryvo);
    }
    
    @RequestMapping(value = "/updatecategory",method = RequestMethod.POST)
    @ResponseBody
    public int updatecategory(@RequestBody categoryVO categoryvo){
        return categorysvc.updateCategory(categoryvo);
    }

    
    @RequestMapping(value = "/permanentdeletecategory",method = RequestMethod.POST)
    @ResponseBody
    public int permanentdeletecategory(@RequestBody categoryVO categoryvo){
        return categorysvc.permanentdeleteCategory(categoryvo);
    }




}
