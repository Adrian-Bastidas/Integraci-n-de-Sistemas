//------------------------------------------------------------------------------
// <auto-generated>
//     Este código se generó a partir de una plantilla.
//
//     Los cambios manuales en este archivo pueden causar un comportamiento inesperado de la aplicación.
//     Los cambios manuales en este archivo se sobrescribirán si se regenera el código.
// </auto-generated>
//------------------------------------------------------------------------------

namespace PracticaRest01.Models
{
    using System;
    using System.Collections.Generic;
    
    public partial class Consulta
    {
        public int idConsulta { get; set; }
        public System.DateTime fechaConsulta { get; set; }
        public System.TimeSpan horaConsulta { get; set; }
        public string motivoConsulta { get; set; }
        public int idCita { get; set; }
    
        public virtual Cita Cita { get; set; }
    }
}
