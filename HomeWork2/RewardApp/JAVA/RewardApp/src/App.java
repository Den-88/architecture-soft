import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.*;

public class App {
    public static void main(String[] args) {
        // Создаем список для хранения генераторов наград
        List<ItemGenerator> generators = new ArrayList<>();

        // Добавляем генератор для создания алмазов
        generators.add(new GemGenerator());

        // Добавляем три генератора для создания золота
        for (int i = 0; i < 3; i++) {
            generators.add(new GoldGenerator());
        }

        // Добавляем по 10 генераторов каждого типа (Crystal, Emerald, Pearl, Ruby, Silver)
        for (int i = 0; i < 10; i++) {
            generators.add(new CrystalGenerator());
            generators.add(new EmeraldGenerator());
            generators.add(new PearlGenerator());
            generators.add(new RubyGenerator());
            generators.add(new SilverGenerator());
        }

        // Создаем генератор случайных чисел
        Random random = ThreadLocalRandom.current();

        // Генерируем 30 случайных наград
        for (int i = 0; i < 30; i++) {
            // Генерируем случайный индекс для выбора награды из списка
            int index = random.nextInt(generators.size());
            // Открываем выбранную награду
            generators.get(index).openReward();
        }
    }
}
