print('a = ', end='')
a = input()
print('b = ', end='')
b = input()
ab = int(a)*int(b)

if ab % 2 == 0:
    ans = 'Even'
else:
    ans = 'Odd'

print('答え：'+ans)