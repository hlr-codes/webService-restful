package com.gupao.mic.vip.demo;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
@WebService
@Path(value="/users/")
public interface UserService {

    @GET
    @Path("/")  //http://ip:port/users
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})//支持前后端json/xml的数据交互格式，具体格式为前端在header中Content-Type值
    List<User> getUsers();

    @DELETE
    @Path("{id}")  //http://ip:port/users/1
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) //请求accept
    Response delete(@PathParam("id") int id);

    @GET
    @Path("{id}") //http://ip:port/users/1
    @Produces(MediaType.APPLICATION_JSON)
    User getUser(@PathParam("id") int id);

    @POST
    @Path("add")
    Response insert(User user);

    @PUT
    @Path("update")
    Response update(User user);


}

