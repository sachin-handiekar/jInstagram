package org.jinstagram.utils;

import org.jinstagram.http.URLUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Utils for {@link Map} manipulation
 */
public class MapUtils {

    /**
     * Sorts a Map
     *
     * @param map unsorted map
     * @return sorted map
     */
    public static Map<String, String> sort(Map<String, String> map) {
        Preconditions.checkNotNull(map, "Cannot sort a null object.");

        Map<String, String> sorted = new LinkedHashMap<String, String>();

        for (String key : getSortedKeys(map)) {
            sorted.put(key, map.get(key));
        }

        return sorted;
    }

    private static List<String> getSortedKeys(Map<String, String> map) {
        List<String> keys = new ArrayList<String>(map.keySet());

        Collections.sort(keys);

        return keys;
    }

    /**
     * Form-urlDecodes and appends all keys from the source {@link Map} to the
     * target {@link Map}
     *
     * @param source Map from where the keys get copied and decoded
     * @param target Map where the decoded keys are copied to
     */
    public static void decodeAndAppendEntries(Map<String, String> source,
                                              Map<String, String> target) {
        for (Entry<String, String> entry : source.entrySet()) {
            target.put(URLUtils.percentEncode(entry.getKey()),
                    URLUtils.percentEncode(entry.getValue()));
        }
    }

    public static <K, V> String toString(Map<K, V> map) {
        if (map == null) {
            return "";
        }
        if (map.isEmpty()) {
            return "{}";
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            result.append(
                    String.format(", %s -> %s ", entry.getKey().toString(), entry.getValue().toString()));
        }
        return "{" + result.substring(1) + "}";
    }
}
