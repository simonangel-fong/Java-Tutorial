package javatutorial.lesson15;

public enum PersonStatus {
    STUDYING, WORKING, SLEEPING, RELAXING;

    // 由于RuntimeException是unchecked exception，所以不需要throws
    public static PersonStatus string2Status(String status) {
        switch (status) {
            case "STUDYING":
                return STUDYING;
            case "WORKING":
                return WORKING;
            case "SLEEPING":
                return SLEEPING;
            case "RELAXING":
                return RELAXING;
            default:
                // 该处用于兜底，即当status都没有在switch时，触发runtime异常，用于提醒switch参数存在未考虑的值
                
                throw new RuntimeException("Unknow status: " + status);
        }
    }
}
