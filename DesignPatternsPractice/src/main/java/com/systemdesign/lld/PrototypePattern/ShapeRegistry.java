package com.systemdesign.lld.PrototypePattern;

import java.util.HashMap;
import java.util.Map;

public class ShapeRegistry {
    // This can be replaced with a more sophisticated storage mechanism
    private Map<String, Shape> shapeMap = new HashMap<>();

    public void registerShape(String key, Shape shape) {
        shapeMap.put(key, shape);
    }

    public Shape getShape(String key) {
        Shape shape = shapeMap.get(key);
        return shape != null ? shape.clone() : null;
    }
    
}
