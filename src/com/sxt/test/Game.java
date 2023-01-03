package com.sxt.test;

/**
 * a interface for game
 */
public interface Game {
    /**
     * the price of the game
     */
    int price = 100;

    int charge(int money);

    /**
     * charge money
     *
     * @return
     */
    int charge();
}
