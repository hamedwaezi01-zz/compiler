package compiler.configs;

public enum BuiltinTypes {
    OBJECT("Object"),
    STRING("String");

    private String name;
    BuiltinTypes(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
