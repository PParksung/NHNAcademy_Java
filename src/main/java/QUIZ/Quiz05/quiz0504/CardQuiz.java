package QUIZ.Quiz05.quiz0504;

import java.util.*;

public class CardQuiz {
    // 문제 1
    public static class Card {
        int suit;  // 카드의 무늬
        int value; // 카드의 값
        // TODO: 생성자 작성
        public Card(int suit, int value) {
            this.suit = suit;
            this.value = value;
        }
        public static void main(String[] args) {
            System.out.println("문제 1");
            // TODO: Card 객체 생성 및 값 출력
            Card card = new Card(1, 13);
            System.out.println(card.suit + " " + card.value);
        }
    }

    // 문제 2
    public static class Card2 {
        public static final int SPADES = 0;
        public static final int HEARTS = 1;
        public static final int DIAMONDS = 2;
        public static final int CLUBS = 3;
        public static final int ACE = 1;
        public static final int JACK = 11;
        public static final int QUEEN = 12;
        public static final int KING = 13;
        int suit;
        int value;
        // TODO: 생성자 작성
        public Card2(int suit, int value) {
            this.suit = suit;
            this.value = value;
        }
        public static void main(String[] args) {
            System.out.println("문제 2");
            // TODO: Card 객체 생성 및 값 출력
            Card2 card = new Card2(SPADES, ACE);
            System.out.println(card.suit + " " + card.value);
        }
    }

    // 문제 3
    public static class Card3 {
        int suit;
        int value;
        // TODO: 생성자와 toString 메서드 작성
        public Card3(int suit, int value) {
            this.suit = suit;
            this.value = value;
        }
        public String toString() {
            return "Card [suit=" + suit + ", value=" + value + "]";
        }
        public static void main(String[] args) {
            System.out.println("문제 3");
            // TODO: Card 객체 생성 및 출력
            Card3 card = new Card3(1, 10);
            System.out.println(card);
        }
    }

    // 문제 4
    public static class Card4 {
        int suit;
        int value;
        public Card4(int suit, int value) {
            this.suit = suit;
            this.value = value;
        }
        public String toString() {
            return "Card [suit=" + suit + ", value=" + value + "]";
        }
    }
    public static class Hand4 {
        ArrayList<Card4> cards;
        // TODO: 생성자 및 addCard 메서드 작성
        public Hand4() {
            cards = new ArrayList<>();
        }
        public void addCard(Card4 card) {
            cards.add(card);
        }
        public static void main(String[] args) {
            System.out.println("문제 4");
            // TODO: Hand 객체 생성 및 카드 추가
            // TODO: 손패 출력
            Hand4 hand = new Hand4();
            hand.addCard(new Card4(1, 10));
            hand.addCard(new Card4(2, 5));
            for (Card4 c : hand.cards) {
                System.out.println(c);
            }
        }
    }

    // 문제 5
    public static class Card5 {
        int suit;
        int value;
        public Card5(int suit, int value) {
            this.suit = suit;
            this.value = value;
        }
        public String toString() {
            return "Card [suit=" + suit + ", value=" + value + "]";
        }
    }
    public static class Hand5 {
        ArrayList<Card5> cards;
        // TODO: 생성자 및 정렬 메서드 작성
        public Hand5() {
            cards = new ArrayList<>();
        }
        public void addCard(Card5 card) {
            cards.add(card);
        }
        public void sortBySuit() {
            cards.sort(Comparator.comparingInt(c -> c.suit));
        }
        public void sortByValue() {
            cards.sort(Comparator.comparingInt(c -> c.value));
        }
        public static void main(String[] args) {
            System.out.println("문제 5");
            // TODO: Hand 객체 생성 및 카드 추가
            // TODO: 카드 정렬 및 출력
            Hand5 hand = new Hand5();
            hand.addCard(new Card5(2, 5));
            hand.addCard(new Card5(1, 10));
            hand.addCard(new Card5(3, 2));
            hand.sortBySuit();
            for (Card5 c : hand.cards) System.out.println(c);
            hand.sortByValue();
            for (Card5 c : hand.cards) System.out.println(c);
        }
    }

