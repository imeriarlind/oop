package session19.service.impl;

import session19.service.StudentService;

public class StudentServiceFactory {
    public static StudentService getStudentService(String type) throws Exception {
        return switch (type.toLowerCase()) {
            case "jpa" -> new JpaStudentServiceImpl();
            case "jdbc" -> new JdbcStudentServiceImpl();
            case "file" -> new FileStudentServiceImpl();
            default -> throw new IllegalArgumentException("Unknown service type: " + type);
        };
    }
}
