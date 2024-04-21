package com.dts.core.designPatterns.java.creational.singleton.practice.connectionPool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPoolImpl implements ConnectionPool {
    private List<DatabaseConnection> connections;
    private List<DatabaseConnection> availableConnections;
    private int maxConnectionCount;
    private static ConnectionPoolImpl cp;

    private ConnectionPoolImpl() {
        // default constructor
    }

    @Override
    public void initializePool() {
        connections = new ArrayList<>(this.maxConnectionCount);
        availableConnections = new ArrayList<>(this.maxConnectionCount);
        for(int i=0; i< maxConnectionCount; i++) {
            DatabaseConnection connection = new DatabaseConnection();
            connection.setAvailable(true);
            connections.add(connection);
            availableConnections.add(connection);
        }
    }

    @Override
    public DatabaseConnection getConnection() {
       DatabaseConnection connection = availableConnections.remove(0);
       connection.setAvailable(false);
       return connection;
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        connection.setAvailable(true);
        availableConnections.add(connection);
    }

    @Override
    public int getAvailableConnectionsCount() {
        return availableConnections.size();
    }

    @Override
    public int getTotalConnectionsCount() {
        return connections.size();
    }

    public static ConnectionPool getInstance(int maxConnections) {
        if(cp == null) {
            synchronized (ConnectionPool.class) {
                if(cp == null) {
                    cp = new ConnectionPoolImpl();
                    cp.maxConnectionCount = maxConnections;
                   cp.initializePool();
                }
            }
        }
        return cp;
    }

    public static void resetInstance() {
        if(cp != null) {
            cp = null;
        }
    }
}
