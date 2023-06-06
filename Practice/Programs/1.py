while True:
    n=input("Enter String:")
    print(len(n))
    if(len(n)==0):
        print("Enter valid input")
    else:
        break
for i in range(len(n)):
    if i%2==0:
        print(n[i])