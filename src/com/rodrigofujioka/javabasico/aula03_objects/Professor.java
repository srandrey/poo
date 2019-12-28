/**
 * Projeto das trilhas de treinamento de Java básico ou avançado
 * com foco nas certificações java e em treinamentos corporativos.
 * Fontes disponíveis em https://github.com/rodrigofujioka
 * <p>
 * Professor: Rodrigo da Cruz Fujioka
 * Ano: 2016
 * http://www.rodrigofujioka.com
 * http://www.fujideia.com.br
 * http://lattes.cnpq.br/0843668802633139
 * <p>
 * Contato: rcf4@cin.ufpe.br
 */
package com.rodrigofujioka.javabasico.aula03_objects;

/**
 * Classe que define o objeto professor e seu comportamento.
 * @author: Rodrigo
 * @date: 10 de fev de 2016
 * @Time: 05:41:32
 */
public class Professor {

    String disciplina;

    /**
     *
     * Esse método ensina alguma disciplina.
     */
    public void ensina() {

        System.out.println("O professor esta ensinando a disciplina de " + this.disciplina);

    }

}
