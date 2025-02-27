class SqueakyClean {
    static String clean(String identifier) {
        identifier = identifier.replaceAll("\\s", "_");

        if(identifier.contains("-")){
            char capitalized = Character.toUpperCase(identifier.split("-")[1].charAt(0));
            identifier = identifier.split("-")[0] + capitalized + identifier.split("-")[1].substring(1);
        }

        // replace all 4, 3, 0, 1 and 7 with a, e, o, l, t(resp.)
        identifier = identifier.replaceAll("4", "a")
                .replaceAll("3", "e")
                .replaceAll("0", "o")
                .replaceAll("1", "l")
                .replaceAll("7", "t");

        identifier = identifier.replaceAll("[^a-zA-Z_]", "");

        return identifier;
    }
}