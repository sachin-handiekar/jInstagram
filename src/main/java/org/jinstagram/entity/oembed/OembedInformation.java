package org.jinstagram.entity.oembed;

import com.google.gson.annotations.SerializedName;

/**
 * Holds information returned from the oembed API endpoint
 * https://www.instagram.com/developer/embedding/#oembed
 *
 * @author Brenn Hill
 */
public class OembedInformation {

    @SerializedName("provider_url")
    private String providerUrl;

    @SerializedName("title")
    private String title;

    @SerializedName("url")
    private String url;

    @SerializedName("author_name")
    private String authorName;

    @SerializedName("height")
    private String height;

    @SerializedName("width")
    private String width;

    @SerializedName("html")
    private String html;

    @SerializedName("thumbnail_url")
    private String thumbnailUrl;

    @SerializedName("thumbnail_width")
    private int thumbnailWidth;

    @SerializedName("thumbnail_height")
    private int thumbnailHeight;

    @SerializedName("media_id")
    private String mediaId;

    @SerializedName("version")
    private String version;

    @SerializedName("author_url")
    private String authorUrl;

    @SerializedName("provider_name")
    private String providerName;

    @SerializedName("type")
    private String type;

    public String getProviderUrl() {
        return providerUrl;
    }

    public void setProviderUrl(String providerUrl) {
        this.providerUrl = providerUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAuthorUrl() {
        return authorUrl;
    }

    public void setAuthorUrl(String authorUrl) {
        this.authorUrl = authorUrl;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getHtml() { return html; }

    public void setHtml(final String html) { this.html = html; }

    public String getThumbnailUrl() { return thumbnailUrl; }

    public void setThumbnailUrl(final String thumbnailUrl) { this.thumbnailUrl = thumbnailUrl; }

    public int getThumbnailWidth() { return thumbnailWidth; }

    public void setThumbnailWidth(final int thumbnailWidth) { this.thumbnailWidth = thumbnailWidth; }

    public int getThumbnailHeight() { return thumbnailHeight; }

    public void setThumbnailHeight(final int thumbnailHeight) { this.thumbnailHeight = thumbnailHeight; }

    /*
                 * (non-Javadoc)
                 *
                 * @see java.lang.Object#toString()
                 */
    @Override
    public String toString() {
        return "OembedInformation ["
                + (providerUrl != null ? "provider_url=" + providerUrl + ", "  : "")
                + (title != null ? "title=" + title + ", " : "")
                + (url != null ? "url=" + url + ", " : "")
                + (authorName != null ? "author_name=" + authorName + ", " : "")
                + (height != null ? "height=" + height + ", " : "")
                + (width != null ? "width=" + width + ", " : "")
                + (version != null ? "version=" + version + ", " : "")
                + (authorUrl != null ? "author_url=" + authorUrl + ", " : "")
                + (providerName != null ? "provider_name=" + providerName + ", " : "")
                + (type != null ? "type=" + type + ", " : "")
                + (mediaId != null ? "mediaId=" + mediaId : "")
                + "]";
    }

}
