package enums;

public enum EnumMethods {

    MORNING {
        public String getHours() { return "5:00 AM - 11:59 AM"; }
    },
    DAY {
        public String getHours() { return "12:00 PM - 5:59 PM"; }
    },
    EVENING {
        public String getHours() { return "6:00 PM - 9:59 PM"; }
    },
    NIGHT {
        public String getHours() { return "10:00 PM - 4:59 AM"; }
    };
    public abstract String getHours();
}