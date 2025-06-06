import random

print("=" * 40)
print(" " * 12 + "LOGIN PANEL")
print("=" * 40)

username = input("Enter your username: ")
password = input("Enter your password: ")

if len(username) >= 8 and len(password) >= 6:
    auth_code = random.randint(100000, 999999)
    print("\n" + "=" * 40)
    print("Login successful!")
    print("Your 6-digit authentication code is:", auth_code)
    print("=" * 40)
else:
    print("\n" + "=" * 40)
    print("Invalid login. Username must be at least 8 characters,")
    print("and password must be at least 6 characters.")
    print("=" * 40)