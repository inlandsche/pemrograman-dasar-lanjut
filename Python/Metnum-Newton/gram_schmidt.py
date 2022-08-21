import numpy as np

def hkd(u, v):
    return np.dot(u,v)

def panjang_vektor(v):
    p = np.sqrt(sum(v**2))

    return p

def gram_schmidt(u1, u2, u3):
    # Anggap v1 = u1
    v1 = u1
    print("v1 : ", v1)

    # Anggap v2 = u2 - projw1 u2
    v2 = u2 - (hkd(u2, v1)/panjang_vektor(v1)**2)*v1
    print("v2 : ", v2)

    # Anggap v3 = u3 - projw2 u3
    v3 = u3 - ((hkd(u3, v1)/panjang_vektor(v1)**2)*v1) - ((hkd(u3, v2)/panjang_vektor(v2)**2)*v2)
    print("v3 : ", v3)

    # Hasil q1 q2 q3
    q1 = v1/panjang_vektor(v1)
    q2 = v2/panjang_vektor(v2)
    q3 = v3/panjang_vektor(v3)

    return q1, q2, q3

u1 = np.array([1,1,1])
u2 = np.array([0,1,1])
u3 = np.array([0,0,1])

arr = gram_schmidt(u1, u2, u3)

print("Hasil Gram Schmidt")

for i in range(len(arr)):
    print("q" + str(i+1) + " : ", list(arr[i]))

