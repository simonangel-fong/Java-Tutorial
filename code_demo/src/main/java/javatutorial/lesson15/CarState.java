package javatutorial.lesson15;

public enum CarState {
    DRIVING, WAITING, PARKING;

    // throws声明该方法中存在没有处理的异常
    public static CarState string2State(String state) throws Exception {
        switch (state) {
            case "Driving":
                return DRIVING;
            case "Waiting":
                return WAITING;
            case "Parking":
                return PARKING;
            default:
                // 声明抛出一个checked exception
                throw new Exception("Unknow state(" + state + ")");
        }
    }
}
