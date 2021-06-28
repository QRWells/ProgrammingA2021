n = int(input())
p = 0
s = 0

for i in range(1, n + 1):
    p += i
    s += p

print("sum =", s)
