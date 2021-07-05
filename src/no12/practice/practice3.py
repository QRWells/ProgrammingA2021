#  Copyright (c) Wang Qirui. All rights reserved.
#  Licensed under the MIT license. See LICENSE file in the project root for full license information.

p = float(input("principal: "))
r = float(input("rate: ")) + 1

for i in range(5, 21, 5):
    print(i, ":", p * (r ** i))
