package br.com.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {

    private String nome;
    private String descricao;
    final LocalDate dataInicial = LocalDate.now(); //inicializa data
    final LocalDate dataFinal = dataInicial.plusDays(45); //datainicial + 45 dias
    private Set<Dev> devInscrito = new HashSet<>(); //lista dos dev´s
    private Set<Conteudo> conteudo = new LinkedHashSet<>(); //lista de conteudo por ordem de inclusão

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevInscrito() {
        return devInscrito;
    }

    public void setDevInscrito(Set<Dev> devInscrito) {
        this.devInscrito = devInscrito;
    }

    public Set<Conteudo> getConteudo() {
        return conteudo;
    }

    public void setConteudo(Set<Conteudo> conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootCamp bootCamp = (BootCamp) o;
        return Objects.equals(nome, bootCamp.nome) && Objects.equals(descricao, bootCamp.descricao) && Objects.equals(dataInicial, bootCamp.dataInicial) && Objects.equals(dataFinal, bootCamp.dataFinal) && Objects.equals(devInscrito, bootCamp.devInscrito) && Objects.equals(conteudo, bootCamp.conteudo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devInscrito, conteudo);
    }
}
