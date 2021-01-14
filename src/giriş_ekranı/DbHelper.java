package giriş_ekranı;

 
import java.sql.Connection; 

 class DataBase{
  public   java.sql.Statement statement =null; 
 public java.sql.Connection con = null;
  public java.sql.PreparedStatement preparedStatement = null;
String kullanici_adi = "root"; String parola = "";
String db_ismi = "musteriler";
  String host = "localhost";
  int port = 3306;
   
  
    
    public DataBase()
    {
        
        String url = "jdbc:mysql://" + host +":"+ port +"/" +db_ismi +"?useUnicode=true&characterEncoding=utf8";      
        
       
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
            System.out.println("Driver Bulundu.");
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("Driver Bulunamadı");
        }
        
        
        try {             
            con = java.sql.DriverManager.getConnection(url,kullanici_adi,parola);
            System.out.println("Bağlantı Başarılı");
        }            
        catch (java.sql.SQLException ex)
        {
            System.out.println("Bağlantı Başarısız");
        }
    }
    
    public void polymorphism(){
        System.out.println("Bu bir polymorphism metodur.");
    }
            
}
abstract class abstractclass extends DataBase{
    
abstract void abstractmetod();
}

class miniDataBase extends DataBase{

    @Override
    public void polymorphism() {
        System.out.println("ovveride edilmiş polymorphism metodur.");
    }

}

class miniDataBase2 extends DataBase{

    @Override
    public void polymorphism() {
        System.out.println("ovveride edilmiş 2. polymorphism metodur.");
    }
    
}

public class DbHelper{
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        miniDataBase miniDataBase = new miniDataBase();
        miniDataBase2 miDataBase2 = new miniDataBase2();
     
        metod(dataBase);
        metod(miniDataBase);
        metod(miDataBase2);
    }
    public static void metod(DataBase nesne) {
        nesne.polymorphism();
    }
}
