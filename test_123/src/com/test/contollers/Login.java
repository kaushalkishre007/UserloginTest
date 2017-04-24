package com.test.contollers;




import org.springframework.http.HttpStatus;
import javax.ws.rs.core.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.test.models.User;

@RestController
public class Login {
	@RequestMapping(value="/login",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON)
	public String login(@RequestBody User u1){
		System.out.println("post is hit");
		
		if(u1.getUname()=="root" && u1.getPassword()=="root"){
			return "ok";
			
		}else{
			return null;
		}		
	}
	@RequestMapping(value="/login",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON)
	@ResponseBody
	public User login(){
		System.out.println("i  am hit");
		User u1=new User();
		u1.setId(1);
		u1.setUname("root");
		u1.setPassword("root");
		return u1; 
		
	}
}
