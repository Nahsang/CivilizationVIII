package com.GroupProject;


import java.sql.Connection;


import com.GroupProject.utill.ConnectorBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        Connection con = ConnectorBuilder.getConnection();
        System.out.println(con);





    }
}
