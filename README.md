Ataque real X Simulação:

Ataque Original:
Invasão do site: o atacante compromete um site legítimo (no caso, o da Rede Record) e injeta um código JavaScript malicioso.

Carregamento do Java Applet: esse script malicioso carregava um Applet Java (.jar) escondido na página.

Execução do Código Malicioso: o Java Applet baixava e executava arquivos externos na máquina da vítima, geralmente malwares para roubar dados.

_______________________________________________________________________________________________________

Simulação:

Carregamento do Applet: o código SimulatedAttackApplet é um Java Applet, um pequeno programa Java que poderia ser executado dentro de navegadores mais antigos.

Download de um Arquivo Simulado: a função downloadFile() faz uma requisição HTTP para baixar um arquivo de texto inofensivo (safe-file.txt) de um servidor fictício.
Em um ataque real, esse arquivo poderia ser um executável (.exe) ou um script malicioso.

Salvamento do Arquivo no Computador da “Vítima”: o código salva o arquivo no diretório do usuário (System.getProperty("user.home") + "/simulated_download.txt").
Em um ataque real, esse arquivo poderia ser um malware que se executa automaticamente.

Saída no Console: o programa imprime mensagens para mostrar que o arquivo foi baixado e salvo com sucesso.
