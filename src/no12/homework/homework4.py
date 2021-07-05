#  Copyright (c) Wang Qirui. All rights reserved.
#  Licensed under the MIT license. See LICENSE file in the project root for full license information.

def checkPerfectNumber(num: int) -> bool:
    import math
    if num <= 1:
        return False

    sum_val = 1
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            sum_val = sum_val + i + num / i
        if i == num / i:
            break
    return sum_val == num


for n in range(1, 10001):
    if checkPerfectNumber(n):
        print(n)
