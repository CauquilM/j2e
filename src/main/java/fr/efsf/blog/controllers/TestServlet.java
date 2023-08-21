package fr.efsf.blog.controllers;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TestServlet extends HttpServlet {
    @Override
    public void doGet( HttpServletRequest request, HttpServletResponse response
    ) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        // ici on définit que notre "out" n’est pas la console mais la réponse
        // envoyée au client
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\" />");
        out.println("<title>Steack</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>Votre steak est prêt monsieur</p>");
        out.println("<p>Bon appétit !</p>");
        out.println("</body>");
        out.println("</html>");
    }
}

