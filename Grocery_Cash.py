tomatoes_price=7.00
cherry_price=12.79
apple_price=4.89
pear_price=9.50
spinach_price=4.25
banana_price=9.99
total=0

tomatoes_amount = float(input("How many kilograms of Tomatoes did you buy ? : "))
tomatoes_sum = tomatoes_amount*tomatoes_price
print("The amount that you have to pay for the Tomatoes you bought: {}" .format(tomatoes_sum))

cherry_amount = float(input("How many kilograms of Cherries did you buy ? : "))
cherry_sum=cherry_amount*cherry_price
print("The amount that you have to pay for the Cherries you bought: {}" .format(cherry_sum))

apple_amount = float(input("How many kilograms of Apples did you buy ? : "))
apple_sum = apple_amount*apple_price
print("The amount that you have to pay for the Apples you bought: {}" .format(apple_sum))

pear_amount= float(input("How many kilograms of Pears did you buy ? : "))
pear_sum=pear_amount*pear_price
print("The amount that you have to pay for the Pears you bought: {}" .format(pear_sum))

spinach_amount = float(input("How many kilograms of Spinaches did you buy ? : "))
spinach_sum=spinach_amount*spinach_price
print("The amount that you have to pay for the Spinaches you bought: {}" .format(spinach_sum))

banana_amount = float(input("How many kilograms of Bananas did you buy ? : "))
banana_sum=banana_amount*banana_price
print("The amount that you have to pay for the Bananas you bought: {}" .format(banana_sum))


fruits_sum=(tomatoes_sum+cherry_sum+apple_sum+pear_sum+spinach_sum+banana_sum)

total += fruits_sum

print("The amount you have to pay for all the goods you bought: {}" .format(total))

print("Thank You !")
