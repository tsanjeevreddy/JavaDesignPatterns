package com.dts.core.designPatterns.java.creational.builder.practice.dqbQuery;

@WithBuilder
public class QueryBuilder {
    private String select;
    private String from;
    private String where;
    private String join;
    private String orderBy;
    private String groupBy;

    public static Builder createBuilder(){
        return new Builder();
    }

    public QueryBuilder(Builder builder) {
        this.select = builder.getSelect();
        this.from = builder.getFrom();
        this.join = builder.getJoin();
        this.where = builder.getWhere();
        this.join = builder.getJoin();
        this.orderBy = builder.getWhere();
        this.orderBy = builder.getOrderBy();
        this.groupBy = builder.getGroupBy();
    }

    public static class Builder {
        private String select;
        private String from;
        private String where;
        private String join;
        private String orderBy;
        private String groupBy;

        public String getSelect() {
            return select;
        }

        public String getFrom() {
            return from;
        }

        public String getWhere() {
            return where;
        }

        public String getJoin() {
            return join;
        }

        public String getOrderBy() {
            return orderBy;
        }

        public String getGroupBy() {
            return groupBy;
        }

        public QueryBuilder build(){
            return new QueryBuilder(this);
        }
    }
}
