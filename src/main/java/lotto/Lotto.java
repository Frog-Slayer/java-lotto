package lotto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        validateByRange(numbers);
        validateBySize(numbers);
    }

    private void validateByRange(List<Integer> numbers){
        for (Integer number : numbers){
            if (number > 45 || number < 1) throw new IllegalArgumentException();
        }
    }

    private void validateBySize(List<Integer> numbers){
        if (numbers.size() != 6){
            throw new IllegalArgumentException();
        }
    }

    private void validateByDistinction(List<Integer> numbers){
        Set<Integer> distinctNumbers = new HashSet<>(numbers);
        if (distinctNumbers.size() != numbers.size()) throw new IllegalArgumentException();
    }

    public Integer countMatched(List<Integer> winningNumbers){
        Integer number = 0;
        for (Integer winningNumber : winningNumbers){
               if (numbers.contains(winningNumber)) number += 1;
        }
        return number;
    }

    public Boolean contains(Integer bonus){
        return numbers.contains(bonus);
    }


}
