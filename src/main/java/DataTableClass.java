public class DataTableClass {

    // We created this class to put query commands and tasks

    static String deleteTable = "SELECT * FROM deletetable";
    static String salesmanTable = "SELECT * FROM salesman";

    // TASK53 List the earning and cities of the companies with a company ID gretaer than 1209

    static String listEarningCompaniesTable = "SELECT earning,city FROM " +
            "salesman Where company_name " +
            "IN (SELECT company_name FROM companies WHERE company_id>1209) ";

    // TASK54 : List the number of company_id,numberof_person whose city is in Samsun

    static String listNumberOfCompanies = "SELECT company_id,numberof_person,company_name\n" +
            "FROM companies\n" +
            "Where company_name\n" +
            "IN (SELECT company_name\n" +
            "FROM salesman\n" +
            "WHERE city='Samsun')";


    // TASK55 : List all information of the company except Istanbul and Amasya

    static String listAllinfoCompany = "SELECT *\n" +
            "FROM companies WHERE company_name\n" +
            "IN (SELECT company_name\n" +
            "FROM salesman\n" +
            "WHERE city!='Istanbul' AND city!='Amasya')";

    // TASK56: List each name of company, number of person and average earning of person

    static String listEachNameOfCompany = "SELECT company_name,numberof_person,\n" +
            "(SELECT AVG(earning)\n" +
            "FROM salesman \n" +
            "WHERE companies.company_name = salesman.company_name) AS 'earning_avg'\n" +
            "FROM companies";


    // TASK22: List the personnel information between 'Mehmet Yilmaz' and 'Salih Can'

    static String listPersonnelBetween = "SELECT * FROM personnel WHERE personnel_name BETWEEN 'Mehmet Yilmaz' AND 'Salih Can'";

    // TASK23: List the names of the personnel whose name is included Ayse.
    
    static String listNamePerson = "SELECT personnel_name" +
            " FROM personnel WHERE " +
            "personnel_name LIKE '%ayse%'";
}
