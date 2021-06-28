import math
from math import sqrt


def is_prime(num: int) -> bool:
    if num <= 1:
        return False
    if num == 2 or num == 3:
        return True
    elif num % 6 != 1 and num % 6 != 5:
        return False
    half = math.floor(sqrt(num))
    for i in range(5, half + 1, 6):
        if num % i == 0 or num % (i + 2) == 0:
            return False
    return True


n = int(input())

if is_prime(n):
    print(n, "is", "prime")
else:
    print(n, "is", "not", "prime")
