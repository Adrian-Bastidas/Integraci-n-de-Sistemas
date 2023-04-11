using PracticaRest01.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Http;

namespace PracticaRest01.Controllers
{
    
    public class MedicosController : ApiController
    {
        CitasMedicasDBEntities contexto;
        public MedicosController() {
            contexto = new CitasMedicasDBEntities();
            contexto.Configuration.ProxyCreationEnabled = false;

        }
        // GET: api/Medico
        public List<Medico> Get()
        {
            return contexto.Medico.ToList();
        }
        public Medico Get(int id)
        {
            return contexto.Medico.Where(cntx => cntx.idMed == id).SingleOrDefault();
        }
        public int Post(Medico medic)
        {
            contexto.Medico.Add(medic);
            contexto.SaveChanges();
            return medic.idMed;
        }
        public Medico Put(int id,Medico medic)
        {
            Medico med = new Medico();
            med = contexto.Medico.Where(cntx => cntx.idMed == id).SingleOrDefault();
            contexto.Entry(medic);
            contexto.SaveChanges();
            return medic;
        }
        public void Delete(int id)
        {
            Medico med = new Medico();
            med =contexto.Medico.Where(cntx => cntx.idMed == id).SingleOrDefault();
            contexto.Medico.Remove(med);
            contexto.SaveChanges();
        }
    }
}