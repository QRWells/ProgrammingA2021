#  Copyright (c) Wang Qirui. All rights reserved.
#  Licensed under the MIT license. See LICENSE file in the project root for full license information.

def binarySearch(lst, target, max_cell=True):
    seq = sorted(lst)

    def _sim(_st, _end, _targ):
        return _st < _targ < _end

    if target <= seq[0]:
        return 0
    elif target >= seq[-1]:
        return len(seq) - 1
    start, end = 0, len(seq)
    while start <= end:
        mid = (start + end) // 2
        if seq[mid] == target:
            return mid
        elif seq[mid] < target:
            start = mid + 1
        elif seq[mid] > target:
            end = mid - 1

        if max_cell and _sim(seq[mid], seq[mid + 1], target) and seq[mid + 1] >= target:
            return mid + 1
        elif max_cell and _sim(seq[mid - 1], seq[mid + 1], target) and seq[mid] >= target:
            return mid
        elif (not max_cell) and _sim(seq[mid - 1], seq[mid], target) and seq[mid - 1] <= target:
            return mid - 1
        elif (not max_cell) and _sim(seq[mid - 2], seq[mid - 1], target) and seq[mid - 2] <= target:
            return mid - 2

mountain = ['Fujisan', 'Kitadake', 'Okuhodakadake', 'Ainodake', 'Yarigatake',
            'Warusawadake', 'Akaisidake', 'Karasawadake', 'Kitahodakadake', 'Oobamidake',
            'Maehodakadake', 'Nakadake', 'Arakawanakadake', 'Ontakesan', 'Noutoridake',
            'Shiomidake', 'Minamidake', 'Senjougatake', 'Norikuradake', 'Tateyama']
height = [3775, 3193, 3190, 3190, 3180, 3141, 3120, 3110, 3106, 3101, 3090,
          3084, 3083, 3067, 3051, 3046, 3032, 3032, 3026, 3015]

print(mountain[len(mountain)-1-binarySearch(height, 3100)])
