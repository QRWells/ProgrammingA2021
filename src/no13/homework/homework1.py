#  Copyright (c) Wang Qirui. All rights reserved.
#  Licensed under the MIT license. See LICENSE file in the project root for full license information.

import re

phone = {}
f = open("TableDef.txt", "r")
name = ""
while name != "end":
    name = f.readline()
    name = name.rstrip("\n")
    number = f.readline()
    number = number.rstrip("\n")
    phone[name] = number
f.close()
new_dict = {v: k for k, v in phone.items()}
name = ""
while name != "end":
    name = input("Query? ")
    if re.match(r"\d{3}-\d{2}-\d{4}", name) is not None:
        if name in new_dict:
            print(new_dict[name])
        else:
            print("no such name or phone")
    else:
        if name in phone:
            print(phone[name])
        else:
            print("no such name or phone")
