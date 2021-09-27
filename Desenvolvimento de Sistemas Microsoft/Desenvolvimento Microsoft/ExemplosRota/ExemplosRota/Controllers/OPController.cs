using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;

namespace ExemplosRota.Controllers
{
    public class OPController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }

        public IActionResult Dobrar(int id)
        {
            ViewData["Resultado"] = id * 2;
            return View();
        }

        //public IActionResult Somar(int id, int parametroB)
        //{
        //    ViewData["Resultado"] = id + parametroB;
        //    return View();
        //}

        public IActionResult Subtrair(int n1, int n2)
        {
            ViewData["Resultado"] = n1 - n2;
            return View();
        }

        public IActionResult Somar(int n1, int n2, int n3=0)
        {
            ViewData["Resultado"] = n1 + n2 + n3;
            return View();
        }
    }
}