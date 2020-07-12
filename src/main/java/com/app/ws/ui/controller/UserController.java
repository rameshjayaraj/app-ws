package com.app.ws.ui.controller;

import com.app.ws.ui.model.response.UserRest;
import org.apache.catalina.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getUsers(@RequestParam(value = "page", defaultValue = "1") int page,
                           @RequestParam(value = "limit", defaultValue = "50") int limit,
                           @RequestParam(value = "sort", defaultValue = "descending", required = false) String sort){


        return "get users method was called with page = " + page + " and limit = " + limit + " with sort by "+sort;
    }

    @GetMapping(path = "/{userId}", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public UserRest getUser(@PathVariable String userId){
        UserRest returnValue = new UserRest();
        returnValue.setFistName("Ramesh");
        returnValue.setLastName("Jayaraj");
        returnValue.setEmail("ramesh@gmail.com");
        returnValue.setUserId("rameshj");
        return returnValue;
    }

    @PostMapping
    public String createUser(){

        return "create user was called";
    }

    @PutMapping
    public String updateUser(){
        return "update method was called";
    }

    @DeleteMapping
    public String deleteUser(){
        return "delete user method was called.";
    }
}
