package trimestre1.ejercicios.proyecto_Aventura;

import java.util.Random;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_CYAN = "\u001B[36m";   
        final String ANSI_PURPLE = "\u001B[35m"; 

        // Variables generales 
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        
        // Inicialización de variables de control y de juego
        int eleccion= 0, personaje_escogido = 0, vidas = 0, ppt_maquina = 0, daño = 0;
        int flechas = 0, vidas_mono = 25, vidas_brutus = 35, vidas_cashmere = 20;
        
        // Variables de tipo String para el inicio de sesión y el acertijo
        String contraseña_jugador = "", contraseña = "jugones", intento_anagrama = "", anagrama = "voluntario";
        
        // Variables booleanas para el control de estados del juego
        boolean combate_finalizado = false, turno = false, voluntario = false;
        boolean tener_arco = false, tener_reloj = false, esquivar = false, plan = false;
        boolean aliada = false, tener_medicina = false, logica = false, cegar = false, muerto = false;
        boolean combate = false, pulso = false, tener_tridente = true, combate_perfecto = false;

        System.out.println(ANSI_PURPLE + "\n========================================================");
        System.out.println("Elige tu propia aventura VERSIÓN: LOS JUEGOS DEL HAMBRE");
        System.out.println("CREADORES: Ignacio Bobes, Ricardo Crespo, Pablo Soriano");
        System.out.println("========================================================" + ANSI_RESET);
        
        // Inicio de sesión
        System.out.println(ANSI_CYAN + "\n--- INICIO DE SESIÓN ---" + ANSI_RESET);
        System.out.println("Introduce la contraseña:");
        System.out.print(ANSI_CYAN + "> " + ANSI_RESET); 
        contraseña_jugador = sc.nextLine();
        
        // Bucle para seguir pidiendo en caso de que la contraseña no sea correcta
        while (!contraseña.equals(contraseña_jugador)) 
        {
            System.out.println(ANSI_RED + "\nContraseña incorrecta." + ANSI_RESET);
            System.out.println("Vuelve a intentarlo:");
            System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
            contraseña_jugador = sc.nextLine();
        }
        System.out.println(ANSI_GREEN + "Inicio correcto.\n" + ANSI_RESET);

        // Escoger personaje
        do 
        {
            System.out.println("SELECCIÓN DE PERSONAJE:");
            System.out.println("Pulse 1 para: KATNISS");
            System.out.println("Pulse 2 para: PEETA");
            System.out.println("Pulse 3 para: FINNICK");
            System.out.println("\nTu elección: ");
            System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
            try 
            {
                personaje_escogido = sc.nextInt(); 
                sc.nextLine();
            } 
            catch (Exception e) 
            {
                sc.nextLine();
                System.out.println("Valor no válido, introdúzcalo de nuevo.");
            }
        } while (personaje_escogido < 1 || personaje_escogido > 3);
        
        // Switch para seleccionar la ruta inicial
        switch (personaje_escogido) 
        {
            case 1:
                // Variables para Katniss
                vidas = 20;
                flechas = 0;
                vidas_mono = 25;
                
                System.out.println(ANSI_RED + "\n------------------------------------------------");
                System.out.println("ERES KATNISS EVERDEEN");
                System.out.println("------------------------------------------------" + ANSI_RESET);
                System.out.println(ANSI_RED + "La Chica en Llamas. Eres el símbolo de la rebelión, lo sepas o no.\n" +
                        "Tu instinto de supervivencia es inigualable.\n" +
                        "Eres una cazadora, letal con el arco y experta en trampas.\n" +
                        "Te mueves por el bosque como una sombra.\n" +
                        "Tu debilidad es tu desconfianza; te cuesta hacer aliados y tu temperamento puede alejar a los patrocinadores." + ANSI_RESET);
                
                System.out.println("\nEstás esperando, en poco sacarán el nombre del tributo de tu distrito.");
                System.out.println("Hay una opción mala: que salga tu nombre.");
                System.out.println("Pero salió una peor... Prim Everdeen.");
                System.out.println("Tienes que salvarla.");

                // Primera decisión
                try {
                    System.out.println("\nResuelve el siguiente anagrama:   oolntraiv");
                    System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
                    intento_anagrama = sc.nextLine();
                } 
                catch (Exception e) 
                {
                    sc.nextLine();
                }
                
                if (intento_anagrama.toLowerCase().trim().equals(anagrama)) 
                {
                    voluntario = true;
                }
                
                if (!voluntario) 
                {
                    System.out.println("\nTe quedas en silencio... miras a Prim desesperada."); 
                    System.out.println("La culpa te come pero no tienes la fuerza de voluntad para presentarte."); 
                    System.out.println(ANSI_RED + "\nFINAL 1: COBARDE" + ANSI_RESET);  
                    break;
                }

                
                System.out.println("\nTu grito silencia a la multitud: \"¡Me presento voluntaria!\".");
                System.out.println("Te llevan bajo custodia al Capitolio. Tras el desfile y días de entrenamiento, llega el momento de puntuar tu valía ante los Vigilantes.");
                

                System.out.println("\nEntras en la habitación para mostrar habilidades, por lo que coges tu arco.\n" +
                        "Clavas tu flecha en el centro de la diana tres veces pero ves que ningún rico te está prestando atención.\n" +
                        "¿Qué haces?");
                
                do 
                {
                    System.out.println("\nPulse 1 para: Irte.");
                    System.out.println("Pulse 2 para: Disparar a los ricos."); 
                    System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
                    try 
                    {
                        eleccion = sc.nextInt(); 
                        sc.nextLine();
                    } 
                    catch (Exception e) 
                    {   
                        sc.nextLine();
                        System.out.println("Valor no válido, introdúzcalo de nuevo.");
                    }
        
                } while (eleccion < 1 || eleccion > 2);
                
                if (eleccion == 1) 
                {
                    System.out.println("\nTe vas, mostrando buena técnica y fuerza.\n" +
                            "Los participantes te han prestado atención, pero los patrocinadores no saben ni quién eres.");    
                }
                else
                {
                    System.out.println("\nDisparas la flecha hacia la sala, golpea rompiendo una lámpara y echando cristales a la comida.\n" +
                            "Te miran con desprecio. YA SABEN QUIÉN ERES, ya tienes algo positivo y algo negativo.");
                }

                System.out.println(ANSI_YELLOW + "\n ██▓ ███▄    █  ██▓ ▄████▄   ██▓ ▄▄▄       ███▄    █      \r\n" + //
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
                        " ░   ░     ░        ░  ░      ░     ░ ░        ░          " + ANSI_RESET);
                
                System.out.println("\nEstás en una oscuridad acogedora, no hay ruido, escuchas como late tu corazón.");
                System.out.println("De repente notas que te mueves y te ciega una luz. Miras a tu alrededor, ves la imponente Cornucopia en el centro.");
                System.out.println("Suena la bocina casi inmediatamente. Observas un arco brillando y te planteas ir a por él, pero Gloss ya está yendo hacia él.");
                System.out.println("Notas un mensaje brillante bajo el agua:\n" +
                        "\"El camino más rápido es el que nadie pisa, el reflejo marca la piedra segura\".\n" +
                        "Ves unas piedras que sobresalen y otras sumergidas que se ven por el reflejo.");
                
                do 
                {
                    System.out.println("\nPulse 1 para: Saltar por las piedras secas y visibles.");
                    System.out.println("Pulse 2 para: Pisar donde el agua hace reflejo."); 
                    System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
                    try 
                    {
                        eleccion = sc.nextInt(); 
                        sc.nextLine();
                    } 
                    catch (Exception e) 
                    {   
                        sc.nextLine();
                        System.out.println("Valor no válido, introdúzcalo de nuevo.");
                    }
        
                } while (eleccion < 1 || eleccion > 2);
                
                 if (eleccion == 1) 
                {
                    System.out.println("\nEs una trampa, se hunden. Gloss llega antes, te quedas sin arco y pierdes 5 HP por ahogamiento.");  
                    vidas -= 5;
                     tener_arco = false;  
                }
                else
                {
                    System.out.println("\nCorrecto. Son pilares de cristal invisibles. Llegas antes, coges el arco y huyes ilesa.");
                     tener_arco = true;
                     flechas = 6;
                }
                System.out.println("\nTras la situación de la cornucopia decides esconderte en el bosque para sobrevivir.\n" +
                        "Escuchas un ruido tras unos árboles.");
                
                do 
                {
                    System.out.println("\nPulse 1 para: Ir a comprobarlo.");
                    System.out.println("Pulse 2 para: Quedarte escondida."); 
                    System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
                    try 
                    {
                        eleccion = sc.nextInt(); 
                        sc.nextLine();
                    } 
                    catch (Exception e) 
                    {   
                        sc.nextLine();
                        System.out.println("Valor no válido, introdúzcalo de nuevo.");
                    }
        
                } while (eleccion < 1 || eleccion > 2);
                
                if (eleccion == 1) 
                {
                    System.out.println("\nEl ruido lo provocaba otra persona: WIRESS, quien está muy nerviosa y repite sin parar tic-tac tic-tac.\n" +
                            "Para calmarla y conseguir información: ENCUENTRO CON WIRESS — “APUESTA DE MANOS”"); 
                    System.out.println("Minijuego a jugar: piedra, papel o tijera.");
                    
                    ppt_maquina = ran.nextInt(1, 4); 
                    do 
                    {
                        try {
                            System.out.println("\nPulse 1 para: Piedra.");
                            System.out.println("Pulse 2 para: Papel.");
                            System.out.println("Pulse 3 para: Tijera.");
                            System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
                            eleccion = sc.nextInt();
                            sc.nextLine();
                        } 
                        catch (Exception e) 
                        {
                            sc.nextLine();
                        }
                    }
                    while (eleccion < 1 || eleccion > 3 );
                                
                    if (eleccion == ppt_maquina) 
                    {
                        System.out.println("EMPATE: Wiress se calla, se empieza a alejar, la pierdes de vista, no sacaste nada en claro.");
                         tener_reloj = false;  
                    }
                    else if ((eleccion == 1 && ppt_maquina == 3) || (eleccion == 2 && ppt_maquina == 1) || (eleccion == 3 && ppt_maquina == 2))
                    {
                        System.out.println("GANAS: Wiress te muestra algo brillante y te dice en un susurro: Es un reloj, Katniss.");
                        tener_reloj = true;
                    }
                    else 
                    {
                        System.out.println("PIERDES: Wiress huye pegando gritos, solo has perdido el tiempo.");
                        tener_reloj = false;
                    }
                }
                else
                {
                    System.out.println("\nAguantas en tu posición, nerviosa, con ojos firmes y preparada para atacar si algo aparece ante tus ojos.\n" +
                            "Sin embargo, el ruido se apaga y tu sensación de peligro decae completamente.");
                    tener_reloj = false;
                }

                if (!tener_reloj) 
                {
                    System.out.println("\nEstás descansando, tranquila, crees que nada puede salir mal, ESE SERÁ TU ÚLTIMO ERROR.");
                    System.out.println("Empiezas a escuchar ruidos de animales, están sufriendo, pero no sabes por qué, hasta que es demasiado tarde.");
                    System.out.println("Una humareda blanca te ha rodeado, NO TIENES DÓNDE HUIR.\n" +
                            "Empiezas a notar que te cuesta respirar y empiezas a toser sangre.");
                    System.out.println("HAS MUERTO: no sabías cómo funcionaba la arena.");
                    System.out.println(ANSI_RED + "\nFINAL 5: LOCURA" + ANSI_RESET);
                    break;  
                }
 
                System.out.println("\nEl sol cae, tu campo visual se está reduciendo, notas que el entorno vibra, hasta que aparece la razón:\n" +
                        "Un mono mutante alfa.");
                System.out.println("Solo tienes una decisión que tomar. MATAR O MORIR.");
                System.out.println("Inicio del combate, tu vida = 20");
                
                turno = ran.nextBoolean();
                combate_finalizado = false;

                // Bucle que mantiene en funcionamiento el combate 
                while (!combate_finalizado) 
                {
                    if (turno) 
                    {
                        System.out.println(ANSI_GREEN + "\nTU TURNO, vidas = " + vidas + ANSI_RESET);
                        System.out.println("Ataques disponibles:");
                        
                        do {
                            try 
                            {
                                if (flechas > 0) 
                                {
                                    System.out.println("Pulse 1 para: Flechazo Certero");
                                }
                                System.out.println("Pulse 2 para: Cuchillo Corto");
                                System.out.println("Pulse 3 para: Patada y Huida");
                                System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
                                eleccion = sc.nextInt();
                                sc.nextLine();
                                
                                if (eleccion == 1 && flechas == 0) {
                                    System.out.println("No te quedan flechas. Debes elegir otra opción.");
                                    eleccion = 0; 
                                }
                            } 
                            catch (Exception e) 
                            {
                                sc.nextLine();
                            }
                        } while (eleccion > 3 || eleccion < 1);
                        
                        if (eleccion == 1 && flechas > 0) {
                            flechas -= 1;
                            daño = 8;
                            esquivar = false;
                        }
                        else if (eleccion == 2) {
                            daño = 4;
                            esquivar = false;
                        }
                        else if (eleccion == 3) {
                            daño = 2;
                            esquivar = true;
                        }
                        
                        int impacto = ran.nextInt(1, 4);
                        if (impacto == 1) 
                        {
                            System.out.println("El ataque impacta totalmente.");
                            vidas_mono -= daño;
                            System.out.println("Vidas mono - " + daño);
                        }
                        else if (impacto == 2) {
                            System.out.println("El ataque impacta parcialmente.");
                            vidas_mono -= daño / 2;
                            System.out.println("Vidas mono - " + daño / 2);
                            
                        }
                        else
                        {
                         System.out.println("El ataque falla.");
                         esquivar = false;   
                        }
                        
                        if (vidas_mono <= 0) 
                        {
                            System.out.println("\nHas ganado el combate.");
                            combate_finalizado = true;    
                        }
                        
                    }
                    else
                    {
                        System.out.println(ANSI_RED + "\nTurno del MONO MUTANTE" + ANSI_RESET);
                        System.out.println("VIDAS MONO RESTANTE: " + vidas_mono);
                        
                        int ataqueMono = ran.nextInt(1, 4);
                        if (ataqueMono == 1) 
                        {
                            System.out.println("El mono ataca con un mordisco.");
                            daño = 6;
                        }
                        else if (ataqueMono == 2) 
                        {
                            System.out.println("El mono ataca con un arañazo.");
                            daño = 4;
                        }
                        else
                        {
                            System.out.println("El mono ataca con un grito.");
                            daño = 2; 
                        }
                        
                        int aciertoMono = ran.nextInt(1, 4);
                        if (aciertoMono == 1) 
                        {
                            if (esquivar && ran.nextBoolean()) 
                            {
                                System.out.println("Esquivas el ataque.");    
                            }
                            else
                            {   
                                System.out.println("El golpe impacta completamente.");
                                System.out.println("Vidas jugador - " + daño);
                                vidas -= daño; 
                            }
                        }
                        else if (aciertoMono == 2) 
                        {
                            if (esquivar && ran.nextBoolean()) 
                            {
                                System.err.println("Esquivas el ataque.");    
                            }
                            else
                            {
                                System.out.println("El golpe impacta parcialmente.");
                                System.out.println("Vidas jugador - " + daño / 2);
                                vidas -= daño / 2;
                            }
                        }
                        else
                        {
                            System.out.println("El ataque falla.");
                        }
                        if (vidas <= 0) 
                        {
                            System.out.println("\nEstás muy débil, pero consigues distraer al mono y huir.");
                            combate_finalizado = true;    
                        }
                    }
                    turno = !turno; 
                }
                
                if (vidas <= 0) {
                    System.out.println(ANSI_RED + "\nFINAL 3 — MÁRTIR" + ANSI_RESET);
                    System.out.println("Intentas tensar el arco, pero estás muy débil.");
                    System.out.println("No consigues disparar.");
                    System.out.println("El capitolio te captura.");
                    System.out.println("TU HISTORIA ACABA AQUÍ.");
                    break;
                }
                
                System.out.println("\nEl combate ha finalizado, te sigues moviendo por la arena y encuentras a Beetee sentando sobre una roca, enrollando un cable metálico casi invisible.");
                System.out.println("EL ACERTIJO DEL ALAMBRE — BEETEE");
                System.out.println("BEETEE te plantea la siguiente pregunta:");
                System.out.println("Para atrapar un rayo necesito un conductor y una toma de tierra. El árbol será el conductor.\n" +
                        "¿La toma de tierra… cuál es?");
                do {
                    try {
                        System.out.println("\nPulse 1 para: EL SUELO DE LA SELVA");
                        System.out.println("Pulse 2 para: EL MAR");
                        System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
                        eleccion = sc.nextInt();
                        sc.nextLine();
                    } catch (Exception e) {
                        sc.nextLine();
                    } 
                } 
                while (eleccion < 1 || eleccion > 2);
                
                if (eleccion == 1) 
                {
                    System.out.println("Beetee niega lentamente. La arena no conduce electricidad, no hay tiempo para pensar más.");
                    System.out.println("PLAN FALLIDO");
                    plan = false;
                }
                else
                {
                    System.out.println("Beetee sonríe satisfecho. El agua salada es la clave. El plan puede funcionar.");
                    plan = true;
                }

                // FINALES POSIBLES
                if (!plan) 
                {
                    System.out.println(ANSI_RED + "\nFINAL 6: FUEGO CRUZADO" + ANSI_RESET);
                    System.out.println("Beetee conecta el cable al suelo. Nada ocurre.");
                    System.out.println("El rayo cae sin control, estalla en el aire y revienta media arena.");
                    System.out.println("Tú estás demasiado cerca. La explosión te derrumba.");
                    System.out.println("En los últimos segundos, el Capitolio te recoge inconsciente.");
                    System.out.println("Sigues con vida, pero te conviertes en rehén propagandístico.");
                    System.out.println("Un final sin gloria.");
                    break;
                }
                if (!tener_arco) {
                    System.out.println(ANSI_YELLOW + "\nFINAL 4: VENCEDORA SOLITARIA" + ANSI_RESET); 
                    System.out.println("Te das cuenta que al plan le falta algo. TU ARCO, no pueden ganar así... pero TÚ SÍ.");
                    System.out.println("Decides traicionar a tu equipo.");
                    System.out.println("Sobrevives con trampas, cazas, resistes.");
                    System.out.println("ERES LA GANADORA DE LOS 75º JUEGOS DEL HAMBRE...");
                    System.out.println("Pero estás sola.");    
                    break;              
                }
                if (vidas <= 0 && tener_arco) {
                    System.out.println(ANSI_RED + "\nFINAL 3 — MÁRTIR" + ANSI_RESET);
                    System.out.println("Intentas tensar el arco, pero estás muy débil.");
                    System.out.println("No consigues disparar.");
                    System.out.println("El capitolio te captura.");
                    System.out.println("TU HISTORIA ACABA AQUÍ.");
                    break;
 
                }
                if (tener_arco && plan) 
                {
                    System.out.println(ANSI_GREEN + "\nFINAL 2 — EL SINSAJO" + ANSI_RESET);
                    System.out.println("Disparas tu arco, el rayo desciende.");
                    System.out.println("La arena estalla.");
                    System.out.println("Eres rescatada por los rebeldes.");
                    System.out.println("HABÉIS GANADO CONTRA EL CAPITOLIO.");
                    break;    
                }
            
            break; 

            case 2:
                // Variables para Peeta
                vidas = 25;
                vidas_brutus = 35;
                
                System.out.println(ANSI_YELLOW + "\n------------------------------------------------");
                System.out.println("ERES PEETA MELLARK");
                System.out.println("------------------------------------------------" + ANSI_RESET);
                System.out.println(ANSI_YELLOW + "El Chico del Pan. Tu arma no es la fuerza bruta, aunque la tienes, sino tus palabras.\n" +
                        "Eres el maestro de la estrategia social y el carisma.\n" +
                        "Sabes cómo ganarte al público y conseguir patrocinadores. Además, eres un experto en camuflaje.\n" +
                        "Tu debilidad es tu brújula moral; tu aversión a matar te pone en desventaja." + ANSI_RESET);
                
                System.out.println("\nEstás esperando, en poco sacarán el nombre del tributo de tu distrito.");
                System.out.println("Hay una opción mala: que salga tu nombre.");
                System.out.println("Pero salió una peor... una amiga de tu infancia.");
                System.out.println("Tienes que salvarla.");
                
                try {
                    System.out.println("\nResuelve el siguiente anagrama:   oolntraiv");
                    System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
                    intento_anagrama = sc.nextLine();
                } catch (Exception e) {
                    sc.nextLine();
                }

                if (intento_anagrama.toLowerCase().trim().equals(anagrama)) 
                {
                    voluntario = true;
                }

                if (!voluntario) 
                {
                    System.out.println("Te quedas en silencio... miras a Hemlich desesperado."); 
                    System.out.println("La culpa te come pero no tienes la fuerza de voluntad para presentarte."); 
                    System.out.println(ANSI_RED + "\nFINAL 1: COBARDE" + ANSI_RESET);  
                    break;
                }

                
                System.out.println("\nTe presentas voluntario para protegerla. El viaje en tren es silencioso.");
                System.out.println("Ya en el Capitolio, tras días de preparación, te enfrentas a tu evaluación privada.");
               
                
                System.out.println("\nEntras en la habitación para mostrar habilidades. Decides intentar practicar con armas pero no es tu fuerte,\n" +
                        "por lo que practicas camuflaje. Piensas que hacer aliados será útil pero no estás seguro si podrás conseguirlo.");
                System.out.println("¿Intentas hablar con gente?");
                do 
                {
                    System.out.println("\nPulse 1 para: Si.");
                    System.out.println("Pulse 2 para: No."); 
                    System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
                    try 
                    {
                        eleccion = sc.nextInt(); 
                        sc.nextLine();
                    } 
                    catch (Exception e) 
                    {   
                        sc.nextLine();
                        System.out.println("Valor no válido, introdúzcalo de nuevo.");
                    }
        
                } while (eleccion < 1 || eleccion > 2);

                if (eleccion == 1) 
                {
                    System.out.println("Consigues hablar con gente asustada, usas tu gran carisma para tranquilizarlos.\n" +
                            "IMPORTANTE: has conseguido aliados.");    
                }
                else
                {
                    System.out.println("Te vas sin dejar marca en nadie, nadie te tiene como objetivo pero tampoco creen que eres útil.");
                }


                System.out.println(ANSI_YELLOW + "\n ██▓ ███▄    █  ██▓ ▄████▄   ██▓ ▄▄▄       ███▄    █      \r\n" + //
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
                        " ░   ░     ░        ░  ░      ░     ░ ░        ░          " + ANSI_RESET);
                
                System.out.println("\nSaltas a la arena y consigues tu machete.");
                System.out.println("Vas hacia el bosque a esconderte.");
                System.out.println("Entre los árboles húmedos aparece Johanna Mason, debes tener cuidado.");
                System.out.println("Lleva un hacha apoyada en el hombro. La baja hasta apuntarte con ella.");
                System.out.println("—Dame una excusa para no matarte —dice—.\n Y que no sea “Katniss”. Estoy harta de ella.");
                
                do {
                    try {
                            System.out.println("\nPulse 1 para: “Soy bueno con el camuflaje, puedo esconderte”.");
                            System.out.println("Pulse 2 para: “Hago buen pan. Y sé qué plantas son comestibles aquí”.");
                            System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
                            eleccion = sc.nextInt();
                            sc.nextLine();
                    } catch (Exception e) {
                        sc.nextLine();
                    }
                } while (eleccion < 1 || eleccion > 2);
                
                if (eleccion == 1) 
                {
                    System.out.println("Johanna suelta una carcajada.");
                    System.out.println("—¿Esconderme? ¿A mí?");
                    System.out.println("Te da un golpe fuerte con el mango del hacha.");
                    vidas -= 5;
                    System.out.println("Johanna NO se une.");
                }
                else
                {
                    System.out.println("Johanna baja el hacha lentamente.");
                    System.out.println("—Tengo hambre. Vienes conmigo.");
                    System.out.println("ALIADA CONSEGUIDA");
                    aliada = true;
                }
                
                System.out.println("\nTras tu encuentro con Johanna decides buscar suministros.");
                System.out.println("La sed te consume.");
                System.out.println("Crees que tu suerte ha mejorado cuando escuchas agua... ");
                System.out.println("Resulta que tu suerte solo empeoró, ante ti está ¡BRUTUS!");
                System.out.println("Es mucho más fuerte que tú, pero también rápido, solo puedes luchar.");
                
                combate_finalizado = false;
                turno = ran.nextBoolean();

                // Bucle para el funcionamiento del combate 
                while (!combate_finalizado) {
                   
                    if (turno) {
                        System.out.println(ANSI_GREEN + "\nTus vidas son: " + vidas + ANSI_RESET);
                        do 
                        {
                            try 
                            {
                                System.out.println("Pulse 1 para: Golpe de machete.");
                                System.out.println("Pulse 2 para: Lanzar arena.");
                                System.out.println("Pulse 3 para: Embestida de placaje.");
                                System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
                                eleccion = sc.nextInt();
                                sc.nextLine();
                            } 
                            catch (Exception e) 
                            {
                                sc.nextLine();
                            }
                        } while (eleccion < 1 || eleccion > 3);
                        
                        if (eleccion == 1) 
                        {
                             daño = 6;
                        }
                        else if (eleccion == 2) 
                        {
                             daño = 2;
                             cegar = true;
                        }
                        else
                        {
                             daño = 8;
                        }

                        if (ran.nextInt(1, 4) == 1) 
                        {
                            System.out.println("El golpe impacta completamente.");
                            System.out.println("Vidas Brutus - " + daño);
                            vidas_brutus -= daño;
                        }
                        else if (ran.nextInt(1, 4) == 2) 
                        {
                            System.out.println("El golpe impacta parcialmente.");
                            System.out.println("Vidas Brutus -" + daño / 2);
                            vidas_brutus  -= daño / 2;
                        }
                        else
                        {
                            System.out.println("El ataque falla.");
                            
                        }
                        if (vidas_brutus <= 0 ) 
                        {
                            combate_finalizado = true;
                            System.out.println("Has derrotado a Brutus.");
                        }
                    }
                    else
                    {
                        daño = 0;
                        System.out.println(ANSI_RED + "\nTurno de Brutus" + ANSI_RESET);
                        System.out.println("Brutus tiene " + vidas_brutus + " vidas.");
                        
                        int ataqueBrutus = ran.nextInt(1, 4);
                        if (ataqueBrutus == 1) 
                        {
                            System.out.println("Brutus ataca con un cuchillo.");
                            daño = 8;
                        }
                        else if (ataqueBrutus == 2) 
                        {
                            System.out.println("Brutus ataca con una patada.");
                            daño = 6;
                        }
                        else
                        {
                            System.out.println("Brutus ataca con el puño.");
                            daño = 2;
                        }

                        int impactoBrutus = ran.nextInt(1, 4);

                        if (impactoBrutus == 1) 
                        {
                            if (cegar) 
                            {
                                System.out.println("Brutus estaba cegado y falla el ataque.");
                                cegar = false;

                            }
                            else
                            {
                                System.out.println("El golpe impacta completamente.");
                                System.out.println("Vidas Jugador - " + daño);
                                vidas -= daño;
                            }
                            
                        }
                        else if (impactoBrutus == 2) 
                        {
                            if (cegar) 
                            {
                                System.out.println("Brutus estaba cegado y falla el ataque.");
                                cegar = false;
                            }
                            else
                            {
                                System.out.println("El golpe impacta parcialmente.");
                                System.out.println("Vidas Jugador -" + daño / 2);
                                vidas -= daño / 2; 
                            }
                        }
                        else
                        {
                            System.out.println("El ataque falla.");
                            cegar = false;
                        }
                        if (vidas <= 0 ) 
                        {
                            combate_finalizado = true;
                            System.out.println("Has sido derrotado por Brutus.");
                            muerto = true;
                        }
                    }
                    turno = !turno; 
                }
                
                if (muerto) 
                {
                    System.out.println(ANSI_RED + "\nFINAL 3 — MUERTE HEROICA" + ANSI_RESET);
                    System.out.println("El mar golpea la arena mientras sangras.");
                    System.out.println("Miras al cielo, sabiendo que tu muerte encenderá algo más grande que tú.");
                    System.out.println("Tu sacrificio inspira a la rebelión.");
                    break;
                }
                System.out.println("\nLlegas herido al borde del bosque.");
                System.out.println("Una figura del Distrito 6 —la Morfina— aparece silenciosa.");
                System.out.println("Lleva una dosis de medicina que necesitas con urgencia.");
                System.out.println("No habla. Solo te mira y mueve la mano en un gesto claro.");
                System.out.println("Piedra, Papel o Tijera.");
                
                ppt_maquina = ran.nextInt(1, 4); 
                do 
                    {
                        try {
                            System.out.println("\nPulse 1 para: Piedra.");
                            System.out.println("Pulse 2 para: Papel.");
                            System.out.println("Pulse 3 para: Tijera.");
                            System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
                            eleccion = sc.nextInt();
                            sc.nextLine();
                        } 
                        catch (Exception e) 
                        {
                            sc.nextLine();
                        }
                    }
                    while (eleccion < 1 || eleccion > 3 );
                    
                    if (eleccion == ppt_maquina) 
                    {
                        System.out.println("EMPATE: la Morfina se encoge de hombros antes de darte una pequeña hoja de menta.");
                        System.out.println("La muerdes y te sientes un poco mejor.");
                        vidas += 2;
                        tener_medicina = false; 
                    }
                    else if ((eleccion == 1 && ppt_maquina == 3) || (eleccion == 2 && ppt_maquina == 1) || (eleccion == 3 && ppt_maquina == 2))
                    {
                        System.out.println("GANAS: Ella sonríe débilmente.");
                        System.out.println("Te da la medicina.");
                        vidas += 10;
                        System.out.println("Más adelante, se sacrificará por ti.");
                        tener_medicina = true;
                    }
                    else
                    {
                        System.out.println("PIERDES: la Morfina se guarda la medicina.");
                        System.out.println("Se esfuma entre los árboles.");
                        tener_medicina = false;
                    }
                    
                    if (!tener_medicina && vidas <= 10 ) 
                    {
                        System.out.println("Las heridas te arden, no puedes continuar...");
                        System.out.println("Empiezas a perder la consciencia.");
                        System.out.println(ANSI_RED + "\nFINAL 5: INFECCIÓN" + ANSI_RESET); 
                        System.out.println("La fiebre te consume.");
                        System.out.println("Mueres sin violencia... no derramas sangre.");
                        System.out.println("Pero caes en el olvido.");
                        break;  
                    }

                    System.out.println("\nHa caído ya la noche, puedes descansar un poco.");
                    System.out.println("El sol te despierta, es momento de moverte.");
                    System.out.println("Viajas en busca de comida.");
                    System.out.println("Ves un trozo de pan fresco, vas a comértelo...");
                    System.out.println("Antes de darle un mordisco ves un patrón quemado en la corteza.");
                    System.out.println("12-6-12-6");
                    System.out.println("Piensas qué puedes hacer.");
                    
                    do 
                    {
                        try {
                            System.out.println("\nPulse 1 para: Ir a la Cornucopia a las 12.");
                            System.out.println("Pulse 2 para: Moverse de norte a sur cada 6 horas.");
                            System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
                            eleccion = sc.nextInt();
                            sc.nextLine();
                        } 
                        catch (Exception e) 
                        {
                            sc.nextLine();
                        }
                    }
                    while (eleccion < 1 || eleccion > 2 );
                    
                    if (eleccion == 1) {
                        System.out.println("Es la hora del rayo.");
                        System.out.println("Una explosión sacude la arena.");
                        System.out.println("DECISIÓN EQUIVOCADA");
                        logica = false;
                    }
                    else
                    {
                       System.out.println("Encaja.");
                       System.out.println("Sigues el patrón del reloj."); 
                       System.out.println("Evitas zonas letales.");
                       System.out.println("PUZLE RESUELTO");
                       logica = true;
                    }

                    // FINALES
                
                    if (aliada && logica) 
                    {
                        System.out.println(ANSI_GREEN + "\nFINAL 4 — EL LÍDER" + ANSI_RESET);  
                        System.out.println("Johanna lucha a tu lado.");
                        System.out.println("Interpretaste el patrón del reloj."); 
                        System.out.println("Guías a los demás entre las zonas seguras.");
                        System.out.println("Cuando la arena cae, escapas con Katniss al Distrito 13.");
                        System.out.println("Te conviertes en líder, eres la esperanza del resto.");
                        break; 
                    }
                    if (vidas < 8) 
                    {
                        System.out.println(ANSI_RED + "\nFINAL 2 — SECUESTRADO" + ANSI_RESET);
                        System.out.println("Te encuentras en la orilla cuando llega el aerodeslizador rebelde.");
                        System.out.println("Levantan a Katniss.");
                        System.out.println("Una red electromagnética te atrapa a ti.");
                        System.out.println("El Capitolio te arrastra al cielo.");
                        System.out.println("Tu historia continúa… como prisionero.");
                        break;    
                    }

                    System.out.println(ANSI_YELLOW + "\nFINAL 6 — EL TÍTERE" + ANSI_RESET);
                    System.out.println("Pero nunca luchas por escapar.");
                    System.out.println("Snow te considera útil y te mantiene vivo.");
                    System.out.println("Te mandan de vuelta a tu distrito.");
                    System.out.println("No mueres pero tu libertad desaparece.");

                break;
            case 3: 
                // Variables de Finnick
                vidas =  30;
                combate = false; pulso = false; tener_tridente = true; combate_perfecto = false;
                vidas_cashmere = 20;
                
                System.out.println(ANSI_GREEN + "\n------------------------------------------------");
                System.out.println("ERES FINNICK ODAIR");
                System.out.println("------------------------------------------------" + ANSI_RESET);
                System.out.println(ANSI_GREEN + "El Favorito del Capitolio. Eres una leyenda de los Juegos, un profesional nato.\n" +
                        "Encantador, atlético y absolutamente letal con el tridente.\n" +
                        "El agua es tu elemento natural. Usas tu arrogancia y belleza como un escudo, pero bajo la superficie yace una mente astuta.\n" +
                        "Tu debilidad es tu exceso de confianza y el peso de tu reputación." + ANSI_RESET);
                
                System.out.println("\nEstás esperando, en poco sacarán el nombre del tributo de tu distrito.");
                System.out.println("Hay una opción mala: que salga tu nombre.");
                System.out.println("Tuviste suerte, no es tu nombre, aun así piensas en si deberías salvar a este señor.");
                
                try {
                    System.out.println("\nResuelve el siguiente anagrama:   oolntraiv");
                    System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
                    intento_anagrama = sc.nextLine();
                } catch (Exception e) {
                    sc.nextLine();
                }

                if (intento_anagrama.toLowerCase().trim().equals(anagrama)) 
                {
                    voluntario = true;
                }

                if (!voluntario) 
                {
                    System.out.println("Te quedas en silencio... miras al desconocido."); 
                    System.out.println("La culpa te come pero no tienes la fuerza de voluntad para presentarte."); 
                    System.out.println(ANSI_RED + "\nFINAL 1: COBARDE" + ANSI_RESET);  
                    break;
                }

                
                System.out.println("\nTomas el lugar del tributo. El Capitolio te recibe con aplausos, pero sabes que es una sentencia.");
                System.out.println("Llega el momento de demostrar por qué sigues siendo el favorito en tu evaluación privada.");
                
                
                System.out.println("\nEntras en la habitación para mostrar habilidades, caminas recto y con cara confiada, conoces bien las habilidades que posees.\n" +
                        "Piensas en dar un espectáculo.");
                do 
                {
                    System.out.println("\nPulse 1 para: Si.");
                    System.out.println("Pulse 2 para: No."); 
                    System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
                    try 
                    {
                        eleccion = sc.nextInt(); 
                        sc.nextLine();
                    } 
                    catch (Exception e) 
                    {   
                        sc.nextLine();
                        System.out.println("Valor no válido, introdúzcalo de nuevo.");
                    }
        
                } while (eleccion < 1 || eleccion > 2);
                
                if (eleccion == 1) 
                {
                    System.out.println("Lanzas el tridente hacia un maniquí (se parece a PEETA), le arranca la cabeza de un solo golpe y ríes en alto.");    
                }
                else
                {
                    System.out.println("Vuelves a dejar el tridente en la sala, te vas sin llamar mucho la atención.");
                }

                System.out.println(ANSI_GREEN + "\n ██▓ ███▄    █  ██▓ ▄████▄   ██▓ ▄▄▄       ███▄    █      \r\n" + //
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
                        " ░   ░     ░        ░  ░      ░     ░ ░        ░          " + ANSI_RESET);
                System.out.println("\nTe diriges a la cornucopia, es un caos.");
                System.out.println("Cashmere, rápida como un filo, se lanza hacia Katniss.");
                System.out.println("Te colocas entre ambas.");
                System.out.println("—Apártate, Finnick —escupe ella—. O te abro en dos.");
                
                combate_finalizado = false;
                turno = ran.nextBoolean();

                while (!combate_finalizado) {
                    if (turno) 
                    {
                        System.out.println(ANSI_GREEN + "\nTU TURNO, vidas: " + vidas + ANSI_RESET);
                        do {
                            try {
                                if (tener_tridente) 
                                {
                                    System.out.println("Pulse 1 para: Lanzamiento de Tridente.");    
                                }
                                System.out.println("Pulse 2 para: Red de Pescador.");
                                System.out.println("Pulse 3 para: Golpe de Mango.");
                                System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
                                eleccion = sc.nextInt();
                                sc.nextLine();
                            } catch (Exception e) {
                                sc.nextLine();
                            }
                        } while (eleccion < 1 || eleccion > 3);

                        if (eleccion == 1 && tener_tridente) 
                        {
                            System.out.println("Decides lanzar tu tridente para atacar.");
                            daño = 8;
                        }
                        else if (eleccion == 2) 
                        {
                            System.out.println("Decides envolverla con una red de pescador con púas.");
                            daño = 6;
                        }
                        else
                        {
                            System.out.println("Decides golpear con el mango.");
                            daño = 4;
                        }
                        
                        if (ran.nextInt(1, 4) == 1) 
                        {
                            System.out.println("El ataque impacta totalmente.");
                            System.out.println("Vidas CASHMERE - " + daño);
                            vidas_cashmere -= daño;
                        }
                        else if (ran.nextInt(1, 4) == 2) 
                        {
                            System.out.println("El ataque impacta parcialmente.");
                            System.out.println("Vidas CASHMERE - " + daño / 2);
                            vidas_cashmere -= daño / 2;
                        }
                        else
                        {
                            System.out.println("El ataque falla.");
                        }
                        
                        if (vidas_cashmere <= 0) 
                        {
                            System.out.println("\nHas derrotado a Cashmere.");
                            combate_finalizado = true;
                            combate = true; 
                            if (vidas == 30) {
                                 combate_perfecto = true;
                                
                            } 
                            else
                                {
                                    combate_perfecto = false;
                                }  
                        }
                    }
                    else
                    {
                        System.out.println(ANSI_RED + "\nTurno de Cashmere" + ANSI_RESET);
                        int ataqueCashmere = ran.nextInt(1, 4);
                        if (ataqueCashmere == 1) 
                        {
                            System.out.println("CASHMERE ataca con una patada.");
                            daño = 2;
                        }
                        else if (ataqueCashmere == 2) 
                        {
                            System.out.println("CASHMERE ataca lanzando el cuchillo.");
                            daño = 6;
                        }
                        else
                        {
                            System.out.println("CASHMERE ataca con los puños de frente.");
                            daño = 4;
                        }
                        
                        int aciertoCashmere = ran.nextInt(1, 4);
                        if (aciertoCashmere == 1) 
                        {
                            System.out.println("El ataque impacta totalmente.");
                            System.out.println("Vidas jugador - " + daño);
                            vidas -= daño;
                        }
                        else if (aciertoCashmere == 2) 
                        {
                            System.out.println("El ataque impacta parcialmente.");
                            System.out.println("Vidas jugador - " + daño / 2);
                            vidas -= daño / 2;
                        }
                        else
                        {
                            System.out.println("El ataque falla.");
                        }
                        
                        if (vidas <= 0) 
                        {

                            combate_finalizado = true;
                            System.out.println("Huyes del combate viendo que vas perdiendo.");  
                            combate = false;  
                        }
                    }
                    turno = !turno; 
                }

                if (vidas <= 0) {
                    System.out.println(ANSI_RED + "\nFINAL: MUERTO EN COMBATE" + ANSI_RESET);
                    break;
                }

                    System.out.println("\nTras el combate, sigues avanzando a través del bosque.");
                    System.out.println("Te encuentras a Chaff, del distrito 11. Amigo y Líder.");
                    System.out.println("Pero hay un problema, no quiere seguir el plan.");
                    System.out.println("—No me mandas —dice tambaleándose—. ¡A pulso te gano!");
                    System.out.println("MINIJUEGO: piedra, papel, tijera.");
                    
                    ppt_maquina = ran.nextInt(1, 4); 
                    do 
                    {
                        try {
                            System.out.println("\nPulse 1 para: Piedra.");
                            System.out.println("Pulse 2 para: Papel.");
                            System.out.println("Pulse 3 para: Tijera.");
                            System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
                            eleccion = sc.nextInt();
                            sc.nextLine();
                        } 
                        catch (Exception e) 
                        {
                            sc.nextLine();
                        }
                    }
                    while (eleccion < 1 || eleccion > 3 );
                   
                    if (eleccion == ppt_maquina) 
                    {
                        System.out.println("EMPATE: Chaff sigue sin querer seguir el plan pero se queda contigo.");
                        pulso = true;
                    }
                    else if ((eleccion == 1 && ppt_maquina == 3) || (eleccion == 2 && ppt_maquina == 1) || (eleccion == 3 && ppt_maquina == 2))
                    {
                        System.out.println("GANAS: Chaff se ríe, te abraza, y promete cubrir tu flanco.");
                        pulso = true;
                    }
                    else
                    {
                        System.out.println("PIERDES: Chaff se aleja de ti.");
                        System.out.println("Chaff muere esta noche y tú quedas desprotegido.");
                        pulso = false;
                    }
                    
                    System.out.println("\nTras tu situación delicada con Chaff sigues moviéndote, atento a cualquier cosa que te pueda dar una ventaja.");
                    System.out.println("De repente ves algo.");
                    System.out.println("Oculto bajo unas rocas encuentras un regalo de Annie.");
                    System.out.println("Una ostra metálica.");
                    System.out.println("En la tapa está grabado:");
                    System.out.println("“Solo me abro ante aquello que nos separa ahora mismo”.");
                    System.out.println("La sostienes con manos temblorosas, extrañas a Annie más que al aire.");
                	System.out.println("¿Qué representa “lo que os separa”?");
                
                do {
                    try {
                        System.out.println("\nPulse 1 para: La Arena.");
                        System.out.println("Pulse 2 para: El mar.");
                        System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
                        eleccion = sc.nextInt();
                        sc.nextLine();
                    } catch (Exception e) {
                        sc.nextLine();
                    }
                } while (eleccion < 1 || eleccion > 2);
                
                boolean abrir_caja = false;
                if (eleccion == 1) 
                {
                    System.out.println("Nada sucede.");
                    System.out.println("La caja permanece fría, cerrada, silenciosa.");
                    abrir_caja = false;

                }
                else
                {
                    System.out.println("Tomas agua de mar y la viertes sobre la cerradura.");
                    System.out.println("Un clic. La ostra se abre.");
                    System.out.println("Dentro, un ungüento para quemaduras.");
                    System.out.println("El olor te recuerda a casa.");
                    System.out.println("PUZLE RESUELTO");
                    abrir_caja = true;
                }
                
                if (!abrir_caja) 
                {
                    System.out.println(ANSI_RED + "\nFINAL 4 — LOCURA" + ANSI_RESET); 
                    System.out.println("Tu mente se rompe.");
                    System.out.println("Solo tienes recuerdos dolorosos y miedo.");
                    System.out.println("En un acto de delirio, corres hacia el campo de fuerza buscando silencio."); 
                    System.out.println("El silencio llega. La muerte es inmediata."); 
                    break; 
                }

                System.out.println("\nTu grupo sigue viajando a través del bosque.");
                System.out.println("Vuestras defensas y atención han bajado debido al cansancio.");
                System.out.println("La arena te vuelve a recordar que no puedes bajar la guardia.");
                System.out.println("La niebla venenosa os ha alcanzado.");
                System.out.println("Mags ha sufrido daño al igual que Peeta.");
                System.out.println("Debes escoger qué hacer.");
                
                do {
                    try {
                        System.out.println("\nPulse 1 para: Intentar cargar a ambos.");
                        System.out.println("Pulse 2 para: Dejar que Mags se sacrifique.");
                        System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
                        eleccion= sc.nextInt();
                        sc.nextLine();
                    } catch (Exception e) {
                        sc.nextLine();
                    }
                    
                } while (eleccion < 1 || eleccion > 2);
                
                boolean sacrificar_mags = false;
                if (eleccion == 1) 
                {
                    System.out.println("Tu fuerza es extraordinaria… pero no suficiente.");
                    System.out.println("Tu velocidad cae.");
                    System.out.println("La niebla os envuelve.");
                    System.out.println("Mags muere de todas formas.");
                    System.out.println(ANSI_RED + "\nFINAL 3 — MUERTE DE HONOR" + ANSI_RESET);
                    System.out.println("Las quemaduras y el cansancio te destrozan.");
                    System.out.println("Cuando Enobaria ataca, te interpones para proteger a Peeta.");
                    System.out.println("Tu tridente y tus esperanzas caen al suelo.");
                    System.out.println("Has muerto como has vivido: defendiendo.");   
                    break;
                }
                else
                {
                    
                    System.out.println("Mags te sonríe con dulzura.");
                    System.out.println("Se adentra sola en la niebla... Desaparece.");
                    System.out.println("Guardas silencio.");
                    System.out.println("Pero salvas a Peeta… y sigues con vida.");
                    System.out.println("ELECCIÓN CORRECTA PARA SOBREVIVIR");
                    sacrificar_mags = true;
                }
                
                if (!pulso) 
                {
                    System.out.println(ANSI_YELLOW + "\nFINAL 5 — TRAIDOR" + ANSI_RESET);
                    System.out.println("A pesar de salvar a gente.");
                    System.out.println("Estás acorralado y sin aliados en buena forma.");
                    System.out.println("Comprendes que solo hay un camino para sobrevivir…");
                    System.out.println("Y ese camino pasa por la espalda de Katniss.");
                    System.out.println("El Capitolio sonríe al ver tus actos.");
                    break;

                }
                if (combate_perfecto && abrir_caja) 
                {
                    System.out.println(ANSI_YELLOW + "\nFINAL 6 - REENCUENTRO" + ANSI_RESET);
                    System.out.println("Sobrevives al caos.");
                    System.out.println("Te mantuviste en perfecta forma.");
                    System.out.println("Eres un campeón… otra vez.");  
                    System.out.println("El Capitolio, satisfecho con tu desempeño, te recompensa devolviéndote a Annie.");  
                    System.out.println("Pero os mutila la lengua para impedir que habléis de la rebelión.");
                    System.out.println("Os abrazáis en silencio.");
                    System.out.println("Un silencio que dice más que cualquier palabra.");
                    break;
                }
                if (combate && sacrificar_mags) 
                {
                    System.out.println(ANSI_GREEN + "\nFINAL 2 — RESCATADO" + ANSI_RESET);  
                    System.out.println("Te mantienes firme, letal y decidido.");  
                    System.out.println("Cuando el campo colapsa, el aerodeslizador rebelde te arranca de la arena.");
                    System.out.println("Vuelves con vida.");
                    System.out.println("La guerra te espera.");
                }

                break;

                default:
                System.out.println("Número inválido");
                break;
        }
        System.out.println(ANSI_RESET + "");
    }
}