public class PalavrasReservadas {
    public static void main(String[] args) throws Exception {
        // Palavras reservadas do Java
        String[] palavrasReservadas = {
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float",
            "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
            "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp",
            "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile",
            "while"
        };

        // Imprime as palavras reservadas
        for (String palavra : palavrasReservadas) {
            System.out.println(palavra);
        }
    }
}
