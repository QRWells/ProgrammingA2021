#  Copyright (c) Wang Qirui. All rights reserved.
#  Licensed under the MIT license. See LICENSE file in the project root for full license information.

import math


class Shape:
    def __init__(self):
        pass

    def getArea(self) -> float:
        return 0


class Rectangle(Shape):
    def __init__(self, w: float, h: float):
        super().__init__()
        self.w = w
        self.h = h

    def getArea(self) -> float:
        return self.w * self.h


class Square(Rectangle):
    def __init__(self, w: float):
        super().__init__(w, w)


class Circle(Shape):
    def __init__(self, r: float):
        super().__init__()
        self.r = r

    def getArea(self) -> float:
        return math.pi * self.r ** 2
