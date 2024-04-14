# Jogo de Apostas - LotoFácil
Apostar de 0 a 100: O jogador digita um número entre 0 e 100. Se o número escolhido for sorteado, ele vence.

Apostar de A a Z: O jogador digita uma letra de A a Z. Se a letra escolhida for sorteada, ele vence.

Apostar par ou impar: O jogador digita um número e o programa determina se é par ou ímpar. Se todos os números sorteados forem do mesmo tipo (par ou ímpar), ele vence.

# Funcionalidades
O código utiliza a biblioteca Swing para criar a interface gráfica do usuário (GUI). Os botões são adicionados à janela principal (JFrame) e cada botão é configurado com um listener de ação.

Quando um botão é pressionado, o método actionPerformed é chamado, onde um switch determina qual método deve ser executado com base no texto do botão. Cada método corresponde a um tipo de aposta e exibe uma caixa de diálogo para o jogador fazer sua aposta.

Após o jogador fazer sua aposta, o programa gera números ou letras aleatórias, dependendo do tipo de aposta, e compara com a aposta do jogador. O resultado é exibido em uma caixa de diálogo.

# Como Rodar
Clone o repositório para sua máquina local.

Abra o projeto em um IDE Java, como Eclipse ou IntelliJ.

Execute a classe Painel.java.

A interface do jogo será exibida. Clique em um dos três botões para fazer sua aposta.

Siga as instruções na caixa de diálogo para fazer sua aposta.

# Versão do JDK
O projeto foi desenvolvido e testado utilizando JDK 8.

# Autor
Samuel Vidal
