package org.example.Junior.sem1.Task2;

/**
 * Чебурек
 */
public class Cheburek implements SemiFinishedFood{
    @Override
    public boolean getProteins() {
        return false;
    }

    @Override
    public boolean getFats() {
        return true;
    }

    @Override
    public boolean getCarbohydrates() {
        return false;
    }

    @Override
    public String getName() {
        return "Чебурек";
    }


}
