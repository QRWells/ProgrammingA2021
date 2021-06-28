p = float(input("principal: "))
r = float(input("rate: ")) + 1

for i in range(5, 21, 5):
    print(i, ":", p * (r ** i))
