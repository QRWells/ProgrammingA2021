i = float(input())
low = 0
high = i
attempt = (low + high) / 2
while abs(attempt ** 2 - i) > 0.01:
    if attempt ** 2 > i:
        high = attempt
    else:
        low = attempt
    attempt = (high + low) / 2

print(attempt)
