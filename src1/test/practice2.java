/*
 * package test; import java.io.File; import java.io.FileWriter; import
 * java.io.IOException; import java.sql.Connection; import
 * java.sql.DriverManager; import java.sql.ResultSet; import
 * java.sql.SQLException; import java.sql.Statement; import java.util.ArrayList;
 * 
 * import org.apache.commons.text.StringEscapeUtils; import
 * org.json.simple.JSONArray; import org.json.simple.JSONObject;
 * 
 * import com.fasterxml.jackson.core.JsonGenerationException; import
 * com.fasterxml.jackson.databind.JsonMappingException; import
 * com.fasterxml.jackson.databind.ObjectMapper; import com.google.gson.Gson;
 * 
 * public class practice2 {
 * 
 * public static void main(String[] args) throws ClassNotFoundException,
 * JsonGenerationException, JsonMappingException, IOException { try {
 * ArrayList<customerInfo> a = new ArrayList(); JSONArray ja = new JSONArray();
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
 * ".json"), a.get(p)); Gson g = new Gson(); String jsonString =
 * g.toJson(a.get(p));
 * 
 * ja.add(jsonString);
 * 
 * 
 * 
 * }
 * 
 * JSONObject jo = new JSONObject(); jo.put("data", ja);
 * //System.out.println(ja.toString()); String str =
 * StringEscapeUtils.unescapeJava(jo.toJSONString()); str = str.replace("\"{",
 * "{"); str = str.replace("}\"", "}"); System.out.println(str); try (FileWriter
 * file1 = new FileWriter(
 * "C:\\Users\\amitg\\eclipse-workspace\\Practice\\input\\singleFile.json")){
 * file1.write(str); };
 * 
 * } catch (SQLException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); }
 * 
 * } }
 */