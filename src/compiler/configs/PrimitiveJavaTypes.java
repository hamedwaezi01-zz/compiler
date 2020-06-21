package compiler.configs;

import java.util.HashMap;

public class PrimitiveJavaTypes {
    private static PrimitiveJavaTypes instance = null;
    private HashMap<String, String> map = new HashMap<String, String>();

    private PrimitiveJavaTypes() {
        map.put("int", "int");
        map.put("boolean", "bool");
    }

    public static PrimitiveJavaTypes getInstance() {
        if (PrimitiveJavaTypes.instance == null)
            PrimitiveJavaTypes.instance = new PrimitiveJavaTypes();
        return instance;
    }

    public String getType(String key) {
        return map.get(key);
    }
}
