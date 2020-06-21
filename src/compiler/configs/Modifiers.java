package compiler.configs;

public enum Modifiers {
    pub("ACCESS_MODIFIER_PUBLIC"),
    priv("ACCESS_MODIFIER_PRIVATE");

    private String str;
    Modifiers(String str){
        this.str = str;
    }

    @Override
    public String toString() {
        return this.str;
    }
}