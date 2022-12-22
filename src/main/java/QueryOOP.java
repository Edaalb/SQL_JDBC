import java.sql.*;

public class QueryOOP {
    static String dataBaseUrl = "jdbc:mysql://localhost:3306/sys?serverTimezone=UTC";
    static String userName = "root";
    static String password = "12345";


    static Connection connection;
    static Statement statement;
    static ResultSet data;

        //Create a method from Connection interface

    public static Connection connectionDataBase(){
        try {
            connection = DriverManager.getConnection(dataBaseUrl,userName,password);

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return connection ;
    }

        //Create a method from Statement interface

    public static Statement statementDataBase(){
        try {
            statement = connectionDataBase().createStatement() ;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return statement ;
    }


    public static ResultSet listNumberOfCompanies(){

        try {
            data = statementDataBase().executeQuery(DataTableClass.listNumberOfCompanies) ;
            while (data.next()){
                System.out.println(data.getString(1)+ " " + data.getString(2));
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return data ;
    }

    public static ResultSet listPersonnelBetween(){
        try {
            data = statementDataBase().executeQuery(DataTableClass.listPersonnelBetween) ;
            while (data.next()){
                System.out.println(data.getString(1)+ " " + data.getString(2));
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return data ;
    }

    public static ResultSet listNamePerson(){
        try {
            data = statementDataBase().executeQuery(DataTableClass.listNamePerson) ;
            while (data.next()){
                System.out.println(data.getString(1));
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return data ;
    }
    public static ResultSet listEarningCompaniesTable(){
        try {
            data = statementDataBase().executeQuery(DataTableClass.listEarningCompaniesTable) ;
            while (data.next()){
                System.out.println(data.getString(1)+ " " + data.getString(2));
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return data ;
    }
}