    // 문제 6
    public static class Card6 {
        int suit;
        int value;
        public Card6(int suit, int value) {
            this.suit = suit;
            this.value = value;
        }
        public String toString() {
            return "Card [suit=" + suit + ", value=" + value + "]";
        }
    }
    public static class Deck6 {
        Card6[] cards;
        // TODO: 생성자 작성
        public Deck6() {
            cards = new Card6[52];
            int idx = 0;
            for (int suit = 0; suit < 4; suit++) {
                for (int value = 1; value <= 13; value++) {
                    cards[idx++] = new Card6(suit, value);
                }
            }
        }
        public static void main(String[] args) {
            System.out.println("문제 6");
            // TODO: Deck 객체 생성 및 카드 출력
            Deck6 deck = new Deck6();
            for (Card6 c : deck.cards) System.out.println(c);
        }
    }

    // 문제 7
    public static class Card7 {
        int suit;
        int value;
        public Card7(int suit, int value) {
            this.suit = suit;
            this.value = value;
        }
        public String toString() {
            return "Card [suit=" + suit + ", value=" + value + "]";
        }
    }
    public static class Deck7 {
        Card7[] cards;
        // TODO: 생성자 및 shuffle 메서드 작성
        public Deck7() {
            cards = new Card7[52];
            int idx = 0;
            for (int suit = 0; suit < 4; suit++) {
                for (int value = 1; value <= 13; value++) {
                    cards[idx++] = new Card7(suit, value);
                }
            }
        }
        public void shuffle() {
            Random rand = new Random();
            for (int i = cards.length - 1; i > 0; i--) {
                int j = rand.nextInt(i + 1);
                Card7 temp = cards[i];
                cards[i] = cards[j];
                cards[j] = temp;
            }
        }
        public static void main(String[] args) {
            System.out.println("문제 7");
            // TODO: Deck 객체 생성 및 카드 섞기
            Deck7 deck = new Deck7();
            for (Card7 c : deck.cards) System.out.println(c);
            deck.shuffle();
            System.out.println("--- After shuffle ---");
            for (Card7 c : deck.cards) System.out.println(c);
        }
    }

    // 문제 8
    public static class Card8 {
        int suit;
        int value;
        public Card8(int suit, int value) {
            this.suit = suit;
            this.value = value;
        }
        public String toString() {
            return "Card [suit=" + suit + ", value=" + value + "]";
        }
    }
    public static class Deck8 {
        Card8[] cards;
        public Deck8() {
            cards = new Card8[52];
            int idx = 0;
            for (int suit = 0; suit < 4; suit++) {
                for (int value = 1; value <= 13; value++) {
                    cards[idx++] = new Card8(suit, value);
                }
            }
        }
        public void shuffle() {
            Random rand = new Random();
            for (int i = cards.length - 1; i > 0; i--) {
                int j = rand.nextInt(i + 1);
                Card8 temp = cards[i];
                cards[i] = cards[j];
                cards[j] = temp;
            }
        }
    }
    public static class CardGame8 {
        public static void main(String[] args) {
            System.out.println("문제 8");
            // TODO: Deck 객체 생성 및 카드 섞기
            // TODO: 플레이어에게 카드 분배 및 출력
            Deck8 deck = new Deck8();
            deck.shuffle();
            Card8[] player = Arrays.copyOfRange(deck.cards, 0, 5);
            for (Card8 c : player) System.out.println(c);
        }
    }

    // 문제 9
    public static class Card9 {
        int suit;
        int value;
        public Card9(int suit, int value) {
            this.suit = suit;
            this.value = value;
        }
        public String toString() {
            return "Card [suit=" + suit + ", value=" + value + "]";
        }
    }
    public static class Hand9 {
        ArrayList<Card9> cards;
        // TODO: 생성자 및 removeCard 메서드 작성
        public Hand9() {
            cards = new ArrayList<>();
        }
        public void addCard(Card9 card) {
            cards.add(card);
        }
        public void removeCard(Card9 card) {
            cards.removeIf(c -> c.suit == card.suit && c.value == card.value);
        }
        public static void main(String[] args) {
            System.out.println("문제 9");
            // TODO: Hand 객체 생성 및 카드 추가 및 제거
            Hand9 hand = new Hand9();
            Card9 c1 = new Card9(1, 10);
            Card9 c2 = new Card9(2, 5);
            hand.addCard(c1);
            hand.addCard(c2);
            hand.removeCard(c1);
            for (Card9 c : hand.cards) System.out.println(c);
        }
    }

