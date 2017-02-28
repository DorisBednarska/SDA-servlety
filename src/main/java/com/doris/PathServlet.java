package com.doris;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

/**
 * Created by RENT on 2017-02-28.
 */
public class PathServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> names = Arrays.asList("Doris", "Jan", "Anna", "Kasia", "Monika", "Wojtek");
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
//        writer.write("Hello World!");

//        String requestURI = req.getRequestURI(); //pobieramy sciezka
//        String name = requestURI.substring(requestURI.lastIndexOf("/") + 1);   //szukamy ostatniego slesha, przechodzimy 1 za nim (split)
//        writer.write("<h1>" + name + "</h1>"); //wyswietlamy

        String requestURI = req.getRequestURI();
        Integer index = new Integer(requestURI.substring(requestURI.lastIndexOf("/") + 1));
        writer.write("<h1>" + names.get(index) + "</h1>");
    }
}
