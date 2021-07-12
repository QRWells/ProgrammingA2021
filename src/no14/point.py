#  Copyright (c) Wang Qirui. All rights reserved.
#  Licensed under the MIT license. See LICENSE file in the project root for full license information.
import math


class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def show(self) -> str:
        return "({}, {})".format(self.x, self.y)

    def move(self, dx, dy) -> None:
        self.x += dx
        self.y += dy

    def dist(self, point) -> float:
        return math.sqrt((self.x - point.x) ** 2 + (self.y - point.y) ** 2)
