package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Krushang Prajapati
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String ageString = request.getParameter("age");
        int age;

        try {
            age = Integer.parseInt(ageString);
            request.setAttribute("age", age++);
            request.setAttribute("ageOutput", "On your next birthday, your age will be " + age++ + ".");
        } catch (NumberFormatException e) {
            request.setAttribute("message", "*Invalid input. Please input a valid number.");
        }

        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

}
