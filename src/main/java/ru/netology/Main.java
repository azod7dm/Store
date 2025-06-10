package ru.netology;

import ru.netology.cart.Cart;
import ru.netology.store.Store;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Просмотреть товары");
            System.out.println("2. Фильтровать товары");
            System.out.println("3. Добавить товар в корзину");
            System.out.println("4. Просмотреть корзину");
            System.out.println("5. Оформить заказ");
            System.out.println("6. Выйти");
            System.out.print("Выберите действие: ");
            int action = scanner.nextInt();

            // Обработка действий на основе введенного номера
        }
    }
}
