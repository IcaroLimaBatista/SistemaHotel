Sistema de Gestão de Reservas de Hotel

Descrição
Este projeto é um sistema simples de gerenciamento de reservas de hotel desenvolvido em Java, com foco em praticar lógica de programação, manipulação de matrizes e interação via terminal.
O sistema permite cadastrar, listar, buscar e ordenar reservas de hóspedes.

Funcionalidades:
Cadastrar nova reserva
Listar todas as reservas
Buscar reserva por nome do hóspede (não sensível a maiúsculas/minúsculas)
Ordenar reservas por número de dias (ordem decrescente)
Encerrar o sistema
Lógica Utilizada

O sistema utiliza uma matriz bidimensional (String[][]) para armazenar os dados das reservas:
Índice	Informação
[0]	Nome do cliente
[1]	Tipo de quarto
[2]	Número de dias
[3]	Valor total

Cada coluna representa uma reserva.

Menu do Sistema
1. Nova Reserva
2. Listar reservas
3. Buscar reserva por nome do hóspede
4. Ordenar reservas por número de dias (decrescente)
5. Sair

Exemplo de Uso
Entrada:
Nome: Maria
Dias: 2
Nome: João
Dias: 5

Saída após ordenação:
João - 5 dias
Maria - 2 dias

Limitações
Máximo de 10 reservas (tamanho fixo da matriz)
Dados armazenados apenas em memória (não persistem após encerrar o programa)
Uso de String para armazenar números (necessita conversão)

Autor
Desenvolvido por Ícaro Lima
Estudante de Engenharia de Software e Cibersegurança

Licença
Este projeto é de uso livre para fins de estudo.
