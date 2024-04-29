/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author Aveesh
 */
public class darabaseLayer {
    static public Connection getConnection ()
    {
          connection con = null;
          try
          {
              class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
                      con = DriverManager.getConnection("jdbc:derby://localhost:1527/Login");
          }
           catch(Exception ex)
                   {
                   System.out.print(ex);
                   }
           return con;
               }
}