    // 문제 10
    public static class Card10 {
        public static final int SPADES = 0;
        public static final int HEARTS = 1;
        public static final int DIAMONDS = 2;
        public static final int CLUBS = 3;
        public static final int ACE = 1;
        public static final int JACK = 11;
        public static final int QUEEN = 12;
        public static final int KING = 13;
        int suit;
        int value;
        public Card10(int suit, int value) {
            this.suit = suit;
            this.value = value;
        }
        public String toString() {
            return "Card [suit=" + suit + ", value=" + value + "]";
        }
    }
    public static class Main10 {
        public static void main(String[] args) {
            System.out.println("문제 10");
            // TODO: Card 상수를 사용한 객체 생성 및 출력
            Card10 card = new Card10(Card10.SPADES, Card10.ACE);
            System.out.println(card);
        }
    }

    // 문제 11
    public static class Card11 {
        int suit;
        int value;
        public Card11(int suit, int value) {
            this.suit = suit;
            this.value = value;
        }
        public String toString() {
            return "Card [suit=" + suit + ", value=" + value + "]";
        }
    }
    public static class Deck11 {
        Card11[] cards;
        int cardsUsed;
        // TODO: 생성자 및 dealCard 메서드 작성
        public Deck11() {
            cards = new Card11[52];
            int idx = 0;
            for (int suit = 0; suit < 4; suit++) {
                for (int value = 1; value <= 13; value++) {
                    cards[idx++] = new Card11(suit, value);
                }
            }
            cardsUsed = 0;
        }
        public Card11 dealCard() {
            if (cardsUsed < cards.length) return cards[cardsUsed++];
            return null;
        }
        public static void main(String[] args) {
            System.out.println("문제 11");
            // TODO: Deck 객체 생성 및 카드 분배
            Deck11 deck = new Deck11();
            System.out.println(deck.dealCard());
            System.out.println("남은 카드 수: " + (deck.cards.length - deck.cardsUsed));
        }
    }

    // 문제 12
    public static class Card12 {
        int suit;
        int value;
        public Card12(int suit, int value) {
            this.suit = suit;
            this.value = value;
        }
        public String toString() {
            return "Card [suit=" + suit + ", value=" + value + "]";
        }
    }
    public static class Hand12 {
        ArrayList<Card12> cards;
        // TODO: 생성자 및 clear 메서드 작성
        public Hand12() {
            cards = new ArrayList<>();
        }
        public void addCard(Card12 card) {
            cards.add(card);
        }
        public void clear() {
            cards.clear();
        }
        public static void main(String[] args) {
            System.out.println("문제 12");
            // TODO: Hand 객체 생성 및 카드 추가 후 clear 호출
            Hand12 hand = new Hand12();
            hand.addCard(new Card12(1, 10));
            hand.addCard(new Card12(2, 5));
            hand.clear();
            System.out.println(hand.cards);
        }
    }

    // 문제 13
    public static class Card13 {
        int suit;
        int value;
        public Card13(int suit, int value) {
            this.suit = suit;
            this.value = value;
        }
        public String toString() {
            return "Card [suit=" + suit + ", value=" + value + "]";
        }
    }
    public static class Hand13 {
        ArrayList<Card13> cards;
        // TODO: 생성자 및 getCard 메서드 작성
        public Hand13() {
            cards = new ArrayList<>();
        }
        public void addCard(Card13 card) {
            cards.add(card);
        }
        public Card13 getCard(int position) {
            return cards.get(position);
        }
        public static void main(String[] args) {
            System.out.println("문제 13");
            // TODO: Hand 객체 생성 및 카드 추가 후 특정 카드 반환
            Hand13 hand = new Hand13();
            hand.addCard(new Card13(1, 10));
            hand.addCard(new Card13(2, 5));
            System.out.println(hand.getCard(1));
        }
    }

