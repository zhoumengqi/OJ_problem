public class intToRoman {

    String[][] roman = {
            {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
            {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
            {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
            {"", "M", "MM", "MMM"}
    };

    public String intToRoman(int num) {
        String res = "";
        int wei = 0;
        while (num != 0) {
            int yu = num % 10;
            res = roman[wei++][yu] + res;
            num /= 10;
        }
        return res;
    }


}
