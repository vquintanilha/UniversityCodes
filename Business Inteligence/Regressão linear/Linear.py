import pandas as pd
import matplotlib.pyplot as plt
import numpy as np
from sklearn.linear_model import LinearRegression
import seaborn as sns
plt.style.use('ggplot')

# Lê o arquivio csv
df = pd.read_csv('C:\\Users\\Victor\\Downloads\\bi\\weight-height.csv')

# imprime as 5 primeiras linhas e algumas estatísticas
df.head()
df.shape
df.dtypes
df.info()
df.Gender.nunique()
df.Gender.unique()

# histograma da altura
df.Height.plot(kind='hist', color='purple', edgecolor='black', figsize=(10,7))
plt.title('Distribuição de Altura', size=24)
plt.xlabel('Altura (inches)', size=18)
plt.ylabel('Frequência', size=18)
plt.show()

# histograma do peso
df.Weight.plot(kind='hist', color='purple', edgecolor='black', figsize=(10,7))
plt.title('Distribuição do Peso', size=24)
plt.xlabel('Peso (pounds)', size=18)
plt.ylabel('Frequência', size=18);
plt.show()

# histograma da altura - homens e mulheres

df[df['Gender'] == 'Male'].Height.plot(kind='hist', color='blue', edgecolor='black', alpha=0.5, figsize=(10, 7))
df[df['Gender'] == 'Female'].Height.plot(kind='hist', color='magenta', edgecolor='black', alpha=0.5, figsize=(10, 7))
plt.legend(labels=['Homens', 'Mulheres'])
plt.title('Distribuição de Altura', size=24)
plt.xlabel('Altura (inches)', size=18)
plt.ylabel('Frequência', size=18)
plt.show()

# histograma do peso - homens e mulheres

df[df['Gender'] == 'Male'].Weight.plot(kind='hist', color='blue', edgecolor='black', alpha=0.5, figsize=(10, 7))
df[df['Gender'] == 'Female'].Weight.plot(kind='hist', color='magenta', edgecolor='black', alpha=0.5, figsize=(10, 7))
plt.legend(labels=['Homens', 'Mulheres'])
plt.title('Distribuição do Peso', size=24)
plt.xlabel('Peso (pounds)', size=18)
plt.ylabel('Frequência', size=18);
plt.show()

# Gráfico de Dispersão de Altura e Peso

ax1 = df[df['Gender'] == 'Male'].plot(kind='scatter', x='Height', y='Weight', color='blue', alpha=0.5, figsize=(10, 7))
df[df['Gender'] == 'Female'].plot(kind='scatter', x='Height', y='Weight', color='magenta', alpha=0.5, figsize=(10 ,7), ax=ax1)
plt.legend(labels=['Homens', 'Mulheres'])
plt.title('Relação entre Peso e Altura', size=24)
plt.xlabel('Altura (inches)', size=18)
plt.ylabel('Peso (pounds)', size=18);
plt.show()

# Gráfico de Dispesão - 500 mulheres

sample_females = df[df['Gender'] == 'Female'].sample(500)
sample_females.plot(kind='scatter', x='Height', y='Weight', color='magenta', alpha=0.5, figsize=(10, 7))
plt.legend(labels=['Mulheres'])
plt.title('Relação entre Peso e Altura ( 500 mulheres aleatório)', size=20)
plt.xlabel('Altura (inches)', size=18)
plt.ylabel('Peso (pounds)', size=18);
plt.show()


# 300 exemplos de cada classe tomados aleatóriamente
df_males_sample = df[df['Gender'] == 'Male'].sample(300)
df_females_sample = df[df['Gender'] == 'Female'].sample(300)

# gráfico de regressão usando seaborn
fig = plt.figure(figsize=(10, 7))
sns.regplot(x=df_males_sample.Height, y=df_males_sample.Weight, color='blue', marker='+')
sns.regplot(x=df_females_sample.Height, y=df_females_sample.Weight, color='magenta', marker='+')
plt.legend(labels=['Homens', 'Mulheres'])
plt.title('Relação entre Peso e Altura', size=24)
plt.xlabel('Altura (inches)', size=18)
plt.ylabel('Peso (pounds)', size=18);
plt.show()


df_males = df[df['Gender'] == 'Male']

# criar objeto de regressão linear
lr_males = LinearRegression()
# ajusta ou treina (fit) regressão linear
lr_males.fit(df_males[['Height']], df_males['Weight'])
# obtenha a inclinação e a interceptação da linha que melhor se encaixam
print(lr_males.intercept_)
# -224.49884070545772
print(lr_males.coef_)
# 5.96177381

''' y=b₀+b₁x₁
    Males → Weight = -224.50+5.96*Height
    Females → Weight = -246.01+5.99*Height
'''

df_females = df[df['Gender'] == 'Female']


lr_females = LinearRegression()
lr_females.fit(df_females[['Height']], df_females['Weight'])
print(lr_females.intercept_)
# -246.01326574667277
print(lr_females.coef_)
# 5.99404661


df_females = df[df['Gender'] == 'Female']
# fit the model using scikit learn
lr_females = LinearRegression()
lr_females.fit(df_females[['Height']], df_females['Weight'])

# predictions using scikit learn
print(lr_females.predict([[60]]))

'''Uma regra prática para interpretar o tamanho do coeficiente de correlação é a seguinte:

    1–0.8 → Muito Forte
    0.799–0.6 → Forte
    0.599–0.4 → Moderado
    0.399–0.2 → Fraco
    0.199–0 → Muito Fraco '''
df_females.corr()

# dataframe contendo apenas mulheres ( 500 exemplos )
df_females = df[df['Gender'] == 'Female'].sample(500)

# parcela residual 500 females
fig = plt.figure(figsize = (10, 7))
sns.residplot(df_females.Height, df_females.Weight, color='magenta')
plt.title('Parcela residual 500 mulheres', size=24)
plt.xlabel('Altura (inches)', size=18)
plt.ylabel('Peso (pounds)', size=18);
plt.show()

''' Regressao linear múltipla
y=b₀+b₁x₁+b₂x₂+b₃x₃+…+bₙxₙ 
'''