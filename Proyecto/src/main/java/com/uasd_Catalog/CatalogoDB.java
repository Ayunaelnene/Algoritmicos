package com.uasd_Catalog;

public class CatalogoDB{
    // ==================== CONEXIÓN ====================
    private final String URL = "jdbc:mysql://localhost:3306/uasd_catalog?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "+Juandelospalotes.01*";

    String sqlTodasFacultades = "SELECT DISTINCT nombre FROM facultades ORDER BY nombre";
    String sqlTodasCarreras = """
            SELECT c.id, f.nombre AS facultad, e.nombre AS escuela, 
                   c.codigo_plan, c.nombre AS carrera
            FROM facultades f
            JOIN escuelas e ON e.facultad_id = f.id
            JOIN carreras c ON c.escuela_id = e.id
            ORDER BY f.nombre, e.nombre, c.nombre
            """;
    String sqlFiltrarFacultad = """
            SELECT c.id, f.nombre AS facultad, e.nombre AS escuela, 
                   c.codigo_plan, c.nombre AS carrera
            FROM facultades f
            JOIN escuelas e ON e.facultad_id = f.id
            JOIN carreras c ON c.escuela_id = e.id
            WHERE f.nombre = ?
            ORDER BY e.nombre, c.nombre
            """;
    String sqlBuscarCarreras = """
            SELECT c.id, f.nombre AS facultad, e.nombre AS escuela, 
                   c.codigo_plan, c.nombre AS carrera
            FROM facultades f
            JOIN escuelas e ON e.facultad_id = f.id
            JOIN carreras c ON c.escuela_id = e.id
            WHERE f.nombre LIKE ? OR e.nombre LIKE ? OR c.nombre LIKE ? OR c.codigo_plan LIKE ?
            ORDER BY f.nombre, e.nombre, c.nombre
            """;

    public String getURL() {
        return URL;
    }

    public String getUSUARIO() {
        return USUARIO;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public String getSqlTodasFacultades() {
        return sqlTodasFacultades;
    }

    public String getSqlTodasCarreras() {
        return sqlTodasCarreras;
    }

    public String getSqlFiltrarFacultad() {
        return sqlFiltrarFacultad;
    }   

    public String getSqlBuscarCarreras() {
        return sqlBuscarCarreras;
    }

}