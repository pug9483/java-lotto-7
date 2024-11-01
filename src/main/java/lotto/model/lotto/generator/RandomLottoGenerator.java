package lotto.model.lotto.generator;

import static lotto.util.LottoConstants.LOTTO_NUMBERS_COUNT;
import static lotto.util.LottoConstants.LOTTO_NUMBER_MAX;
import static lotto.util.LottoConstants.LOTTO_NUMBER_MIN;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import lotto.model.lotto.Lotto;

public class RandomLottoGenerator implements LottoGenerator{
    @Override
    public Lotto generateLotto() {
        return new Lotto(Randoms.pickUniqueNumbersInRange(LOTTO_NUMBER_MIN, LOTTO_NUMBER_MAX, LOTTO_NUMBERS_COUNT));
    }
}
