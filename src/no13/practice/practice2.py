#  Copyright (c) Wang Qirui. All rights reserved.
#  Licensed under the MIT license. See LICENSE file in the project root for full license information.

lst = []
num = int(input())

while num != 0:
    lst.insert(0, num % 2)
    num = int(num / 2)
st = ''
for i in lst:
    st += str(i)
print(st)
