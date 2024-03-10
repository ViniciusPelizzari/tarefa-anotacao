public class ExeReflection {

    public static void main(String[] args) {
        Address address = new Address(3, "Av. Brasil");

        Tabela tabelaAnnotation = Address.class.getAnnotation(Tabela.class);
        dataAnnotation("Nome da tabela", tabelaAnnotation.value());
        dataAnnotation("Autor", tabelaAnnotation.author());
        dataAnnotation("Ano", tabelaAnnotation.year());
        System.out.println(address.toString());
    }

    public static void dataAnnotation(String frase, Object object){
        System.out.println(frase + ": " + object);
    }
}
