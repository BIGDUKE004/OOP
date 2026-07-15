package BankingSystem;

public enum BankDigits {
    ACCESSBANK("044", "Access Bank"),
    AFRIBANK("014", "Afribank"),
    CITIBANK("023", "Citibank"),
    DIAMOND_BANK("063", "Diamond Bank"),
    ECOBANK("050", "Ecobank"),
    EQUITORIAL_TRUST_BANK("040", "Equitorial Trust Bank"),
    FIRSTBANK("011", "First Bank"),
    FCMB("214", "First City Monument Bank"),
    FIDELITY_BANK("070", "Fidelity Bank"),
    FINBANK("085", "FinBank"),
    GUARANTY_TRUST_BANK("058", "Guaranty Trust Bank"),
    INTERCONTINENTAL_BANK("069", "Intercontinental Bank"),
    OCEANICBANK("056", "Oceanic Bank"),
    BANKPHB("082", "Bank PHB"),
    SKYEBANK("076", "Skye Bank"),
    SPRINGBANK("084", "Spring Bank"),
    STANBICIBTC("221", "Stanbic IBTC"),
    STANDARDCHARTERED_BANK("068", "Standard Chartered Bank"),
    STERLINGBANK("232", "Sterling Bank"),
    UNITEDBANKFORAFRICA("033", "United Bank for Africa"),
    UNIONBANK("032", "Union Bank"),
    WEMABANK("035", "Wema Bank"),
    ZENITHBANK("057", "Zenith Bank"),
    UNITYBANK("215", "Unity Bank");

    private final String bankName;
    private final String code;

    BankDigits(String code, String bankName) {
        this.code = code;
        this.bankName = bankName;
    }

    public String getCode() {
        return code;
    }

    public String getBankName() {
        return bankName;
    }
}

