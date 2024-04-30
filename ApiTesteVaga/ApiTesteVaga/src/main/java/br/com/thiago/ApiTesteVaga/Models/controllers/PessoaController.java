package br.com.thiago.ApiTesteVaga.Models.controllers;

import br.com.thiago.ApiTesteVaga.Models.Endereco;
import br.com.thiago.ApiTesteVaga.Models.Pessoa;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @PostMapping
    public Pessoa criarPessoa(@RequestBody Pessoa pessoa) {
        return pessoa;
    }

    @PutMapping("/{id}")
    public Pessoa editarPessoa(@PathVariable int id, @RequestBody Pessoa pessoa) {
        return pessoa;
    }

    @GetMapping("/{id}")
    public Pessoa consultarPessoa(@PathVariable int id) {
        return new Pessoa();
    }

    @PostMapping("/{id}/enderecos")
    public Endereco criarEndereco(@PathVariable int id, @RequestBody Endereco endereco) {
        return endereco;
    }

    @PutMapping("/{idPessoa}/enderecos/{idEndereco}")
    public Endereco editarEndereco(@PathVariable int idPessoa, @PathVariable int idEndereco, @RequestBody Endereco endereco) {
        return endereco;
    }

    @GetMapping("/{id}/enderecos")
    public List<Endereco> consultarEnderecos(@PathVariable int id) {
        return List.of(new Endereco());
    }

    @PutMapping("/{id}/endereco-principal/{idEndereco}")
    public Endereco indicarEnderecoPrincipal(@PathVariable int id, @PathVariable int idEndereco) {
        return new Endereco();
    }
}


