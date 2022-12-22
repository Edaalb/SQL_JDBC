public class RunMethods {

    // QeryOPP class has many methods, we would like to run in this class
    static QueryOOP queryMethod = new QueryOOP() ;


    public static void main(String[] args) {

        //queryMethod.listPersonnelBetween();
        // queryMethod.listNamePerson();

        queryMethod.listEarningCompaniesTable();
        queryMethod.listPersonnelBetween();

    }
}
