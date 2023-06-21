package decktask;

/*
Дана колода карт (без мастей, просто числа). Карты выкладываются на стол по следующему алгоритму:
1) Карта с верхушки колоды кладётся на стол
2) Следующая карта с верхушки кладется в низ колоды

Необходимо реализовать методы getTable и getDeck - первый отображает расположение карт на столе после разбора колоды,
а второй должен по расположению карт на столе собирать карты назад в колоду, так чтобы порядок карт был идентичен изначальному
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Deck {

    private static final Deque<Integer> deck = createDeck(36);
    private static final Stack<Integer> table = new Stack<>();

    public static void main(String[] args) {
        System.out.println("Колода:\n" + deck);
        System.out.println("Расположение карт на столе:\n" + getTable());
        System.out.println("Колода после сбора:\n" + getDeck());
    }

    public static Deque<Integer> createDeck(int deckSize) {
        Deque<Integer> deck = new ArrayDeque<>();
        for (int i = 1; i <= deckSize; i++) {
            deck.add(i);
        }
        return deck;
    }

    public static Stack<Integer> getTable() {
        while (deck.size() > 1) {
            table.push(deck.pollLast());
            deck.addFirst(deck.pollLast());
        }
        table.push(deck.pollLast());
        return table;
    }

    public static Deque<Integer> getDeck() {
        deck.add(table.pop());
        while (table.size() > 1) {
            deck.addLast(table.pop());
            deck.addLast(deck.pollFirst());
        }
        deck.add(table.pop());
        return deck;
    }
}
