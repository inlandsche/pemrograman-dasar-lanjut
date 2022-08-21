import numpy as np
import matplotlib.pyplot as plt

def turunan(fx,x,x_1):
    return (fx(x) - fx(x_1))/(x - x_1)

def secant(fx,x0,x1):
    
    while True:
        d = turunan(fx,x1,x0)

        xk1 = x0 - (fx(x0)/d)
        nilai_abs = abs(x1 - x0)

        if(nilai_abs < 0.00001):
            break
        else:
            x0 = x1
            x1 = xk1
            


    return x1

def plot(fx,x0,x1):
    akar = secant(fx,x1,x0)

    x = np.arange(akar-10, akar+10, 0.01)
    y = x**7 - 1000

    plt.plot(x, y, 'b-')
    plt.plot(akar, 'ro')
    
    plt.xlabel('X')
    plt.ylabel('Y')

    plt.grid(True)

    plt.show()


fx = np.poly1d([1,0,0,0,0,0,0,-1000])
print(turunan(fx,5,5.000000001))

x0 = 2
x1 = 3

print(secant(fx,x0,x1))
# plot(fx,5,4)