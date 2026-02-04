package trimestre1.ejercicios.proyecto_Aventura;
import java.util.Random;
import java.util.Scanner;

public class Z 
{
    public static void main(String[] args) 
    {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";

        //Variables generales 
        Random ran = new Random();
        // Inicialización de variables de control y de juego
        int eleccion= 0, personaje_escogido = 0,vidas, ppt_maquina = ran.nextInt(1,4), daño = 0;
        // Variables de tipo String para el inicio de sesión y el acertijo
        String contraseña_jugador = "", contraseña = "jugones", intento_anagrama = "", anagrama = "voluntario";
        //Abrir Scanner para pedida a usuario
        Scanner sc = new Scanner(System.in);
        // Variables booleanas para el control de estados del juego
        boolean combate_finalizado = false, turno = ran.nextBoolean(),voluntario = false;
        
        // Título
        System.out.println("Elige tu propia aventura VERSION: LOS JUEGOS DEL HAMBRE ");
        System.out.println("CREADORES: Ignacio Bobes Ricardo Crespo Pablo Soriano");
        // Inicio de sesión
        System.out.println("Inicio sesion");
        contraseña_jugador = sc.nextLine();
        //bucle para seguir pidiendo en caso de que la contraseña no sea correcta
        while (!contraseña.equals(contraseña_jugador)) 
        {
            System.out.println("Contraseña incorrecta");
            System.out.println("Vuelve a intentarlo");
            contraseña_jugador = sc.nextLine();
        }
        System.out.println("Inicio correcto");

        // Escoger personaje, bucle while para seguir pidiendo en caso que el valor no entre en el rago pedido
        //Try catch para caso que introduzca otro tipo de variable 
        do 
        {
            System.out.println("Pulse 1 para: KATNISS ");
            System.out.println("Pulse 2 para: PEETA");
            System.out.println("Pulse 3 para: FINNIC");
            System.out.println("Tu elección: ");
        try 
        {
            personaje_escogido = sc.nextInt(); 
            sc.nextLine();
        } 
        catch (Exception e) 
        {
            sc.nextLine();
            System.out.println("Valor no valido, Introduzcalo de nuevo");
        }
        } while (personaje_escogido <1 || personaje_escogido > 3);
        
        // switch para seleccionar la ruta inicial, Do while usado para seguir pidiendo el valor en caso que valor dado por el usuario no entre en las especificaiones dadas, ademas un uso del bloque try catch para evitar excepciones en caso que se meta otro tipo de dato
        
        switch (personaje_escogido) 
        {
            case 1:
                //Variables para Katniss
                vidas = 20;
                int flechas = 0, vidas_mono = 25;
                boolean tener_arco, tener_reloj = false, esquivar = false, plan;
                 

                System.out.println(ANSI_RED+"ERES KATNISS EVERDEEN \n La Chica en Llamas. Eres el símbolo de la rebelión, lo sepas o no. \nTu instinto de supervivencia es inigualable.\n Eres una cazadora, letal con el arco y experta en trampas.\n Te mueves por el bosque como una sombra.\n Tu debilidad es tu desconfianza; te cuesta hacer aliados y tu temperamento puede alejar a los patrocinadores.");
                System.out.println("Estas esperando, en pocos sacaran el nombre del tributo de tu distrito");
                System.out.println("Hay una opcion mala, que salga tu nombre");
                System.out.println("Pero salio una peor... Prim Everdeen");
                System.out.println("Tienes que salvarla");

                //Primera decision
                //Try Catch para evitar excepciones en caso de tipo de dato erroneo por parte ususario 
                try {
                    System.out.println("Reseulve el siguente anagrama:   oolntraiv");
                    intento_anagrama = sc.nextLine();
                    sc.nextLine();
                } 
                catch (Exception e) 
                {
                    sc.nextLine();
                    // TODO: handle exception
                }
                //comprobacion de intento jugador coincide con la solucion real
                if (intento_anagrama.toLowerCase().equals(anagrama)) 
                {
                    voluntario = true;
                }
                //SI no se completa el anagrama, no hay historia ya que no te presentas como voluntario
                if (!voluntario) 
                {
                    System.out.println("Te quedas en silencio...miras a Prim desesperada"); 
                    System.out.println("La culpa te come pero no tienes la fuerza de volunta para presentarte"); 
                    System.out.println("FINAL 1: COBARDE");  
                    break;
                }

                //Inicio historia principal
                System.out.println("Entras en la habitacion para mostrar habilidades por lo que coges tu arco. Clavas tu flecha en el centro de la diana tres veces pero ves que ningun rico te esta prestando atencion, que haces?");
                
                //Pedida de valor a usuario
                //Bulce hasta que el valor introducido sea valido
                do 
                {
                    System.out.println("Pulse 1 para: Irte ");
                    System.out.println("Pulse 2 para: Disparar a los ricos"); 
                try 
                {
                    eleccion = sc.nextInt(); 
                    sc.nextLine();
                } 
                catch (Exception e) 
                {   
                    sc.nextLine();
                    System.out.println("Valor no valido, Introduzcalo de nuevo");
                }
        
                } while (eleccion <1 || eleccion > 2);
                //If separando la opciones que podias tomar en la historia
                if (eleccion==1) 
                {
                    System.out.println("Te vas, mostrando buena tecnica y fuerza. Los participantes te han prstando atencion, pero los patrocinadores no saben ni quien eres.");    
                }
                else
                {
                    System.out.println("Disparas la flecha hacia la sala, golpea rompiendo una lampara,y echando cristales a la comida.\n Te miran con desprecio, YA SABEN QUIEN ERES, ya tienes algo positivo y algo negativo");
                }

                System.out.println(" ██▓ ███▄    █  ██▓ ▄████▄   ██▓ ▄▄▄       ███▄    █      \r\n" + //
                        "▓██▒ ██ ▀█   █ ▓██▒▒██▀ ▀█  ▓██▒▒████▄     ██ ▀█   █      \r\n" + //
                        "▒██▒▓██  ▀█ ██▒▒██▒▒▓█    ▄ ▒██▒▒██  ▀█▄  ▓██  ▀█ ██▒     \r\n" + //
                        "░██░▓██▒  ▓ ██▒░██░▒▓▓▄ ▄██▒░██░░██▄▄▄▄██ ▓██▒  ▓ ██▒     \r\n" + //
                        "░██░▒██░   ▓██░░██░▒ ▓███▀ ░░██░ ▓█   ▓██▒▒██░   ▓██░     \r\n" + //
                        "░▓  ░ ▒░   ▒ ▒ ░▓  ░ ░▒ ▒  ░░▓   ▒▒   ▓▒█░░ ▒░   ▒ ▒      \r\n" + //
                        " ▒ ░░ ░░   ░ ▒░ ▒ ░  ░  ▒    ▒ ░  ▒   ▒▒ ░░ ░░   ░ ▒░     \r\n" + //
                        " ▒ ░   ░   ░ ░  ▒ ░░         ▒ ░  ░   ▒      ░   ░ ░      \r\n" + //
                        " ░           ░  ░  ░ ░       ░        ░  ░         ░      \r\n" + //
                        "                   ░                                      \r\n" + //
                        "             ██▓     ▒█████    ██████                     \r\n" + //
                        "            ▓██▒    ▒██▒  ██▒▒██    ▒                     \r\n" + //
                        "            ▒██░    ▒██░  ██▒░ ▓██▄                       \r\n" + //
                        "            ▒██░    ▒██   ██░  ▒   ██▒                    \r\n" + //
                        "            ░██████▒░ ████▓▒░▒██████▒▒                    \r\n" + //
                        "            ░ ▒░▓  ░░ ▒░▒░▒░ ▒ ▒▓▒ ▒ ░                    \r\n" + //
                        "            ░ ░ ▒  ░  ░ ▒ ▒░ ░ ░▒  ░ ░                    \r\n" + //
                        "              ░ ░   ░ ░ ░ ▒  ░  ░  ░                      \r\n" + //
                        "                ░  ░    ░ ░        ░                      \r\n" + //
                        "                                                          \r\n" + //
                        " ▄▄▄██▀▀▀█    ██ ▓█████   ▄████  ▒█████    ██████         \r\n" + //
                        "   ▒██   ██  ▓██▒▓█   ▀  ██▒ ▀█▒▒██▒  ██▒▒██    ▒         \r\n" + //
                        "   ░██  ▓██  ▒██░▒███   ▒██░▄▄▄░▒██░  ██▒░ ▓██▄           \r\n" + //
                        "▓██▄██▓ ▓▓█  ░██░▒▓█  ▄ ░▓█  ██▓▒██   ██░  ▒   ██▒        \r\n" + //
                        " ▓███▒  ▒▒█████▓ ░▒████▒░▒▓███▀▒░ ████▓▒░▒██████▒▒        \r\n" + //
                        " ▒▓▒▒░  ░▒▓▒ ▒ ▒ ░░ ▒░ ░ ░▒   ▒ ░ ▒░▒░▒░ ▒ ▒▓▒ ▒ ░        \r\n" + //
                        " ▒ ░▒░  ░░▒░ ░ ░  ░ ░  ░  ░   ░   ░ ▒ ▒░ ░ ░▒  ░ ░        \r\n" + //
                        " ░ ░ ░   ░░░ ░ ░    ░   ░ ░   ░ ░ ░ ░ ▒  ░  ░  ░          \r\n" + //
                        " ░   ░     ░        ░  ░      ░     ░ ░        ░          ");
                System.out.println("Estas en una oscuridad acogedora, no hay ruido, escuchas como late tu corazon");
                System.out.println("De repente notas que te mueves y te ciega una luz, miras a tu alrededor, ves la imponente Cornucopia en el centro");
                System.out.println(" Suena la bocina casi inmediatamente. Observas un  arco brillando y te planteas ir a por el pero Gloss ya esta yendo hacia el. ");
                System.out.println("Notas un mensaje brillante bajo el agua: \"El camino más rápido es el que nadie pisa, el reflejo marca la piedra segura\".\n Ves unas piedras que sobresalen y otras sumergidas que se ven por el reflejo.");
                //Pedida de valor a usuario
                //Bulce hasta que el valor introducido sea valido
                do 
                {
                    System.out.println("Pulse 1 para:  Saltar por las piedras secas y visibles ");
                    System.out.println("Pulse 2 para: Pisar donde el agua hace reflejo."); 
                try 
                {
                    eleccion = sc.nextInt(); 
                    sc.nextLine();
                } 
                catch (Exception e) 
                {   
                    sc.nextLine();
                    System.out.println("Valor no valido, Introduzcalo de nuevo");
                }
        
                } while (eleccion <1 || eleccion > 2);
                //If separando la opciones que podias tomar en la historia
                 if (eleccion==1) 
                {
                    System.out.println("Es una trampa, se hunden. Gloss llega antes, te quedas sin arco y pierdes 5 HP por ahogamiento");  
                    vidas -= 5;
                     tener_arco = false;  
                }
                else
                {
                    System.out.println("Correcto. Son pilares de cristal invisibles. Llegas antes, coges el arco y huyes ilesa");
                     tener_arco = true;
                     flechas = 6;
                }
                System.out.println("Tras la situacion de la cornucopia decides esconderte en el bosque para sobrevivir. \n Escuchas un ruido tras unos arboles. ");
                //Pedida de valor a usuario
                //Bulce hasta que el valor introducido sea valido
                do 
                {
                    System.out.println("Pulse 1 para: Ir a comprobarlo. ");
                    System.out.println("Pulse 2 para: Quedarte escondida."); 
                try 
                {
                    eleccion = sc.nextInt(); 
                    sc.nextLine();
                } 
                catch (Exception e) 
                {   
                    sc.nextLine();
                    System.out.println("Valor no valido, Introduzcalo de nuevo");
                }
        
                } while (eleccion <1 || eleccion > 2);
                //If separando la opciones que podias tomar en la historia

                if (eleccion==1) 
                {
                    System.out.println("El ruido lo provocaba otra persona WIRESS, quien esta muy nerviosa y repite sin parar tic-tac tic-tac \n Para calmarla y conseguir información: ENCUENTRO CON WIRESS — “APUESTA DE MANOS”"); 
                    System.out.println("Mini juego a jugar, piedra papel o tijeras");
                    
                    
                    do 
                    {
                        try {
                            System.out.println("Pulse 1 para: Piedra. ");
                            System.out.println("Pulse 2 para: Papel.");
                            System.out.println("Pulse 3 para: Tijera.");
                            sc.nextInt();
                        } 
                        catch (Exception e) 
                        {
                            sc.nextLine();
                            // TODO: handle exception
                        }
                    }
                    while (eleccion <1 || eleccion > 3 );
                                
                    //Sucesion de if y else if para la division de camino dependiendo de lo escogido en el piedra papel tijera
                    if (eleccion == 1 && ppt_maquina == 1) 
                    {
                        System.out.println("EMPATE: Wiress se calla, se empieza a alejar, la pierdes de vista, no sacaste nada en claro");
                         tener_reloj = false;  
                    }
                    else if (eleccion == 1 && ppt_maquina == 2) 
                    {
                        System.out.println("PIERDES: Wiress huye pegando gritos, solo has perdido el tiempo");
                         tener_reloj = false;
                    }
                    else if (eleccion == 1 && ppt_maquina == 3) 
                    {
                        System.out.println("GANAS: Wiress te muestra algo brillante y te dice en un susurro: Es un reloj, Katniss");
                     tener_reloj = true;
                    }
                    else if (eleccion == 2 && ppt_maquina == 1) 
                    {
                        System.out.println("GANAS: Wiress te muestra algo brillante y te dice en un susurro: Es un reloj, Katniss");
                         tener_reloj = true;
                    }
                    else if (eleccion == 2 && ppt_maquina == 2) 
                    {
                        System.out.println("EMPATE: Wiress se calla, se empieza a alejar, la pierdes de vista, no sacaste nada en claro");
                         tener_reloj = false;
                    }
                    else if (eleccion == 2 && ppt_maquina == 3) 
                    {
                        System.out.println("PIERDES: Wiress huye pegando gritos, solo has perdido el tiempo");
                         tener_reloj = false;
                    }
                    else if (eleccion == 3 && ppt_maquina == 1) 
                    {
                        System.out.println("PIERDES: Wiress huye pegando gritos, solo has perdido el tiempo");
                         tener_reloj = false;
                    }
                    else if (eleccion == 3 && ppt_maquina == 2) 
                    {
                        System.out.println("GANAS: Wiress te muestra algo brillante y te dice en un susurro: Es un reloj, Katniss");
                         tener_reloj = true;
                    }
                    else if (eleccion == 3 && ppt_maquina == 3) 
                    {
                        System.out.println("EMPATE: Wiress se calla, se empieza a alejar, la pierdes de vista, no sacaste nada en claro");
                         tener_reloj = false;
                    }
                }
                else
                {
                    System.out.println("Aguantas en tu posicion, nerviosa, con ojos firmes y preparada para atacar si algo aparece antes tu ojos.\n Sim embargo el ruido se apaga y tu sensacion de peligro decae completamente");
                    tener_reloj = false;
                }

                //If provocando un final en caso de perder la "apuesta " con Wiress
                if (!tener_reloj) 
                {
                    System.out.println("Estas descansando, tranquila, crees que nada puede salir mal, ESE SERA TU ULTIMO ERROR ");
                    System.out.println("Empiezas a escuchar ruidos de animales, estan sufriendo, pero no sabes porque, hasta que es demasiado tarde");
                    System.out.println("Una humareda blanca te ha rodeado, NO TIENES DONDE HUIR, empiezas a notas que te cuesta respirar y empiezas a toser sangre");
                    System.out.println("HAS MUERTO: no sabias como funcionaba la arena");
                    System.out.println("FINAL 5: LOCURA");
                    break;  
                }
                //En caso de no entrar al if se continua con la historia  
                System.out.println("EL sol cae, tu campo visual se esta reduciendo, notas que el entorno vibra, hasta que aparece la razon \n Un mono mutante alfa");
                System.out.println("Solo tienes una decision que tomar. MATAR O MORIR");
                System.out.println("Inicio del combate, tu vida = 20");
                
                //Bucle que mantiene en funcionamiento el combate 
                while (!combate_finalizado) 
                {
                    //If decidiendo cual es el turno actual mediante un booleano, (el turno inicial se hace mediante un ran.nextboolean())
                    if (turno) 
                    {
                        System.out.println("TU TURNO, vidas = "+ vidas);
                        System.out.println("Ataques disponibles");
                        //Pedida de valor a usuario
                        //Bulce hasta que el valor introducido sea valido
                        do {
                            try 
                            {
                                if (flechas>0) 
                                {
                                    System.out.println("Pulse 1 para: Flechazo Certero");
                                }
                                System.out.println("Pulse 2 para: Cuchillo Corto");
                                System.out.println("Pulse 3 para: Patada y Huida");
                                eleccion = sc.nextInt();
                                sc.nextLine();
                            } 
                            catch (Exception e) 
                            {
                                sc.nextLine();
                                // TODO: handle exception
                            }
                        } while (eleccion > 3 || eleccion < 1);
                        //Segun la eleccion de usuario, selecciona un movimiento, cada uno tiene su daño establecido
                        int aleatorio = ran.nextInt(1,4);
                        if (eleccion==1) {
                            flechas -=1;
                            daño = 8;
                        }
                        else if (eleccion==2) {
                            daño = 4;
                        }
                        else if (eleccion==3) {
                            daño = 2;
                            esquivar = true;
                        }
                        //EL random se usa para escoger si los impoactos golpearan y de que forma
                        if (ran.nextInt(1,4) == 1) 
                        {
                            System.out.println("El ataque impacta totalmente");
                            vidas_mono -= daño;
                            System.out.println("Vidas mono - " + daño);
                        }
                        else if (ran.nextInt(1,4)==2) {
                            System.out.println("El ataque impacta parcialmente");
                            vidas_mono -= daño/2;
                            System.out.println("Vidas mono - " + daño/2);
                            
                        }
                        else
                        {
                         System.out.println("El ataque falla");
                         esquivar = false;   
                        }
                        //if comprobando si el combate sigue ya que el mono sigue teniendo vida
                        if (vidas_mono <= 0) 
                        {
                            System.out.println("Has ganado el combate");
                            combate_finalizado = true;    
                        }
                        
                    }
                    else
                    {
                        System.out.println("Turno del MONO MUTANTE");
                        System.out.println("VIDAS MONO RESTANTE: "+ vidas_mono);
                        //Random utilizado para esocger el movimiento del mono, cada uno tabmien tiene su daño
                        if (ran.nextInt(1,4)== 1) 
                        {
                            System.out.println("El mono ataca con un mordisco");
                            daño = 6;
                        }
                        else if (ran.nextInt(1,4)==2) 
                        {
                            System.out.println("EL mono ataca con un arañazo");
                            daño = 4;
                        }
                        else
                        {
                            System.out.println("El mono ataca con un grito");
                            daño = 2; 
                        }
                        //EL random se usa para escoger si los impoactos golpearan y de que forma
                        if (ran.nextInt(1,4)== 1) 
                        {
                            //Comprobacion si katniss esquivara el ataque 
                            if (esquivar) 
                            {
                                System.out.println("Esquivas el ataque");    
                            }
                            else
                            {   
                                System.out.println("El golpe impacta completamente ");
                                System.out.println("Vidas jugador - " + daño);
                                vidas -= daño; 
                            }
                            
                        }
                        else if (ran.nextInt(1,4)==2) 
                        {
                            //Comprobacion si katniss esquivara el ataque 
                            if (esquivar) 
                            {
                                System.err.println("Esquivas el ataque ");    
                            }
                            else
                            {
                                System.out.println("El golpe impacta parcialmente ");
                                System.out.println("Vidas jugador - " + daño/2);
                                vidas -= daño/2;
                            }
                        }
                        else
                        {
                            System.out.println("El ataque falla ");
                        }
                        if (vidas <= 0) 
                        {
                            System.out.println("Estas muy debil, pero consigues distraer al mono y huir");
                            combate_finalizado = true;    
                        }
                        turno = !turno;
                    }
                }
                System.out.println("El combate ha finalizado, te sigues moviendo por la arena y encuentras a Beetee sentando sobre una roca, enrollando un cable metálico casi invisible.");
                System.out.println("EL ACERTIJO DEL ALAMBRE — BEETEE");
                System.out.println("BEETEE te plantea la siguente pregunta:");
                System.out.println("Para atrapar un rayo  necesito un conductor y una toma de tierra. El árbol será el conductor. \n¿La toma de tierra… cuál es?");
                do {
                    try {
                        System.out.println("Pulse 1 para: EL SUELO DE LA SELVA");
                        System.out.println("Pulse 2 para: EL MAR");
                        eleccion = sc.nextInt();
                        sc.nextLine();
                    } catch (Exception e) {
                        sc.nextLine();
                        // TODO: handle exception
                    } 
                } 
                while (eleccion <1 || eleccion > 2);
                if (eleccion==1) 
                {
                    System.out.println("Beetee niega lentamente. La arena no conduce electricidad, no hay tiempo para pensar mas");
                    System.out.println("PLAN FALLIDO");
                    plan = false;
                }
                else
                {
                    System.out.println("Beetee sonríe satisfecho. El agua salada es la clave. El plan puede funcionar.");
                    plan =true;
                }

                //FINALES POSIBLES (no contemplan los que acabn antes)
                if (!plan) 
                {
                    System.out.println("FINAL 6: FUEGO CRUZADO");
                    System.out.println("Beetee conecta el cable al suelo. Nada ocurre.");
                    System.out.println("  El rayo cae sin control, estalla en el aire y revienta media arena.");
                    System.out.println("Tú estás demasiado cerca. La explosion te derrumba.");
                    System.out.println( "En los últimos segundos, el Capitolio te recoge inconsciente");
                    System.out.println("Sigues con vida, pero te conviertes en rehén propagandístico");
                    System.out.println("Un final sin gloria.");
                    break;
                }
                if (!tener_arco) {
                    System.out.println(" FINAL 4: VENCEDORA SOLITARIA"); 
                    System.out.println("Te das cuenta que el plan le falta algo. TU ARCO, no pueden ganar asi..... pero TU SI");
                    System.out.println("Decides traiconar a tu equipo");
                    System.out.println("Sobrevives con trampas, cazas , resistes");
                    System.out.println("ERES LA GANADORA DE LOS 75º JUEGOS DEL HAMBRE.....");
                    System.out.println("pero estas sola");    
                    break;              
                }
                if (vidas <= 0 && tener_arco) {
                    System.out.println("FINAL 3 — MÁRTIR");
                    System.out.println("Intenas tensar el arco, pero estas muy debil");
                    System.out.println("No consigues disparar");
                    System.out.println("EL capitolio te captura");
                    System.out.println("TU HISTORIA ACABA AQUI");
                    break;
 
                }
                if (tener_arco && plan) 
                {
                    System.out.println("FINAL 2 — EL SINSAJO");
                    System.out.println("Disparas tu arco, el rayo desciende");
                    System.out.println("La arena estalla");
                    System.out.println("Eres rescatada por los rebeldes");
                    System.out.println("HABEIS GANADO CONTRA EL CAPITOLIO");
                    break;    
                }
            
            
            break; 









                



            case 2:
                //Variables mas especificas  en este caso para Peeta
                vidas = 25;
                int vidas_brutus = 35;
                boolean aliada = false, tener_medicina = false, logica = false, cegar = false, muerto = false;
                System.out.println(ANSI_YELLOW+"ERES PEETA MELLARK \n El Chico del Pan. Tu arma no es la fuerza bruta, aunque la tienes, sino tus palabras. Eres el maestro de la estrategia social y el carisma. Sabes cómo ganarte al público y conseguir patrocinadores. Además, eres un experto en camuflaje. Tu debilidad es tu brújula moral; tu aversión a matar te pone en desventaja.");
                System.out.println("Estas esperando, en pocos sacaran el nombre del tributo de tu distrito");
                System.out.println("Hay una opcion mala, que salga tu nombre");
                System.out.println("Pero salio una peor... Hemlich");
                System.out.println("Tienes que salvarla");
                //Resolucion de anagrama para empezar la historia
                try {
                    System.out.println("Reseulve el siguente anagrama:   oolntraiv");
                    intento_anagrama = sc.nextLine();
                    sc.nextLine();
                } catch (Exception e) {
                    sc.nextLine();
                    // TODO: handle exception
                }
                //Las dos opciones y resultados que pueden salir, resolverlo correctamente o no
                if (intento_anagrama.toLowerCase().equals(anagrama)) 
                {
                    voluntario = true;
                }
                //Si se falla no comienza la historia
                if (!voluntario) 
                {
                    System.out.println("Te quedas en silencio...miras a Hemlich desesperado"); 
                    System.out.println("La culpa te come pero no tienes la fuerza de voluntad para presentarte"); 
                    System.out.println("FINAL 1: COBARDE");  
                    break;
                }
                
                //Primera seleccion dentro de a historia, mismo funcionamiento que el resto
                System.out.println("Entras en la habitacion para mostrar habilidades, decides intentar practicar con armas pero no es tu fuerte por lo que practicas camuflage. Piensas que hacer aliados será útil pero no estas seguro si podras conseguirlo");
                System.out.println("¿Intentas hablar con gente?");
                do 
                {
                    System.out.println("Pulse 1 para: Si ");
                    System.out.println("Pulse 2 para: No"); 
                try 
                {
                    eleccion = sc.nextInt(); 
                    sc.nextLine();
                } 
                catch (Exception e) 
                {   
                    sc.nextLine();
                    System.out.println("Valor no valido, Introduzcalo de nuevo");
                }
        
                } while (eleccion <1 || eleccion > 2);

                if (eleccion==1) 
                {
                    System.out.println("Consigues hablar con gente asustada, usas tu gran carisma para tranquilizarlos\n IMPORTANTE: has conseguido aliados");    
                }
                else
                {
                    System.out.println("Te vas sin dejar marca en nadie, nadie te tiene como objetivo pero tampoco creen que eres util");
                }


                System.out.println(" ██▓ ███▄    █  ██▓ ▄████▄   ██▓ ▄▄▄       ███▄    █      \r\n" + //
                        "▓██▒ ██ ▀█   █ ▓██▒▒██▀ ▀█  ▓██▒▒████▄     ██ ▀█   █      \r\n" + //
                        "▒██▒▓██  ▀█ ██▒▒██▒▒▓█    ▄ ▒██▒▒██  ▀█▄  ▓██  ▀█ ██▒     \r\n" + //
                        "░██░▓██▒  ▓ ██▒░██░▒▓▓▄ ▄██▒░██░░██▄▄▄▄██ ▓██▒  ▓ ██▒     \r\n" + //
                        "░██░▒██░   ▓██░░██░▒ ▓███▀ ░░██░ ▓█   ▓██▒▒██░   ▓██░     \r\n" + //
                        "░▓  ░ ▒░   ▒ ▒ ░▓  ░ ░▒ ▒  ░░▓   ▒▒   ▓▒█░░ ▒░   ▒ ▒      \r\n" + //
                        " ▒ ░░ ░░   ░ ▒░ ▒ ░  ░  ▒    ▒ ░  ▒   ▒▒ ░░ ░░   ░ ▒░     \r\n" + //
                        " ▒ ░   ░   ░ ░  ▒ ░░         ▒ ░  ░   ▒      ░   ░ ░      \r\n" + //
                        " ░           ░  ░  ░ ░       ░        ░  ░         ░      \r\n" + //
                        "                   ░                                      \r\n" + //
                        "             ██▓     ▒█████    ██████                     \r\n" + //
                        "            ▓██▒    ▒██▒  ██▒▒██    ▒                     \r\n" + //
                        "            ▒██░    ▒██░  ██▒░ ▓██▄                       \r\n" + //
                        "            ▒██░    ▒██   ██░  ▒   ██▒                    \r\n" + //
                        "            ░██████▒░ ████▓▒░▒██████▒▒                    \r\n" + //
                        "            ░ ▒░▓  ░░ ▒░▒░▒░ ▒ ▒▓▒ ▒ ░                    \r\n" + //
                        "            ░ ░ ▒  ░  ░ ▒ ▒░ ░ ░▒  ░ ░                    \r\n" + //
                        "              ░ ░   ░ ░ ░ ▒  ░  ░  ░                      \r\n" + //
                        "                ░  ░    ░ ░        ░                      \r\n" + //
                        "                                                          \r\n" + //
                        " ▄▄▄██▀▀▀█    ██ ▓█████   ▄████  ▒█████    ██████         \r\n" + //
                        "   ▒██   ██  ▓██▒▓█   ▀  ██▒ ▀█▒▒██▒  ██▒▒██    ▒         \r\n" + //
                        "   ░██  ▓██  ▒██░▒███   ▒██░▄▄▄░▒██░  ██▒░ ▓██▄           \r\n" + //
                        "▓██▄██▓ ▓▓█  ░██░▒▓█  ▄ ░▓█  ██▓▒██   ██░  ▒   ██▒        \r\n" + //
                        " ▓███▒  ▒▒█████▓ ░▒████▒░▒▓███▀▒░ ████▓▒░▒██████▒▒        \r\n" + //
                        " ▒▓▒▒░  ░▒▓▒ ▒ ▒ ░░ ▒░ ░ ░▒   ▒ ░ ▒░▒░▒░ ▒ ▒▓▒ ▒ ░        \r\n" + //
                        " ▒ ░▒░  ░░▒░ ░ ░  ░ ░  ░  ░   ░   ░ ▒ ▒░ ░ ░▒  ░ ░        \r\n" + //
                        " ░ ░ ░   ░░░ ░ ░    ░   ░ ░   ░ ░ ░ ░ ▒  ░  ░  ░          \r\n" + //
                        " ░   ░     ░        ░  ░      ░     ░ ░        ░          ");
                System.out.println("Saltas a la arena y consigues tu machete");
                System.out.println("Vas hacia el bosque a esconderte");
                System.out.println("Entre los árboles húmedos aparece Johanna Mason , debes tener cuidado");
                System.out.println("Lleva un hacha apoyada en el hombro, La baja hasta apuntarte con ella");
                System.out.println("—Dame una excusa para no matarte —dice—.\n Y que no sea “Katniss”. Estoy harta de ella");
                //Bucle para continuar pidiendo e lvalor a ususario si no es valido
                //try catch para comprobar el tipo de valor
                do {
                    try {
                            System.out.println("Pulse 1 para: “Soy bueno con el camuflaje, puedo esconderte.”");
                            System.out.println("Pulse 2 para: “Hago buen pan. Y sé qué plantas son comestibles aquí.”");
                            eleccion = sc.nextInt();
                            sc.nextLine();
                    } catch (Exception e) {
                        sc.nextLine();
                        // TODO: handle exception
                    }
                } while (eleccion <1 || eleccion > 2);
                //Opciones segun eleccion
                if (eleccion==1) 
                {
                    System.out.println("Johanna suelta una carcajada");
                    System.out.println("—¿Esconderme? ¿A mí?");
                    System.out.println("Te da un golpe fuerte con el mango del hacha.");
                    vidas -=5;
                    System.out.println("Johanna NO se une");
                }
                else
                {
                    System.out.println("Johanna baja el hacha lentamente");
                    System.out.println("—Tengo hambre. Vienes conmigo");
                    System.out.println("ALIADA CONSEGUIDA");
                    aliada = true;
                }
                
                System.out.println("Tras tu encuentro con Johanna decides buscar suministros.");
                System.out.println("La sed te consume");
                System.out.println("Crees que tu suerte ha mejorado  cuando escuchas agua.... ");
                System.out.println("Resulta que tu suerte solo empeoro, ante ti esta BRUTUS¡");
                System.out.println("Es mucho mas fuerte que tu, pero tambien rapido, solo puedes luchar ");
                
                
                //Bucle para el funcionamiento del combate 
                while (!combate_finalizado) {
                   
                //condicional para determinar el turno
                //el Turno inicial fue mediante la creacion de la variable con un ran.nextboolean()
                    if (turno) {
                        System.out.println("Tus vidas son" + vidas);
                        //Bucle para continuar pidiendo e lvalor a ususario si no es valido
                        //try catch para comprobar el tipo de valor
                        do 
                        {
                            try 
                            {
                                System.out.println("Pulse 1 para: Golpe de machete ");
                                System.out.println("Pulse 2 para: Lanzar arena 1");
                                System.out.println("Pulse 3 para: Embestida de placaje ");
                                eleccion = sc.nextInt();
                                sc.nextLine();
                            } 
                            catch (Exception e) 
                            {
                                sc.nextLine();
                        // TODO: handle exception
                            }
                        } while (eleccion <1 || eleccion > 3);
                        //Segun el movimiento escogido el daño a realizar cambiara
                        if (eleccion==1) 
                        {
                             daño= 6;
                        }
                        else if (eleccion==2) 
                        {
                             daño = 2;
                             cegar = true;
                        }
                        else
                        {
                             daño = 8;
                        }

                        //Uso de un random para determinar la forma en la que golpeara
                        if (ran.nextInt(1,4)==1) 
                        {
                            System.out.println("El golpe impacta completamente ");
                            System.out.println("Vidas Brutus - " + daño);
                            vidas_brutus -= daño;
                        }
                        else if (ran.nextInt(1,4)==2) 
                        {
                            System.out.println("El golpe impacta parcialmente");
                            System.out.println("Vidas Brutus -" + daño/2);
                            vidas_brutus  -= daño/2;
                        }
                        else
                        {
                            System.out.println("El ataque falla");
                            
                        }
                        //Comprobacion para ver si se ha derrotado enemigo
                        if (vidas_brutus <= 0 ) 
                        {
                            combate_finalizado = true;
                            System.out.println("Has derrotado a Brutus");
                        }
                        //Cambio de turno
                        turno = !turno;
                    }
                    else
                    {
                        daño= 0;
                        System.out.println("Turno de Brutus");
                        System.out.println("Brutues tiene "+ vidas_brutus +" vidas");
                        //Aleatorio para ver el movimiento del enemigo
                        if (ran.nextInt(1,4)==1) 
                        {
                            System.out.println("Brutus ataca con un cuchillo ");
                            daño = 8;
                        }
                        else if (ran.nextInt(1,4) == 2) 
                        {
                            System.out.println("Brutes ataca con una patada");
                            daño = 6;
                        }
                        else
                        {
                            System.out.println("Brutus ataca con el puño ");
                            daño = 2;
                        }


                        //Uso de un random para determinar la forma en la que golpeara

                        if (ran.nextInt(1,4)==1) 
                        {
                            if (cegar) 
                            {
                                System.out.println("Brutus estaba cegado y falla el ataque");
                                cegar = false;

                            }
                            else
                            {
                                System.out.println("El golpe impacta completamente ");
                                System.out.println("Vidas Jugador - " + daño);
                                vidas -= daño;
                            }
                            
                        }
                        else if (ran.nextInt(1,4)==2) 
                        {
                            if (cegar) 
                            {
                                System.out.println("Brutus estaba cegado y falla el ataque");
                                cegar = false;
                            }
                            else
                            {
                                System.out.println("El golpe impacta parcialmente");
                                System.out.println("Vidas Brutus -" + daño/2);
                                vidas_brutus  -= daño/2; 
                            }
                            
                        }
                        else
                        {
                            System.out.println("El ataque falla");
                            cegar = false;
                        }
                        //Comprobacion si el combate continua o te han derrotado
                        if (vidas <= 0 ) 
                        {
                            combate_finalizado = true;
                            System.out.println("Has sido derrotado por Brutus");
                            muerto = true;
                        }
                        //Cambia el turno
                        turno = !turno;
                    }
                }
                //Si se ha perdido el combate, se activiara un final
                if (muerto) 
                {
                    System.out.println("FINAL 3 — MUERTE HEROICA ");
                    System.out.println("El mar golpea la arena mientras sangras.");
                    System.out.println("Miras al cielo, sabiendo que tu muerte encenderá algo más grande que tú.");
                    System.out.println("Tu sacrificio inspira a la rebelión.");
                    break;
                }
                System.out.println("Llegas herido al borde del bosque ");
                System.out.println("Una figura del Distrito 6 —la Morfinta— aparece silenciosa");
                System.out.println("Lleva una dosis de medicina que necesitas con urgencia");
                System.out.println("No habla. Solo te mira y mueve la mano en un gesto claro");
                System.out.println("Piedra, Papel o Tijera");
                //Bucle para continuar pidiendo e lvalor a ususario si no es valido
                    //try catch para comprobar el tipo de valor
                do 
                    {
                        try {
                            System.out.println("Pulse 1 para: Piedra. ");
                            System.out.println("Pulse 2 para: Papel.");
                            System.out.println("Pulse 3 para: Tijera.");
                            sc.nextInt();
                        } 
                        catch (Exception e) 
                        {
                            sc.nextLine();
                            // TODO: handle exception
                        }
                    }
                    while (eleccion <1 || eleccion > 3 );
                    //Opciones segun lo escogido por el jugador para el piedra papel o tijera
                    //Se usa un random para determinar lo escodigo por el NPC
                    if (eleccion == 1 && ppt_maquina == 1) 
                    {
                        System.out.println("EMPATE: la Morfinta se encoge de hombros antes de darte una pequeña hoja de menta ");
                        System.out.println("La muerdes y te sientes un poco mejor");
                        vidas+=2;
                        tener_medicina = false; 
                          
                    }
                    else if (eleccion == 1 && ppt_maquina == 2) 
                    {
                        System.out.println("PIERDES: la morfinta se guarda la medicina");
                        System.out.println("Se esfuma entre los árboles");
                        tener_medicina = false; 
                         
                    }
                    else if (eleccion == 1 && ppt_maquina == 3) 
                    {
                        System.out.println("GANAS: Ella sonríe débilmente");
                        System.out.println("Te da la medicina");
                        vidas+=10;
                        System.out.println("Más adelante, se sacrificará por ti");
                        tener_medicina = true;
                     
                    }
                    else if (eleccion == 2 && ppt_maquina == 1) 
                    {
                        System.out.println("GANAS: Ella sonríe débilmente");
                        System.out.println("Te da la medicina");
                        vidas+=10;
                        System.out.println("Más adelante, se sacrificará por ti");
                        tener_medicina = true;                         
                    }
                    else if (eleccion == 2 && ppt_maquina == 2) 
                    {
                        System.out.println("EMPATE: la Morfinta se encoge de hombros antes de darte una pequeña hoja de menta ");
                        System.out.println("La muerdes y te sientes un poco mejor");
                        vidas+=2;
                        tener_medicina = false;                         
                    }
                    else if (eleccion == 2 && ppt_maquina == 3) 
                    {
                        System.out.println("PIERDES: la morfinta se guarda la medicina");
                        System.out.println("Se esfuma entre los árboles");
                        tener_medicina = false; 
                    }
                    else if (eleccion == 3 && ppt_maquina == 1) 
                    {
                        System.out.println("PIERDES: la morfinta se guarda la medicina");
                        System.out.println("Se esfuma entre los árboles");
                        tener_medicina = false; 
                    }
                    else if (eleccion == 3 && ppt_maquina == 2) 
                    {
                        System.out.println("GANAS: Ella sonríe débilmente");
                        System.out.println("Te da la medicina");
                        vidas+=10;
                        System.out.println("Más adelante, se sacrificará por ti");
                        tener_medicina = true;                    
                    }
                    else if (eleccion == 3 && ppt_maquina == 3) 
                    {
                        System.out.println("EMPATE: la Morfinta se encoge de hombros antes de darte una pequeña hoja de menta ");
                        System.out.println("La muerdes y te sientes un poco mejor");
                        vidas+=2;   
                        tener_medicina = false;                  
                    }
                    //Si no se gana la "la apuesta" se activa un final
                    if (!tener_medicina && vidas<=10 ) 
                    {
                        System.out.println("Las heridas te arden, no puedes continuar...");
                        System.out.println("Empiezas a perder la consciencia");
                        System.out.println("FINAL 5: INFECCION"); 
                        System.out.println(" La fiebre te consume.");
                        System.out.println("Mueres sin violencia....no derramas sangres");
                        System.out.println("pero caes en el olvido");
                        break;  
                    }

                    System.out.println("Ha caido ya la noche, puedes descansar un poco");
                    System.out.println("EL sol te despierta, es momento de moverte");
                    System.out.println("Viajas en busca de comida.");
                    System.out.println("Ves un trozo de pan fresco, vas a comertelo...");
                    System.out.println("ANtes de darle un mordisco ves un patron quemado en la corteza");
                    System.out.println("12-6-12-6");
                    System.out.println("Piensas que puedes hacer");
                    //Bucle para continuar pidiendo e lvalor a ususario si no es valido
                        //try catch para comprobar el tipo de valor
                    do 
                    {
                        try {
                            System.out.println("Pulse 1 para: Ir a la Cornucopia a las 12. ");
                            System.out.println("Pulse 2 para: Moverse de norte a sur cada 6 horas.");
                            sc.nextInt();
                        } 
                        catch (Exception e) 
                        {
                            sc.nextLine();
                            // TODO: handle exception
                        }
                    }
                    while (eleccion <1 || eleccion > 2 );
                    //REsultado de la opcion escogida
                    if (eleccion==1) {
                        System.out.println("Es la hora del rayo.");
                        System.out.println("Una explosión sacude la arena.");
                        System.out.println("DECISIÓN EQUIVOCADA");
                        logica = false;
                    }
                    else
                    {
                       System.out.println("Encaja");
                       System.out.println("Sigues el patrón del reloj"); 
                       System.out.println(" Evitas zonas letales");
                       System.out.println("PUZLE RESUELTO");
                       logica = true;
                    }

                    //FINALES, estos 
                
                    if (aliada && logica) 
                    {
                        System.out.println("FINAL 4 — EL LÍDER");  
                        System.out.println("Johanna lucha a tu lado");
                        System.out.println("Interpretaste el patrón del reloj"); 
                        System.out.println("Guias a los demás entre las zonas seguras");
                        System.out.println("Cuando la arena cae, escapas con Katniss al Distrito 13");
                        System.out.println("Te conviertes en líder, eres la esperanza del resto");
                        break; 
                    }
                    if (vidas < 8) 
                    {
                        System.out.println("FINAL 2 — SECUESTRADO");
                        System.out.println("Te encuentras en la orilla cuando llega el aerodeslizador rebelde");
                        System.out.println("Levantan a Katniss");
                        System.out.println("Una red electromagnética te atrapa a ti");
                        System.out.println("El Capitolio te arrastra al cielo");
                        System.out.println("Tu historia continúa… como prisionero");
                        break;    
                    }

                    //En caso de que no se cumplan los requisitos para otro final
                    System.out.println("FINAL 6 — EL TÍTERE");
                    System.out.println("pero nunca luchas por escapar");
                    System.out.println("Snow te considera útil y te mantiene vivo");
                    System.out.println("Te mandan de vuelta a tu distrito");
                    System.out.println("No mueres pero tu libertad desaparece");



                break;
            case 3: 
                //Variables  de Finnick
                vidas =  30;
                boolean combate = false, pulso = false, tener_tridente = true, combate_perfecto = false;
                int vidas_cashmere = 20;
                
                System.out.println(ANSI_GREEN+"ERES FINNICK ODAIR \n El Favorito del Capitolio. Eres una leyenda de los Juegos, un profesional nato. Encantador, atlético y absolutamente letal con el tridente. El agua es tu elemento natural. Usas tu arrogancia y belleza como un escudo, pero bajo la superficie yace una mente astuta. Tu debilidad es tu exceso de confianza y el peso de tu reputación");
                System.out.println("Estas esperando, en pocos sacaran el nombre del tributo de tu distrito");
                System.out.println("Hay una opcion mala, que salga tu nombre");
                System.out.println("Tuviste suerte, no es tu nombre, aun asi piensas en si deberias salvar a este señor");
                //Pedida al usuario para resolucion anagrama
                try {
                    System.out.println("Reseulve el siguente anagrama:   oolntraiv");
                    intento_anagrama = sc.nextLine();
                    sc.nextLine();
                } catch (Exception e) {
                    sc.nextLine();
                    // TODO: handle exception
                }
                //Comprobacion de la respuesta y si esta correcta
                if (intento_anagrama.toLowerCase().equals(anagrama)) 
                {
                    voluntario = true;
                }
                //SI se falla, provoca un final ya que no hay historia
                if (!voluntario) 
                {
                    System.out.println("Te quedas en silencio...miras al desconocido"); 
                    System.out.println("La culpa te come pero no tienes la fuerza de volunta para presentarte"); 
                    System.out.println("FINAL 1: COBARDE");  
                    break;
                }
                //Primera decision de la historia
                //Bucle para continuar pidiendo e lvalor a ususario si no es valido
                //try catch para comprobar el tipo de valor
                System.out.println("Entras en la habitacion para mostrar habilidades, caminas recto y con cara confiado, conoces bien las habilidades que posees. Piensas en dar un espectaculo");
                do 
                {
                    System.out.println("Pulse 1 para: Si ");
                    System.out.println("Pulse 2 para: No"); 
                try 
                {
                    eleccion = sc.nextInt(); 
                    sc.nextLine();
                } 
                catch (Exception e) 
                {   
                    sc.nextLine();
                    System.out.println("Valor no valido, Introduzcalo de nuevo");
                }
        
                } while (eleccion <1 || eleccion > 2);
                //Condicional dependiendo del resultado
                if (eleccion==1) 
                {
                    System.out.println("Lanzas el tridente hacia un maniquin (se parece a PEETA), le arranca la cabeza de un solo golpe y ries en alto");    
                }
                else
                {
                    System.out.println("Vuelves a dejar el trindente en la sala, te vas sin llamar mucho la atencion ");
                }

                System.out.println(" ██▓ ███▄    █  ██▓ ▄████▄   ██▓ ▄▄▄       ███▄    █      \r\n" + //
                        "▓██▒ ██ ▀█   █ ▓██▒▒██▀ ▀█  ▓██▒▒████▄     ██ ▀█   █      \r\n" + //
                        "▒██▒▓██  ▀█ ██▒▒██▒▒▓█    ▄ ▒██▒▒██  ▀█▄  ▓██  ▀█ ██▒     \r\n" + //
                        "░██░▓██▒  ▓ ██▒░██░▒▓▓▄ ▄██▒░██░░██▄▄▄▄██ ▓██▒  ▓ ██▒     \r\n" + //
                        "░██░▒██░   ▓██░░██░▒ ▓███▀ ░░██░ ▓█   ▓██▒▒██░   ▓██░     \r\n" + //
                        "░▓  ░ ▒░   ▒ ▒ ░▓  ░ ░▒ ▒  ░░▓   ▒▒   ▓▒█░░ ▒░   ▒ ▒      \r\n" + //
                        " ▒ ░░ ░░   ░ ▒░ ▒ ░  ░  ▒    ▒ ░  ▒   ▒▒ ░░ ░░   ░ ▒░     \r\n" + //
                        " ▒ ░   ░   ░ ░  ▒ ░░         ▒ ░  ░   ▒      ░   ░ ░      \r\n" + //
                        " ░           ░  ░  ░ ░       ░        ░  ░         ░      \r\n" + //
                        "                   ░                                      \r\n" + //
                        "             ██▓     ▒█████    ██████                     \r\n" + //
                        "            ▓██▒    ▒██▒  ██▒▒██    ▒                     \r\n" + //
                        "            ▒██░    ▒██░  ██▒░ ▓██▄                       \r\n" + //
                        "            ▒██░    ▒██   ██░  ▒   ██▒                    \r\n" + //
                        "            ░██████▒░ ████▓▒░▒██████▒▒                    \r\n" + //
                        "            ░ ▒░▓  ░░ ▒░▒░▒░ ▒ ▒▓▒ ▒ ░                    \r\n" + //
                        "            ░ ░ ▒  ░  ░ ▒ ▒░ ░ ░▒  ░ ░                    \r\n" + //
                        "              ░ ░   ░ ░ ░ ▒  ░  ░  ░                      \r\n" + //
                        "                ░  ░    ░ ░        ░                      \r\n" + //
                        "                                                          \r\n" + //
                        " ▄▄▄██▀▀▀█    ██ ▓█████   ▄████  ▒█████    ██████         \r\n" + //
                        "   ▒██   ██  ▓██▒▓█   ▀  ██▒ ▀█▒▒██▒  ██▒▒██    ▒         \r\n" + //
                        "   ░██  ▓██  ▒██░▒███   ▒██░▄▄▄░▒██░  ██▒░ ▓██▄           \r\n" + //
                        "▓██▄██▓ ▓▓█  ░██░▒▓█  ▄ ░▓█  ██▓▒██   ██░  ▒   ██▒        \r\n" + //
                        " ▓███▒  ▒▒█████▓ ░▒████▒░▒▓███▀▒░ ████▓▒░▒██████▒▒        \r\n" + //
                        " ▒▓▒▒░  ░▒▓▒ ▒ ▒ ░░ ▒░ ░ ░▒   ▒ ░ ▒░▒░▒░ ▒ ▒▓▒ ▒ ░        \r\n" + //
                        " ▒ ░▒░  ░░▒░ ░ ░  ░ ░  ░  ░   ░   ░ ▒ ▒░ ░ ░▒  ░ ░        \r\n" + //
                        " ░ ░ ░   ░░░ ░ ░    ░   ░ ░   ░ ░ ░ ░ ▒  ░  ░  ░          \r\n" + //
                        " ░   ░     ░        ░  ░      ░     ░ ░        ░          ");
                System.out.println("Te diriges a la cornucopia, es un caos");
                System.out.println("Cashmere, rápida como un filo, se lanza hacia Katniss");
                System.out.println("Te colocas entre ambas");
                System.out.println("—Apártate, Finnick —escupe ella—. O te abro en dos");
                //Bulce para funcionamiento del combate
                while (!combate_finalizado) {
                    //condicional para el turno
                    if (turno) 
                    {
                        //pedido de movimiento al usuario
                        //Try catch comprobar el tipo de dato
                        do {
                            try {
                                if (tener_tridente) 
                                {
                                    System.out.println("Pulse 1 para: Lanzamiento de Tridente");    
                                }
                                System.out.println("Pulse 2 para: Red de Pescador");
                                System.out.println("Pulse 3 para: Golpe de Mango");
                            } catch (Exception e) {
                                // TODO: handle exception
                            }
                        } while (eleccion <1 || eleccion > 3);
                        //Condicional para registrar el daño en funcion del movimineto
                        if (eleccion==1 && tener_tridente) 
                        {
                            System.out.println("Decides lanzar tu tridente para atacar");
                            daño = 8;
                        }
                        else if (eleccion ==2) 
                        {
                            System.out.println("Decides envolverla con una red de pescador con puas");
                            daño = 6;
                        }
                        else
                        {
                            System.out.println("Decides golpear con el mango");
                        }
                        //Random para ver la forma en la que el movimiento impacta
                        if (ran.nextInt(1,4)==1) 
                        {
                            System.out.println("El ataque impacta totalmente");
                            System.out.println("Vidas CASHMERE - " + daño);
                            vidas_cashmere -= daño;
                        }
                        else if (ran.nextInt(1,4) == 2) 
                        {
                            System.out.println("El ataque impacta parcialmente");
                            System.out.println("Vidas CASHMERE - " + daño/2);
                            vidas_cashmere -= daño/2;
                        }
                        else
                        {
                            System.out.println("El ataque falla");
                        }
                        //Comprobacion para ver si elcombate sigue 
                        if (vidas_cashmere <= 0) 
                        {
                            combate_finalizado = true;
                            System.out.println("Has derrotado a Cashmere");
                            combate = true; 
                            //condicional si no has recibido daño
                            if (vidas == 30) {
                                 combate_perfecto = true;
                                
                            } 
                            else
                                {
                                    combate_perfecto = false;
                                }  
                        }
                        //cambio de turno

                        turno = !turno;
                    }
                    else
                    {
                        //Aleatorio para el movimiento del NPC
                        if (ran.nextInt(1,4 )==1) 
                        {
                            System.out.println("CASHMERE  ataca con una patada");
                            daño = 2;
                        }
                        else if (ran.nextInt(1,4)==2) 
                        {
                            System.out.println("CASHMERE ataca lanzando el cuchillo ");
                            daño =6;
                        }
                        else
                        {
                            System.out.println("CASHMERE ataca con los puños de frente");
                            daño = 4;
                        }
                        //Aleatorio para ver la forma en la cual el golpe impacta
                        if (ran.nextInt(1,4)==1) 
                        {
                            System.out.println("El ataque impacta totalmente");
                            System.out.println("Vidas jugador - " + daño);
                            vidas -= daño;
                        }
                        else if (ran.nextInt(1,4) == 2) 
                        {
                            System.out.println("El ataque impacta parcialmente");
                            System.out.println("Vidas jugador - " + daño/2);
                            vidas -= daño/2;
                        }
                        else
                        {
                            System.out.println("El ataque falla");
                        }
                        //Comprobacion de que si sigue el combate
                        if (vidas <= 0) 
                        {

                            combate_finalizado = true;
                            System.out.println("Huyes del combate viendo que vas perdiendo");  
                            combate = false;  
                        }
                        //cambio de turno
                        turno = !turno;
                    }
                }

                    System.out.println("Tras el combate, sigues avanzando a traves del bosque ");
                    System.out.println("Te encuentras a Chaff, del distrito 11. Amigo y Lider");
                    System.out.println("Pero hay un problema, no quiere seguir el plan ");
                    System.out.println("—No me mandas —dice tambaleándose—. ¡A pulso te gano!");
                    System.out.println("MINIJUEGO: piedra papel tijera");
                    //Bucle para continuar pidiendo e lvalor a ususario si no es valido
                        //try catch para comprobar el tipo de valor
                    do 
                    {
                        try {
                            System.out.println("Pulse 1 para: Piedra. ");
                            System.out.println("Pulse 2 para: Papel.");
                            System.out.println("Pulse 3 para: Tijera.");
                            sc.nextInt();
                        } 
                        catch (Exception e) 
                        {
                            sc.nextLine();
                            // TODO: handle exception
                        }
                    }
                    while (eleccion <1 || eleccion > 3 );
                    //Aleatorio para la eleccion del NPC
                    ppt_maquina = ran.nextInt(1,4);
                    //COndicional para los casos del piedra papel y tijera
                    if (eleccion == 1 && ppt_maquina == 1) 
                    {
                        System.out.println("EMPATE: Chaff sigue sin querer seguir el plan pero se queda contigo ");
                        pulso = true;
                        
                         
                          
                    }
                    else if (eleccion == 1 && ppt_maquina == 2) 
                    {
                        System.out.println("PIERDES: Chaff se aleja de ti. ");
                        System.out.println("Chaff muere esta noche y tu quedas desprotegido");
                        pulso = false;
                        
                         
                    }
                    else if (eleccion == 1 && ppt_maquina == 3) 
                    {
                        System.out.println("GANAS:Chaff se ríe, te abraza, y promete cubrir tu flanco ");
                        pulso = true;
                        
                     
                    }
                    else if (eleccion == 2 && ppt_maquina == 1) 
                    {
                        System.out.println("GANAS:Chaff se ríe, te abraza, y promete cubrir tu flanco ");
                        pulso = true;
                                               
                    }
                    else if (eleccion == 2 && ppt_maquina == 2) 
                    {
                        System.out.println("EMPATE: Chaff sigue sin querer seguir el plan pero se queda contigo ");
                        pulso = true;
                                       
                    }
                    else if (eleccion == 2 && ppt_maquina == 3) 
                    {
                        System.out.println("PIERDES: Chaff se aleja de ti. ");
                        System.out.println("Chaff muere esta noche y tu quedas desprotegido");
                        pulso = false;
                        
                    }
                    else if (eleccion == 3 && ppt_maquina == 1) 
                    {
                        System.out.println("PIERDES: Chaff se aleja de ti. ");
                        System.out.println("Chaff muere esta noche y tu quedas desprotegido");
                        pulso = false;
                         
                    }
                    else if (eleccion == 3 && ppt_maquina == 2) 
                    {
                        System.out.println("GANAS:Chaff se ríe, te abraza, y promete cubrir tu flanco ");
                        pulso = true;
                                           
                    }
                    else if (eleccion == 3 && ppt_maquina == 3) 
                    {
                        System.out.println("EMPATE: Chaff sigue sin querer seguir el plan pero se queda contigo ");
                        pulso = true;
                                       
                    }
                    
                    System.out.println("Tras tu situacion delicada con Chaff sigues moviendote, atento a cualquier cosa que te pueda dar una ventaja");
                    System.out.println("De repente ves algo");
                    System.out.println("Oculto bajo unas rocas encuentras un regalo de Annie");
                System.out.println("Una ostra metálica");
                System.out.println("En la tapa está grabado");
                System.out.println("“Solo me abro ante aquello que nos separa ahora mismo.”");
                System.out.println("La sostienes con manos temblorosas, Extrañas a Annie más que al aire");
                System.out.println("¿Qué representa “lo que os separa”?");
                //Bucle para continuar pidiendo e lvalor a ususario si no es valido
                    //try catch para comprobar el tipo de valor
                do {
                    try {
                        System.out.println("Pulse 1 para: La Arena");
                        System.out.println("Pulse 2 para: El mar");
                        eleccion = sc.nextInt();
                        sc.nextLine();
                    } catch (Exception e) {
                        sc.nextLine();
                        // TODO: handle exception
                    }
                } while (eleccion <1 || eleccion > 2);
                boolean abrir_caja = false;
                //Comprobacion para tu eleccion en el puzzle de la caja de annie
                if (eleccion==1) 
                {
                    System.out.println("Nada sucede");
                    System.out.println("La caja permanece fría, cerrada, silenciosa.");
                    abrir_caja = false;

                }
                else
                {
                    System.out.println("Tomas agua de mar y la viertes sobre la cerradura");
                    System.out.println("Un clic. La ostra se abre");
                    System.out.println("Dentro, un ungüento para quemaduras");
                    System.out.println("El olor te recuerda a casa");
                    System.out.println("PUZLE RESUELTO");
                    abrir_caja = true;
                }
                //si se falla el puzzle activa un final
                if (!abrir_caja) 
                {
                    System.out.println("FINAL 4 — LOCURA"); 
                    System.out.println("Tu mente se rompe");
                    System.out.println("Solo tienes recuerdos dolorosos y miedo");
                    System.out.println("En un acto de delirio, corres hacia el campo de fuerza buscando silencio"); 
                    System.out.println("El silencio llega. La muerte es inmediata");  
                }

                System.out.println("Tu grupo sigue viajando a traves del bosque");
                System.out.println("Vuestras defensas y atencion han bajado debido al cansancio");
                System.out.println("La arena te vuelve a recordar que no puedes bajar la guardia");
                System.out.println("La niebla venenosa os ha alcanzado");
                System.out.println("Mags ha sufrido daño al igual que Peeta");
                System.out.println("Debes escoger que hacer");
                //Bucle para continuar pidiendo e lvalor a ususario si no es valido
                        //try catch para comprobar el tipo de valor
                do {
                    try {
                        System.out.println("Pulse 1 para: Intentar cargar a ambos");
                        System.out.println("Pulse 2 para: Dejar que Mags se sacrifique");
                        eleccion= sc.nextInt();
                        sc.nextLine();
                    } catch (Exception e) {
                        sc.nextLine();
                        // TODO: handle exception
                    }
                    
                } while (eleccion < 1 || eleccion > 2);
                boolean sacrificar_mags = false, muerte_herioca = false;
                //Condicional segun tu eleccion
                if (eleccion==1) 
                {
                    System.out.println("Tu fuerza es extraordinaria… pero no suficiente");
                    System.out.println("Tu velocidad cae");
                    System.out.println(" La niebla os envuelve");
                    System.out.println("Mags muere de todas formas");
                    sacrificar_mags = false;
                    muerte_herioca = true;
                }
                else
                {
                    
                    System.out.println("Mags te sonríe con dulzura");
                    System.out.println("Se adentra sola en la niebla.... Desaparece");
                    System.out.println("Guardas silencio");
                    System.out.println("Pero salvas a Peeta… y sigues con vida.");
                    System.out.println("ELECCIÓN CORRECTA PARA SOBREVIVIR");
                    sacrificar_mags = true;
                }
                //si se falla escogiendo el sacrificio de Mags se activa un final   
                if (muerte_herioca) 
                {
                    System.out.println("FINAL 3 — MUERTE DE HONOR");
                    System.out.println("Las quemaduras y el cansancio te destrozan");
                    System.out.println("Cuando Enobaria ataca, te interpones para proteger a Peeta");
                    System.out.println("Tu tridente y tus esperanzas caen al suelo");
                    System.out.println("Has muerto como has vivido: defendiendo");   
                    break;
                }
                //Comprobaciones para los finales
                if (!pulso) 
                {
                    System.out.println("FINAL 5 — TRAIDOR");
                    System.out.println("A pesar de salvar a gente");
                    System.out.println("Estas acorralado y sin aliados en buena forma");
                    System.out.println("Comprendes que solo hay un camino para sobrevivir…");
                    System.out.println("y ese camino pasa por la espalda de Katniss");
                    System.out.println("El Capitolio sonríe al ver tus actos");
                    break;

                }
                if (combate_perfecto && abrir_caja) 
                {
                    System.out.println("FINAL 6 - REENCUENTRO");
                    System.out.println("Sobrevives al caos");
                    System.out.println("Te mantuviste en perfecta forma");
                    System.out.println("Eres un campeón… otra vez");  
                    System.out.println("El Capitolio, satisfecho con tu desempeño, te recompensa devolviéndote a Annie");  
                    System.out.println("Pero os mutila la lengua para impedir que habléis de la rebelión");
                    System.out.println("Os abrazáis en silencio.");
                    System.out.println("Un silencio que dice más que cualquier palabra");
                    break;
                }
                if (combate && sacrificar_mags) 
                {
                    System.out.println("11  1 — RESCATADO");  
                    System.out.println("Te mantienes firme, letal y decidido");  
                    System.out.println(" Cuando el campo colapsa, el aerodeslizador rebelde te arranca de la arena");
                    System.out.println("Vuelves con vida");
                    System.out.println("La guerra te espera");
                }

                break;

                default:
                System.out.println("Número inválido");
                break;
        }
        System.out.println(ANSI_RESET+"");
    }
}
