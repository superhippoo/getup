package com.board.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.board.dto.authorVO;
import com.board.svc.authorSvc;

@RestController
@RequestMapping("/author")
public class authorController {
	
	@Autowired
	private authorSvc authorsvc;

	//committest
    @RequestMapping(value = "/selectauthorlist",method = RequestMethod.POST)
    @ResponseBody
    public List<authorVO> selectauthorlist(@RequestBody authorVO authorvo){
        return authorsvc.selectAuthorList(authorvo);
    }
    
    @RequestMapping(value = "/selectauthor",method = RequestMethod.POST)
    @ResponseBody
    public List<authorVO> selectauthor(@RequestBody authorVO authorvo){
        return authorsvc.selectAuthor(authorvo);
    }
    
    @RequestMapping(value = "/insertauthor",method = RequestMethod.POST)
    @ResponseBody
    public int insertuser(@RequestBody authorVO authorvo){
        return authorsvc.insertAuthor(authorvo);
    }
    
    @RequestMapping(value = "/updateauthor",method = RequestMethod.POST)
    @ResponseBody
    public int updateuser(@RequestBody authorVO authorvo){
        return authorsvc.updateAuthor(authorvo);
    }
    
    @RequestMapping(value = "/deleteauthor",method = RequestMethod.POST)
    @ResponseBody
    public int deleteuser(@RequestBody authorVO authorvo){
        return authorsvc.deleteAuthor(authorvo);
    }
    
    @RequestMapping(value = "/approveauthor",method = RequestMethod.POST)
    @ResponseBody
    public int approveuser(@RequestBody authorVO authorvo){
        return authorsvc.approveAuthor(authorvo);
    }
    
    @RequestMapping(value = "/permanentdeleteauthor",method = RequestMethod.POST)
    @ResponseBody
    public int permanentdeleteuser(@RequestBody authorVO authorvo){
        return authorsvc.permanentdeleteAuthor(authorvo);
    }




}
