/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject1;

/**
 *
 * @author burcu
 */
import java.util.Scanner;

public class JavaProject1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Every part includes 10 question.");
        System.out.println("If you do 6 correct question from 10 question, you can go to next level.");

        int p = 10;
        int x = 0;
        int count = 0;

        while (x < p) {

            int randomNumber1 = (int) (Math.random() * 10);
            int randomNumber2 = (int) (Math.random() * 10);
            int randomNumber3 = (int) (Math.random() * 4);

            if (randomNumber3 == 0) {
                System.out.println(randomNumber1 + " + " + randomNumber2 + " = ? ");
                int c = input.nextInt();
                int result = (randomNumber1 + randomNumber2);
                if (result == c) {
                    System.out.println("(Correct)");
                    count++;
                } else {
                    System.out.println("(Wrong)");
                }
            }

            if (randomNumber3 == 1) {
                if (randomNumber2 > randomNumber1) {
                    int temp = randomNumber2;
                    randomNumber2 = randomNumber1;
                    randomNumber1 = temp;
                }
                System.out.println(randomNumber1 + " - " + randomNumber2 + " = ? ");
                int c = input.nextInt();
                int result = (randomNumber1 - randomNumber2);
                if (result == c) {
                    System.out.println("(Correct)");
                    count++;
                } else {
                    System.out.println("(Wrong)");
                }
            }

            if (randomNumber3 == 2) {
                System.out.println(randomNumber1 + " * " + randomNumber2 + " = ? ");
                int c = input.nextInt();
                int result = (randomNumber1 * randomNumber2);
                if (result == c) {
                    System.out.println("(Correct)");
                    count++;
                } else {
                    System.out.println("(Wrong)");
                }
            }

            if (randomNumber3 == 3) {
                if (randomNumber2 == 0) {
                    int temp = randomNumber2;
                    randomNumber2 = randomNumber1;
                    randomNumber1 = temp;
                }
                System.out.println(randomNumber1 + " / " + randomNumber2 + " = ? ");
                int c = input.nextInt();
                int result = (randomNumber1 / randomNumber2);
                if (result == c) {
                    System.out.println("(Correct)");
                    count++;
                } else {
                    System.out.println("(Wrong)");
                }
            }

            x++;
        }
        if (count > 5) {
            System.out.println("You did " + count + " correct answer.CONGRATULATIONS. Put 1 to go next level");
        } else {
            System.out.println("You did " + count + " correct answer. You need more practice.");
            System.out.println("Put 2 to try again.");
        }

        int number = input.nextInt();
        if (number == 2) {
            int num1 = 10;
            int num2 = 0;
            int count3 = 0;
            while (num2 < num1) {

                int a = (int) (Math.random() * 10);
                int b = (int) (Math.random() * 10);
                int d = (int) (Math.random() * 4);

                if (d == 0) {
                    System.out.println(a + " + " + b + " = ? ");
                    int c = input.nextInt();
                    int result = (a + b);
                    if (result == c) {
                        System.out.println("(Correct)");
                        count3++;
                    } else {
                        System.out.println("(Wrong)");
                    }
                }

                if (d == 1) {
                    if (b > a) {
                        int temp = b;
                        b = a;
                        a = temp;
                    }
                    System.out.println(a + " - " + b + " = ? ");
                    int c = input.nextInt();
                    int result = (a - b);
                    if (result == c) {
                        System.out.println("(Correct)");
                        count3++;
                    } else {
                        System.out.println("(Wrong)");
                    }
                }

                if (d == 2) {
                    System.out.println(a + " * " + b + " = ? ");
                    int c = input.nextInt();
                    int result = (a * b);
                    if (result == c) {
                        System.out.println("(Correct)");
                        count3++;
                    } else {
                        System.out.println("(Wrong)");
                    }
                }

                if (d == 3) {
                    if (b == 0) {
                        int temp = b;
                        b = a;
                        a = temp;
                    }
                    System.out.println(a + " / " + b + " = ? ");
                    int c = input.nextInt();
                    int result = (a / b);
                    if (result == c) {
                        System.out.println("(Correct)");
                        count3++;
                    } else {
                        System.out.println("(Wrong)");
                    }
                }

                num2++;
            }
            if (count3 > 5) {
                System.out.println("You did " + count3 + " correct answer.CONGRATULATIONS");
            } else {
                System.out.println("You did " + count3 + " correct answer. You need more practice. ");
            }

        }

        int i = 0;
        int n = 10;

        if (number == 1) {
            int count2 = 0;
            while (i < n) {
                int r = (int) (Math.random() * 10);
                int s = (int) (Math.random() * 10);
                int m = (int) (Math.random() * 10);
                int k = (int) (Math.random() * 16);

                if (k == 0) {
                    System.out.println(r + " + " + s + " + " + m + " = ? ");
                    int v = input.nextInt();
                    int result = (r + s + m);
                    if (result == v) {
                        System.out.println("(Correct)");
                        count2++;
                    } else {
                        System.out.println("(Wrong)");
                    }
                }

                if (k == 1) {

                    System.out.println(r + " - " + s + "- " + m + " = ? ");
                    int v = input.nextInt();
                    int result = (r - s - m);
                    if (result == v) {
                        System.out.println("(Correct)");
                        count2++;
                    } else {
                        System.out.println("(Wrong)");
                    }
                }

                if (k == 2) {
                    System.out.println(r + " * " + s + " * " + m + " = ? ");
                    int v = input.nextInt();
                    int result = (r * s * m);
                    if (result == v) {
                        System.out.println("(Correct)");
                        count2++;
                    } else {
                        System.out.println("(Wrong)");
                    }
                }

                if (k == 3) {
                    System.out.println(r + " + " + s + " - " + m + " = ? ");
                    int v = input.nextInt();
                    int result = (r + s - m);
                    if (result == v) {
                        System.out.println("(Correct)");
                        count2++;
                    } else {
                        System.out.println("(Wrong)");
                    }
                }

                if (k == 4) {
                    System.out.println(r + " + " + s + " * " + m + " = ? ");
                    int v = input.nextInt();
                    int result = (r + s * m);
                    if (result == v) {
                        System.out.println("(Correct)");
                        count2++;
                    } else {
                        System.out.println("(Wrong)");
                    }
                }

                if (k == 5) {
                    if (m == 0) {
                        int temp = m;
                        m = s;
                        s = temp;
                    }
                    System.out.println(r + " + " + s + " / " + m + " = ? ");
                    int v = input.nextInt();
                    int result = (int) (r + s / m);
                    if (result == v) {
                        System.out.println("(Correct)");
                        count2++;
                    } else {
                        System.out.println("(Wrong)");
                    }
                }

                if (k == 6) {
                    System.out.println(r + " - " + s + " + " + m + " = ? ");
                    int v = input.nextInt();
                    int result = (r - s + m);
                    if (result == v) {
                        System.out.println("(Correct)");
                        count2++;
                    } else {
                        System.out.println("(Wrong)");
                    }
                }

                if (k == 7) {
                    System.out.println(r + " - " + s + " * " + m + " = ? ");
                    int v = input.nextInt();
                    int result = (r - s * m);
                    if (result == v) {
                        System.out.println("(Correct)");
                        count2++;
                    } else {
                        System.out.println("(Wrong)");
                    }
                }

                if (k == 8) {
                    if (m == 0) {
                        int temp = m;
                        m = s;
                        s = temp;
                    }
                    System.out.println(r + " - " + s + " / " + m + " = ? ");
                    int v = input.nextInt();
                    int result = (int) (r - s / m);
                    if (result == v) {
                        System.out.println("(Correct)");
                        count2++;
                    } else {
                        System.out.println("(Wrong)");
                    }
                }

                if (k == 9) {
                    System.out.println(r + " * " + s + " + " + m + " = ? ");
                    int v = input.nextInt();
                    int result = (r * s + m);
                    if (result == v) {
                        System.out.println("(Correct)");
                        count2++;
                    } else {
                        System.out.println("(Wrong)");
                    }
                }

                if (k == 10) {
                    System.out.println(r + " * " + s + " - " + m + " = ? ");
                    int v = input.nextInt();
                    int result = (r * s - m);
                    if (result == v) {
                        System.out.println("(Correct)");
                        count2++;
                    } else {
                        System.out.println("(Wrong)");
                    }
                }

                if (k == 11) {
                    if (m == 0) {
                        int temp = m;
                        m = s;
                        s = temp;
                    }
                    System.out.println(r + " * " + s + " / " + m + " = ? ");
                    int v = input.nextInt();
                    int result = (r * s / m);
                    if (result == v) {
                        System.out.println("(Correct)");
                        count2++;
                    } else {
                        System.out.println("(Wrong)");
                    }
                }

                if (k == 12) {
                    if (s == 0) {
                        int temp = s;
                        s = r;
                        r = temp;
                    }
                    System.out.println(r + " / " + s + " + " + m + " = ? ");
                    int v = input.nextInt();
                    int result = (int) (r / s + m);
                    if (result == v) {
                        System.out.println("(Correct)");
                        count2++;
                    } else {
                        System.out.println("(Wrong)");
                    }
                }

                if (k == 13) {
                    if (s == 0) {
                        int temp = s;
                        s = r;
                        r = temp;
                    }
                    System.out.println(r + " / " + s + " - " + m + " = ? ");
                    int v = input.nextInt();
                    int result = (r / s - m);
                    if (result == v) {
                        System.out.println("(Correct)");
                        count2++;
                    } else {
                        System.out.println("(Wrong)");
                    }
                }

                if (k == 14) {
                    if (s == 0) {
                        int temp = s;
                        s = r;
                        r = temp;
                    }
                    System.out.println(r + " / " + s + " * " + m + " = ? ");
                    int v = input.nextInt();
                    int result = (int) (r / s * m);
                    if (result == v) {
                        System.out.println("(Correct)");
                        count2++;
                    } else {
                        System.out.println("(Wrong)");
                    }
                }
                i++;
            }

            if (count2 > 5) {
                System.out.println("You did " + count2 + " correct answer.CONGRATULATIONS");
            } else {
                System.out.println("You did " + count2 + " correct answer. You need more practice. ");
            }

        }
    }
}
