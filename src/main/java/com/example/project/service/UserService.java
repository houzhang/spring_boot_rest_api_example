package com.example.project.service;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.project.dao.UserDao;
import com.example.project.domain.User;
import com.example.project.serializer.UserSerializer;


@Component
@Path("users")
public class UserService {
	Logger logger = LoggerFactory.getLogger("com.example.project.service.UserService");
	
	@Autowired
	private UserDao userDao;
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public UserSerializer getUsers(@PathParam("id") String id) {
		return new UserSerializer(userDao.findOne(Long.parseLong(id)));
	}
	
	@PUT
	public String putUser() {
		return "putUser()";
	}
	
	@POST
	public String createUser() {
		User u = new User("hou", "liang");
		userDao.save(u);
		return "createUser";
	}
	
}
