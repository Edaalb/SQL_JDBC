import java.sql.*;

public class QueryMethodClass {

    // We created this class to query methods
    // define the url of MySQL
    static String dataBaseUrl = "jdbc:mysql://localhost:3306/sys?serverTimezone=UTC";
    static String userName = "root";
    static String password = "12345";

    // Executes the given SQL statement, which returns a single ResultSet object
    static Statement statement;
    // to connection
    static Connection connection;
    static ResultSet data;

    public static void deleteTable()  {
        try {
            connection = DriverManager.getConnection(dataBaseUrl,userName,password) ;
            statement = connection.createStatement();
            data = statement.executeQuery(DataTableClass.deleteTable) ;

            while (data.next()){
                System.out.println(data.getInt(1)+ " " + data.getString(2)+" "
                        + data.getString(3));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void salesmanTable()  {
        try {
            connection = DriverManager.getConnection(dataBaseUrl,userName,password) ;
            statement = connection.createStatement();
            data = statement.executeQuery(DataTableClass.salesmanTable) ;

            while (data.next()){
                System.out.println(data.getInt(1)+ " " + data.getString(2)+" "
                        + data.getString(3));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void listNumberOfCompanies()  {
        try {
            connection = DriverManager.getConnection(dataBaseUrl,userName,password) ;
            statement = connection.createStatement();
            data = statement.executeQuery(DataTableClass.listNumberOfCompanies) ;
            System.out.println("The number of Companies");
            while (data.next()){
                System.out.println(data.getInt(1));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void listEachNameOfCompany()  {
        try {
            connection = DriverManager.getConnection(dataBaseUrl,userName,password) ;
            statement = connection.createStatement();
            data = statement.executeQuery(DataTableClass.listEachNameOfCompany) ;
            System.out.println("The number of Companies");
            while (data.next()){
                System.out.println(data.getString(1)+ "  " + data.getString(2) +
                        "           " +        data.getString(3));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void listAllinfoCompany()  {
        try {
            connection = DriverManager.getConnection(dataBaseUrl,userName,password) ;
            statement = connection.createStatement();
            data = statement.executeQuery(DataTableClass.listAllinfoCompany) ;

            while (data.next()){
                System.out.println(data.getString(1));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        //deleteTable();
        System.out.println("****************************");
        //salesmanTable() ;
        // listNumberOfCompanies() ;
        // listEachNameOfCompany() ;

        listAllinfoCompany() ;
    }
}
