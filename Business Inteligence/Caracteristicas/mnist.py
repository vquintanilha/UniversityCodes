#matplotlib inline
import numpy as np
import matplotlib.pyplot as plt

image_size = 28 # width and length
no_of_different_labels = 10 #  i.e. 0, 1, 2, 3, ..., 9
image_pixels = image_size * image_size
data_path = "C:\\Users\\Victor\\Downloads\\bi\\"
#train_data = np.loadtxt(data_path + "mnist_train.csv", delimiter=",")
test_data = np.loadtxt(data_path + "mnist_test.csv", delimiter=",")
#print(test_data[:10])

#Realiza ajustes nas imagens
fac = 0.99 / 255
#train_imgs = np.asfarray(train_data[:, 1:]) * fac + 0.01
test_imgs = np.asfarray(test_data[:, 1:]) * fac + 0.01

#train_labels = np.asfarray(train_data[:, :1])
test_labels = np.asfarray(test_data[:, :1])

def array_definition(imagem):
    linha  = imagem.shape[0] 
    coluna = imagem.shape[1] 
    transicao = [0] * (linha + coluna)

    for i in range(0,linha):  # este loop extrai as características das linhas
        for j in range(0,coluna):
            if imagem[i, j-1] != imagem[i, j]:
                transicao[i] = transicao[i] + 1

    for i in range(0,coluna):  # este loop extrai as características das colunas
        for j in range(0,linha):
            if imagem[j-1, i] !=  imagem[j, i]:
                transicao[linha + i] = transicao[linha + i] + 1
    return transicao 

def get_differences(imagem):
    line = imagem.shape[0]
    column = imagem.shape[1]
    middle_line = imagem.shape[0] / 2
    middle_column = imagem.shape[1] / 2

    differences = [0] * (6 + 1)

    upper_left = imagem[0:int(middle_line), 0:int(middle_column)]
    bottom_left = imagem[int(middle_line):line, 0:int(middle_column)]
    upper_right = imagem[0:int(middle_line), int(middle_column):column]
    bottom_right = imagem[int(middle_line):line, int(middle_column):column]

    left = upper_left + bottom_left
    right = upper_right + bottom_right
    upper = upper_left + upper_right
    bottom = bottom_left + bottom_right

    def_left = sum(array_definition(left))
    def_right = sum(array_definition(right))
    def_upper = sum(array_definition(upper))
    def_bottom = sum(array_definition(bottom))

    dif_left_right = abs(def_left - def_right)
    dif_right_left = abs(def_right - def_left)

    differences[0] = def_left
    differences[1] = def_right
    differences[2] = def_upper
    differences[3] = def_bottom
    differences[4] = dif_left_right
    differences[5] = dif_right_left

    return differences

#for i in range(10):
#    img = test_imgs[i].reshape((28,28))
#    plt.imshow(img, cmap="Greys")
#    plt.show()
#    print("Array ",  characteristic_definition(img))

f = open(data_path + "aula.arff", "w")
f.write("@RELATION digits\n")

# for i in range(1, 63):
for i in range(1, 59):
    f.write("@ATTRIBUTE " + str(i) +" NUMERIC\n")
f.write("@ATTRIBUTE class {0,1,2,3,4,5,6,7,8,9}\n\n")

f.write("@DATA\n")
transicoes = [0] * 56  # inicializa o array com 0 (zero) antes de entrar no loop
differences = [0] * 7
for i in range(len(test_data)):
# for i in range(10):
    img = test_imgs[i].reshape((28,28))
    transicoes = array_definition(img)
    differences = get_differences(img)
    differences[-1] = int(test_labels[i])
    print(*transicoes, *differences, sep=',' , file = f)
    
f.close()
print("Acabou")