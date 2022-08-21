import numpy as n

def derivate(polinom, x):
    d = n.polyder(polinom)

    return d(x)

def newton(f, x):
    error = 1
    tolerance = 0.00001
    fder = derivate(f, x)

    while (error >= tolerance):
        xk = x - (f(x)/(fder))

        error = n.abs(xk - x)
        x = xk

    return xk


pol_fx = n.poly1d([1, 0, 0, 0, 0, 0, 0, -1000])
print(derivate(pol_fx, 5))
print(newton(pol_fx, 5))

    