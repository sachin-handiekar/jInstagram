package org.jinstagram.entity.common;

import com.google.gson.Gson;

import org.junit.Test;

public class CommentsTest {
    private Gson GSON_PARSER = new Gson();

    private static final String COMMENTS_JSON_NULL = "{\"comments\": null}";

    private static final String COMMENTS_JSON_DATA = "{ \"data\": [{\n"
            + "                \"created_time\": \"1279332030\",\n"
            + "                \"text\": \"Love the sign here\",\n"
            + "                \"from\": {\n"
            + "                    \"username\": \"mikeyk\",\n"
            + "                    \"full_name\": \"Mikey Krieger\",\n"
            + "                    \"id\": \"4\",\n"
            + "                    \"profile_picture\": \"http://distillery.s3.amazonaws.com/profiles/profile_1242695_75sq_1293915800.jpg\"\n"
            + "                },\n"
            + "                \"id\": \"8\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"created_time\": \"1279341004\",\n"
            + "                \"text\": \"Chilako taco\",\n"
            + "                \"from\": {\n"
            + "                    \"username\": \"kevin\",\n"
            + "                    \"full_name\": \"Kevin S\",\n"
            + "                    \"id\": \"3\",\n"
            + "                    \"profile_picture\": \"...\"\n"
            + "                },\n"
            + "                \"id\": \"3\"\n"
            + "            }],\n"
            + "            \"count\": 2\n"
            + "        }";


    @Test
    public void testCommentsEntity_Null() {
        GSON_PARSER.fromJson(COMMENTS_JSON_NULL, Comments.class);
    }

    @Test
    public void testCaptionEntity_WithData() {
        GSON_PARSER.fromJson(COMMENTS_JSON_DATA, Comments.class);
    }


}
