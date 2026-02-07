//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.io.IOException;
//
//@WebServlet("/loginTry")
//public class Login extends HttpServlet {
//
//    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        //Recebe os parametros password e e-mail
//        String tmp_password = request.getParameter("password");
//        String tmp_email = request.getParameter("email");
//
//        //Cria um objeto em formato de usuário temporário para validação
//        SysUser SessionUser = new SysUser(tmp_password, tmp_email);
//
//        //Compara o objeto temporário com a lista de usuários cadastrados e
//        //se houver um objeto igual ao input o retorna
//        var already_Authenticated_User = SessionAuthenticator.authenticate(SessionUser);
//
//        if (already_Authenticated_User != null) {
//            //Se o objeto for validado aplicará um novo valor a VARIÁVEL DA SESSÃO DO
//            //SERVLET, que srá usada em outras páginas
//            request.getSession().setAttribute("SessionUser", already_Authenticated_User);
//            request.getRequestDispatcher("loginTrySuccess.jsp").forward(request, response);
//        } else {
//            //Se o objeto não for validado a variável não será alterada
//            request.setAttribute("SessionUser", null);
//            request.getRequestDispatcher("loginTryNotFound.jsp").forward(request, response);
//        }
//    }
//
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("loginTry.jsp").forward(request, response);
//    }
//
//}
