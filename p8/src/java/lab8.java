import java.io.*;
import jakarta.servlet.*;
public class lab8 extends GenericServlet 
{
    @Override
    public void service(ServletRequest req,ServletResponse res)throws IOException
    {
        PrintWriter pw= res.getWriter();
        String s= req.getParameter("stname");
        pw.println("hello "+s+"how are you?");
    }
}