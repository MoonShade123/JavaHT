package com.hometask;

public class HT4A extends HT4 {
    private int parts;
    private String condition;

    public HT4A(int parts, String condition) {
        super(parts, condition);
    }

    public HT4A(String name, int capacility, int startYear, int parts, String condition, String kind) {
        super(name, capacility, startYear, parts, condition, kind);
    }

    public int getParts() {
        return parts;
    }

    public void setParts(int parts) {
        this.parts = parts;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Transort{" +
                "Count of parts: " + parts  +
                "Condition: " + condition + "\""
                + "}";
    }
    public HT4A(String name, int capacility, int startYear, int parts, String condition){
        super(name, capacility, startYear, parts, condition);
        parts = parts;
        capacility = capacility;
    }

}
