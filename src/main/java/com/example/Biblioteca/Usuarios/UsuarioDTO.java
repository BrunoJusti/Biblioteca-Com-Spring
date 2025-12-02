package com.example.Biblioteca.Usuarios;
import com.example.Biblioteca.Book.BookModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

        private Long id;
        private String nome;
        private String imgUrl;
        private int idade;
        private String email;
        private String cpf;
        private BookModel books;

    }

