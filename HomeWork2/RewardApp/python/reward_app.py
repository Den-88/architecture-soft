from abc import ABC, abstractmethod
from random import randint


class IGameItem(ABC):
    @abstractmethod
    def open(self):
        pass


class ItemFabric(ABC):
    @abstractmethod
    def create_item(self):
        pass


class Gold(IGameItem):
    def open(self):
        print('Gold! 🏆')


class Gem(IGameItem):
    def open(self):
        print('Gem! 💎')


class Crystal(IGameItem):
    def open(self):
        print('Crystal! 🔮')


class Emerald(IGameItem):
    def open(self):
        print('Emerald! 💚')


class Pearl(IGameItem):
    def open(self):
        print('Pearl! 🐚')


class Ruby(IGameItem):
    def open(self):
        print('Ruby! 🔴')


class Silver(IGameItem):
    def open(self):
        print('Silver! ⚪️')


class GoldGenerator(ItemFabric):
    def create_item(self):
        return Gold()


class GemGenerator(ItemFabric):
    def create_item(self):
        return Gem()


class CrystalGenerator(ItemFabric):
    def create_item(self):
        return Crystal()


class EmeraldGenerator(ItemFabric):
    def create_item(self):
        return Emerald()


class PearlGenerator(ItemFabric):
    def create_item(self):
        return Pearl()


class RubyGenerator(ItemFabric):
    def create_item(self):
        return Ruby()


class SilverGenerator(ItemFabric):
    def create_item(self):
        return Silver()


if __name__ == '__main__':
    rewards = [GemGenerator()]
    for _ in range(3):
        rewards.append(GoldGenerator())
    for _ in range(10):
        rewards.append(CrystalGenerator())
        rewards.append(EmeraldGenerator())
        rewards.append(PearlGenerator())
        rewards.append(RubyGenerator())
        rewards.append(SilverGenerator())

    for _ in range(30):
        rewards[randint(0, len(rewards) - 1)].create_item().open()
