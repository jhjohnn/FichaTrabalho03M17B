// --- PSI M17B - ficha de trabalho 3.
// O que é necessário fazer:
// - aceitar o convite para colaborar no repositório deste projeto.
// - clonar o repositório com o NetBeans.
// - fazer alterações ao projeto no NetBeans, de acordo com as indicações dadas
//   no próprio projeto - VER main().

// Depois:
// - atualizar o repositório local – Team | Commit...
// - enviar o código para o repositório remoto – Team | Remote | Push…
package turma11o.m17b_projetocolab_fichatrab3;

public class M17B_projetoColab_FichaTrab3 {

    public static void main(String[] args) {
        Retangulo[] poligonos = new Retangulo[20];
        
        poligonos[0] = new Retangulo("a00000", 4, 3);
        System.out.println(poligonos[0]);
        
        // O que deve ser acrescentado ao código:
        // - na prática, repetir o código das linhas 18 e 19, mas instanciando
        //   um novo elemento do array, sem ser os de índices 0 e 19;
        // - no primeiro atributo, relativo ao nome, deve ser colocado o
        //   vosso «nome de utilizador» da conta da escola (a00000 no exemplo);
        // - para os atributos da largura e altura devem usar quaisquer valores
        //   diferentes dos já usados.
        
        // Não esquecer: depois de acrescentar o código, fazer
        //               Team | Commit
        //               Team | Remote | Push
        
        // NOVO CÓDIGO SÓ ABAIXO DESTA LINHA 
              
        poligonos[19] = new Retangulo("a99999", 5, 9);
        System.out.println(poligonos[19]);
       
        

    }
}
