package com.splendor;

import com.splendor.board.Board;

public class BoardTest {

    public static void main(String[] args) {
        Board board = new Board();
        String[] deckPreview = board.deckToStringArray(4);
        System.out.println(String.join("\n", deckPreview));
    }
}