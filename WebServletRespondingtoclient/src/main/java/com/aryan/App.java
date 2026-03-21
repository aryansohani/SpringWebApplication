package com.aryan;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException {
        System.out.println("running on port 8000");
        Tomcat tom= new Tomcat();
        tom.setPort(8001);
        tom.getConnector();

        Context context = tom.addContext("", System.getProperty("java.io.tmpdir"));
        tom.addServlet(context,"h1",new HelloServlet());
        context.addServletMappingDecoded("/hello","h1");

       tom.start();
        tom.getServer().await();
    }
}
