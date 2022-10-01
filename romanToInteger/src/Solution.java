public class Solution {
    public int romanToInt(String s) {
        char[] ch = s.toCharArray();
        int size = ch.length;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            switch (ch[i]) {
                case 'I':
                    if (i != size - 1 && ch[i + 1] == 'V') {
                        sum = sum + 4;
                        i++;
                    } else if (i != size - 1 && ch[i + 1] == 'X') {
                        sum = sum + 9;
                        i++;
                    } else {
                        sum = sum + 1;
                    }
                    break;
                case 'V':
                    sum = sum + 5;
                    break;
                case 'X':
                    if (i != size - 1 && ch[i + 1] == 'L') {
                        sum = sum + 40;
                        i++;
                    } else if (i != size - 1 && ch[i + 1] == 'C') {
                        sum = sum + 90;
                        i++;
                    } else {
                        sum = sum + 10;
                    }
                    break;
                case 'L':
                    sum = sum + 50;
                    break;
                case 'C':
                    if (i != size - 1 && ch[i + 1] == 'D') {
                        sum = sum + 400;
                        i++;
                    } else if (i != size - 1 && ch[i + 1] == 'M') {
                        sum = sum + 900;
                        i++;
                    } else {
                        sum = sum + 100;
                    }
                    break;
                case 'D':
                    sum = sum + 500;
                    break;
                case 'M':
                    sum = sum + 1000;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
        return sum;
    }
}
