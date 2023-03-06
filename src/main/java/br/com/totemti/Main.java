package br.com.totemti;

import java.util.Objects;
import java.util.function.Predicate;

public class Main {

    private static String gerarIdentificador(final String frase) {
        // TODO: Implemente a regra de negócio
        return frase;
    }

    public static void main(final String[] args) {
        verificarPreCondicoes(
                gerarIdentificador(null),
                Objects::isNull,
                "O valor gerado deve ser nulo"
        );
        verificarPreCondicoes(
                gerarIdentificador(""),
                String::isEmpty,
                "O valor gerado deve estar vazio"
        );
        verificarPreCondicoes(
                gerarIdentificador("Dia inicial da prestação de contas"),
                t -> t.equals("diaInicPresContas_t"),
                "O valor gerado deve ser igual a diaInicPresContas_t"
        );
        verificarPreCondicoes(
                gerarIdentificador("numero"),
                t -> t.equals("numero_t"),
                "O valor gerado deve ser igual a numero_t"
        );
        verificarPreCondicoes(
                gerarIdentificador("Informações alteradas do Dependente"),
                t -> t.equals("informaçõesAlteDependente_t"),
                "O valor gerado deve ser igual a informaçõesAlteDependente_t"
        );
    }

    private static void verificarPreCondicoes(
            String identificadorGerado,
            Predicate<String> condition,
            String mensagem
    ) {
        boolean test = condition.test(identificadorGerado);
        if (!test) {
            System.err.println(mensagem + " ❌");
        }
        else {
            System.out.println("Sucesso ✅");
        }
    }

}
