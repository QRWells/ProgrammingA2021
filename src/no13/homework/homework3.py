#  Copyright (c) Wang Qirui. All rights reserved.
#  Licensed under the MIT license. See LICENSE file in the project root for full license information.

dic = {"January": 31, "February": 28, "March": 31, "April": 30, "May": 31, "June": 30, "July": 31,
       "August": 31, "September": 30, "October": 31, "November": 30, "December": 31}

counter = 0

while True:
    num = int(input("Enter number of days "))
    if num > 365:
        print("out of days")
    for i in dic.values():
        if num > i:
            num -= i
            counter += 1
        else:
            print(list(dic.keys())[counter], num)
            break
    counter = 0
