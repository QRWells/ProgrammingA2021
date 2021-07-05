#  Copyright (c) Wang Qirui. All rights reserved.
#  Licensed under the MIT license. See LICENSE file in the project root for full license information.

score = {'H15001': 70, 'H15002': 65, 'H15003': 90, 'H15004': 82, 'H15005': 55}

for i in sorted(score.items(), key=lambda kv: (kv[1], kv[0])):
    print(i[0], i[1])
