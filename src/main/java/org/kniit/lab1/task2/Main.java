class SimpleUrl  {
    private String protocol;
    private String siteName;
    private String domainZone;
    private String webpageName;
    private String webPageExtention;
    private String webpagePath;

    private int intParam;
    private double doubleParam;
    private String textParameter;

    public String getProtocol() { return protocol; }
    public String getSiteName() { return siteName; }
    public String getDomainZone() { return domainZone; }
    public String getWebpageName() { return webpageName; }
    public String getWebPageExtention() { return webPageExtention; }
    public String getWebpagePath() { return webpagePath; }
    public int getIntParam() { return intParam; }
    public double getDoubleParam() { return doubleParam; }
    public String getTextParameter() { return textParameter; }

    public void setProtocol(String s) { this.protocol = s; }
    public void setSiteName(String s) { this.siteName = s; }
    public void setDomainZone(String s) { this.domainZone = s; }
    public void setWebpageName(String s) { this.webpageName = s; }
    public void setWebPageExtention(String s) { this.webPageExtention = s; }
    public void setWebpagePath(String s) { this.webpagePath = s; }
    public void setIntParam(int n) { this.intParam = n; }
    public void setDoubleParam(double n) { this.doubleParam = n; }
    public void setTextParameter(String s) { this.textParameter = s; }

    public String toString()
    {
        return "protocol = " + protocol + '\n' +
        "address = " + siteName + "." + domainZone +'\n' +
        "domainZone = " + domainZone + '\n' +
        "siteName = " + siteName + '\n' +
        "webpageName = " + webpageName + "." + webPageExtention + '\n' +
        "webPageExtention  = " + webPageExtention + '\n';
    }
}


public class Main {
    public static void main(String[] args) {
        SimpleUrl url = new SimpleUrl();

        String text = "https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText";
        int i = text.indexOf("://");
        url.setProtocol(text.substring(0, i));

        int j = text.indexOf(".");

        url.setSiteName(text.substring(i + 3, j));

        i = text.indexOf("/", j);

        url.setDomainZone(text.substring(j + 1, i));

        int x = text.indexOf("?", i);
        j = text.lastIndexOf("/", x);
        int t = text.indexOf(".", j);

        url.setWebpageName(text.substring(j + 1, t));
        url.setWebPageExtention(text.substring(t + 1, x));
        url.setWebpagePath(text.substring(i + 1, j));

        i = text.indexOf("intParam=", x);
        j = text.indexOf("&", i);
        url.setIntParam(Integer.parseInt(text.substring(i + 9, j)));

        i = text.indexOf("doubleParam=", x);
        j = text.indexOf("&", i);
        url.setDoubleParam(Double.parseDouble(text.substring(i + 12, j)));

        i = text.indexOf("textParameter", x);
        url.setTextParameter(text.substring(i + 14));

        System.out.println(url);
    }
}