    // 문제 14
    public static class Card14 {
        int suit;
        int value;
        public Card14(int suit, int value) {
            this.suit = suit;
            this.value = value;
        }
        public String toString() {
            return "Card [suit=" + suit + ", value=" + value + "]";
        }
    }
    public static class Deck14 {
        Card14[] cards;
        int cardsUsed;
        public Deck14() {
            cards = new Card14[52];
            int idx = 0;
            for (int suit = 0; suit < 4; suit++) {
                for (int value = 1; value <= 13; value++) {
                    cards[idx++] = new Card14(suit, value);
                }
            }
            cardsUsed = 0;
        }
        public Card14 dealCard() {
            if (cardsUsed < cards.length) return cards[cardsUsed++];
            return null;
        }
    }
    public static class Hand14 {
        ArrayList<Card14> cards;
        public Hand14() {
            cards = new ArrayList<>();
        }
        public void addCard(Card14 card) {
            cards.add(card);
        }
        public String toString() {
            return cards.toString();
        }
    }
    public static class Main14 {
        public static void main(String[] args) {
            System.out.println("문제 14");
            // TODO: Deck 및 Hand 객체 생성
            // TODO: 덱에서 카드 분배 및 손패 출력
            Deck14 deck = new Deck14();
            Hand14 hand = new Hand14();
            for (int i = 0; i < 5; i++) {
                hand.addCard(deck.dealCard());
            }
            System.out.println(hand);
        }
    }

    // 문제 15
    public static class Card15 {
        int suit;
        int value;
        public Card15(int suit, int value) {
            this.suit = suit;
            this.value = value;
        }
        public String toString() {
            return "Card [suit=" + suit + ", value=" + value + "]";
        }
    }
    public static class Hand15 {
        ArrayList<Card15> cards;
        public Hand15() {
            cards = new ArrayList<>();
        }
        public void addCard(Card15 card) {
            cards.add(card);
        }
        public int sum() {
            int s = 0;
            for (Card15 c : cards) s += c.value;
            return s;
        }
    }
    public static class CardGame15 {
        public static void main(String[] args) {
            System.out.println("문제 15");
            // TODO: 두 명의 플레이어 손패 생성 및 카드 추가
            // TODO: 합계를 비교하여 승자를 출력
            Hand15 h1 = new Hand15();
            Hand15 h2 = new Hand15();
            for (int i = 0; i < 5; i++) {
                h1.addCard(new Card15(1, i + 1));
                h2.addCard(new Card15(2, 5 - i));
            }
            int sum1 = h1.sum();
            int sum2 = h2.sum();
            if (sum1 > sum2) System.out.println("Player 1 wins");
            else if (sum2 > sum1) System.out.println("Player 2 wins");
            else System.out.println("Draw");
        }
    }

    // 문제 16
    public static class Card16 {
        int suit;
        int value;
        public Card16(int suit, int value) {
            this.suit = suit;
            this.value = value;
        }
        public String toString() {
            return "Card [suit=" + suit + ", value=" + value + "]";
        }
    }
    public static class Deck16 {
        Card16[] cards;
        int cardsUsed;
        public Deck16() {
            cards = new Card16[52];
            int idx = 0;
            for (int suit = 0; suit < 4; suit++) {
                for (int value = 1; value <= 13; value++) {
                    cards[idx++] = new Card16(suit, value);
                }
            }
            cardsUsed = 0;
        }
        public Card16 dealCard() {
            if (cardsUsed < cards.length) return cards[cardsUsed++];
            return null;
        }
    }
    public static class Main16 {
        public static void main(String[] args) {
            System.out.println("문제 16");
            // TODO: Deck 객체 생성 및 카드 분배
            // TODO: 값이 짝수인 카드만 출력
            Deck16 deck = new Deck16();
            for (int i = 0; i < 10; i++) {
                Card16 c = deck.dealCard();
                if (c.value % 2 == 0) System.out.println(c);
            }
        }
    }

