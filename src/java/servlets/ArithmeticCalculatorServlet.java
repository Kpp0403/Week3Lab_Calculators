package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Krushang Prajapati
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("arithmeticOutput", "Result: ---");

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String number1 = request.getParameter("first");
        String number2 = request.getParameter("second");

        if (number1 == null || number1.equals("")
                || number2 == null || number2.equals("")) {

            request.setAttribute("first", number1);
            request.setAttribute("second", number2);

            request.setAttribute("arithmeticOutput", "Result: invalid");

            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);

            return;
        }

        int firstNumber;
        int secondNumber;
        int output = 0;

        try {
            firstNumber = Integer.parseInt(number1);
            secondNumber = Integer.parseInt(number2);

            switch (request.getParameter("submit")) {

                case "+":
                    output = firstNumber + secondNumber;
                    break;
                case "-":
                    output = firstNumber - secondNumber;
                    break;
                case "*":
                    output = firstNumber * secondNumber;
                    break;
                case "%":
                    output = firstNumber % secondNumber;
                    break;
            }

            request.setAttribute("arithmeticOutput", "Result: " + output);
        } catch (NumberFormatException e) {
            request.setAttribute("arithmeticOutput", "Result: invalid");

            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);

            return;
        }

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

}
