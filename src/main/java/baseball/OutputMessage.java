package baseball;

public enum OutputMessage {
    START_GAME_MESSAGE("숫자 야구 게임을 시작합니다."),
    BASEBALL_NUMBER_INPUT_REQUEST_MESSAGE("숫자를 입력해주세요 : "),
    ALL_STRIKE_AND_ROUND_OVER_MESSAGE("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    GAME_OVER_MESSAGE("게임 종료"),
    CONTINUE_GAME_INPUT_REQUEST_MESSAGE("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
