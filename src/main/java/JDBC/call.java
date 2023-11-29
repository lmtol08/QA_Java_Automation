package JDBC;

public class call {
    public static void main(String[] args) {
        JDBC.operations operations = new operations();

        /*
         String selectQuery = "SELECT * fROM qaauto";
        operations.readData(selectQuery);
         */

        /*
        String insertQuery = "INSERT INTO   qaauto (name,email,class,phone)" +
         "VALUES ('Reggie Ward', 'pas@gmail.com','QA OCT 2023','333-898-9632');";
        operations.writeData(insertQuery);
         */

        //   String deleteQuery = "DELETE fROM qaauto WHERE id= 12;";
    //    operations.deleteData(deleteQuery);

        String updateQuery = "UPDATE qaauto SET name = 'tOM jONES' WHERE ID=3";
        operations.updateData(updateQuery);


       connection.closeConnection();
    }
}
