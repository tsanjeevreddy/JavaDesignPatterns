package com.dts.core.designPatterns.creational.builder.practice.dbConfig;

@WithBuilder
public class DatabaseConfigurationBuilder {
    private String databaseUrl;
    private String username;
    private String password;
    private int maxConnections;
    private boolean enableCache;
    private boolean isReadOnly;

    public DatabaseConfigurationBuilder(Builder builder) {
        this.databaseUrl = builder.getDatabaseUrl();
        this.username = builder.getUsername();
        this.password = builder.getPassword();
        this.maxConnections = builder.getMaxConnections();
        this.enableCache = builder.isEnableCache();
        this.isReadOnly = builder.isReadOnly();
    }

    public static Builder createBuilder() {
        return new Builder();
    }
    public static class Builder{
        private String databaseUrl;
        private String username;
        private String password;
        private int maxConnections;
        private boolean enableCache;
        private boolean isReadOnly;

        public String getDatabaseUrl() {
            return databaseUrl;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public int getMaxConnections() {
            return maxConnections;
        }

        public boolean isEnableCache() {
            return enableCache;
        }

        public boolean isReadOnly() {
            return isReadOnly;
        }

        public DatabaseConfigurationBuilder build(){
            return new DatabaseConfigurationBuilder(this);
        }
    }


}
