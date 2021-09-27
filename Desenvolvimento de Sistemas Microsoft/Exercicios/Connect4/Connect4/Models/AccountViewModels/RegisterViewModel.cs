﻿using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace Connect4.Models.AccountViewModels
{
    public class RegisterViewModel
    {

        [Required]
        [MinLength(2)]
        [Display(Name = "Nome")]
        public string Nome { get; set; }

        [Required]
        [MinLength(14, ErrorMessage = "CPF inválido, necessário 11 digitos"), MaxLength(14, ErrorMessage = "CPF inválido, necessário 11 digitos")]
        [Display(Name = "CPF")]
        
        public string CPF { get; set; }

        [Required]
        [Display(Name = "Endereco")]
       
        public string Endereco { get; set; }

        [Required]
        [Display(Name = "CEP")]

        [MaxLength(9, ErrorMessage = "CEP inválido, necessário 8 digitos")]
        [MinLength(9, ErrorMessage = "CEP inválido, necessário 8 digitos")]
        public string CEP { get; set; }

        [Required]
        [EmailAddress]
        [Display(Name = "Email")]
        public string Email { get; set; }

        [Display(Name = "Data de Nascimento")]
        [Required]
        [MinIdade(18, ErrorMessage ="Precisa ter 18 anos para se cadastrar")]
        [MaxIdade(120, ErrorMessage = "Você é muito velho para esse jogo")]
        [DataType(DataType.Date)]
        public DateTime Nascimento { get; set; }

        [Required]
        [StringLength(100, ErrorMessage = "The {0} must be at least {2} and at max {1} characters long.", MinimumLength = 6)]
        [DataType(DataType.Password)]
        [Display(Name = "Password")]
        public string Password { get; set; }

        [DataType(DataType.Password)]
        [Display(Name = "Confirm password")]
        [Compare("Password", ErrorMessage = "The password and confirmation password do not match.")]
        public string ConfirmPassword { get; set; }
    }
}
