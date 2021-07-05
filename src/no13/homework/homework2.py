#  Copyright (c) Wang Qirui. All rights reserved.
#  Licensed under the MIT license. See LICENSE file in the project root for full license information.

import re

f = open("namebook.txt", "r")
line = f.readline()
while line:
    line = line.rstrip("\n")
    result = re.search(r"(.* .*) (\d{4} \d{1,2} \d{1,2})", line)
    print(result.group(1), "was born in", tuple(result.group(2).split(" ")))
    line = f.readline()
