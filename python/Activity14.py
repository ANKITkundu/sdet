def Fibonacci(n):
  if n <= 1:
    return 1
  else:
     return Fibonacci(n-2) + Fibonacci(n-1)
num = int(input("Enter a number: ")) 
#result =Fibonacci(num)
for i in range(num):
  print(str(Fibonacci(i)))