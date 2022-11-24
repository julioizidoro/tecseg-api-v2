package br.com.tecsegapi.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

@Service
public class ConectionFactory {
	
	public static Connection getConexao() {
		Connection conexao = null;
		try {
			conexao = DriverManager.getConnection("jdbc:mysql://192.168.15.100:8082/tecseg", "root", "20SimpleS78**");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conexao;
	}

}
