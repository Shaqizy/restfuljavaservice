package com.shayzeq.main;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

import java.io.IOException;

public class StudyWS {

    public static void main(String[] args) throws IOException {

        String restServiceUrl = "http://localhost:8080/rest/helloRestService/getdoc";

        HttpClient httpClient = new HttpClient();
        GetMethod getMethod = new GetMethod(restServiceUrl);

        Header header = new Header();
        header.setName("content-type");
        header.setValue("application/x-www-form-urlencoded");
        getMethod.addRequestHeader(header);

        Header header2 = new Header();
        header2.setName("accept");
        header2.setValue("application/xml");
        getMethod.addRequestHeader(header2);

        httpClient.executeMethod(getMethod);
        String output = getMethod.getResponseBodyAsString();

        System.out.println(output);
    }
}
