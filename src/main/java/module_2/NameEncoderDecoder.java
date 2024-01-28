package module_2;

public class NameEncoderDecoder {
    public static void main(String[] args) {
        NameEncoderDecoder names = new NameEncoderDecoder();

        String encodeOfName = names.encode(("Crab"));
        System.out.println("names.encode(\"Crab\") = " + names.encode("Crab"));

        encodeOfName = names.encode(("Fish"));
        System.out.println("names.encode(\"Fish\") = " + names.encode("Fish"));

        encodeOfName = names.decode((NOTFORYOU + "Cr5b" + YESNOTFORYOU));
        System.out.println("names.decode(\"Cr5b\") = " + encodeOfName);

        encodeOfName = names.decode(("NOTFORYOUNOTFORYOUYESNOTFORYOU"));
        System.out.println("names.decode(\"NOTFORYOUNOTFORYOUYESNOTFORYOU\") = " + encodeOfName);
    }

    private static final String NOTFORYOU = "NOTFORYOU";
    private static final String YESNOTFORYOU = "YESNOTFORYOU";

    public String encode(String name) {
        String result = name
                .replaceAll("e", "1")
                .replaceAll("u", "2")
                .replaceAll("i", "3")
                .replaceAll("o", "4")
                .replaceAll("a", "5");
        return NOTFORYOU + result + YESNOTFORYOU;
    }

    public String decode(String name) {
        return name
                .replaceAll("1", "e")
                .replaceAll("2", "u")
                .replaceAll("3", "i")
                .replaceAll("4", "o")
                .replaceAll("5", "a").substring(NOTFORYOU.length(), name.length() - YESNOTFORYOU.length());
    }
}
