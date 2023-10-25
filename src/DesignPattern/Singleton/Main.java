package DesignPattern.Singleton;

public class Main {
    public static void main(String[] args) {
        DBConnection con = DBConnection.getInstance();
        con.getConnection();
        DBConnection con1 = DBConnection.getInstance();
        con1.getConnection();
    }
}
