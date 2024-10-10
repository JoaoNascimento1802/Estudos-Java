const formulario = document.querySelector("form");
const Inome = document.querySelector(".nome");
const Iemail = document.querySelector(".email");
const Isenha = document.querySelector(".senha");
const Itel = document.querySelector(".tel");

function cadastrar() {
    
}


formulario.addEventListener('submit', function (event){
    event.preventDefault();

    const dados = {
        nome: Inome.value,
        email: Iemail.value,
        senha: Isenha.value,
        tel: Itel.value
    };
});
