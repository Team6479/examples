public class Conditionals {
  public static void main(String[] args) {
    boolean imMentallyStable = false;

    int num = 0;

    if (imMentallyStable) {
      num = num + 1;
    } else {
      num = num + 2;
    }

    if (2 + 2 == 4 && 3 - 2 != 5) {
      num++;
    } else if (2 < 3 || 3 > 2) {
      num++;
    }

    if (2 <= 5 || 7 >= 1) {
      num++;
    }

    switch (num) {
      case 0:
        System.out.println(num);
        break;
      case 1:
        System.out.println(num + 1);
        break;
      case 2:
        System.out.println(num + 2);
        break;
      case 3:
        System.out.println(num + 3);
        break;
      case 4:
        System.out.println(num + 4);
        break;
      case 5:
        System.out.println(num + 5);
        break;
      default:
        System.out.println(num - 1);
        break;
    }
  }
}
