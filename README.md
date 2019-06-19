# Automatos
Trabalho de Paradigmas de orientação Obejtos

Descrição:
Um autômato finito não determinístico (AFN) é um modelo matemático que consiste de:
1. Um conjunto de estados S;
2. Um conjunto de símbolos de entrada Ʃ (o alfabeto de símbolos de entrada);
3. Uma função de transição que mapeia pares estados/símbolo para conjunto de estados;
4. Um estado inicial S0 e;
5. Um conjunto de estados finais F.
Um autômato finito determinístico (AFD) é um caso especial de AFN no qual:
1. Nenhum estado tem uma ɛ-transição;
2. Para cada estado S e símbolo de entrada c há no máximo uma transição partindo de S que consome c, isto é, a função de transição mapeia pares estado/símbolo para um estado apenas.
Considere um AFD cujo alfabeto de entrada Ʃ são letras arábicas minúsculas (a-z) e dígitos decimais (0-9). Os estados são rotulados por números inteiros não negativos (não necessariamente em seqüência). As transições são especificadas nas linhas iniciais de um arquivo texto, cada transição em linha. Uma transição de um estado Si para um estado Sj e que consome o símbolo de entrada c é escrita como:
Si c Sj
Uma linha começando com -1 indica o final das transições do AFD. Em seguida o arquivo tem duas linhas: uma com um número inteiro igual ao rótulo do estado inicial e outra com uma seqüência de números inteiros iguais aos rótulos dos estados finais do AFD.
Após as linhas com a definição do AFD, o arquivo contém uma ou mais linhas com cadeias de símbolos de Ʃ, isto é, letras minúsculas e dígitos, uma cadeia por linha.
Seu trabalho consiste em ler o AFD e as cadeias do arquivo texto e imprimir na saída padrão, em ordem alfabética, somente as cadeias aceitas pelo AFD. Uma cadeia é aceita se todos seus símbolos são consumidos em transições a partir do estado inicial para algum estado final, como mostrado no algoritmo a seguir:
S = S0
para cada (símbolo c da cadeia de entrada)
se ( houver uma transição de S para um estado n para o símbolo c)
S = n;
Senão retorna falso
Retorna S está em F ? verdadeiro : falso
Observação: A escolha da estrutura de dados a ser utilizada fica a critério do aluno, sendo assim, pode ser entre array, arrayList, LinkedList ou TreeMap.
Exemplo de um arquivo de entrada
1 a 3

3 b 5

5 a 3

5 c 8

5 0 17

5 9 17

5 8 17

5 7 17

5 6 17

5 5 17

5 4 17

5 3 17

5 2 17

5 1 17

17 1 17

17 2 17

17 3 17


17 4 17

17 5 17

17 6 17

17 7 17

17 8 17

17 9 17

17 0 17

17 c 8

8 d 4

4 c 8

-1

1

4

abab123cd

aab56dc

ab1cd

ababcdcdcd

O AFD deste exemplo tem 6 estados (1, 3, 5, 17, 8, 4) e 27 transições. O estado inicial é 1 e há apenas um estado final (4). O AFD reconhece as cadeias de caracteres a, b, c, d e dígitos decimais geradas pela expressão regular (ab) + [0-9] * (cd) +. A saída gerada pelo programa é:
ab1cd
abab123cd
ababcdcdcd
