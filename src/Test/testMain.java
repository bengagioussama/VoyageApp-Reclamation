package Test;

import Entitie.Etat;
import Entitie.Reclamation;
import Services.ServiceReclamation;
import Utils.DataSource;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class testMain {
    public static void main(String[] args) throws Exception{
        ServiceReclamation serviceReclamation = new ServiceReclamation();
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");


        java.util.Date DATE = date.parse("1992-10-10");
        java.sql.Date sqlDate = new java.sql.Date(DATE.getTime());
        Reclamation r1 = new Reclamation(sqlDate,"TEST Objet","Test Description", Etat.COMPLETED);

        try {
            serviceReclamation.addReclamation(r1);
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }

        ArrayList<Reclamation> l=null;
        try {
            l = serviceReclamation.readAll();
        }catch (SQLException e)
        {
            System.out.println(e);
        }


        l.forEach(e-> System.out.println(e));






    }
}
