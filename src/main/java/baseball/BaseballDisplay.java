package baseball;

public class BaseballDisplay {
    public void startGame() {
        displayMessage(OutputMessage.START_GAME_MESSAGE);
    }

    public void baseballNumberInputRequest() {
        displayMessage(OutputMessage.BASEBALL_NUMBER_INPUT_REQUEST_MESSAGE);
    }

    public void allStrikeAndRoundOver() {
        displayMessage(OutputMessage.ALL_STRIKE_AND_ROUND_OVER_MESSAGE);
    }

    public void gameOver() {
        displayMessage(OutputMessage.GAME_OVER_MESSAGE);
    }

    public void continueGameInputRequest() {
        displayMessage(OutputMessage.CONTINUE_GAME_INPUT_REQUEST_MESSAGE);
    }

    public void displayMessage(OutputMessage message) {
        displayMessage(message.getMessage());
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
