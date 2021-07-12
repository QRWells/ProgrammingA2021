#  Copyright (c) Wang Qirui. All rights reserved.
#  Licensed under the MIT license. See LICENSE file in the project root for full license information.
import hashlib


class Kouza:
    def __init__(self, pin: str):
        """お金を0に、PINを設定"""
        self.balance = 0
        self.pin = hashlib.sha512(pin.encode("utf8")).hexdigest()

    def test(self, pin: str) -> None:
        """PINがあっているかどうか確認"""
        temp = hashlib.sha512(pin.encode("utf8")).hexdigest()
        if temp != self.pin:
            raise Exception("PIN Error")

    def deposit(self, pin: str, amount: int) -> int:
        """お金を預ける。預けた数字を返す"""
        self.test(pin)
        self.balance += amount
        return self.balance

    def withdraw(self, pin: str, amount: int) -> int:
        """お金を引き出して、返す"""
        self.test(pin)
        if self.balance >= amount:
            self.balance -= amount
        else:
            raise Exception("Balance is not enough")
        return amount

    def get_balance(self, pin: str) -> int:
        """お金の確認"""
        self.test(pin)
        return self.balance

    def change_pin(self, oldpin: str, newpin: str):
        """PINの変更"""
        self.test(oldpin)
        self.pin = hashlib.sha512(newpin.encode("utf8")).hexdigest()
