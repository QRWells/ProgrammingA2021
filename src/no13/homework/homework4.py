#  Copyright (c) Wang Qirui. All rights reserved.
#  Licensed under the MIT license. See LICENSE file in the project root for full license information.

f = open("python.txt", "r")

line = f.readline()
dic = {}

while line:
    line = line.rstrip("\n")
    group = line.replace(",", "").replace(".", "").lower().split(" ")
    if group.count('') > 0:
        group.remove('')
    for item in group:
        if item in dic:
            dic[item] += 1
        else:
            dic[item] = 1
    line = f.readline()

for i in sorted(dic):
    print(i, dic[i])
