package day6;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.sql.*;

public class JDBCJSONOutputDemo {

    String url = "jdbc:postgresql://localhost:5432/bootcamp";
    String username = "postgres";
    String password = "manage";

    String sql = "select * from car_models";
    public void fetchData() {
        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            ObjectMapper mapper = new ObjectMapper();
            ArrayNode arrayNode = mapper.createArrayNode();

            while (rs.next()) {
                ObjectNode objNode = mapper.createObjectNode();
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = rsmd.getColumnName(i);
                    objNode.put(columnName, rs.getString(i));
                }
                arrayNode.add(objNode);
            }

            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(arrayNode);
            System.out.println(jsonString);

        } catch (SQLException | com.fasterxml.jackson.core.JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public void addData() {
        String addSql = "INSERT INTO car_models (car_name, car_price, category, quantity) VALUES (?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement pst = con.prepareStatement(addSql)) {

            // Adding first car
            pst.setString(1, "Tesla Model M");
            pst.setInt(2, 12000000);
            pst.setString(3, "Electric");
            pst.setInt(4,250);
            pst.addBatch();

            // Adding second car
            pst.setString(1, "Renault EV");
            pst.setInt(2, 23000000);
            pst.setString(3, "Electric");
            pst.setInt(4,210);
            pst.addBatch();

            // Adding third car
            pst.setString(1, "Toyota Avanza");
            pst.setInt(2, 35000000);
            pst.setString(3, "Diesel");
            pst.setInt(4,220);
            pst.addBatch();

            // Execute batch
            pst.executeBatch();

            System.out.println("Data inserted successfully!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateData() {
        String updateSql = "UPDATE car_models SET car_price = ?, quantity = ? WHERE car_name = ?";

        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement pst = con.prepareStatement(updateSql)) {

            // Updating first car
            pst.setInt(1, 13000000);
            pst.setInt(2, 260);
            pst.setString(3, "Tesla Model M");
            pst.addBatch();

            // Updating second car
            pst.setInt(1, 24000000);
            pst.setInt(2, 220);
            pst.setString(3, "Renault EV");
            pst.addBatch();

            // Updating third car
            pst.setInt(1, 36000000);
            pst.setInt(2, 230);
            pst.setString(3, "Toyota Avanza");
            pst.addBatch();

            // Execute batch
            pst.executeBatch();

            System.out.println("Data updated successfully!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteData() {
        String deleteSql = "DELETE FROM car_models WHERE car_name = ?";

        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement pst = con.prepareStatement(deleteSql)) {

            // Deleting first car
            pst.setString(1, "Tesla Model M");
            pst.addBatch();

            // Deleting second car
            pst.setString(1, "Renault EV");
            pst.addBatch();

            // Deleting third car
            pst.setString(1, "Toyota Avanza");
            pst.addBatch();

            // Execute batch
            pst.executeBatch();

            System.out.println("Data deleted successfully!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        JDBCJSONOutputDemo demo = new JDBCJSONOutputDemo();
//        demo.fetchData();
        demo.addData();
    }
}
