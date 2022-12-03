import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> product = new ArrayList<>();
    int countProduct = 0;

    while (true) {
      System.out.println("Выберите операцию:");
      String input = scanner.nextLine();
      System.out.println();

      switch (input) {
        case "1":
          System.out.println("Какую покупку хотите добавить?");
          String addProduct = scanner.nextLine();
          product.add(addProduct);
          countProduct++;
          System.out.println("Итого в списке покупок: " + countProduct);
          break;
        case "2":
          System.out.println("Список покупок:");
          for (int i = 0; i < product.size(); i++) {
            System.out.println((i + 1) + ". " + product.get(i));
          }
          break;
        case "3":
          System.out.println("Список покупок:");
          for (int i = 0; i < product.size(); i++) {
            System.out.println((i + 1) + ". " + product.get(i));
          }
          System.out.println("Какую хотите удалить? Введите номер или название");
          System.out.println();
          String delProduct = scanner.nextLine();
          try {
            int delProducts = Integer.parseInt(delProduct);
            for (int j = 0; j < product.size(); j++) {
              if (delProducts == j + 1) {
                String del = product.remove(j);
                System.out.println();
                System.out.println("Продукт \"" + del + "\" удален. Список покупок:");
              }
            }
          } catch (NumberFormatException e) {
            for (int j = 0; j < product.size(); j++) {
              if (delProduct.equals(product.get(j))) {
                product.remove(product.get(j));
                System.out.println("Продукт \"" + delProduct + "\" удален. Список покупок:");
                for (int i = 0; i < product.size(); i++) {
                  System.out.println((i + 1) + ". " + product.get(i));
                }
              }
            }
          }
          break;
        case "4":
          System.out.println("Введите текст для поиска:");
          String findProduct = scanner.nextLine();
          System.out.println("Найдено:");
          for (int i = 0; i < product.size(); i++) {
            if (product.get(i).toLowerCase().contains(findProduct.toLowerCase())) {
              System.out.println((i + 1) + ". " + product.get(i));
            }
          }
          break;
      }
    }
  }
}

