package com.shayzeq.webservices.rest;

import com.shayzeq.model.Document;
import com.shayzeq.model.Goods;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

public class HelloRest {

    public HelloRest(){}

    @GET
    @Path("/getgoods")
    @Produces("application/xml")
    public Goods getGoods() {
        Goods goods = new Goods();
        goods.setId(1);
        goods.setName("Some Goods name");
        return goods;
    }

    @GET
    @Path("/getdoc")
    @Produces("application/xml")
    public Document getDocument() {
        List<Goods> goodsList = new ArrayList<Goods>();
        goodsList.add(new Goods(1, "goods1"));
        goodsList.add(new Goods(2, "goods2"));
        goodsList.add(new Goods(3, "goods3"));
        return new Document(777, "firstDocument", goodsList);
    }
}
