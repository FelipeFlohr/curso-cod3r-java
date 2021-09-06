public class Usuario {

    String nome;
    String email;

    // Utilizando o método equals()
    @Override
    public boolean equals(Object objeto) {
        if(objeto instanceof Usuario){
            Usuario outro = (Usuario) objeto;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        }
        else{
            return false;
        }
    }

    // O hashcode será abordado em outra aula

}
