public class FootballMatchReports {
    public static String onField(int shirtNum) {
        switch (shirtNum) {
            case 1:
                return "goalie";
            case 2:
                return "left back";
            case 3, 4:
                return "center back";
            case 5:
                return "right back";
            case 6, 7, 8:
                return "midfielder";
            case 9:
                return "left wing";
            case 10:
                return "striker";
            case 11:
                return "right wing";
            default:
                throw new IllegalArgumentException();
        }
    }

    // 1 -> "goalie"
    // 2 -> "left back"
    // 3 & 4 "center back"
    // 5 -> "right back"
    // 6, 7, & 8 -> "midfielder"
    // 9 -> "left wing"
    // 10 -> "striker"
    // 11 -> "right wing"
}