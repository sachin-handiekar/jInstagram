package org.jinstagram.entity.common;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.google.gson.Gson;

public class PaginationTest {
    private Gson GSON_PARSER = new Gson();

    private static final String CAPTION_JSON_NULL = "{\"caption\": null}";

    private static final String CAPTION_JSON_DATA = "{"
            + "            \"created_time\": \"1296656006\",\n"
            + "            \"text\": \"ã\u0083\u008Fã\u0083¼ã\u0083\u0088â\u0099¥ã\u0082¢ã\u0083\u0097ã\u0083ªå§\u008Bã\u0082\u0081ã\u0081¦ä½¿ã\u0081£ã\u0081¦ã\u0081¿ã\u0081\u009Fã\u0082\u0087(^^)\",\n"
            + "            \"from\": {\n"
            + "                \"username\": \"cocomiin\",\n"
            + "                \"full_name\": \"\",\n"
            + "                \"type\": \"user\",\n"
            + "                \"id\": \"1127272\"\n"
            + "            },\n"
            + "            \"id\": \"26329105\"\n"
            + "        }";


    @Test
    public void testCaptionEntity_Null() {
        Caption caption;
        caption = GSON_PARSER.fromJson(CAPTION_JSON_NULL, Caption.class);

        assertNull(caption.getCreatedTime());
        assertNull(caption.getFrom());
        assertNull(caption.getId());
        assertNull(caption.getText());
    }

    @Test
    public void testCaptionEntity_WithData() {
        Caption caption;
        caption = GSON_PARSER.fromJson(CAPTION_JSON_DATA, Caption.class);

        assertNotNull("'Caption' entity should not be null.", caption);
        assertNotNull(caption.getCreatedTime());
        assertNotNull(caption.getFrom());
        assertNotNull(caption.getId());
        assertNotNull(caption.getText());
    }


}
