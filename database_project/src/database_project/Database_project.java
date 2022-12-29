/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_project;

import java.awt.Dimension;
import java.awt.Toolkit;


public class Database_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        LoginPage lp = new LoginPage();
        int x = (screenSize.width - lp.getWidth()) / 2;
        int y = (screenSize.height - lp.getHeight()) / 2;
        lp.setLocation(x, y);
        lp.setVisible(true);
    }
    
}
