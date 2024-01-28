package module_7;

public class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}

class GooSearchResult{
    private final String url;

    public String getUrl() {
        return url;
    }

    public GooSearchResult(String url) {
        this.url = url;
    }
    public String parseDomain(){
        int start = url.indexOf("://") + 3;
        int end = url.indexOf("/", start);

        if(end < 0) {
            return  url.substring(start);
        }else {
            return url.substring(start, end);
        }
    }
}
