package com.joseph.gradle;
 
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.StringWriter;
 
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

 
public class UsernameServletTest {
 
    //these 3 are provided by containers like tomcat at runtime, so we need to mock them since we are doing unit testing
    @Mock private HttpServletRequest request;
    @Mock private HttpServletResponse response;
    @Mock private RequestDispatcher requestDispatcher;
 
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void doPost() throws Exception {
        when(request.getParameter("username")).thenReturn("Joseph");
        when(request.getRequestDispatcher("response.jsp")).thenReturn(requestDispatcher);
        new UsernameServlet().doPost(request, response);
        verify(request).setAttribute("helloMessage", "Hello Joseph");
        verify(requestDispatcher).forward(request, response);
    }
}