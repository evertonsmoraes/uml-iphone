
 **Este é a entrega do projeto do módulo "Modelando o iPhone com UML: Funções de Músicas, Chamadas e Internet"**  | 
 --- |
 
 <a href="https://evertonsmoraes.github.io/uml-iphone/" target="_blank">Documentação do Projeto Desenvolvido</a>
 #### Repositório do Projeto Proposto: <a href="https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe" target="_blank">https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe</a>

<table>
    <tr><td width=900px>
    <h1> UML desenvolvido</h1>
    
```mermaid
classDiagram
class Iphone  
class ReprodutorMusical {
 +String nome
  +abrir()
  +tocar()
  +pausar()
  +selecionarMusica(String musica)
}
<<interface>> ReprodutorMusical

class AparelhoTelefonico {
  +String modelo
  +String numeroLinhaTefonica
  +ligar(String numero)
  +atender()
  +iniciarCorreioVoz()
}
<<interface>> AparelhoTelefonico

class NavegadorInternet {
  +String nome
  +exibirPagina(String url)
  +adicionarNovaAba()
  +atualizarPagina()
}
<<interface>> NavegadorInternet

class Iphone {
  -String numeroLinhaTefonica
  -String nome
  -String modelo
  -String nomeReprodutorMusical
  -String nomeNavegadorNaInternet
  -String musicaAtual
  -String urlAtual
  +setNumeroLinhaTefonica void (String numeroLinhaTefonica)
  +setNome void (String nome)
  -setMusicaAtual void (String musica)
  -setUrlAtual void (String url)
  +getNumeroLinhaTefonica() String
  +getNome() String
  +getModelo() String
  +getNomeReprodutorMusical() String
  +getNomeNavegadorNaInternet() String
  +ligarAparelho void()
  +desligarAparelho void()
}

ReprodutorMusical <|-- Iphone
AparelhoTelefonico <|-- Iphone
NavegadorInternet <|-- Iphone

note for Iphone "Documentação Completa Gerada"

class Nokia2280 {
  -String numeroLinhaTefonica
  -String nome
  -String modelo
  +setNumeroLinhaTefonica void (String numeroLinhaTefonica)
  +setNome void (String nome)
  +getNumeroLinhaTefonica() String
  +getNome() String
  +getModelo() String
  +ligarAparelho void()
  +desligarAparelho void()
}

AparelhoTelefonico <|-- Nokia2280

class IpodShuffle {
  -String nome
  -String modelo
  -String nomeReprodutorMusical
  -String musicaAtual
  +setNome void (String nome)
  -setMusicaAtual void (String musica)
  +getNome() String
  +getModelo() String
  +getNomeReprodutorMusical() String
  +getNomeNavegadorNaInternet() String
  +ligarAparelho void()
  +desligarAparelho void()
}

ReprodutorMusical <|-- IpodShuffle

class Loja

Loja ..> Iphone
Loja ..> IpodShuffle
Loja ..> Nokia2280


```
</td></tr>
</table>

**Abaixo replicação da descrição do projeto**

<table>
<tr><td>
  
  # [DIO](www.dio.me) - Trilha Java Básico

  ## Autores
  - [Gleyson Sampaio](https://github.com/glysns)
  
  ## POO - Desafio
  
  ### Modelagem e Diagramação de um Componente iPhone
  
  Neste desafio, você será responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.
  
  #### Contexto
  Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos `.java`.
  
  [Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)
  - Minutos relevantes: 00:15 até 00:55
  
  #### Funcionalidades a Modelar
  1. **Reprodutor Musical**
     - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
  2. **Aparelho Telefônico**
     - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
  3. **Navegador na Internet**
     - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`
  
  ### Objetivo
  1. Criar um diagrama UML que represente as funcionalidades descritas acima.
  2. Implementar as classes e interfaces correspondentes em Java (Opcional).
  
  ### Exemplo de Diagrama UML (Mermaid)
  ```mermaid
  classDiagram
      class ReprodutorMusical {
          +exemploMetodo1()
          +exemploMetodo2(String exemplo)
      }
  
      class AparelhoTelefonico {
          +exemploMetodo1()
          +exemploMetodo2(String exemplo)
      }
  
      class NavegadorInternet {
          +exemploMetodo1()
          +exemploMetodo2(String exemplo)
      }
  
      class iPhone {
      }
  
      iPhone --> ReprodutorMusical
      iPhone --> AparelhoTelefonico
      iPhone --> NavegadorInternet
  ```
  
  ### Instruções
  1. Assista ao vídeo do lançamento do iPhone para entender as funcionalidades principais.
  2. Utilize uma ferramenta UML de sua preferência para criar o diagrama das classes e interfaces. Você pode utilizar o modelo acima (criado na sintaxe [Mermaid](https://mermaid.js.org/)), uma alternativa open-source e compatível com arquivos Markdown como este.
  3. Opcionalmente, caso esteja cheio(a) de confiança, pode implementar as classes Java representadas em seu diagrama UML.
  4. Submeta seu repositório GitHub conforme as orientações da plataforma DIO. Por exemplo:
  
  ```bash
  https://github.com/glysns/trilha-java-basico/desafios/poo/README.md
  ```` 
</td></tr>
</table>
