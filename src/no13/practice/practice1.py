#  Copyright (c) Wang Qirui. All rights reserved.
#  Licensed under the MIT license. See LICENSE file in the project root for full license information.

import random

lst = [0, 0, 0, 0, 0, 0]
for i in range(1000000):
    r = random.randint(0, 5)
    lst[r] += 1

print(lst)
