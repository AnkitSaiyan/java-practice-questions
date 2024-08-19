package com.questions.maths;

public class NumberToWords {
    public static String wordMapping(int num) {
        return switch (num) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            case 10 -> "Ten";
            case 11 -> "Eleven";
            case 12 -> "Twelve";
            case 13 -> "Thirteen";
            case 14 -> "Fourteen";
            case 15 -> "Fifteen";
            case 16 -> "Sixteen";
            case 17 -> "Seventeen";
            case 18 -> "Eighteen";
            case 19 -> "Nineteen";
            case 20 -> "Twenty";
            case 30 -> "Thirty";
            case 40 -> "Forty";
            case 50 -> "Fifty";
            case 60 -> "Sixty";
            case 70 -> "Seventy";
            case 80 -> "Eighty";
            case 90 -> "Ninety";
            case 100 -> "Hundred";
            case 1000 -> "Thousand";
            case 1000000 -> "Million";
            case 1000000000 -> "Billion";
            default -> "";
        };
    }

    public static String getHundredsWord(int num) {
        if (num == 0) {
            return "";
        }

        if (num < 100) {
            if (num <= 20 || num % 10 == 0) {
                return wordMapping(num);
            } else {
                return wordMapping((num / 10) * 10) + " " + wordMapping(num % 10);
            }
        }

        return getHundredsWord(num / 100) + " " + wordMapping(100) + " " + getHundredsWord(num % 100);
    }

    public static String numberToWords(int num) {
        if (num <= 20) {
            return wordMapping(num);
        }

        StringBuilder word = new StringBuilder();

        while (num > 0) {
            if (num >= 1e9) {
                int n = (int)(num / 1e9);
                if (n != 0) {
                    word.append(getHundredsWord(n).trim()).append(" ");
                }
                word.append(wordMapping((int) 1e9)).append(" ");
                num %= (int)1e9;
            } else if (num >= 1e6) {
                int n = (int)(num / 1e6);
                if (n != 0) {
                    word.append(getHundredsWord(n).trim()).append(" ");
                }
                word.append(wordMapping((int) 1e6)).append(" ");
                num %= 1e6;
            } else if (num >= 1000) {
                int n = num / 1000;
                if (n != 0) {
                    word.append(getHundredsWord(n).trim()).append(" ");
                }
                word.append(wordMapping(1000)).append(" ");
                num %= 1000;
            } else {
                word.append(getHundredsWord(num));
                break;
            }
        }

        return  word.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(numberToWords(1234567891));
    }
}
