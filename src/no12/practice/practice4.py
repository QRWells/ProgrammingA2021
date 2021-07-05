#  Copyright (c) Wang Qirui. All rights reserved.
#  Licensed under the MIT license. See LICENSE file in the project root for full license information.

l = []
s = "null"
while True:
    s = input("Enter a data: ")
    if len(s) == 0:
        break
    l.append(float(s))

print("Average =", sum(l) / len(l))
