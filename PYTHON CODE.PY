sum = 0
for x in range(0,1000,3):
    sum += int(x)
for x in range(0,1000,5):
    sum += int(x)
for x in range(0,1000,15):
    sum -= int(x)
print("The sum of the multiples of 3 or 5 =",sum)
