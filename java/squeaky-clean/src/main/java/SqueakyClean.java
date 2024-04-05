class SqueakyClean {
    static String clean(String identifier) {

        // Stringbuilder OP!
        StringBuilder result = new StringBuilder();
        // Poblamos el String;
        for (int i = 0; i < identifier.length(); i++) {
            result.append(identifier.charAt(i));
        }

        // Este ciclo cambia los espacios por underscores.
        for (int i = 0; i < identifier.length(); i++) {
            if (identifier.charAt(i) == ' ') {
                result.replace(i, i + 1, String.valueOf('_'));
            }
        }

        // Ciclo para cambiar de kebabcase a camelCase.
        for (int i = 0; i < identifier.length(); i++) {
            if (identifier.charAt(i) == '-') {
                char c = Character.toUpperCase(identifier.charAt(i + 1));
                result.replace(i, i + 2, String.valueOf(c));
            }
        }

        // Ciclo para cambiar leetspeak con texto normal.
        for (int i = 0; i < identifier.length(); i++) {
            if (identifier.charAt(i) == '4') {
                result.replace(i, i + 1, String.valueOf('a'));
            } else if (identifier.charAt(i) == '3') {
                result.replace(i, i + 1, String.valueOf('e'));
            } else if (identifier.charAt(i) == '0') {
                result.replace(i, i + 1, String.valueOf('o'));
            } else if (identifier.charAt(i) == '1') {
                result.replace(i, i + 1, String.valueOf('l'));
            } else if (identifier.charAt(i) == '7') {
                result.replace(i, i + 1, String.valueOf('t'));
            }
        }

        StringBuilder result2 = new StringBuilder();
        String word = result.toString();

        // Este ciclo elimina todos los otros caracteres raros.
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetterOrDigit(word.charAt(i)) || (word.charAt(i) == '_')) {
                result2.append(word.charAt(i));
            }
        }


        return result2.toString();
    }
}
