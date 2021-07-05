#  Copyright (c) Wang Qirui. All rights reserved.
#  Licensed under the MIT license. See LICENSE file in the project root for full license information.

n = int(input())
p = 0
s = 0

for i in range(1, n + 1):
    p += i
    s += p

print("sum =", s)
