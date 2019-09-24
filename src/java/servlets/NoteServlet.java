package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import models.Note;
/**
 *
 * @author 794473
 */
public class NoteServlet extends HttpServlet {

 protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException 
 {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt"); 
        
         BufferedReader br = new BufferedReader(new FileReader(new File(path)));
         String title = br.readLine();
         String content = br.readLine();
         
        Note n = new Note(title,content);
         
         request.setAttribute("note", n);
         request.setAttribute("note", n);
        
         String e = request.getParameter("edit");
         
         if(e == null)
         {
             getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);
         }
         else
         {
             getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                .forward(request, response);
         }
                         
         br.close();

     
 }
   
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
         PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false))); 
         
         String t = request.getParameter("showTitle");
         String c = request.getParameter("showContent");
         
         Note n = new Note();
         n.setTitle(t);
         n.setContent(c);
         
         request.setAttribute("note", n);     
         pw.write(t+ "\n" + c);
         
         pw.close();
         
         getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }

}
