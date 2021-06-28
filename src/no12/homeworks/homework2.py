#  Copyright (c) Wang Qirui. All rights reserved.
#  Licensed under the MIT license. See LICENSE file in the project root for full license information.

def root(num: float) -> float:
    x = num
    y = num / 2.0
    count = 1
    while abs(y**2 - x) > 1e-7:
        count += 1
        y = ((y * 1.0) + (1.0 * num) / y) / 2.0
    return y


print(root(float(input())))
