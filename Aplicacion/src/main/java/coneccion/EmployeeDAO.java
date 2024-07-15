/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coneccion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    public void addEmployee(EmployeeDTO employee) throws SQLException {
        String query = "INSERT INTO employees (user, password, employee_type, hours_worked) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement empleado = conn.prepareStatement(query)) {
            empleado.setString(1, employee.getUsuario());
            empleado.setString(2, employee.getContrasena());
            empleado.setString(3, employee.getEmployeeTipo());
            empleado.setInt(4, employee.getHoras_trabajo());
            empleado.executeUpdate();
        }
    }

    public List<EmployeeDTO> getAllEmployees() throws SQLException {
        List<EmployeeDTO> employees = new ArrayList<>();
        String query = "SELECT * FROM employees";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                EmployeeDTO empleado = new EmployeeDTO();
                empleado.setId(rs.getInt("id"));
                empleado.setUsuario(rs.getString("user"));
                empleado.setContrasena(rs.getString("password"));
                empleado.setEmployeeTipo(rs.getString("employee_type"));
                empleado.setHoras_trabajo(rs.getInt("hours_worked"));
                employees.add(empleado);
            }
        }
        return employees;
    }

    public void updateEmployee(EmployeeDTO employee) throws SQLException {
        String query = "UPDATE employees SET user = ?, password = ?, employee_type = ?, hours_worked = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, employee.getUsuario());
            stmt.setString(2, employee.getContrasena());
            stmt.setString(3, employee.getEmployeeTipo());
            stmt.setInt(4, employee.getHoras_trabajo());
            stmt.setInt(5, employee.getId());
            stmt.executeUpdate();
        }
    }

    public void deleteEmployee(int id) throws SQLException {
        String query = "DELETE FROM employees WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}

