package fr.efsf.blog.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = {"/index", "/home"})
public class Index extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Dans le doGet de Index");
        System.out.println("Le paramètre 'key' passé dans la requête vaut " + req.getParameter("key"));
        req.setAttribute("message", "Un message en attribut de requête.");
        req.getServletContext()
                .getRequestDispatcher("/WEB-INF/index.jsp")
                .forward(req, resp);
    }
}
