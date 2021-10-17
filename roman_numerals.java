enum roman_numerals {
    I(1), II(2), III(3), IV(4), V(5),
    VI(6), VII(7), VIII(8), IX(9), X(10);
    private int code_to_roman;
    roman_numerals(int code_to_roman) {
        this.code_to_roman = code_to_roman;
    }
    public int getCode_to_roman() {
        return code_to_roman;
    }
}
