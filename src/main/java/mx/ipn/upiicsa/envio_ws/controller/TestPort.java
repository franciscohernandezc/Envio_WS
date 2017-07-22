package mx.ipn.upiicsa.envio_ws.controller;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author  JAVIER 
 * 
 * para ingresar es a esta url http://localhost:8080/Envio_WS/ws/test/lista
 * y agregar de user 1 y  pass 1
 * 
 * 
 */
@RestController
@RequestMapping("/test")
public class TestPort {

    public final Logger log = Logger.getLogger(this.getClass().getName());

    @RequestMapping(value = "/lista", method = RequestMethod.GET, headers = "Accept=application/json")
    public @ResponseBody
    List<String> getLista() {
        log.info("obtiene lista ");
        List<String> lista = new ArrayList<String>();
        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("d");

        return lista;
    }

}
