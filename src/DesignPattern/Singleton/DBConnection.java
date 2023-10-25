package DesignPattern.Singleton;

public class DBConnection {
    private static DBConnection con = null;

    private DBConnection() {
    }

   public static DBConnection getInstance(){
        if(con == null){
            synchronized (DBConnection.class) {
                if(con == null) {
                    con = new DBConnection();
                    return con;
                }
            }
        }
        return con;
   }

   public void getConnection(){
       System.out.println(con.hashCode());
   }

}
