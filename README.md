# DesafioBancoDio

Esse projeto foi desenvolvido por causa de um desafio de um bootcamp da DIO, onde eu coloco em prática os conceitos de orientação a objeto. 

---------------------------

Falando do projeto, fiz a representação de um banco onde primeiramente criei uma classe Conta, que é abstrata e que tem os atributos mais genéricos de uma conta de banco, 
a partir disto criei duas classes que são filhas da classe Conta e tem todos os seus atributos por as duas classes terem os mesmos metódos criei uam interface onde a 
classe Conta implementa os metodós da interface IConta.
A classe Conta tem a composição da classe Cliente, pois toda conta tem que ter um cliente. Por fim também criei uma classe Banco onde esta classe tem o nome do Banco e 
também a lista de todos os clientes.

## Metódos da Interface IConta
- Sacar
- Depositar
- Trasnferir
- Imprimir Extrato