    // 문제 17
    public static class Card17 {
        int suit;
        int value;
        public Card17(int suit, int value) {
            this.suit = suit;
            this.value = value;
        }
        public boolean equals(Object obj) {
            if (!(obj instanceof Card17)) return false;
            Card17 c = (Card17) obj;
            return suit == c.suit && value == c.value;
        }
        public int hashCode() {
            return Objects.hash(suit, value);
        }
        public String toString() {
            return "Card [suit=" + suit + ", value=" + value + "]";
        }
    }
    public static class Main17 {
        public static void main(String[] args) {
            System.out.println("문제 17");
            // TODO: Deck 객체 생성 및 중복 확인
            HashSet<Card17> set = new HashSet<>();
            for (int suit = 0; suit < 4; suit++) {
                for (int value = 1; value <= 13; value++) {
                    Card17 c = new Card17(suit, value);
                    if (!set.add(c)) {
                        System.out.println("중복 카드 발견: " + c);
                    }
                }
            }
            System.out.println("총 카드 수: " + set.size());
        }
    }

    // 문제 18
    public static class Card18 {
        int suit;
        int value;
        public Card18(int suit, int value) {
            this.suit = suit;
            this.value = value;
        }
        public String toString() {
            return "Card [suit=" + suit + ", value=" + value + "]";
        }
    }
    public static class Hand18 {
        ArrayList<Card18> cards;
        // TODO: 카드 필터링 메서드 작성
        public Hand18() {
            cards = new ArrayList<>();
        }
        public void addCard(Card18 card) {
            cards.add(card);
        }
        public List<Card18> filter() {
            List<Card18> result = new ArrayList<>();
            for (Card18 c : cards) if (c.value >= 10) result.add(c);
            return result;
        }
        public static void main(String[] args) {
            System.out.println("문제 18");
            // TODO: Hand 객체 생성 및 카드 추가 후 필터링
            Hand18 hand = new Hand18();
            hand.addCard(new Card18(1, 10));
            hand.addCard(new Card18(2, 5));
            hand.addCard(new Card18(3, 12));
            for (Card18 c : hand.filter()) System.out.println(c);
        }
    }

    // 문제 19
    public static class Card19 implements Comparable<Card19> {
        int suit;
        int value;
        public Card19(int suit, int value) {
            this.suit = suit;
            this.value = value;
        }
        public int compareTo(Card19 o) {
            return Integer.compare(this.value, o.value);
        }
        public String toString() {
            return "Card [suit=" + suit + ", value=" + value + "]";
        }
    }
    public static class Main19 {
        public static void main(String[] args) {
            System.out.println("문제 19");
            // TODO: Deck 객체 생성 및 카드 분배
            // TODO: 카드를 정렬하여 출력
            Card19[] hand = new Card19[5];
            for (int i = 0; i < 5; i++) hand[i] = new Card19(1, 10 - i);
            Arrays.sort(hand);
            for (Card19 c : hand) System.out.println(c);
        }
    }

    // 문제 20
    public static class Card20 {
        private final int suit;
        private final int value;
        // TODO: 생성자 및 getter 작성
        public Card20(int suit, int value) {
            this.suit = suit;
            this.value = value;
        }
        public int getSuit() { return suit; }
        public int getValue() { return value; }
        public static void main(String[] args) {
            System.out.println("문제 20");
            // TODO: Card 객체 생성 및 값 출력
            Card20 card = new Card20(1, 13);
            System.out.println(card.getSuit() + " " + card.getValue());
        }
    }

    public static void main(String[] args) {
        Card.main(args);
        Card2.main(args);
        Card3.main(args);
        Hand4.main(args);
        Hand5.main(args);
        Deck6.main(args);
        Deck7.main(args);
        CardGame8.main(args);
        Hand9.main(args);
        Main10.main(args);
        Deck11.main(args);
        Hand12.main(args);
        Hand13.main(args);
        Main14.main(args);
        CardGame15.main(args);
        Main16.main(args);
        Main17.main(args);
        Hand18.main(args);
        Main19.main(args);
        Card20.main(args);
    }
}