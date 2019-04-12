package com.github.javatraining.web.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.github.javatraining.web.entity.User;

public class UserManager {

	private static final Log log = LogFactory.getLog(UserManager.class);

	private String driver = "com.mysql.jdbc.Driver";

	private String url = "jdbc:mysql://10.211.55.3/servletdb?autoReconnect=true&useUnicode=true&characterEncoding=utf8";

	private String user = "servletdb";

	private String password = "123456";

	private String insersql = "INSERT INTO tusers (username,password,name,sex,province) VALUES(?,?,?,?,?)";

	private String selectallsql = "SELECT * FROM tusers";
	
	private String selectsql = "SELECT * FROM tusers WHERE id = ?";

	private String deletesql = "DELETE FROM tusers WHERE id = ?";

	public boolean addUser(User u) {
		boolean result = false;
		Connection con = null;
		PreparedStatement ps = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(insersql);
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getName());
			ps.setString(4, u.getSex());
			ps.setString(5, u.getProvince());
			int i = ps.executeUpdate();
			if (i == 1) {
				result = true;
			}
		} catch (SQLException e) {
			log.error("add user failed", e);
		} catch (ClassNotFoundException e) {
			log.error("add user failed", e);
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
				}
			}
		}
		return result;
	}

	public User getUserById(long id) {
		User result = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(selectsql);
			ps.setLong(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				result = new User();

				result.setId(rs.getInt("id"));
				result.setUsername(rs.getString("username"));
				result.setPassword(rs.getString("password"));
				result.setName(rs.getString("name"));
				result.setSex(rs.getString("sex"));
				result.setProvince(rs.getString("province"));
			}
		} catch (SQLException e) {
			log.error("get users failed", e);
		} catch (ClassNotFoundException e) {
			log.error("get users failed", e);
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
				}
			}
		}
		log.debug("get user" + result);
		return result;
	}

	public User getUserByName(String name) {
		return null;
	}

	public List<User> getUsers() {
		List<User> result = new ArrayList<User>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(selectallsql);
			rs = ps.executeQuery();
			while (rs.next()) {
				User u = new User();

				u.setId(rs.getInt("id"));
				u.setUsername(rs.getString("username"));
				u.setPassword(rs.getString("password"));
				u.setName(rs.getString("name"));
				u.setSex(rs.getString("sex"));
				u.setProvince(rs.getString("province"));

				result.add(u);
			}
			log.debug("get all users" + result.size());
		} catch (SQLException e) {
			log.error("get users failed", e);
		} catch (ClassNotFoundException e) {
			log.error("get users failed", e);
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
				}
			}
		}
		return result;
	}

	public boolean deleteUser(long id) {
		boolean result = false;
		Connection con = null;
		PreparedStatement ps = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(deletesql);
			ps.setLong(1, id);
			int i = ps.executeUpdate();
			if (i == 1) {
				result = true;
			}
		} catch (SQLException e) {
			log.error("add user failed", e);
		} catch (ClassNotFoundException e) {
			log.error("add user failed", e);
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
				}
			}
		}
		return result;
	}
}
