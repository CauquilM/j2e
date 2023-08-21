package servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "TestLimitations", urlPatterns = {"/TestLimitations"})
public class TestLimitations extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /* Création de la liste et insertion de quatre éléments */
 /* Récupération du jour dans le mois */
        Integer jourDuMois = LocalDate.now().getDayOfMonth();
        /* Stockage de la liste et du jour dans l'objet request */
        request.setAttribute("jour", jourDuMois);
        List<Integer> maListe = new ArrayList<>();
        maListe.add(1);
        maListe.add(3);
        maListe.add(7);
        maListe.add(137);
        /* Stockage de la liste dans l'objet request */
        request.setAttribute("liste", maListe);
        /* Transmission de la paire request/response à la JSP */
        this.getServletContext().getRequestDispatcher("/WEB-INF/testLimitations.jsp").forward(request, response);
    }
}
