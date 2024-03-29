package com.splendor.constants;


/**
 * Constants class that holds various game-related values.
 */
public final class Values {

    /**
     * Maximum number of players in the game.
     */
    public static final Integer MAX_PLAYERS = 4;

    /**
     * Maximum number of tokens a player can have.
     */
    public static final Integer TOKEN_LIMIT = 10;

    /**
     * Number of tokens given when taking tokens of the same resource.
     */
    public static final int SAME_TOKEN_NUMBER = 2;

    /**
     * Number of tokens given when taking tokens of different resources.
     */
    public static final int DIFF_TOKEN_NUMBER = 1;

    /**
     * Limit on the number of different tokens a player can have.
     */
    public static final int DIFF_TOKEN_LIMIT = 3;

    /**
     * Number of tiers in the game.
     */
    public static final int TIER_NUMBER = 3;

    /**
     * Maximum number of nobles in the game.
     */
    public static final int NOBLE_LIMIT = 4;

    /**
     * Number of columns displayed on the game board.
     */
    public final static int COLUMN_NUMBER = 4;

    /**
     * Maximum number of reserved cards per player.
     */
    public final static int MAX_RESERVED_CARDS = 3;

    /**
     * Maximum number of resources per development card.
     */
    public static final int CARD_RESOURCES_LIMIT = 4;

    /**
     * Maximum number of resources a player can have.
     */
    public static final int MAX_NUMBER_RESOURCES_PER_PLAYER = 10;

    /**
     * Minimum number of resources required to gain a token.
     */
    public static final int REQUIRED_RESOURCES = 4;

    /**
     * Points threshold to win the game.
     */
    public static final int WIN_THRESHOLD = 15;

    /**
     * Number of rows on the game board.
     */
    public static final int ROWS_BOARD = 36;

    /**
     * Number of rows in the console.
     */
    public static final int ROWS_CONSOLE = 8;

    /**
     * Number of columns in the console.
     */
    public static final int COLUMNS_CONSOLE = 82;

    /**
     * Regular expression pattern for input validation.
     * Allows only uppercase letters, numbers, and spaces.
     */
    public static final String INPUT_REGEX = "[^A-Z1-9 ]+";
}
