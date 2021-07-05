#  Copyright (c) Wang Qirui. All rights reserved.
#  Licensed under the MIT license. See LICENSE file in the project root for full license information.
import re

f = open('test_write.txt', "r")

line = f.readline()
total = 0
count = 0
while line:
    line = line.rstrip("\n")
    result = re.search(r"(.*):.*(\d{4})", line)
    total += eval(result.group(2))
    count += 1
    line = f.readline()
print("average =", total / count)
