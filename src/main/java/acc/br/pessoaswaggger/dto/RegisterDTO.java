package acc.br.pessoaswaggger.dto;


import acc.br.pessoaswaggger.model.UserRoles;

public record RegisterDTO(String login, String password, UserRoles role){

        }
