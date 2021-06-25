package org.tempuri.WSLCSD.Service;

import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class DBUtil {
	public Util util = new Util();
    private String DBURL = util.getPath("DBURL");
    private String DBUSER = util.getPath("DBUSER");
    private String PASSWORD = util.getPath("PASSWORD");
    public Connection conn;

    public Connection getConnection() {
        try {
            if (conn == null || conn.isClosed())
            	conn = DriverManager.getConnection(DBURL, DBUSER, PASSWORD);

        }catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return conn;
    }
    public void close(){
        if(conn != null){
            try {
                this.conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public ResultSet simpleQRS(ResultSet rs) throws SQLException{
    	if(rs!=null) {
    		rs.next();
    	}
    	return rs;
    }

    
	public ResultSet getQueryResultSet(Connection conn, Object... args) throws SQLException {
		String sql = (String) args[0];
		for (int i = 2; i < args.length; i += 2) {
			sql += "?" + args[i].toString();
		}
		if ((args.length & 1) == 0) {
			sql += "?";
		}
//		 System.out.println("JJJ"+sql);
		PreparedStatement stmt = conn.prepareStatement(sql);
		for (int i = 1; i < args.length; i += 2) {
			int index = (i + 1) / 2;
			if (args[i] != null && !(args[i] instanceof InputStream)) {
				 System.out.println(index + ":" + args[i]);
			}
			if (args[i] instanceof String) {
				stmt.setString(index, (String) args[i]);
			} else if (args[i] instanceof Long) {
				stmt.setLong(index, (Long) args[i]);
			} else if (args[i] instanceof Integer) {
				stmt.setInt(index, (Integer) args[i]);
			} else if (args[i] instanceof InputStream) {
				stmt.setBlob(index, (InputStream) args[i]);
			} else if (args[i] instanceof Blob) {
				stmt.setBlob(index, (Blob) args[i]);
			} else if (args[i] instanceof java.sql.Date) {
				stmt.setDate(index, (java.sql.Date) args[i]);
			} else if (args[i] instanceof java.util.Date) {
				stmt.setDate(index, new java.sql.Date(((java.util.Date) args[i]).getTime()));
			} else if (args[i] == null) {
				stmt.setNull(index, Types.NULL);
			}
		}
		 System.out.println(stmt);
		return stmt.executeQuery();
	}
    
    public long getUpdateResultSet(Connection conn, Object... args) throws SQLException {

		String sql = (String) args[0];
		for (int i = 2; i < args.length; i += 2) {
			sql += "?" + args[i].toString();
		}
		if ((args.length & 1) == 0) {
			sql += "?";
		}
//		 System.out.println(sql);
		PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		for (int i = 1; i < args.length; i += 2) {
			int index = (i + 1) / 2;
			if (args[i] != null && !(args[i] instanceof InputStream)) {
				// System.out.println(index + ":" + args[i]);
			}
			if (args[i] instanceof String) {
				stmt.setString(index, (String) args[i]);
			} else if (args[i] instanceof Long) {
				stmt.setLong(index, (Long) args[i]);
			} else if (args[i] instanceof Integer) {
				stmt.setInt(index, (Integer) args[i]);
			} else if (args[i] instanceof InputStream) {
				stmt.setBlob(index, (InputStream) args[i]);
			} else if (args[i] instanceof Blob) {
				stmt.setBlob(index, (Blob) args[i]);
			} else if (args[i] instanceof java.sql.Date) {
				stmt.setDate(index, (java.sql.Date) args[i]);
			} else if (args[i] instanceof java.util.Date) {
				stmt.setDate(index, new java.sql.Date(((java.util.Date) args[i]).getTime()));
			} else if (args[i] == null) {
				stmt.setNull(index, Types.NULL);
			}
		}

		 System.out.println(stmt);
		/* int result = */ stmt.executeUpdate();

		ResultSet rs = stmt.getGeneratedKeys();
		long pk = 0;
		if (rs != null && rs.next()) {
			pk = rs.getLong(1);
		}

		stmt.close();
		return pk;
	}
}