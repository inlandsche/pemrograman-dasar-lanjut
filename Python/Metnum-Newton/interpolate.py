import numpy as np

# Menyimpan data xi dan yi. Xi telah dirubah menjadi satuan menit secara manual
Xi = [570, 600]
Yi = [100, 35]

# Deklarasi variabel X yang berisi waktu X (dalam menit)
X = 580

# Fungsi interpolasi pada library numpy
Y = np.interp(X, Xi, Yi)

# Mencetak hasil (Y)
print('Y = ', Y, '°C')

import matplotlib.pyplot as plt

sumbu_x = np.arange(Xi[0], Xi[1] + 1, 5)
sumbu_y = np.interp(sumbu_x, Xi, Yi)

# Membuat grafik interpolasi
plt.plot(sumbu_x, sumbu_y, '-')

# Membuat titik suhu pada jam 09.40 (menit ke 580)
plt.plot(X, Y, 'o')

plt.xlabel('Waktu (menit ke-)')
plt.ylabel('Suhu (°C)')

plt.grid(True)
plt.show()