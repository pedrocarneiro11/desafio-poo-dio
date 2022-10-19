package src.br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_Padrao * cargaHoraria;
    }

    /* TODO --------------- A FAZER ------------ */

    public void Curso2(String titulo, String descricao, int cargaHoraria) {

    }

    /* ---------- INFORMACOES DOS CURSOS(TITULO, DESCRICAO E CARGA HORARIA) ---------- */

    public int getCargaHoraria() {

        return cargaHoraria;

    }

    public void setCargaHoraria(int cargaHoraria) {

        this.cargaHoraria = cargaHoraria;

    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


}
