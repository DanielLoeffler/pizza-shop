package ch.ti8m.azubi.lod.web.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet("/hello")

public class HalloServlet extends HttpServlet{
    @Override
    protected void doGet(httpServletRequest req, httpServletResponse resp)
        throws IOException {
        PrintWriter writer=new PrintWriter(resp.getWriter());

        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>Example Servlet</title>");
        writer.write("</head>");
        writer.write("<link rel=\"stylesheet\" href=\"style.css\">");
        writer.write("<body>");
        writer.write("<h1>Hello Servlet Hello kljh</h1>");
        writer.write("Current time is: "+LocalDateTime.now());
        writer.write("</body>");
        writer.write("</html>");

    }
}
