package V2;

import java.util.ArrayList;

import V2.condiciones.CondicionEnergiaM;
import V2.condiciones.CondicionRapidezIgual;
import V2.condiciones.CondicionTalento;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> t1 = new ArrayList<>();
        t1.add("telepatía instantánea");
        t1.add("curación emocional");

        ArrayList<String> t2 = new ArrayList<>();
        t2.add("escudo mental");

        ArrayList<String> t3 = new ArrayList<>();
        t3.add("proyección ilusoria");
        t3.add("curación emocional");

        GuardianMental g1 = new GuardianMental("Astra", 40.0, 24.5, t1);
        GuardianMental g2 = new GuardianMental("Boreal", 28.0, 30.0, t2);
        GuardiaVanidosoSupremo g3 = new GuardiaVanidosoSupremo("Ciro", 20.0, 10.0, t3, 2.0); // vanidoso x2
        GuardiaVanidosoSupremo g4 = new GuardiaVanidosoSupremo("Deyan", 60.0, 12.0, t2, 5.0); // supremo x5
        GuardiaRebeledeMalhumorado rebelde = GuardiaRebeledeMalhumorado.rebelde("Ema", 50.0, 45.0, t1);
        GuardiaRebeledeMalhumorado malhum = GuardiaRebeledeMalhumorado.malhumorado("Fred", 45.0, 50.0, t3);

        Calculador cVal = new CalculadorValorFijo(14.0);
        GuardiaCamaleon ch = new GuardiaCamaleon("Cam", 33.0, 7.0, t2, cVal);

        // camaleon con calculador condicional: si tiene curación emocional usa 100, sino usa energia
        Calculador camCond = new CalculadorCondicional(new CondicionTalento("curación emocional"), new CalculadorValorFijo(100.0), new CalculadorNivEnergia());
        ch.setCalculador(camCond);

        EscuadronAccRapida esc1 = new EscuadronAccRapida();
        esc1.agregarMiembro(g1);
        esc1.agregarMiembro(g2);
        esc1.agregarMiembro(ch);

        CCP ccp = new CCP();
        ccp.agregarMiembro(g3);
        ccp.agregarMiembro(rebelde);
        ccp.agregarMiembro(malhum);

        OficinaEnrolamiento oficina = new OficinaEnrolamiento();
        oficina.agregarGuardian(g1);
        oficina.agregarGuardian(g2);
        oficina.agregarGuardian(g3);
        oficina.agregarGuardian(g4);
        oficina.agregarGuardian(rebelde);
        oficina.agregarGuardian(malhum);
        oficina.agregarGuardian(ch);

        System.out.println("Guardianes en oficina (ordenados):");
        for (GuardianMental g : oficina.getGuardianes()) {
            System.out.println(" - " + g);
        }

        System.out.println();
        // buscar guardianes con energia > 30
        long cantE = esc1.buscarGuardianes(new CondicionEnergiaM(30.0)).size()
                + ccp.buscarGuardianes(new CondicionEnergiaM(30.0)).size()
                + (new ArrayList<>(oficina.getGuardianes())).stream().filter(x -> x.getEnergiaEmocional() > 30).count();
        System.out.println("Cantidad de guardianes con energia > 30 en estructuras (EARM+CCP+oficina(separado)) aprox: " + cantE);

        // usar condición por talento
        int cantCur = 0;
        for (GuardianMental g : oficina.getGuardianes()) if (new CondicionTalento("curación emocional").cumple(g)) cantCur++;
        System.out.println("Guardianes en oficina con 'curación emocional' talento: " + cantCur);

        // probar camaleon rapidez
        System.out.println("Rapidez camaleon (condicional): " + ch.getRapidezPensamiento());
    }
}