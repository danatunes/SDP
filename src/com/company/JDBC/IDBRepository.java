package com.company.JDBC;

import java.sql.Connection;

public interface IDBRepository {
     Connection  getConnection() throws Exception;
}
