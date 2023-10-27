package baseball;

import baseball.domain.BaseballNumber;
import baseball.dto.BaseballCount;
import camp.nextstep.edu.missionutils.Console;

public class BaseballGame {
    private final BaseballDisplay baseballDisplay = new BaseballDisplay();

    public void startBaseball() {
        baseballDisplay.startGame();
        do {
            BaseballNumber answerNumberList = createComputerBaseballNumber();
            playBaseball(answerNumberList);
        } while (wantToContinueGame());
        baseballDisplay.gameOver();
    }

    private BaseballNumber createComputerBaseballNumber() {
        return BaseballNumber.createComputerNumber();
    }

    private void playBaseball(BaseballNumber computerNumber) {
        BaseballCount baseballCount;
        do {
            BaseballNumber userNumber = inputUserBaseballNumber();
            baseballCount = createBaseballCount(computerNumber, userNumber);
            baseballDisplay.displayMessage(baseballCount.getResultBriefing());
        } while (!baseballCount.isAllStrike());

        baseballDisplay.allStrikeAndRoundOver();
    }

    private BaseballNumber inputUserBaseballNumber() {
        baseballDisplay.baseballNumberInputRequest();
        String inputString = Console.readLine();
        return BaseballNumber.createNumberByString(inputString);
    }

    private BaseballCount createBaseballCount(BaseballNumber computerNumber, BaseballNumber userNumber) {
        return computerNumber.matchTo(userNumber);
    }

    private boolean wantToContinueGame() {
        baseballDisplay.continueGameInputRequest();
        String inputString = Console.readLine();
        validateContinueGameInput(inputString);
        return inputString.equals("1");
    }

    private void validateContinueGameInput(String inputString) {
        if (!inputString.equals("1") && !inputString.equals("2")) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }
}
