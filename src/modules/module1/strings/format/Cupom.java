package modules.module1.strings.format;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Cupom {
    private String nomeFantasia;
    private String cpf;
    private String ie;
    private String im;
    private LocalDate data;
    private LocalTime horario;
    private int ccf;
    private int cdd;
    private Endereco endereco;
    private List<CupomItem> cupomItems = new ArrayList<CupomItem>();


    public Cupom(String nomeFantasia, int cdd, LocalTime horario, int ccf, LocalDate data, String im, String ie, String cpf, Endereco endereco, List<CupomItem> cupomItems) {
        this.nomeFantasia = nomeFantasia;
        this.cdd = cdd;
        this.horario = horario;
        this.ccf = ccf;
        this.data = data;
        this.im = im;
        this.ie = ie;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cupomItems = cupomItems;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getCdd() {
        return cdd;
    }

    public void setCdd(int cdd) {
        this.cdd = cdd;
    }

    public int getCcf() {
        return ccf;
    }

    public void setCcf(int ccf) {
        this.ccf = ccf;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(nomeFantasia).append('\n');
        sb.append(endereco.getLogradouro() + " ").append(endereco.getComplemento() + " ").append(endereco.getBairro()).append('\n');
        sb.append("CEP:" + endereco.getCep()).append('\n');
        sb.append(System.lineSeparator());
        sb.append("CPF:" + String.format("%-34s", cpf)).append(String.format("%td/%<tm/%<tY", data)).append('\n');
        sb.append("IE:" + String.format("%-35s", ie)).append(String.format("%tk:%<tM:%<tS", horario)).append('\n');
        sb.append("IM:" + String.format("%-35s", im)).append(String.format("CCF:%-5.5s", ccf)).append('\n');
        sb.append(String.format("%42s %-5.5s", "CFF:", cdd));
        sb.append(System.lineSeparator());
        sb.append(String.format("%50.50s","-----------------------------------------------------------------------------------")).append(System.lineSeparator());
        sb.append("CUPOM FISCAL").append(System.lineSeparator());
        sb.append("ITEM. COD.  DESC.").append(String.format("%30s", "VALOR"));
        sb.append(System.lineSeparator());

        for (CupomItem cupomItem : cupomItems) {
            sb.append(String.format("%04d", cupomItem.getOrder())).append(' ' + String.format("%04d", cupomItem.getSku()) + "  " ).append(String.format("%-30.30s", cupomItem.getDescricao())).append(String.format("%.2f", cupomItem.getPreco())).append('\n');
        }





        return sb.toString();






    }
}
