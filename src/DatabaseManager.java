import java.sql.*;

public class DatabaseManager {
    private static final String URL = "jdbc:mysql://localhost:3306/spelersdb";
    private static final String USER = "root";
    private static final String PASSWORD = "Aidee123!";

    public static void initializeDatabase() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement()) {

            String sql = "CREATE TABLE IF NOT EXISTS speler (" +
                    "gamertag VARCHAR(50) PRIMARY KEY," +
                    "voortgang INT DEFAULT 0)";
            stmt.execute(sql);
            System.out.println("✅ Verbonden en tabel gecontroleerd.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void slaVoortgangOp(String gamertag, int voortgang) {
        String sql = "REPLACE INTO speler (gamertag, voortgang) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, gamertag);
            pstmt.setInt(2, voortgang);
            pstmt.executeUpdate();
            System.out.println("💾 Voortgang opgeslagen voor " + gamertag);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static int laadVoortgang(String gamertag) {
        String selectSql = "SELECT voortgang FROM speler WHERE gamertag = ?";
        String insertSql = "INSERT INTO speler (gamertag, voortgang) VALUES (?, 0)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            PreparedStatement selectStmt = conn.prepareStatement(selectSql);
            selectStmt.setString(1, gamertag);
            ResultSet rs = selectStmt.executeQuery();

            if (rs.next()) {
                return rs.getInt("voortgang");
            } else {
                PreparedStatement insertStmt = conn.prepareStatement(insertSql);
                insertStmt.setString(1, gamertag);
                insertStmt.executeUpdate();
                return 0;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static boolean isKamerVoltooid(String gamertag, int kamer) {
        String sql = "SELECT voltooid FROM kamerstatus WHERE gamertag = ? AND kamer = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, gamertag);
            pstmt.setInt(2, kamer);
            ResultSet rs = pstmt.executeQuery();
            return rs.next() && rs.getBoolean("voltooid");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void markeerKamerAlsVoltooid(String gamertag, int kamer) {
        String sql = "REPLACE INTO kamerstatus (gamertag, kamer, voltooid) VALUES (?, ?, TRUE)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, gamertag);
            pstmt.setInt(2, kamer);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
