/*
 * import java.io.File; import java.io.IOException; import java.sql.Connection;
 * import java.sql.DriverManager; import java.sql.ResultSet; import
 * java.sql.SQLException; import java.sql.Statement; import java.util.ArrayList;
 * 
 * import com.fasterxml.jackson.core.JsonGenerationException; import
 * com.fasterxml.jackson.databind.JsonMappingException; import
 * com.fasterxml.jackson.databind.ObjectMapper;
 * 
 * public class practice {
 * 
 * public static void main(String[] args) throws ClassNotFoundException,
 * JsonGenerationException, JsonMappingException, IOException { try {
 * ArrayList<customerInfo> a = new ArrayList();
 * 
 * Class.forName("com.mysql.cj.jdbc.Driver"); Connection con = null; con =
 * DriverManager.getConnection("jdbc:mysql://localhost:3306/Business", "root",
 * "root");
 * 
 * Statement st = con.createStatement(); ResultSet rs =
 * st.executeQuery("select * from CustomerInfo where Location ='Asia';"); while
 * (rs.next()) {
 * 
 * System.out.println(rs.getString(1)); System.out.println(rs.getString(2));
 * System.out.println(rs.getInt(3)); System.out.println(rs.getString(4));
 * 
 * 
 * customerInfo ci = new customerInfo(); ci.setCourseName(rs.getString(1));
 * ci.setLocation(rs.getString(4)); ci.setPurchaseAmount(rs.getInt(3));
 * ci.setPurchaseDate(rs.getString(2)); System.out.println(ci.getCourseName());
 * System.out.println(ci.getLocation());
 * System.out.println(ci.getPurchaseAmount());
 * System.out.println(ci.getPurchaseDate()); a.add(ci);
 * 
 * } con.close();
 * 
 * for(int p=0; p<a.size();p++) { ObjectMapper om = new ObjectMapper();
 * om.writeValue(new
 * File("C:\\Users\\amitg\\eclipse-workspace\\Practice\\input\\customerinfo"+p+
 * ".json"), a.get(p)); } } catch (SQLException e) { // TODO Auto-generated
 * catch block e.printStackTrace(); }
 * 
 * } }
 */