@Controller
class Ejemplo {
   @RequestMapping("/")
   @ResponseBody
   public String hola() {
      "Hola, Mundo"
   }
}