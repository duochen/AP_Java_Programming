package chapter03.Exercises;

import java.util.Scanner;

public class Exercise03_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a three-digit integer: ");
		int number = input.nextInt();
		if (number % 10 == (number - (number % 100)) / 100) {
			System.out.println(number + " is a palindrome");
		} else {
			System.out.println(number + " is not a palindrome");
		}
	}

    public static class Exercise03_31 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the exchange rate from dollars to RMB: ");
            double rate = input.nextDouble();

            System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
            int choice = input.nextInt();

            System.out.print("Enter the ");

            if (choice == 0) {
                System.out.print("dollar amount: ");
                double amount = input.nextDouble();
                System.out.println("$" + amount + " is " + (amount * rate) + " yuan");
            } else if (choice == 1) {
                System.out.print("RMB amount: ");
                double amount = input.nextDouble();
                System.out.println(amount + " yuan is $" + ((int) ((amount * 100) / rate)) / 100.0);
            } else {
                System.out.println("Incorrect input");
            }
        }
    }

    public static class Exercise03_27 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a point's x- and y-coordinates: ");
            double x = input.nextDouble();
            double y = input.nextDouble();

            double intersectx = (x * (20_000)) / (y * 200 + x * 100);
            double intersecty = (y * (20_000)) / (y * 200 + x * 100);

            if (x > intersectx || y > intersecty) {
                System.out.println("The point is not in the triangle");
            } else {
                System.out.println("The point is in the triangle");
            }

        }
    }

    public static class Exercise03_25 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
            double x1 = input.nextDouble();
            double y1 = input.nextDouble();
            double x2 = input.nextDouble();
            double y2 = input.nextDouble();
            double x3 = input.nextDouble();
            double y3 = input.nextDouble();
            double x4 = input.nextDouble();
            double y4 = input.nextDouble();

            double a = y1 - y2;
            double b = -1 * (x1 - x2);
            double c = y3 - y4;
            double d = -1 * (x3 - x4);
            double e = (y1 - y2) * x1 - (x1 - x2) * y1;
            double f = (y3 - y4) * x3 - (x3 - x4) * y3;

            double denominator = a * d - b * c;
            if (denominator == 0) {
                System.out.println("The two lines are parallel");
            } else {
                double x = (e * d - b * f) / denominator;
                double y = (a * f - e * c) / denominator;
                System.out.println("The intersecting point is at (" + x + ", " + y + ")");
            }

        }
    }

    public static class Exercise03_26 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter an integer: ");
            int number = input.nextInt();

            System.out.println(
                    "Is " + number + " divisible by 5 and 6? "
            + (number % 5 == 0 && number % 6 == 0 ? "true" : "false"));
            System.out.println(
                    "Is " + number + " divisible by 5 or 6? "
            + (number % 5 == 0 || number % 6 == 0 ? "true" : "false"));
            System.out.println("Is " + number + " divisible by 5 or 6, but not both? "
                    + (number % 5 == 0 ^ number % 6 == 0 ? "true" : "false"));

        }
    }

    public static class Exercise03_28 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter r1�s center x-, y-coordinates, width, and height: ");
            double x1 = input.nextDouble();
            double y1 = input.nextDouble();
            double w1 = input.nextDouble();
            double h1 = input.nextDouble();

            System.out.print("Enter r2�s center x-, y-coordinates, width, and height: ");
            double x2 = input.nextDouble();
            double y2 = input.nextDouble();
            double w2 = input.nextDouble();
            double h2 = input.nextDouble();

            double xDistance;
            double yDistance;

            if (x1 >= x2) {
                xDistance = x1 - x2;
            } else {
                xDistance = x2 - x1;
            }

            if (y1 >= y2) {
                yDistance = y1 - y2;
            } else {
                yDistance = y2 - y1;
            }

            if (xDistance <= (w1 - w2) / 2 && yDistance <= (h1 - h2) / 2) {
                System.out.println("r2 is inside r1");
            } else if (xDistance <= (w1 + w2) / 2 && yDistance <= (h1 + h2) / 2) {
                System.out.println("r2 overlaps r1");
            } else {
                System.out.println("r2 does not overlap r1");
            }
        }

    }

    public static class Exercise03_30 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the time zone offset to GMT: ");
            int timeZone = input.nextInt();
            long totalMilliseconds = System.currentTimeMillis();
            long totalSeconds = totalMilliseconds / 1000;
            long currentSecond = totalSeconds % 60;
            long totalMinutes = totalSeconds / 60;
            long currentMinute = totalMinutes % 60;
            long totalHours = totalMinutes / 60;
            long currentHour = totalHours % 24;

            int hour;
            String str = "";
            if ((currentHour + timeZone) >= 12) {
                hour = (int) (currentHour + timeZone) - 12;
                str = "PM";
            } else {
                hour = (int) (currentHour + timeZone);
                str = "AM";
            }

            System.out.println("Current time is " + hour + ":" + currentMinute + ":" + currentSecond + " " + str);

        }
    }

    public static class Exercise03_24 {
        public static void main(String[] args) {
            int randomRank = (int) (Math.random() * 12) + 1;
            int randomSuit = (int) (Math.random() * 4) + 1;

            System.out.print("The card you picked is ");
            switch (randomRank) {
            case 1:
                System.out.print("Ace");
                break;
            case 2:
                System.out.print(randomRank);
                break;
            case 3:
                System.out.print(randomRank);
                break;
            case 4:
                System.out.print(randomRank);
                break;
            case 5:
                System.out.print(randomRank);
                break;
            case 6:
                System.out.print(randomRank);
                break;
            case 7:
                System.out.print(randomRank);
                break;
            case 8:
                System.out.print(randomRank);
                break;
            case 9:
                System.out.print(randomRank);
                break;
            case 10:
                System.out.print(randomRank);
                break;
            case 11:
                System.out.print("Jack");
                break;
            case 12:
                System.out.print("Quenn");
                break;
            case 13:
                System.out.print("King");
                break;
            }

            System.out.print(" of ");
            switch (randomSuit) {
            case 1:
                System.out.println("Clubs");
                break;
            case 2:
                System.out.println("Diamonds");
                break;
            case 3:
                System.out.println("Hearts");
                break;
            case 4:
                System.out.println("Spades");
                break;
            }
        }
    }

    public static class Exercise03_23 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a point with two coordinates: ");
            double x = input.nextDouble();
            double y = input.nextDouble();

            double xOfRentangleCenter = 0;
            double yOfRentangleCenter = 0;
            double heigthOfRectangle = 5;
            double widthOfRectangle = 10;

            if (xOfRentangleCenter - (widthOfRectangle / 2) <= x && x <= xOfRentangleCenter + (widthOfRectangle / 2)) {
                if (yOfRentangleCenter - (heigthOfRectangle / 2) <= y
                        && y <= yOfRentangleCenter + (heigthOfRectangle / 2)) {
                    System.out.print("Point (" + x + "," + y + ") is in the rectangle.");
                } else {
                    System.out.print("Point (" + x + "," + y + ") is not in the rectangle.");
                }
            } else {
                System.out.print("Point (" + x + "," + y + ") is not in the rectangle.");
            }
        }
    }

    public static class Exercise03_22 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a point with two coordinates: ");
            double x = input.nextDouble();
            double y = input.nextDouble();

            double xOfCircleCenter = 0;
            double yOfCircleCenter = 0;
            double radius = 10;

            double distance = Math.sqrt(Math.pow(xOfCircleCenter - x, 2) + Math.pow(yOfCircleCenter - y, 2));
            System.out.print("Point (" + x + "," + y + ") is ");
            if (distance <= radius) {
                System.out.println(" in the circle.");
            } else {
                System.out.println(" not int the circle.");
            }
        }
    }

    public static class Exercise03_29 {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
            double x1 = input.nextDouble();
            double y1 = input.nextDouble();
            double r1 = input.nextDouble();

            System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
            double x2 = input.nextDouble();
            double y2 = input.nextDouble();
            double r2 = input.nextDouble();

            double distanceOfCenters = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            if (distanceOfCenters <= Math.abs(r1 - r2)) {
                System.out.println("circle2 is inside circle1");
            } else if (distanceOfCenters <= r1 + r2) {
                System.out.println("circle2 overlaps circle1");
            } else {
                System.out.println("circle2 does not overlap circle1");
            }
        }
    }

    public static class Exercise03_33 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter weight and price for package 1: ");
            double w1 = input.nextDouble();
            double p1 = input.nextDouble();
            System.out.println("Enter weight and price for package 2: ");
            double w2 = input.nextDouble();
            double p2 = input.nextDouble();

            if (p1 / w1 < p2 / w2) {
                System.out.println("Package 1 has a better price.");
            }else if (p1 / w1 > p2 / w2) {
                System.out.println("Package 2 has a better price.");
            }else {
                System.out.println("Two packages have the same price.");
            }

        }

    }

    public static class Exercise03_34 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter three points for p0, p1, and p2: ");
            double x0 = input.nextDouble();
            double y0 = input.nextDouble();
            double x1 = input.nextDouble();
            double y1 = input.nextDouble();
            double x2 = input.nextDouble();
            double y2 = input.nextDouble();

            System.out.print("(" + x2 + "," + y2 + ") ");
            double status = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

            if (status <= 0.0000000001 && ((x0 <= x2 && x2 <= x1) || (x0 >= x2 && x2 >= x1))) {
                System.out.print("is on the line segment");
            } else {
                System.out.print("is not on the line segment");
            }
            System.out.println(" from (" + x0 + "," + y0 + ") to (" + x1 + "," + y1 + ")");
        }

    }

    public static class Exercise03_32 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter three points for p0, p1, and p2: ");
            double x0 = input.nextDouble();
            double y0 = input.nextDouble();
            double x1 = input.nextDouble();
            double y1 = input.nextDouble();
            double x2 = input.nextDouble();
            double y2 = input.nextDouble();

            double condition = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

            System.out.print("(" + x2 + "," + y2 + ") is on the ");
            if (condition == 0) {
                System.out.print("same line");
            } else if (condition < 0) {
                System.out.print("right side of the line");
            } else {
                System.out.print("left side of the line");
            }
            System.out.println(" from (" + x0 + "," + y0 + ") to (" + x1 + "," + y1 + ")");
        }
    }

    public static class Exercise03_21 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter year: (e.g., 2012): ");
            int year = input.nextInt();
            System.out.println("Enter month: 1-12: ");
            int month = input.nextInt();
            System.out.println("Enter the day of the month: 1-31: ");
            int dayOfTheMonth = input.nextInt();

            if (month == 1 || month == 2) {
                month += 12;
                year = year - 1;
            }

            int day = (dayOfTheMonth + (26 * (month + 1)) / 10 + (year % 100) + (year % 100) / 4 + (year / 100) / 4
                    + 5 * (year / 100)) % 7;

            System.out.print("Day of the week is ");
            switch (day) {
            case 0:
                System.out.print("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.print("Monday");
                break;
            case 3:
                System.out.print("Tuesday");
                break;
            case 4:
                System.out.print("Wednesday");
                break;
            case 5:
                System.out.print("Thursday");
                break;
            case 6:
                System.out.print("Friday");
                break;

            }
        }
    }
}