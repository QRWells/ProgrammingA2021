#  Copyright (c) Wang Qirui. All rights reserved.
#  Licensed under the MIT license. See LICENSE file in the project root for full license information.

class Heikin:
    def __init__(self):
        self.total = 0
        self.count = 0

    def __add__(self, other):
        self.total += other
        self.count += 1
        return self

    def __call__(self, *args, **kwargs) -> float:
        return self.total / self.count
